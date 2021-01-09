package com.sarthak.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

/** Activity from where we take user input for birthday card. */
class MainActivity : AppCompatActivity() {

    /** Declaring variables. */
    private lateinit var fromET: EditText
    private lateinit var toET: EditText
    private lateinit var submitButton: Button

    /** Declaring keys. */
    companion object{
        const val FROM_NAME = "from"
        const val TO_NAME = "to"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Initialising variables. */
        fromET = findViewById(R.id.fromET)
        toET = findViewById(R.id.toET)
        submitButton = findViewById(R.id.submitButton)

        /** Starting card activity on button click. */
        submitButton.setOnClickListener {
            val intent = Intent(this, CardActivity::class.java)
            intent.putExtra(FROM_NAME, fromET.text.toString())
            intent.putExtra(TO_NAME, toET.text.toString())
            startActivity(intent)
        }
    }
}