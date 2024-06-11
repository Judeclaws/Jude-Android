package com.example.myap12

import androidx.compose.ui.graphics.BlendMode.Companion.Screen

sealed class Screen(val route: String){
    object HomeScreen: Screen("Home")
    object SignUpScreen: Screen("Sign_UP")

}
