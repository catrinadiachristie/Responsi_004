package com.uty.responsi_004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.responsi_004.ProdukRobot.Produk
import com.uty.responsi_004.ProdukRobot.ProdukData

class Home : AppCompatActivity() {
    private lateinit var rvProduk: RecyclerView

    private var list: ArrayList<Produk> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvProduk = findViewById(R.id.rv_robot)
        rvProduk.setHasFixedSize(true)
        list.addAll(ProdukData.urutanprodukrobot)
        showProdukList()
    }
    private fun showProdukList() {
        rvProduk.layoutManager = LinearLayoutManager(this)
        val produkAdapter = ListProdukAdapter(list)
        rvProduk.adapter = produkAdapter
    }
}
