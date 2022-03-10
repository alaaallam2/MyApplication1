package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)
        val finish_Quiz =findViewById<Button>(R.id.button4)
        finish_Quiz.setOnClickListener(View.OnClickListener {
            val mainActivity2Intent = Intent(this@MainActivity15, MainActivity3::class.java)
            startActivity(mainActivity2Intent)
        });
    }
}