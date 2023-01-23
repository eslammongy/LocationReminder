package com.eslammongy.locationreminder.locationreminders.savereminder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0003J\"\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0017H\u0016J+\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.H\u0016\u00a2\u0006\u0002\u0010/J\u001a\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0017J\b\u00102\u001a\u00020\u0017H\u0003J\b\u00103\u001a\u00020\u0017H\u0003R\u001b\u0010\u0003\u001a\u00020\u00048VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/eslammongy/locationreminder/locationreminders/savereminder/SaveReminderFragment;", "Lcom/eslammongy/locationreminder/base/BaseFragment;", "()V", "_viewModel", "Lcom/eslammongy/locationreminder/locationreminders/savereminder/SaveReminderViewModel;", "get_viewModel", "()Lcom/eslammongy/locationreminder/locationreminders/savereminder/SaveReminderViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/eslammongy/locationreminder/databinding/FragmentSaveReminderBinding;", "geofencePendingIntent", "Landroid/app/PendingIntent;", "getGeofencePendingIntent", "()Landroid/app/PendingIntent;", "geofencePendingIntent$delegate", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "reminderDataItem", "Lcom/eslammongy/locationreminder/locationreminders/reminderslist/ReminderDataItem;", "runningQOrLater", "", "checkDeviceLocationSettingsAndStartGeofence", "", "resolve", "fineAndBackgroundLocationPermissionsApproved", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "", "grantedResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "requestFineAndBackgroundLocationPermissions", "startGeoFence", "Companion", "app_debug"})
public final class SaveReminderFragment extends com.eslammongy.locationreminder.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.eslammongy.locationreminder.databinding.FragmentSaveReminderBinding binding;
    private final boolean runningQOrLater = false;
    private com.eslammongy.locationreminder.locationreminders.reminderslist.ReminderDataItem reminderDataItem;
    private com.google.android.gms.location.GeofencingClient geofencingClient;
    private final kotlin.Lazy geofencePendingIntent$delegate = null;
    private static final java.lang.String TAG = "SaveReminderFragment";
    private static final int FINE_LOCATION_REQUEST_CODE = 33;
    private static final int FINE_AND_BACKGROUND_LOCATIONS_REQUEST_CODE = 34;
    private static final int TURN_DEVICE_LOCATION_ON_REQUEST_CODE = 35;
    private static final int FINE_LOCATION_PERMISSION_INDEX = 0;
    private static final int BACKGROUND_LOCATION_PERMISSION_INDEX = 1;
    private static final float GEOFENCE_RADIUS_IN_METERS = 100.0F;
    public static final com.eslammongy.locationreminder.locationreminders.savereminder.SaveReminderFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eslammongy.locationreminder.locationreminders.savereminder.SaveReminderViewModel get_viewModel() {
        return null;
    }
    
    private final android.app.PendingIntent getGeofencePendingIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final void requestFineAndBackgroundLocationPermissions() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final boolean fineAndBackgroundLocationPermissionsApproved() {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantedResults) {
    }
    
    private final void checkDeviceLocationSettingsAndStartGeofence(boolean resolve) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void startGeoFence() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public SaveReminderFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/eslammongy/locationreminder/locationreminders/savereminder/SaveReminderFragment$Companion;", "", "()V", "BACKGROUND_LOCATION_PERMISSION_INDEX", "", "FINE_AND_BACKGROUND_LOCATIONS_REQUEST_CODE", "FINE_LOCATION_PERMISSION_INDEX", "FINE_LOCATION_REQUEST_CODE", "GEOFENCE_RADIUS_IN_METERS", "", "TAG", "", "TURN_DEVICE_LOCATION_ON_REQUEST_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}