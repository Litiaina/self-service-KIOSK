package com.mangotree.selfservicekiosk

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.mangotree.selfservicekiosk.databinding.ActivitySellerViewBinding

class SellerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySellerViewBinding
    var database: FirebaseDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySellerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = FirebaseDatabase.getInstance()

        binding.orderListRecyclerView.layoutManager = LinearLayoutManager(this)

        val dataList = mutableListOf<OrderData>()
        database?.let { db ->
            db.getReference("orders").addValueEventListener(object : ValueEventListener {
            @SuppressLint("SetTextI18n")
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                dataList.clear()
                for (snapshot in dataSnapshot.children) {
                    snapshot.getValue(OrderData::class.java)?.let { dataList.add(it) }
                }
                val adapter = OrdersAdapter(dataList, db)
                binding.orderListRecyclerView.adapter = adapter
                binding.itemCountTextView.text = "ITEM ON LIST: ${adapter.itemCount}"
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("FirebaseError", "Error retrieving data: $error")
            }
        })
        }
    }
}