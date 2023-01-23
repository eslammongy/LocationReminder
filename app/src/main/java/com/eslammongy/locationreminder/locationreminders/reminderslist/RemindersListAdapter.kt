package com.eslammongy.locationreminder.locationreminders.reminderslist

import com.eslammongy.locationreminder.R
import com.eslammongy.locationreminder.base.BaseRecyclerViewAdapter


//Use data binding to show the reminder on the item
class RemindersListAdapter(callBack: (selectedReminder: ReminderDataItem) -> Unit) :
    BaseRecyclerViewAdapter<ReminderDataItem>(callBack) {
    override fun getLayoutRes(viewType: Int) = R.layout.it_reminder
}