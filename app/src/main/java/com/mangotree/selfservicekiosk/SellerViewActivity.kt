package com.mangotree.selfservicekiosk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.mangotree.selfservicekiosk.databinding.ActivitySellerViewBinding

class SellerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySellerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.orderListRecyclerView.layoutManager = LinearLayoutManager(this)

        val orders = mutableListOf<OrderData>()

        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))
        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))
        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))
        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))
        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))
        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))
        orders.add(OrderData("01239daad", listOf("ICE TEA SMALL - 10 (1)", "SISILOG - 60 (1)"), "70"))
        orders.add(OrderData("a+5das4d65", listOf("MAGNOLIA 15 (1)", "CHICKEN STRIPES 60 (1)"), "75"))


        binding.orderListRecyclerView.adapter = OrdersAdapter(orders, this)
    }
}