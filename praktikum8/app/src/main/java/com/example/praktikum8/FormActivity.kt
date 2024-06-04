package com.example.praktikum8

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class FormActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var nameEditText: EditText
    private lateinit var priceEditText: EditText
    private lateinit var btnTambahFoto: Button
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        // Inisialisasi view
        imageView = findViewById(R.id.imageView)
        nameEditText = findViewById(R.id.nameEditText)
        priceEditText = findViewById(R.id.priceEditText)
        btnTambahFoto = findViewById(R.id.btnTambahFoto)
        btnSave = findViewById(R.id.btnSave)

        // Set OnClickListener untuk tombol tambah foto
        btnTambahFoto.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }

        // Set OnClickListener untuk tombol save
        btnSave.setOnClickListener {
            // Simpan data ke SQLite dan kembali ke MainActivity
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(imageBitmap)
        }
    }

    companion object {
        const val REQUEST_IMAGE_CAPTURE = 1
    }
}