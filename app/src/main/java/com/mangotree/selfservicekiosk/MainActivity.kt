package com.mangotree.selfservicekiosk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mangotree.selfservicekiosk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buyerCardView.setOnClickListener {
            startActivity(Intent(this, OrderViewActivity::class.java))
            finish()
        }

        binding.sellerCardView.setOnClickListener {
            startActivity(Intent(this, SellerViewActivity::class.java))
            finish()
        }

    }
}