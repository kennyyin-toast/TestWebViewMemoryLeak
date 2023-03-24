package com.example.testmemoryleak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testwmemoryleak.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMain = findViewById<Button>(R.id.buttonmain)

        buttonMain.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }
    }
}