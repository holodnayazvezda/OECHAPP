package com.example.oechappfinal.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.oechappfinal.data.application.ApplicationContext
import com.example.oechappfinal.data.Storage
import com.example.oechappfinal.ui.navigation.NavGraph
import com.example.oechappfinal.ui.screen.onboarding.OnboardingData
import com.example.oechappfinal.ui.theme.OECHAPPFINALTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ApplicationContext.setContext(this)
        val storage: Storage = Storage(this)
//        storage.clear()
        val onboardingData = OnboardingData()
        setContent {
            OECHAPPFINALTheme {
                NavGraph(
                    if (storage.idOfOnboardingScreen <= 2) {
                        "OnboardingFirstScreen"
                    } else {
                        "SignUpScreen"
                    },
                    onboardingData
                )
            }
        }
    }
}