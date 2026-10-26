
package com.example.intentdemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.inputText)

        val explicitButton = findViewById<Button>(
            R.id.explicitButton
        )

        val implicitButton = findViewById<Button>(
            R.id.implicitButton
        )

        // Явный Intent
        explicitButton.setOnClickListener {
            val intent = Intent(
                this,
                ResultActivity::class.java
            )

            intent.putExtra(
                "input_text",
                input.text.toString()
            )

            intent.putExtra("intent_type", "Intent")

            startActivity(intent)
        }

        // Неявный Intent
        implicitButton.setOnClickListener {
            val intent = Intent(
                "com.example.intentdemo.SHOW_TEXT"
            )

            intent.setPackage(packageName)

            intent.putExtra(
                "input_text",
                input.text.toString()
            )

            intent.putExtra(
                "intent_type",
                "Implicit Intent"
            )

            startActivity(intent)
        }
    }
}
