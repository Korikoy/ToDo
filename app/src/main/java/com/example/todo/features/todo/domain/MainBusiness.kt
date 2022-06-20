package com.example.todo.features.todo.domain

import com.example.todo.features.todo.data.MainRepository

class MainBusiness(
    private val mainRepository: MainRepository
) {

    fun addToList(task: String) {
        var X = task.toInt()
        if (X % 2 == 0) {
            mainRepository.addToList1(task)
        } else if (X % 2 != 0) {
            mainRepository.addToList2(task)
        }
    }


    fun getList1(): List<String> {
        return mainRepository.getList1()
    }

    fun getList2(): List<String> {
        return mainRepository.getList2()
    }


}



