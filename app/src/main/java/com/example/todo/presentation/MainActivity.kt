package com.example.todo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel.getList2()
        viewModel.getList1()

        binding.buttonAdd.setOnClickListener {
            viewModel.addToList(binding.textAdd.text.toString())
           // binding.pares2.text = viewModel.listFromDatabase1.value?.size.toString()
           // binding.impares2.text = viewModel.listFromDatabase2.value?.size.toString()
        }


        viewModel.addToListLiveData1.observe(this){ it ->
            binding.pares2.text = binding.pares2.text.toString() + it
        }
        viewModel.addToListLiveData2.observe(this){ it ->
            binding.impares2.text = binding.impares2.text.toString() + it
        }


    }


}