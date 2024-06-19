@file:Suppress("ktlint:standard:no-wildcard-imports", "PreviewAnnotationInFunctionWithParameters")

package com.smartherd.signinscreen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.smartherd.signinscreen.R.drawable

@Preview
@Composable
@Suppress("ktlint:standard:function-naming")
fun LoginScreen(navController: NavController) {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(id = drawable.user), contentDescription = "User Login", modifier = Modifier.size(100.dp))
        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Login To Your Account", fontSize = 14.sp, fontWeight = FontWeight.Medium)

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email Address") },
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation(),
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            Log.i("Credentials", "Email:$email Password:$password")
            navController.navigate("Second_Screen")
        }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Forget Password ?", modifier = Modifier.clickable {})

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Or Sign In With")
        Row(
            modifier =
                Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            Image(
                painter = painterResource(id = drawable.facebook),
                contentDescription = "Google",
                modifier =
                    Modifier
                        .size(40.dp)
                        .clickable {},
            )

            Image(
                painter = painterResource(id = drawable.twitter),
                contentDescription = "Google",
                modifier =
                    Modifier
                        .size(40.dp)
                        .clickable {},
            )

            Image(
                painter = painterResource(id = drawable.google),
                contentDescription = "Google",
                modifier =
                    Modifier
                        .size(40.dp)
                        .clickable {},
            )
        }
    }
}
