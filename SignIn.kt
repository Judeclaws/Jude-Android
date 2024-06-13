@file:Suppress("ktlint:standard:no-empty-file")

package com.smartherd.jetpacktutorial

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Suppress("ktlint:standard:function-naming")
@Preview
@Composable
fun SignIn() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Sample app")
                },
                navigationIcon = {
                    Icons.Default.Menu
                },
                actions = {
                    Icons.Default.Search
                    Icons.Default.MoreVert
                },
            )
        },
    ) { paddingValues ->
//
        LazyColumn(
            modifier = Modifier.padding(paddingValues),
        ) {
            items(20) {
                Card()
            }
        }
    }
}
p
@Suppress("ktlint:standard:function-naming")
@Composable
fun Card() {
    Card(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .size(80.dp),
    ) {
        Text(
            text = "Column",
            fontSize = 20.sp,
        )
    }
    Spacer(modifier = Modifier.height(10.dp))
}
