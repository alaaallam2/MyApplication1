package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView


class splash : AppCompatActivity() {
    val appname =findViewById<ImageView>(R.id.fading_text_view)
    val splashimg =findViewById<ImageView>(R.id.img)
    val  lottieAnimationView =findViewById<LottieAnimationView>(R.id.lottie)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        splashimg.animate().translationY(-2500f).setDuration(1000).startDelay = 5000
        appname.animate().translationY(2000f).setDuration(1000).startDelay = 5000
        lottieAnimationView.animate().translationY(1500f).setDuration(1000).startDelay = 5000
        Handler().postDelayed(
            { startActivity(Intent(this@splash, MainActivity::class.java)) },
            6000
        )
    }
}