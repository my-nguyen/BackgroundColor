package com.rahulpandey.backgroundcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahulpandey.backgroundcolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.button.isSelected = !binding.button.isSelected
        }
        binding.toggle.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.button.isEnabled = isChecked
        }
    }
}