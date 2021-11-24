package com.example.kuis_19090118

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        parsingdata()
    }

    fun parsingdata() {
        submit.setOnClickListener {
            val nama = nama.text.toString()
            val kampus = kampus.text.toString()
            val nohp = nohp.text.toString().toInt()
            val alamat = alamat.text.toString()
            Intent(this, registrasihasil::class.java).also {
                it.putExtra("Nama", nama)
                it.putExtra("kampus", kampus)
                it.putExtra("nohp", nohp)
                it.putExtra("alamat", alamat)
                startActivity(it)
            }
        }
    }
}