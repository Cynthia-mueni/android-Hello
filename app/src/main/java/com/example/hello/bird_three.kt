package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.hello.databinding.ActivityBirdThreeBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class bird_three : AppCompatActivity() {
    lateinit var binding: ActivityBirdThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBirdThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val btnPrev2 = findViewById<ImageView>(R.id.btnPrev2)
//        val btnNext3 = findViewById<ImageView>(R.id.btnNext3)

        binding.btnPrev2.setOnClickListener {
            finish()
        }
        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, bird_four::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1555169062-013468b47731?q=80&w=1887&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.bird2)
    }
}
