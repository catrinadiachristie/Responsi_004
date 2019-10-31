package com.uty.responsi_004.ProdukRobot

import com.uty.responsi_004.R

object ProdukData {
    private val produkname = arrayOf(
        "Ang",
        "Fornite",
        "Dari Jepang",
        "Rambut Keriting",
        "Tuyul",
        "Rambut Merah",
        "Black",
        "Marvel",
        "Amitaba",
        "Spiderman"
    )

    private val detailrpro = arrayOf(
        "Ang film enak deh ... Coba nonton :(",
        "Fornite game",
        "Dari Jepang kurang tau tapi lucu",
        "Rambutnya keriting bawa pedang hehe",
        "Tuyul hijau buatan mana",
        "Rambut merah rada serem tapi cute",
        "Black ini kirain blackpanter",
        "Marvel bagus, udah nonton?",
        "Amitaba kurang tau apaan",
        "Spiderman ini manusia laba laba ya"
    )

    private val progambar = intArrayOf(
        R.drawable.botak,
        R.drawable.fornite,
        R.drawable.gatau,
        R.drawable.gatau1,
        R.drawable.gatau2,
        R.drawable.gatau3,
        R.drawable.gatau4,
        R.drawable.marvel,
        R.drawable.paan,
        R.drawable.spi)

    val urutanprodukrobot: ArrayList<Produk>
    get() {
        val list = arrayListOf<Produk>()
        for (position in produkname.indices) {
            val produk = Produk()
            produk.namapro = produkname[position]
            produk.detailpro = detailrpro[position]
            produk.gambarpro = progambar[position]
            list.add(produk)
        }
        return list
    }
}