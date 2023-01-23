package com.eslammongy.locationreminder.locationreminders.reminderslist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/eslammongy/locationreminder/locationreminders/reminderslist/RemindersListViewModel;", "Lcom/eslammongy/locationreminder/base/BaseViewModel;", "app", "Landroid/app/Application;", "dataSource", "Lcom/eslammongy/locationreminder/locationreminders/data/ReminderDataSource;", "(Landroid/app/Application;Lcom/eslammongy/locationreminder/locationreminders/data/ReminderDataSource;)V", "remindersList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/eslammongy/locationreminder/locationreminders/reminderslist/ReminderDataItem;", "getRemindersList", "()Landroidx/lifecycle/MutableLiveData;", "invalidateShowNoData", "", "loadReminders", "app_debug"})
public final class RemindersListViewModel extends com.eslammongy.locationreminder.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem>> remindersList = null;
    private final com.eslammongy.locationreminder.locationreminders.data.ReminderDataSource dataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem>> getRemindersList() {
        return null;
    }
    
    public final void loadReminders() {
    }
    
    /**
     * Inform the user that there's not any data if the remindersList is empty
     */
    private final void invalidateShowNoData() {
    }
    
    public RemindersListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.eslammongy.locationreminder.locationreminders.data.ReminderDataSource dataSource) {
        super(null);
    }
}