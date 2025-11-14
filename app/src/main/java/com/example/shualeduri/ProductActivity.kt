package com.example.shualeduri

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shualeduri.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductBinding
    private val productPrice = 120 // Product price in dollars

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the price display
        binding.tvPrice.text = "${productPrice}$"
        binding.tvOldPrice.text = "149$"

        // Navigate to My Cart when Add to Cart is clicked
        binding.btnAddToCart.setOnClickListener {
            val intent = Intent(this, MyCartActivity::class.java)
            // Pass the product price to My Cart using putExtra
            intent.putExtra("PRODUCT_PRICE", productPrice)
            startActivity(intent)
        }

        // Back navigation - finish current activity to go back
        binding.ivCartIcon.setOnClickListener {
            finish()
        }
    }
}

