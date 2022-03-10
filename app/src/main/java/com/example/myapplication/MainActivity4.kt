package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.basgeekball.awesomevalidation.AwesomeValidation
import com.basgeekball.awesomevalidation.ValidationStyle


class MainActivity4 : AppCompatActivity() {
    var requestButton: Button? = null
    var alreadySignin: TextView? = null
    private var awesomeValidation: AwesomeValidation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        awesomeValidation = AwesomeValidation(ValidationStyle.BASIC)
        requestButton = findViewById<View>(R.id.button6) as Button
        alreadySignin = findViewById<View>(R.id.already_signin) as TextView
        requestButton!!.setOnClickListener(mMyListener)
        alreadySignin!!.setOnClickListener(mMyListener)
        val regexPassword =
            "(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])(?=.*[~`!@#\\$%\\^&\\*\\(\\)\\-_\\+=\\{\\}\\[\\]\\|\\;:\"<>,./\\?]).{8,}"
        //adding validation to edittexts
        awesomeValidation!!.addValidation(
            this,
            R.id.editTextName,
            "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$",
            R.string.nameerror
        )
        awesomeValidation!!.addValidation(
            this,
            R.id.editTextEmail,
            Patterns.EMAIL_ADDRESS,
            R.string.emailerror
        )
        awesomeValidation!!.addValidation(
            this,
            R.id.editTextMobile,
            "^[2-9]{2}[0-9]{8}$",
            R.string.mobileerror
        )
        awesomeValidation!!.addValidation(
            this,
            R.id.editTextEmail1,
            regexPassword,
            R.string.passworderror
        )
    }

    private val mMyListener =
        View.OnClickListener { v ->
            when (v.id) {
                R.id.button6 -> if (awesomeValidation!!.validate()) {
                    Toast.makeText(applicationContext, "Its Working!", Toast.LENGTH_LONG).show()
                }
                R.id.already_signin -> {
                    val i = Intent(applicationContext, MainActivity3::class.java)
                    startActivity(i)
                }
                else -> {
                }
            }
        }
}
