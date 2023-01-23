package com.udacity.project4.authentication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.IdpResponse
import com.google.firebase.auth.FirebaseAuth
import com.udacity.project4.R
import com.udacity.project4.locationreminders.RemindersActivity

class AuthenticationActivity : AppCompatActivity() {

    companion object {
        const val SIGN_IN_REQUEST_CODE = 1001
    }

    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)

        viewModel.authenticationState.observe(this, Observer { authenticationState ->
            when (authenticationState) {
                LoginViewModel.AuthenticationState.AUTHENTICATED -> {
                    Log.i(
                        "VTSEN",
                        "Authentication state: $authenticationState"
                    )

                    startRemindersActivity()
                }

//                else ->
//                    // do nothing
//                )
                else -> {}
            }
        })

    }

    fun onLoginClick(view:View) {
        launchSignInFlow()
    }

    private fun launchSignInFlow() {

        val providers = arrayListOf(
            AuthUI.IdpConfig.EmailBuilder().build(),
            AuthUI.IdpConfig.GoogleBuilder().build()
        )

        startActivityForResult(
            AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers)
                .setLogo(R.drawable.welcome)
                .setTheme(R.style.ThemeOverlay_AppCompat_DayNight)
                .build(),
            SIGN_IN_REQUEST_CODE
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == SIGN_IN_REQUEST_CODE) {

            val response = IdpResponse.fromResultIntent(data)
            if (resultCode == Activity.RESULT_OK) {
                Log.i(
                    "VTSEN",
                    "Successfully signed in user " +
                            "${FirebaseAuth.getInstance().currentUser?.displayName}!"
                )
                startRemindersActivity()

            } else {
                // Sign in failed. If response is null the user canceled the sign-in flow using
                // the back button. Otherwise check response.getError().getErrorCode() and handle
                // the error.
                Log.i("VTSEN", "Sign in unsuccessful ${response?.error?.errorCode}")
            }
        }
    }

    private fun startRemindersActivity() {
        val intent = Intent(this, RemindersActivity::class.java)
        startActivity(intent)
    }
}
