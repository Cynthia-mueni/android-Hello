package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        enableEdgeToEdge()
////
//        binding.btnNext2.setOnClickListener {
//
//        }
//        val btnPrev = findViewById<ImageView>(R.id.btnprev)
//        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)

        binding.btnprev.setOnClickListener {
            finish()
        }
        binding.btnNext2.setOnClickListener {
            val intent = Intent(this, bird_three::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1555169062-013468b47731?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(binding.imageView2)
        }
    }
