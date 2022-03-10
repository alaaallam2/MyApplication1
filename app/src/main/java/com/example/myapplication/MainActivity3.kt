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


class MainActivity3 : AppCompatActivity() {
    var requestButton: Button? = null
    var alreadySignup: TextView? = null
    private var awesomeValidation: AwesomeValidation? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        awesomeValidation = AwesomeValidation(ValidationStyle.BASIC)
        requestButton = findViewById<View>(R.id.loginbtn) as Button
        alreadySignup = findViewById<View>(R.id.forgotpass) as TextView
        requestButton!!.setOnClickListener(mMyListener)
        requestButton!!.setOnClickListener(View.OnClickListener {

            val mainActivity2Intent = Intent(this@MainActivity3, MainActivity12::class.java)
            startActivity(mainActivity2Intent)
            Toast.makeText(applicationContext, "Login In Working!", Toast.LENGTH_LONG)

                .show()
        });
        alreadySignup!!.setOnClickListener(mMyListener)
        awesomeValidation!!.addValidation(
            this,
            R.id.editTextEmail,
            Patterns.EMAIL_ADDRESS,
            R.string.emailerror
        )
    }

    private val mMyListener =
        View.OnClickListener { v ->
            when (v.id /*to get clicked view id**/) {
                R.id.button6 -> if (awesomeValidation!!.validate()) {
                    Toast.makeText(applicationContext, "Login In Working!", Toast.LENGTH_LONG)

                        .show()

                }
                R.id.forgotpass -> {
                    val i = Intent(applicationContext, MainActivity4::class.java)
                    startActivity(i)

                }
                else -> {
                }
            }
        }
}
