package com.example.testmemoryleak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testwmemoryleak.R

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val buttonMain = findViewById<Button>(R.id.button1)

        buttonMain.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

    }
}