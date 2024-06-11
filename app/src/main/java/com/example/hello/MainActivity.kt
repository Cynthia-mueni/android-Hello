package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()


      binding.btnNext.setOnClickListener {
          val intent = Intent(this, SecondBirdActivity::class.java)
          startActivity(intent)
      }
          Picasso.get().load("https://images.unsplash.com/photo-1555181019-c8170b1430c3?q=80&w=1965&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D").into(binding.imageView)
    }
}
