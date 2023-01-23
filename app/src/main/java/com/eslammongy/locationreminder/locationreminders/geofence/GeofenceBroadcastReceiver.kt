package com.eslammongy.locationreminder.locationreminders.geofence

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class GeofenceBroadcastReceiver : BroadcastReceiver() {

    companion object {
        const val ACTION_GEOFENCE_EVENT =
            "locationreminders.geofence.action.ACTION_GEOFENCE_EVENT"
    }

    override fun onReceive(context: Context, intent: Intent) {

        if(intent.action == ACTION_GEOFENCE_EVENT) {
            GeofenceTransitionsJobIntentService.enqueueWork(context, intent)
        }
    }
}