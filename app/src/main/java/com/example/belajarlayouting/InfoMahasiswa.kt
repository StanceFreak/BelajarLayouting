package com.example.belajarlayouting

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InfoMahasiswa : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info_mahasiswa)

        val actionbar = supportActionBar

        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.setDisplayShowHomeEnabled(true)
        }

        val nama = findViewById<TextView>(R.id.tv_data_nama)
        val prodi = findViewById<TextView>(R.id.tv_data_prodi)
        val nim = findViewById<TextView>(R.id.tv_data_nim)

        val getNama = intent.getStringExtra("nama")
        val getProdi = intent.getStringExtra("prodi")
        val getNIM = intent.getStringExtra("nim")

        nama.setText(getNama)
        prodi.setText(getProdi)
        nim.setText(getNIM)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}