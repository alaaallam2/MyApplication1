package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity2 : AppCompatActivity() {
    private  val  splashScreentimage :Long =2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity19::class.java))
            finish()
        },splashScreentimage)

    }
}