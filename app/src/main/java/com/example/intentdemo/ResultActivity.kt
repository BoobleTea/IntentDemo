
package com.example.intentdemo

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_result)

        val resultText = findViewById<TextView>(
            R.id.resultText
        )

        val text = intent.getStringExtra("input_text") ?: ""
        val type = intent.getStringExtra("intent_type") ?: ""

        resultText.text = "$text\n$type"
    }
}
