package com.cs407.dummybudget

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class BudgetComparisonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Access views using findViewById
        val rentCity1Text = findViewById<TextView>(R.id.rent_city1_text)
        val groceriesCity1Text = findViewById<TextView>(R.id.groceries_city1_text)
        val utilitiesCity1Text = findViewById<TextView>(R.id.utilities_city1_text)

        val rentCity2Text = findViewById<TextView>(R.id.rent_city2_text)
        val groceriesCity2Text = findViewById<TextView>(R.id.groceries_city2_text)
        val utilitiesCity2Text = findViewById<TextView>(R.id.utilities_city2_text)

        // Example budget data (replace with dynamic data as needed)
        rentCity1Text.text = "$1200"
        groceriesCity1Text.text = "$400"
        utilitiesCity1Text.text = "$150"

        rentCity2Text.text = "$1400"
        groceriesCity2Text.text = "$500"
        utilitiesCity2Text.text = "$170"
    }
}