package com.sarthak.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

/** Activity containing the birthday card. */
class CardActivity : AppCompatActivity() {

    /** Declaring variables. */
    private lateinit var fromTV: TextView
    private lateinit var toTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        /** Initialising variables. */
        fromTV = findViewById(R.id.fromTV)
        toTV = findViewById(R.id.toTV)

        /** Getting intent values using keys. */
        val fromET = intent.getStringExtra(MainActivity.FROM_NAME)
        val toET = intent.getStringExtra(MainActivity.TO_NAME)

        /** Setting text in the textviews. */
        fromTV.text = getString(R.string.mainCardFromText, fromET)
        toTV.text = getString(R.string.mainCardToText, toET)

        /** Enabling back button. */
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}