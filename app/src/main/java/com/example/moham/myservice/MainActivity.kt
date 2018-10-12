package com.example.moham.myservice

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var i = Intent(this@MainActivity,
                Service1::class.java)

        button.setOnClickListener {
            startService(i)
        }
            button2.setOnClickListener {
                stopService(i)
            }
        }

    }

