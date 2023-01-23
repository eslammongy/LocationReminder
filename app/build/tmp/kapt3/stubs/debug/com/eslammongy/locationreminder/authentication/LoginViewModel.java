package com.eslammongy.locationreminder.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/eslammongy/locationreminder/authentication/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "authenticationState", "Landroidx/lifecycle/LiveData;", "Lcom/eslammongy/locationreminder/authentication/LoginViewModel$AuthenticationState;", "getAuthenticationState", "()Landroidx/lifecycle/LiveData;", "AuthenticationState", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.eslammongy.locationreminder.authentication.LoginViewModel.AuthenticationState> authenticationState = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.eslammongy.locationreminder.authentication.LoginViewModel.AuthenticationState> getAuthenticationState() {
        return null;
    }
    
    public LoginViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/eslammongy/locationreminder/authentication/LoginViewModel$AuthenticationState;", "", "(Ljava/lang/String;I)V", "AUTHENTICATED", "UNAUTHENTICATED", "INVALID_AUTHENTICATION", "app_debug"})
    public static enum AuthenticationState {
        /*public static final*/ AUTHENTICATED /* = new AUTHENTICATED() */,
        /*public static final*/ UNAUTHENTICATED /* = new UNAUTHENTICATED() */,
        /*public static final*/ INVALID_AUTHENTICATION /* = new INVALID_AUTHENTICATION() */;
        
        AuthenticationState() {
        }
    }
}