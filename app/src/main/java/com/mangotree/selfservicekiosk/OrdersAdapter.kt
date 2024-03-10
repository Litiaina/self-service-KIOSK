package com.mangotree.selfservicekiosk

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mangotree.selfservicekiosk.databinding.ItemLayoutOrderListBinding

class OrdersAdapter (private var dataArray: List<OrderData>, private val activity: Activity) : RecyclerView.Adapter<OrdersAdapter.ViewHolder>() {

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

        currentItem.orders?.let {
            for(order in it) {
                builder.append("$order\n")
            }
        }

        holder.binding.totalAmountTextView.text = "Total: ${currentItem.totalAmount}"
        holder.binding.outputTextView.text = builder.toString()
    }

    override fun getItemCount(): Int {
        return dataArray.size
    }
}