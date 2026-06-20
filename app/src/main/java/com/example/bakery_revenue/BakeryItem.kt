package com.example.bakery_revenue

import androidx.compose.runtime.Composable

data class BakeryItem(
    val name: String,
    val sold: Double,
    val price: Double
) {
    fun revenue(): Double {
        return sold * price
    }

    @Composable
    fun BakeryRevenueScreen() {
        // Se deja vacío por ahora, justo como pidió el profesor
    }
}