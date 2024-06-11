package com.example.myap12.Composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontSynthesis.Companion.Weight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize() // Fill entire screen (improves responsiveness)
    ) {
        // Top row with New Appointment and Add New button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp), // Add some horizontal padding
            horizontalArrangement = Arrangement.SpaceBetween // Items spaced evenly
        ) {
            Text(text = "New Appointment", style = MaterialTheme.typography.bodyLarge) // Use a clear heading style
            Button(
                onClick = {} // Define your action here
            ) {
                Text(text = "Add New")
            }
        }

        // LazyColumn for attendee cards
        LazyColumn(
            modifier = Modifier.fillMaxHeight() // Fill remaining space vertically
        ) {
            items(attender) { attendee ->
                AttendeeCard( // Use the AttendeeCard composable
                    attendee = attendee,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp) // Add padding to cards
                )
            }
        }
    }
}



@Composable
fun AttendeeCard(attendee: Attendees, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(8.dp),

    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = attendee.name, style = MaterialTheme.typography.bodyMedium)
            Text(text = attendee.description, style = MaterialTheme.typography.labelSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Time:", style = MaterialTheme.typography.labelSmall)
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = attendee.time, style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}
