 package com.example.welchs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.welchs.databinding.ActivityRegisterActivityuBinding

 class RegisterActivityu : AppCompatActivity() {
    lateinit var binding: ActivityRegisterActivityuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_register_activityu)

        binding.register.setOnClickListener {
            finish()
        }
    }
}