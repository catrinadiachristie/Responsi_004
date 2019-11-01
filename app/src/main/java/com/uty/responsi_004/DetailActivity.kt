package com.uty.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent

        //val lsp:Int = intent.getIntExtra("nomor")
        val lsp = intent.getStringExtra("nomor")


        if (lsp == "Ang") {
            lsp.toString()
            detail_txt.text = lsp + " = Ini botak banget = "
        }
        else if (lsp == "Fornite" ) {
            detail_txt.text =  lsp + " =  fornite ga ngerti aku tu, cuman pubg doang = "
        }
        else if (lsp == "Dari Jepang") {
            detail_txt.text = lsp + " = Sebenarnya ini aku gatau apa mas haha "
        }
        else if (lsp == "Rambut Keriting" ) {
            detail_txt.text = lsp + " = Rambutnya keriting bawa pedang hehe gatau lagi huuh = "
        }
        else if (lsp == "Tuyul") {
            detail_txt.text = lsp + " = Tuyul hijau buatan mana, mana mana senang :( "
        }
        else if (lsp == "Rambut Merah" ) {
            detail_txt.text = lsp + " = Rambut merah rada serem tapi cute tapi seram kayak film vampire"
        }
        else if (lsp == "Black") {
            detail_txt.text = lsp + " = kirain blackpanter rupanya bukan,"
        }
        else if (lsp == "Marvel" ) {
            detail_txt.text = lsp + " = marvel film hits, mas pasti nonton kan?"
        }
        else if (lsp == "Amitaba") {
            detail_txt.text = lsp + " = kalo ini gatau apa, luculah"
        }
        else if (lsp == "Spiderman" ) {
            detail_txt.text = lsp + " = Spiderman coming home udah nonton?"
        }
        else
            Toast.makeText(this, "Anda salah :(", Toast.LENGTH_SHORT).show()
    }
}
