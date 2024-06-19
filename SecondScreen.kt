@file:Suppress("ktlint:standard:import-ordering", "PreviewAnnotationInFunctionWithParameters")

package com.smartherd.signinscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
// import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Suppress("ktlint:standard:function-naming")
@Composable
fun SecondScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Doctor Appointment") },
                actions = {
                    IconButton(onClick = { /*TODO*/ }, Modifier.background(color = Color.LightGray)) {
                        Text(text = "Add new", fontFamily = FontFamily.SansSerif, fontSize = 16.sp, fontWeight = FontWeight.ExtraBold)
//
                    }
                },
            )
        },
    ) { paddingValues ->
        val scrollState = rememberScrollState()
        LazyColumn(
            modifier =
                Modifier
                    .background(color = Color.LightGray)
                    .fillMaxSize()
                    .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start,
        ) {
            // Replace repetitive cards with LazyColumn

            items(
                // Provide a list of data for appointments
                listOf(
                    "Juggler Scoler",
                    "Doctor Timekeeper",
                    "Hairdresser Stylist",
                    "Juggler Scoler",
                    "Doctor Timekeeper",
                    "Hairdresser Stylist",
                    "Juggler Scoler",
                    "Doctor Timekeeper",
                    "Hairdresser Stylist",
                    "Juggler Scoler",
                    "Doctor Timekeeper",
                    "Hairdresser Stylist",
                ),
            ) { appointmentName ->
                AppointmentCard(appointmentName) // Pass appointment name to card
            }
        }
    }
}

@Preview
@Suppress("ktlint:standard:function-naming")
@Composable
fun AppointmentCard(
    appointmentName: String,
    modifier: Modifier = Modifier,
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 16.dp),
        modifier =
            modifier
                .size(width = 300.dp, height = 100.dp)
                .padding(8.dp)
                .clickable { },
    ) {
        Text(
            text = appointmentName,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            fontFamily = FontFamily.Serif,
        )
    }
}
