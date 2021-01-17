package com.example.appsesions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.content.ContextCompat

class Hello1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello1)
    }

    fun onClick(v: View){
        v.background = ContextCompat.getDrawable(this, R.drawable.shape_back_selected)
        Handler().postDelayed({
            startActivity(Intent(this, Hello2::class.java))
            finish()
        },250)
    }
}