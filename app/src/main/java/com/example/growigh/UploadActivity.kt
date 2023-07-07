package com.example.growigh

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class UploadActivity : AppCompatActivity() {

    private var  GALLERY_REQ_CODE=1000
    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload)

        imageView=findViewById<ImageView>(R.id.image)
        val btnGallery=findViewById<Button>(R.id.btnImage)

        btnGallery.setOnClickListener { v ->
            val iGallery = Intent(Intent.ACTION_PICK)
            iGallery.data = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            startActivityForResult(iGallery, GALLERY_REQ_CODE)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode== RESULT_OK)
        {
            if(requestCode==GALLERY_REQ_CODE)
            {
                imageView.setImageURI(data?.data)
            }
        }
    }
}