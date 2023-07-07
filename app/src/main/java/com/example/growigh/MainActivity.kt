package com.example.growigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReadyy=findViewById<Button>(R.id.btnReady)
        val btnSkipp=findViewById<Button>(R.id.btnSkip)
        btnReadyy.setOnClickListener {

            intent= Intent(applicationContext,HomeActivity::class.java)

            startActivity(intent)
        }

        btnSkipp.setOnClickListener {
            android.os.Process.killProcess(android.os.Process.myPid())
        }

    }
}