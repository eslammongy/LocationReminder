package com.eslammongy.locationreminder.locationreminders.savereminder.selectreminderlocation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u0000 52\u00020\u00012\u00020\u0002:\u000256B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0003J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0003J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0011H\u0002J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\rH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J+\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203H\u0016\u00a2\u0006\u0002\u00104R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/eslammongy/locationreminder/locationreminders/savereminder/selectreminderlocation/SelectLocationFragment;", "Lcom/eslammongy/locationreminder/base/BaseFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "_viewModel", "Lcom/eslammongy/locationreminder/locationreminders/savereminder/SaveReminderViewModel;", "get_viewModel", "()Lcom/eslammongy/locationreminder/locationreminders/savereminder/SaveReminderViewModel;", "_viewModel$delegate", "Lkotlin/Lazy;", "binding", "Lcom/eslammongy/locationreminder/databinding/FragmentSelectLocationBinding;", "map", "Lcom/google/android/gms/maps/GoogleMap;", "marker", "Lcom/google/android/gms/maps/model/Marker;", "addLastLocationCallback", "", "addMapMarker", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "addPoiMarker", "poi", "Lcom/google/android/gms/maps/model/PointOfInterest;", "enableMapMyLocation", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLocationSelected", "onMapReady", "googleMap", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "Companion", "MapZoomLevel", "app_debug"})
public final class SelectLocationFragment extends com.eslammongy.locationreminder.base.BaseFragment implements com.google.android.gms.maps.OnMapReadyCallback {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy _viewModel$delegate = null;
    private com.eslammongy.locationreminder.databinding.FragmentSelectLocationBinding binding;
    private com.google.android.gms.maps.GoogleMap map;
    private com.google.android.gms.maps.model.Marker marker;
    private static final java.lang.String TAG = "SaveReminderFragment";
    private static final int FINE_LOCATION_PERMISSION_REQUEST_CODE = 1;
    private static final int TURN_DEVICE_LOCATION_ON_REQUEST_CODE = 29;
    private static final com.google.android.gms.maps.model.LatLng DEFAULT_LAT_LNG = null;
    public static final com.eslammongy.locationreminder.locationreminders.savereminder.selectreminderlocation.SelectLocationFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eslammongy.locationreminder.locationreminders.savereminder.SaveReminderViewModel get_viewModel() {
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
    
    private final void onLocationSelected() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    private final void addPoiMarker(com.google.android.gms.maps.model.PointOfInterest poi) {
    }
    
    private final void addMapMarker(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void enableMapMyLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void addLastLocationCallback() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public SelectLocationFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/eslammongy/locationreminder/locationreminders/savereminder/selectreminderlocation/SelectLocationFragment$MapZoomLevel;", "", "level", "", "(Ljava/lang/String;IF)V", "getLevel", "()F", "World", "Landmass", "City", "Streets", "Buildings", "app_debug"})
    public static enum MapZoomLevel {
        /*public static final*/ World /* = new World(0.0F) */,
        /*public static final*/ Landmass /* = new Landmass(0.0F) */,
        /*public static final*/ City /* = new City(0.0F) */,
        /*public static final*/ Streets /* = new Streets(0.0F) */,
        /*public static final*/ Buildings /* = new Buildings(0.0F) */;
        private final float level = 0.0F;
        
        public final float getLevel() {
            return 0.0F;
        }
        
        MapZoomLevel(float level) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/eslammongy/locationreminder/locationreminders/savereminder/selectreminderlocation/SelectLocationFragment$Companion;", "", "()V", "DEFAULT_LAT_LNG", "Lcom/google/android/gms/maps/model/LatLng;", "FINE_LOCATION_PERMISSION_REQUEST_CODE", "", "TAG", "", "TURN_DEVICE_LOCATION_ON_REQUEST_CODE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}