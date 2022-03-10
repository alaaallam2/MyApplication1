package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout

class MainActivity28 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main28)
        val url="https://youtube.com/watch?v=PfwO4rrd5CM&t=55s"

            val intent=Intent(Intent.ACTION_SEND)
            intent.type="text/plain"
            intent.putExtra("share this",url )
            val chooser= Intent.createChooser(intent,"share using...")
            startActivity(chooser)

    }
}