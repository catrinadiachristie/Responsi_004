package com.uty.responsi_004

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uty.responsi_004.ProdukRobot.Produk
import kotlinx.android.synthetic.main.item_produk.view.*

class ListProdukAdapter (val listProduk: ArrayList<Produk>) : RecyclerView.Adapter<ListProdukAdapter.ProdukViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListProdukAdapter.ProdukViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_produk, parent, false)
        return ProdukViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProduk.size

    }

    override fun onBindViewHolder(holder: ListProdukAdapter.ProdukViewHolder, position: Int) {
        val produk: Produk = listProduk[position]
        holder.tvProduk.text = produk.namapro
        holder.tvdetail.text = produk.detailpro
        Glide.with(holder.itemView.context)
            .load(produk.gambarpro)
            .into(holder.gbr)
    }

    inner class ProdukViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val tvProduk: TextView = itemView.findViewById(R.id.textview_itemnama_produk)
        val tvdetail: TextView = itemView.findViewById(R.id.textview_iteminfo_produk)
        val gbr: ImageView = itemView.findViewById(R.id.gambar_produk)
    }


}