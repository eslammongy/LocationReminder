package com.eslammongy.locationreminder.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/eslammongy/locationreminder/authentication/AuthenticationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/eslammongy/locationreminder/authentication/LoginViewModel;", "getViewModel", "()Lcom/eslammongy/locationreminder/authentication/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "launchSignInFlow", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginClick", "view", "Landroid/view/View;", "startRemindersActivity", "Companion", "app_debug"})
public final class AuthenticationActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    public static final int SIGN_IN_REQUEST_CODE = 1001;
    public static final com.eslammongy.locationreminder.authentication.AuthenticationActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.eslammongy.locationreminder.authentication.LoginViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void onLoginClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void launchSignInFlow() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void startRemindersActivity() {
    }
    
    public AuthenticationActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/eslammongy/locationreminder/authentication/AuthenticationActivity$Companion;", "", "()V", "SIGN_IN_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}