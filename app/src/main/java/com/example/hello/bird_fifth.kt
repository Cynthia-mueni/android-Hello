package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityBirdFifthBinding
import com.example.hello.databinding.ActivityBirdFourBinding
import com.squareup.picasso.Picasso

class bird_fifth : AppCompatActivity() {
    lateinit var binding: ActivityBirdFifthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdFifthBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
//        val btnPrev4 = findViewById<ImageView>(R.id.btnPrev4)

       binding.btnPrev4.setOnClickListener {
            finish()
        }
       Picasso.get().load("https://images.unsplash.com/photo-1555169062-013468b47731?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(binding.imageView4)
    }
}
