package com.example.belajarlayouting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_submit)
        val isianNama = findViewById<EditText>(R.id.et_nama)
        val isianProdi = findViewById<EditText>(R.id.et_prodi)
        val isianNIM = findViewById<EditText>(R.id.et_nim)

        btn.setOnClickListener {
            val passNama = isianNama.text.toString()
            val passProdi = isianProdi.text.toString()
            val passNIM = isianNIM.text.toString()

            val go = Intent(this, InfoMahasiswa::class.java)
            go.putExtra("nama", passNama)
            go.putExtra("prodi", passProdi)
            go.putExtra("nim", passNIM)
            startActivity(go)
        }
    }
}