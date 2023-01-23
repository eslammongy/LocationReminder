package com.eslammongy.locationreminder.locationreminders.geofence

import android.content.Context
import android.content.Intent
import androidx.core.app.JobIntentService
import com.google.android.gms.location.Geofence
import com.google.android.gms.location.GeofencingEvent
import com.eslammongy.locationreminder.locationreminders.data.ReminderDataSource
import com.eslammongy.locationreminder.locationreminders.data.dto.ReminderDTO
import com.eslammongy.locationreminder.locationreminders.data.dto.Result
import com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem
import com.eslammongy.locationreminder.utils.sendNotification
import kotlinx.coroutines.*
import org.koin.android.ext.android.inject
import kotlin.coroutines.CoroutineContext

class GeofenceTransitionsJobIntentService : JobIntentService(), CoroutineScope {

    private var coroutineJob: Job = Job()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + coroutineJob

    companion object {
        private const val JOB_ID = 573

        // start the JobIntentService to handle the geofencing transition events
        fun enqueueWork(context: Context, intent: Intent) {
            enqueueWork(
                context,
                GeofenceTransitionsJobIntentService::class.java, JOB_ID,
                intent
            )
        }
    }

    // handle the geofencing transition events and
    // send a notification to the user when he enters the geofence area
    override fun onHandleWork(intent: Intent) {

        val geofencingEvent = GeofencingEvent.fromIntent(intent)
        if (geofencingEvent.hasError()) {
            return
        }

        if (geofencingEvent.geofenceTransition == Geofence.GEOFENCE_TRANSITION_ENTER) {
            if (geofencingEvent.triggeringGeofences.isNotEmpty()) {
                sendNotification(geofencingEvent.triggeringGeofences)
            }
        }
    }

    private fun sendNotification(triggeringGeofences: List<Geofence>) {

        for (triggeringGeofence in triggeringGeofences) {
            val requestId = triggeringGeofence.requestId

            //Get the local repository instance
            //val remindersLocalRepository: RemindersLocalRepository by inject()
            val remindersLocalRepository: ReminderDataSource by inject()
            // Interaction to the repository has to be through a coroutine scope
            CoroutineScope(coroutineContext).launch(SupervisorJob()) {
                //get the reminder with the request id
                val result = remindersLocalRepository.getReminder(requestId)
                if (result is Result.Success<ReminderDTO>) {
                    val reminderDTO = result.data
                    //send a notification to the user with the reminder details
                    sendNotification(
                        this@GeofenceTransitionsJobIntentService, ReminderDataItem(
                            reminderDTO.title,
                            reminderDTO.description,
                            reminderDTO.location,
                            reminderDTO.latitude,
                            reminderDTO.longitude,
                            reminderDTO.id
                        )
                    )
                }
            }
        }
    }

}