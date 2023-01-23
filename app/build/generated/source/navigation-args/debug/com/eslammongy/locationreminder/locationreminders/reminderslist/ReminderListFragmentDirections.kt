package com.eslammongy.locationreminder.locationreminders.reminderslist

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.eslammongy.locationreminder.R

class ReminderListFragmentDirections private constructor() {
  companion object {
    fun toSaveReminder(): NavDirections = ActionOnlyNavDirections(R.id.to_save_reminder)
  }
}
