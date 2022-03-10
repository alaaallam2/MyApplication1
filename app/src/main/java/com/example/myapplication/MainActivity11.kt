package com.example.myapplication


import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain11Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity11 : AppCompatActivity() {

    lateinit var binding: ActivityMain11Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain11Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sendBtn.setOnClickListener {
            val email=binding.emailAddress.text.toString()
            val subject=binding.sudject.text.toString()
            val massage=binding.massages.text.toString()

            val addresses=email.split(",".toRegex()).toTypedArray()
            val intent=Intent(Intent.ACTION_SENDTO).apply {
                data= Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL,addresses )
                putExtra(Intent.EXTRA_SUBJECT,subject)
                putExtra(Intent.EXTRA_TEXT,massage)

            }
            if (intent.resolveActivity(packageManager) !=null){
                startActivity(intent)
            }else{
                Toast.makeText(this@MainActivity11,"Requirad App is not installed",Toast.LENGTH_SHORT).show()
            }


        }
        val root_layout = findViewById<LinearLayout>(R.id.alaa)
        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(1)
        animDrawable.setExitFadeDuration(5000)
        animDrawable.start()
    }
}
