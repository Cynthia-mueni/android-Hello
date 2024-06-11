package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityBirdFourBinding
import com.example.hello.databinding.ActivityBirdThreeBinding
import com.squareup.picasso.Picasso

class bird_four : AppCompatActivity() {
    lateinit var binding: ActivityBirdFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdFourBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

//        val btnPrev3 = findViewById<ImageView>(R.id.btnPrev3)
//        val btnNext4 = findViewById<ImageView>(R.id.btnNext4)

        binding.btnPrev3.setOnClickListener {
            finish()
        }
        binding.btnNext4.setOnClickListener {
            val intent = Intent(this, bird_fifth::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1555169062-013468b47731?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(binding.imageView3)
    }
}