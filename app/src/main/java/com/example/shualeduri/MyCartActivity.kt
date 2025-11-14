package com.example.shualeduri

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shualeduri.databinding.ActivityMyCartBinding

class MyCartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMyCartBinding
    private var productPrice: Int = 0
    private var quantity: Int = 2 // Starting quantity is 2 as shown in the design

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the product price from Intent
        productPrice = intent.getIntExtra("PRODUCT_PRICE", 120) // Default to 120 if not found

        // Display the product price
        binding.tvProductPrice.text = "${productPrice}$"

        // Initialize quantity display
        binding.tvQuantity.text = quantity.toString()

        // Calculate and display initial total
        updateTotal()

        // Update subtotal text
        updateSubtotal()

        // Increase quantity button
        binding.btnIncrease.setOnClickListener {
            quantity++
            binding.tvQuantity.text = quantity.toString()
            updateTotal()
            updateSubtotal()
        }

        // Decrease quantity button
        binding.btnDecrease.setOnClickListener {
            if (quantity > 1) { // Prevent quantity from going below 1
                quantity--
                binding.tvQuantity.text = quantity.toString()
                updateTotal()
                updateSubtotal()
            }
        }

        // Delete item (optional - can finish activity or clear cart)
        binding.ivDelete.setOnClickListener {
            // For this assignment, we'll just finish the activity
            finish()
        }

        // Back arrow navigation - go back to Product screen
        binding.ivBackArrow.setOnClickListener {
            finish()
        }

        // Place Order button - navigate to Successfully Pop screen
        binding.btnPlaceOrder.setOnClickListener {
            val intent = Intent(this, SuccessfullyPopActivity::class.java)
            startActivity(intent)
        }
    }

    private fun updateTotal() {
        val total = productPrice * quantity
        binding.tvTotal.text = "$total $"
    }

    private fun updateSubtotal() {
        binding.tvSubtotal.text = getString(R.string.subtotal, quantity)
    }
}

