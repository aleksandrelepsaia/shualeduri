package com.example.shualeduri

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shualeduri.databinding.ActivitySuccessfullyPopBinding

class SuccessfullyPopActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySuccessfullyPopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySuccessfullyPopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // DONE button - navigate back to Cart (main screen)
        binding.btnDone.setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}

