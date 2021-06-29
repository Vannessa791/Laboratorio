package com.example.test_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MessageActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        val intent = intent
        val message = intent.getStringExtra("Message")
        val messageTextView = findViewById<TextView>(R.id.textView)
        messageTextView.text = message
    }
}