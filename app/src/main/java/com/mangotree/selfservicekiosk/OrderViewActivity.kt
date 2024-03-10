package com.mangotree.selfservicekiosk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mangotree.selfservicekiosk.databinding.ActivityOrderViewBinding

class OrderViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.orderCardView.setOnClickListener {
            startActivity(Intent(this, OrderListViewActivity::class.java))
        }

    }
}