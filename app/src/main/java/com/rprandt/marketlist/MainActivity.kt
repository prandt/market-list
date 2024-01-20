package com.rprandt.marketlist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rprandt.marketlist.ui.theme.MarketListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketListTheme {
                Column (
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    Arrangement.Top,
                    Alignment.CenterHorizontally,
                ) {
                    addProduct()
                    listProducts()
                }
            }
        }
    }
}

@Composable
fun addProduct() {
    FloatingActionButton(onClick = { /*TODO*/ }) {
        Icon(Icons.Filled.Add, contentDescription = "Add")
    }
}

@Composable
fun cardProduct(productName: String = "Product") {
    Card (
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp, 100.dp),
    ){
        Row (
            modifier = Modifier
                .padding(16.dp).fillMaxSize(),
            Arrangement.SpaceBetween,
            Alignment.CenterVertically
        ) {
            Text(text = productName)
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Delete, contentDescription = "Delete")
            }
        }
    }
}

@Composable
fun listProducts(modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        val products = listOf("Product 1", "Product 2", "Product 3")
        for (product in products) {
            cardProduct(product)
        }
    }
}


