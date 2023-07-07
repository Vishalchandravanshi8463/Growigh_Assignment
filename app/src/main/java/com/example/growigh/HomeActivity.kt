package com.example.growigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var btnFeeds=findViewById<Button>(R.id.btnFeed)
        var btnUploads=findViewById<Button>(R.id.btnUpload)


        btnFeeds.setOnClickListener {
            intent= Intent(applicationContext,feedsActivity::class.java)
            startActivity(intent)
        }
        btnUploads.setOnClickListener {
            intent=Intent(applicationContext,UploadActivity::class.java)
            startActivity(intent)
        }
    }
}