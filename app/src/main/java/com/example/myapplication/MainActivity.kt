package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tomer.fadingtextview.FadingTextView
import java.time.temporal.TemporalAdjusters.next

class MainActivity : AppCompatActivity() {
    private var fadingTextView: FadingTextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val finish_Quiz =findViewById<Button>(R.id.button3)
        val root_layout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.root_layout)
        val animDrawable = root_layout.background as AnimationDrawable
        setContentView(R.layout.activity_main)

        fadingTextView = findViewById(R.id.fading_text_view)

        animDrawable.setEnterFadeDuration(1)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()
        finish_Quiz.setOnClickListener(View.OnClickListener {
            val mainActivity2Intent = Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(mainActivity2Intent)

        });

    }}
