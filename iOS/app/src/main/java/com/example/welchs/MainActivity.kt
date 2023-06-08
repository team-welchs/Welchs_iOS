  package com.example.welchs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.welchs.clean.CleanProductActivity
import com.example.welchs.databinding.ActivityMainBinding
import com.example.welchs.recycler.RecycleActivity

  class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.cv3.setOnClickListener {
            val intent = Intent(this, RecycleActivity::class.java)
            startActivity(intent)
        }

        binding.cv2.setOnClickListener {
            val intent = Intent(this, CleanProductActivity::class.java)
            startActivity(intent)
        }
    }
}