package com.uty.responsi_004

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.txt_username)
        val password = findViewById<EditText>(R.id.txt_pass)
        val button_Log = findViewById<Button>(R.id.btn_login)
        val regis = findViewById<TextView>(R.id.txt_regis)

        button_Log.setOnClickListener() {
            val datauser = username.text.toString()
            val datapass = password.text.toString()

            if (datauser.equals("cica") && datapass.equals("cica")) {
                Toast.makeText(this, "Anda Sukses Login",
                    Toast.LENGTH_SHORT).show();

                intent = Intent(this,Home::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this, "Password salah",
                    Toast.LENGTH_SHORT).show();
        }

        regis.setOnClickListener(){
            intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}
