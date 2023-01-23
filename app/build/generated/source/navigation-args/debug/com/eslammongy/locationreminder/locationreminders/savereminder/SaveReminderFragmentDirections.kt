package com.eslammongy.locationreminder.locationreminders.savereminder

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.eslammongy.locationreminder.R

class SaveReminderFragmentDirections private constructor() {
  companion object {
    fun actionSaveReminderFragmentToReminderListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_saveReminderFragment_to_reminderListFragment)

    fun actionSaveReminderFragmentToSelectLocationFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_saveReminderFragment_to_selectLocationFragment)
  }
}
