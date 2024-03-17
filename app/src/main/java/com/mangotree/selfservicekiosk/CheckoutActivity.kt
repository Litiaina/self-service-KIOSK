package com.mangotree.selfservicekiosk

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Message
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.mangotree.selfservicekiosk.databinding.ActivityCheckoutBinding

class CheckoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckoutBinding
    var database: FirebaseDatabase? = null
    var stringBuilder: StringBuilder? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val random = (0..500).random()
        database = FirebaseDatabase.getInstance()
        stringBuilder = java.lang.StringBuilder()

        for (data in OrderListViewActivity.orderList){
            stringBuilder?.append("-$data\n")
        }

        binding.totalAmountTextView.text = "TOTAL AMOUNT: ${OrderListViewActivity.totalAmount} php"

        binding.outputTextView.text = stringBuilder.toString()

        binding.placeOrderImageButton.setOnClickListener {
            database?.let { db ->
                db.getReference("Orders").orderByChild("orderNumber").equalTo(random.toString())
                    .addListenerForSingleValueEvent(object : ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {
                            if (snapshot.exists()) {
                                return
                            }
                            val referenceKey = db.getReference("orders").push()
                            referenceKey.setValue(OrderData(referenceKey.key, OrderListViewActivity.orderList, OrderListViewActivity.totalAmount.toString(), random.toString()))
                                .addOnSuccessListener {
                                    OrderListViewActivity.orderList.clear()
                                    OrderListViewActivity.totalAmount = 0.0
                                    initDialog(random)
                                }
                        }
                        override fun onCancelled(error: DatabaseError) {}
                    })
            }
        }

        binding.cancelImageButton.setOnClickListener {
            startActivity(Intent(this@CheckoutActivity, OrderListViewActivity::class.java))
            finish()
        }
    }

    private fun initDialog(value: Int) {
        if(isDestroyed) {
            return
        }
        val builder = AlertDialog.Builder(this@CheckoutActivity)
        builder.setTitle("YOUR ORDER NUMBER IS: $value")
        builder.setCancelable(false)
        builder.setPositiveButton("Ok") { _, _ ->
            startActivity(Intent(this@CheckoutActivity, OrderViewActivity::class.java))
            finish()
        }
        builder.show()
    }
}