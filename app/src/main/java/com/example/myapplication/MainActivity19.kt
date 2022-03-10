package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class MainActivity19 : AppCompatActivity() {

    private  val  splashScreentimage :Long =2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main19)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity3::class.java))
            finish()
        },splashScreentimage)

    }
}