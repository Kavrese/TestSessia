package com.example.appsesions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_hello2.*

class Hello2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello2)
    }

    fun onClickPol(v: View){
        lin_male.background = ContextCompat.getDrawable(this, R.drawable.shape_back)
        llin_female.background = ContextCompat.getDrawable(this, R.drawable.shape_back)
        v.background = ContextCompat.getDrawable(this, R.drawable.shape_back_selected)
    }

    fun onClick(v: View){
        v.background = ContextCompat.getDrawable(this, R.drawable.shape_back_selected)
        Handler().postDelayed({
            startActivity(Intent(this, Hello3::class.java))
            finish()
        },250)
    }
}