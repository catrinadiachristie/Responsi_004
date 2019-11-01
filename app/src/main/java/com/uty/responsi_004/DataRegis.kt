package com.uty.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data_regis.*
import kotlinx.android.synthetic.main.activity_register.*

class DataRegis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_regis)

        val intent = intent
        val namareg = intent.getStringExtra("Nama")
        val alamatreg = intent.getStringExtra("Alamat")
        val hpreg = intent.getStringExtra("Nomor Telpon")
        val emailreg = intent.getStringExtra("Email")
        val userregis = intent.getStringExtra("Username")
        val passregis = intent.getStringExtra("Password")

        textView4.text = "Nama                :" + namareg
        textView5.text = "Alamat              : " + alamatreg
        textView6.text = "Nomor HP       : " + hpreg
        textView7.text = "Email              : " + emailreg
        textView8.text = "Username      : " + userregis
        textView9.text = "Password      : " + passregis
    }
}
