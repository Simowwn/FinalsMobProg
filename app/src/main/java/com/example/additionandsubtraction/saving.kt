package com.example.additionandsubtraction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class saving : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saving)

        val editText = findViewById<EditText>(R.id.inputMoney)
        val circularProgressBar = findViewById<CircularProgressBar>(R.id.CircularProgressBar)
        val totalMoneyTextView = findViewById<TextView>(R.id.totalMoneyTextView)
        val percentTextView = findViewById<TextView>(R.id.percentTextView)

        // Set the initial text of the total money and percent text views
        totalMoneyTextView.text = "Total money added: ₱0"
        percentTextView.text = "0%"

        // Set a click listener for the EditText
        editText.setOnFocusChangeListener { _, hasFocus ->
            if (!hasFocus) {
                // Get the user input
                val maxMoneyValue = editText.text.toString().toInt()

                // Set the max value of the progress bar
                circularProgressBar.progressMax = maxMoneyValue.toFloat()
            }
        }

        // Set click listeners for the buttons
        val twentyButton = findViewById<Button>(R.id.twenty)
        twentyButton.setOnClickListener {
            // Add 20 to the progress of the circular progress bar
            circularProgressBar.progress += 20f

            // Update the text views
            totalMoneyTextView.text = "Total money added: ₱${circularProgressBar.progress} "
            percentTextView.text = "${(circularProgressBar.progress / circularProgressBar.progressMax * 100).toInt()}%"
        }

        val fiftyButton = findViewById<Button>(R.id.fifty)
        fiftyButton.setOnClickListener {
            // Add 50 to the progress of the circular progress bar
            circularProgressBar.progress += 50f

            // Update the text views
            totalMoneyTextView.text = "Total money added: ₱${circularProgressBar.progress} "
            percentTextView.text = "${(circularProgressBar.progress / circularProgressBar.progressMax * 100).toInt()}%"
        }

        val hundredButton = findViewById<Button>(R.id.hundred)
        hundredButton.setOnClickListener {
            // Add 100 to the progress of the circular progress bar
            circularProgressBar.progress += 100f

            // Update the text views
            totalMoneyTextView.text = "Total money added: ₱${circularProgressBar.progress} "
            percentTextView.text = "${(circularProgressBar.progress / circularProgressBar.progressMax * 100).toInt()}%"
        }
    }
}