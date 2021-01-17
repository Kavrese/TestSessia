package com.example.appsesions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        Handler().postDelayed({
            val intent= Intent(this, Hello1::class.java)
            startActivity(intent)
            finish()
        }, 1500)
    }
}