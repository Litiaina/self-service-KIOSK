package com.mangotree.selfservicekiosk

import android.annotation.SuppressLint
import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.FirebaseDatabase
import com.mangotree.selfservicekiosk.databinding.ItemLayoutOrderListBinding

class OrdersAdapter (private var dataArray: List<OrderData>, private var database: FirebaseDatabase) : RecyclerView.Adapter<OrdersAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemLayoutOrderListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemLayoutOrderListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataArray[position]
        val builder = StringBuilder()

        currentItem.listOfOrders?.let {
            for(order in it) {
                builder.append("$order\n")
            }
        }
        holder.binding.doneImageButton.setOnClickListener {
            val requestReference = database.getReference("orders/${currentItem.orderID}")
            requestReference.removeValue().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.i("RequestFirebaseBackend", "Request with UID ${currentItem.orderID} deleted successfully")
                } else {
                    Log.e("RequestFirebaseBackend", "Failed to delete request with UID ${currentItem.orderID}: ${task.exception}")
                }
            }
        }

        holder.binding.cancelImageButton.setOnClickListener {
            val requestReference = database.getReference("orders/${currentItem.orderID}")
            requestReference.removeValue().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.i("RequestFirebaseBackend", "Request with UID ${currentItem.orderID} deleted successfully")
                } else {
                    Log.e("RequestFirebaseBackend", "Failed to delete request with UID ${currentItem.orderID}: ${task.exception}")
                }
            }
        }
        holder.binding.totalAmountTextView.text = "Total: ${currentItem.totalAmount}"
        holder.binding.outputTextView.text = builder.toString()
        holder.binding.orderNumberTextView.text = currentItem.orderNumber
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }
}