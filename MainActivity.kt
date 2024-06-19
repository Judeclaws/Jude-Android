@file:Suppress("ktlint:standard:import-ordering")

package com.smartherd.signinscreen

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "Login_Screen",
            ) {
                composable("Login_Screen") {
                    LoginScreen(navController)
                }
                composable("Second_Screen") {
                    SecondScreen(navController)
                }
                // LoginScreen()
                // SecondScreen()
            }
        }
    }
}