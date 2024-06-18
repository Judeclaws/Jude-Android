package com.smartherd.signinscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Suppress("ktlint:standard:function-naming")
@Preview
@Composable
fun SecondScreen(modifier: Modifier = Modifier) {
    Column(
        modifier =
            Modifier
                .background(color = Color.LightGray)
                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(10.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier =
                Modifier
                    .fillMaxWidth(),
        ) {
            Text(text = "New Appointment", fontSize = 28.sp)

            Spacer(modifier = Modifier.width(30.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Add New")
            }
        }

        AppointmentCard()
        AppointmentCard()
        AppointmentCard()
        AppointmentCard()
        AppointmentCard()
        AppointmentCard()
    }
}

@Suppress("ktlint:standard:function-naming")
@Composable
fun AppointmentCard(
    @Suppress("ktlint:standard:function-naming")
    modifier: Modifier = Modifier,
) {
    ElevatedCard(
        elevation =
            CardDefaults
                .cardElevation(defaultElevation = 16.dp),
        modifier =
            Modifier
                .size(width = 300.dp, height = 100.dp),
    ) {
        Text(
            text = "Juggler Scoler",
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            fontFamily = FontFamily.Serif,
        )
    }
}
