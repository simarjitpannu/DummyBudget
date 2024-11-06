package com.cs407.dummybudget

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class EditBudgetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Access views using findViewById
        val currentBudgetText = findViewById<TextView>(R.id.current_budget_text)
        val projectedBudgetText = findViewById<TextView>(R.id.projected_budget_text)
        val newBudgetInput = findViewById<EditText>(R.id.new_budget_input)
        val saveButton = findViewById<Button>(R.id.save_button)

        // Set example current and projected budget values (replace with dynamic data as needed)
        currentBudgetText.text = "$2000"
        projectedBudgetText.text = "$2500"

        // Handle save button click
        saveButton.setOnClickListener {
            val newBudget = newBudgetInput.text.toString().toIntOrNull()
            if (newBudget != null) {
                // Code to save the new budget
                // Update UI or show a confirmation message
            } else {
                newBudgetInput.error = "Please enter a valid number"
            }
        }
    }
}