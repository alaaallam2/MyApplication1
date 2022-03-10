package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main25)
        val videoView = findViewById<VideoView>(R.id.video_view)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.her
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)
    }
}