package com.uty.responsi_004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.security.KeyStore
import java.lang.Override as Override1

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val namaregis = findViewById<EditText>(R.id.txt_nama_regis)
        val alamatregis = findViewById<EditText>(R.id.txt_alamat_regis)
        val nomortlpregis = findViewById<EditText>(R.id.txt_hp_regis)
        val emailregis = findViewById<EditText>(R.id.txt_email_regis)
        val usernmregis = findViewById<EditText>(R.id.txt_username_regis)
        val passregis = findViewById<EditText>(R.id.txt_pass_regis)
        val btnRegis = findViewById<Button>(R.id.btn_regis)

        btnRegis.setOnClickListener() {
            val datanamaregis = namaregis.text.toString()
            val dataalamatregis = alamatregis.text.toString()
            val datanomortlpregis = nomortlpregis.text.toString()
            val dataemailregis = emailregis.text.toString()
            val datauserregis = usernmregis.text.toString()
            val datapassregis = passregis.text.toString()

            intent = Intent(this,DataRegis::class.java)
            intent.putExtra("Nama", datanamaregis)
            intent.putExtra("Alamat", dataalamatregis)
            datanomortlpregis.toInt()
            intent.putExtra("Nomor Telpon", datanomortlpregis)
            intent.putExtra("Email", dataemailregis)
            intent.putExtra("Username", datauserregis)
            intent.putExtra("Password", datapassregis)

            startActivity(intent)
        }
    }
}
