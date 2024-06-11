package com.example.myap12.Composable

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.navOptions
import com.example.myap12.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {
    val localNavController = navController
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Doctor Appointment App") },
                navigationIcon = {
                    Icons.Default.ArrowBack
                },
                actions = {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = null
                    )
                }
            )


        },

        ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SignUp(navController = navController)

        }
    }
}
@Composable
fun SignUp(navController: NavController){

    var firstName by remember {
        mutableStateOf("")
    }
    var lastName by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
    OutlinedTextField(
        value = firstName ,
        label = { Text(text = "First Name")},
        onValueChange ={firstName=it} 
    )
    OutlinedTextField(
        value = lastName ,
        label = { Text(text = "Last Name")},
        onValueChange ={lastName=it}
    )
    OutlinedTextField(
        value = email ,
        label = { Text(text = "Email")},
        onValueChange ={email=it}
    )
    OutlinedTextField(
        value = password ,
        label = { Text(text = "Password")},
        onValueChange ={password=it}
    )
    Spacer(modifier = Modifier.height(6.dp))

    Button(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            navController.navigate(Screen.HomeScreen.route)
        }) {
        Text(text = "SignUp")
    }
}

    }
