package com.udacity.project4.locationreminders.data

import com.udacity.project4.locationreminders.data.dto.ReminderDTO

//Use FakeDataSource that acts as a test double to the LocalDataSource
class FakeDataSource : ReminderDataSource {

    var reminderDTOList = mutableListOf<ReminderDTO>()

    private var shouldReturnError = false

    fun setShouldReturnError(value: Boolean) {
        shouldReturnError = value
    }

    override suspend fun getReminders(): Result<List<ReminderDTO>> {
        return try {
            if(shouldReturnError) {
                throw Exception("Reminders not found")
            }
            Result.Success(ArrayList(reminderDTOList))
        } catch (ex: Exception) {
            Result.Error(ex.localizedMessage)
        }
    }

    override suspend fun saveReminder(reminder: ReminderDTO) {
        reminderDTOList.add(reminder)
    }

    override suspend fun getReminder(id: String): Result<ReminderDTO> {

        return try {
            val reminder = reminderDTOList.find { it.id == id }
            if (shouldReturnError || reminder == null) {
                throw Exception("Not found $id")
            } else {
                Result.Success(reminder)
            }
        } catch (ex: Exception) {
            Result.Error(ex.localizedMessage)
        }
    }

    override suspend fun deleteAllReminders() {
        reminderDTOList.clear()
    }
}