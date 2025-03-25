package com.example.w1d2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.w1d2.ui.theme.W1D2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            W1D2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ethar",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }

        // Declare and initialize Kotlin data types
        val name: String = "Ethar"
        val age: Int = 24
        val PI: Double = 3.14
        val likeProgramming: Boolean = true
        val character: Char = 'A'

        // Create and manipulate an array or a collection (List, Set, Map).
        val colors = arrayOf("Pink", "White", "Black")
        val fruits = listOf("Apple", "Banana", "Cherry")
        val numbers = setOf(1, 2, 3)
        val map = mapOf(1 to "One", 2 to "Two" , 3 to "Three")

        // Implement control flow using if-else and when expressions.
        if (age >= 18) {
            println("You are an adult")
        } else {
            println("You are a child")
        }

        val today = 3
        val result = when (today) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Invalid"
        }

        // Write a function and use a lambda expression.
        fun sum(x: Int, y: Int): Int {
            return x + y
        }

        val sub = { a: Int , b: Int -> a - b}
        val sub_result = sum(10, 19)


    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hi, My Name is $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    W1D2Theme {
        Greeting("Android")
    }
}