package com.example.myenwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var wallet : List<Wallet>):
    RecyclerView.Adapter<WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.wallet,parent,false)
        return WalletViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = wallet[position]
        holder.tvDate.text = wallet.tvDate
        holder.tvAmount.text=wallet . tvAmount
        holder.tvSalary.text =wallet.tvSalary




    }

    override fun getItemCount(): Int {
        return wallet.size

    }
}
class WalletViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)


}