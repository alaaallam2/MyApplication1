package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main26)
        val mediaController =MediaController(this)
        val videoView=findViewById<VideoView>(R.id.videoView)
        mediaController.setAnchorView(videoView)
        val onlineUri = Uri.parse("video")
        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.her}")
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

        val mediaController1 = MediaController(this)
        val videoView1=findViewById<VideoView>(R.id.videoView1)
        mediaController1.setAnchorView(videoView1)
        val onlineUri1 = Uri.parse("ahmed")
        val offlineUri1 = Uri.parse("android.resource://$packageName/${R.raw.her}")
        videoView1.setMediaController(mediaController1)
        videoView1.setVideoURI(offlineUri1)
        videoView1.requestFocus()
        //videoView1.start()

        val mediaController2 =MediaController(this)
        val videoView2=findViewById<VideoView>(R.id.videoView2)
        mediaController2.setAnchorView(videoView2)
        val onlineUri2 = Uri.parse("emy")
        val offlineUri2 = Uri.parse("android.resource://$packageName/${R.raw.her}")
        videoView2.setMediaController(mediaController2)
        videoView2.setVideoURI(offlineUri2)
        videoView2.requestFocus()
        //videoView2.start()

        val mediaController3 =MediaController(this)
        val videoView3=findViewById<VideoView>(R.id.videoView3)
        mediaController3.setAnchorView(videoView3)
        val onlineUri3 = Uri.parse("amr")
        val offlineUri3 = Uri.parse("android.resource://$packageName/${R.raw.her}")
        videoView3.setMediaController(mediaController3)
        videoView3.setVideoURI(offlineUri3)
        videoView3.requestFocus()
        //videoView3.start()



    }
}