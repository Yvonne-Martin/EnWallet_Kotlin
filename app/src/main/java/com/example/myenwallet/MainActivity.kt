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
        setContentView(R.layout.activity_main)
        binding.rvWallet.layoutManager=LinearLayoutManager(this)
         displayWallet()
    }
    fun displayWallet(){
        val wallet1 = Wallet("2 June 2024","Kes 2344","kes 3444","")
        val wallet2 = Wallet("2 May 2024","Kes 20944","kes 2344","")
        val wallet3 = Wallet("2 June 2024","Kes 2344","kes 3444","")
        val wallet4 = Wallet("2 May 2024","Kes 20944","kes 2344","")
        val wallet5 = Wallet("2 June 2024","Kes 2344","kes 3444","")
        val wallet6 = Wallet("2 May 2024","Kes 20944","kes 2344","")
        val mywallets = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6)

        val walletAdapter = WalletAdapter(mywallets)
        binding.rvWallet.adapter=walletAdapter
    }
}


