package com.example.todo.features.todo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todo.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            viewModel.addToList(binding.textAdd.text.toString())
            viewModel.getList2()
            viewModel.getList1()
        }

        viewModel.listFromDatabase1.observe(this) {
            binding.pares2.text = it.toString()
        }
        viewModel.listFromDatabase2.observe(this) { it ->
            binding.impares2.text = it.toString()
        }
    }

}