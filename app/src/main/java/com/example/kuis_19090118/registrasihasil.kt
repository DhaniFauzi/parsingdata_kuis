package com.example.kuis_19090118

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registrasihasil.*

class registrasihasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasihasil)
        //
        val actionbar = supportActionBar
        actionbar!!.title = "Hasil Registrasi"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
        //
        val namahasil = intent.getStringExtra("Nama")
        val kampushasil = intent.getStringExtra("kampus")
        val nohphasil = intent.getIntExtra("nohp", 0)
        val alamathasil = intent.getStringExtra("alamat")

        val hasil1 = "Nama : $namahasil"
        val hasil2 = "Kampus : $kampushasil"
        val hasil3 = "No.hp : $nohphasil"
        val hasil4 = "alamat : $alamathasil"
        Output.text = hasil1
        Output2.text = hasil2
        Output3.text = hasil3
        Output4.text = hasil4
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}