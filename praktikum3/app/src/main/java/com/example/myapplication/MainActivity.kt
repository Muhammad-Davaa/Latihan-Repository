package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var hitungButton: Button
    private lateinit var nextButton: Button
    private lateinit var sampleFragmentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hitungButton = findViewById(R.id.hitungButton)
        nextButton = findViewById(R.id.nextButton)
        sampleFragmentButton = findViewById(R.id.sampleFragmentButton)

        sampleFragmentButton.setOnClickListener {
            val intent = Intent(this@MainActivity, FragmentActivity::class.java)
            startActivity(intent)
        }

    }
}

