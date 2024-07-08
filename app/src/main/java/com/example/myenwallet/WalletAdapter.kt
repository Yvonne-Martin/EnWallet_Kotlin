package com.example.myenwallet

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WalletAdapter(var wallet : List<Wallet>): RecyclerView.Adapter<WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {

    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {

    }
}
class WalletViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    var tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    var tvMoneyIn = itemView.findViewById<TextView>(R.id.tvMoneyIn)
    var tvMoneyOut = itemView.findViewById<TextView>(R.id.tvMoneyOut)
    var tvBalance = itemView.findViewById<TextView>(R.id.tvBalance)
    var tvTransactions = itemView.findViewById<TextView>(R.id.tvTransactions)
    var tvm1 = itemView.findViewById<TextView>(R.id.tvm1)
    var tvm2 = itemView.findViewById<TextView>(R.id.tvm2)
    var tvm3 = itemView.findViewById<TextView>(R.id.tvm3)
    var tvm4 = itemView.findViewById<TextView>(R.id.tvm4)

}