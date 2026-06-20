package com.example.bakery_revenue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.example.bakery_revenue.ui.theme.BakeryRevenueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // --- CHALLENGE 4 ---
        setContent {
            BakeryRevenueTheme {
                BakeryRevenueScreen()
            }
        }
    }
}

// --- CHALLENGE 3 & 6 ---
@Composable
fun BakeryRevenueScreen() {
    // --- CHALLENGE 6 ---
    var muffinsSold by remember { mutableStateOf("") }
    var muffinPrice by remember { mutableStateOf("") }
    var cakesSold by remember { mutableStateOf("") }
    var cakePrice by remember { mutableStateOf("") }

    // --- CHALLENGE 7, 8 & NEXT ---
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(all = 16.dp)
    ) {
        Text("Bakery Revenue")
        Spacer(modifier = Modifier.height(16.dp))

        // --- CHALLENGE 7 ---
        OutlinedTextField(
            value = muffinsSold,
            onValueChange = { muffinsSold = it },
            label = { Text("Muffins sold") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        // --- CHALLENGE 8 ---
        OutlinedTextField(
            value = muffinPrice,
            onValueChange = { muffinPrice = it },
            label = { Text("Price per muffin") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        // --- CAKES DETECTED ---
        OutlinedTextField(
            value = cakesSold,
            onValueChange = { cakesSold = it },
            label = { Text("Cakes sold") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = cakePrice,
            onValueChange = { cakePrice = it },
            label = { Text("Price per cake") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
    }
}

// --- CHALLENGE 5 ---
@Preview(showBackground = true)
@Composable
fun BakeryRevenueScreenPreview() {
    BakeryRevenueTheme {
        BakeryRevenueScreen()
    }
}