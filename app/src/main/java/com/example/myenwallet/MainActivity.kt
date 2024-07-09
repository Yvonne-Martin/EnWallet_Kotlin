package com.example.myenwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myenwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager=LinearLayoutManager(this)
         displayWallet()
    }
    fun displayWallet(){
        val wallet1 = Wallet("2 June 2024","Salary","kes 3444","")
        val wallet2 = Wallet("2 May 2024","Rent","kes 2344","")
        val wallet3 = Wallet("2 June 2024","Shopping","kes 3444","")
        val wallet4 = Wallet("2 May 2024","Bus fare","kes 2344","")
        val wallet5 = Wallet("2 June 2024","Water bill","kes 3444","")
        val wallet6 = Wallet("2 May 2024","Electricity","kes 2344","")
        val wallet7 = Wallet("2 May 2024","Groceries","kes 2344","")
        val wallet8 = Wallet("2 June 2024","Food","kes 3444","")
        val wallet9 = Wallet("2 May 2024","Bathings","kes 2344","")
        val myWallets = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8,wallet9)

        val walletAdapter = WalletAdapter(myWallets)
        binding.rvWallet.adapter=walletAdapter
    }
}


