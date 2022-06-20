package com.example.todo.domain

import androidx.activity.viewModels
import com.example.todo.data.MainRepository
import com.example.todo.presentation.MainViewModel

class MainBusiness (private val mainRepository : MainRepository, private val  viewModel : MainViewModel
) {

    fun addToList(task: String){
        var  X =  task.toInt()
        if( X % 2 == 0){
            mainRepository.addToList1(task)
            viewModel.addToListLiveData1.value = task
        }else if( X % 2 != 0){
            mainRepository.addToList2(task)
            viewModel.addToListLiveData2.value = task
    }
    else{}
     }


    fun getList1(): List<String> {
        return mainRepository.getList1()
     }
    fun getList2(): List<String>{
        return mainRepository.getList2()
     }



}



