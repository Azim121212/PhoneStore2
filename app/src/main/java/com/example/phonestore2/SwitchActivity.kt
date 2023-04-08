package com.example.phonestore2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonestore2.auth.LoginActivity
import com.example.phonestore2.auth.RegisterActivity
import java.util.*

class SwitchActivity : AppCompatActivity() {
    var timer: Timer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
        timer = Timer()
        timer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@SwitchActivity, RegisterActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)
    }
}