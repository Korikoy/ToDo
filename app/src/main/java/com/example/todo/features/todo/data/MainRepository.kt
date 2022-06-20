package com.example.todo.features.todo.data

class MainRepository {

    val lista1 = mutableListOf<String>()
    val lista2 = mutableListOf<String>()

    fun addToList1(task: String){
        lista1.add(task)
    }
    fun addToList2(task: String){
        lista2.add(task)
    }

    fun getList1(): MutableList<String> {
       return lista1
    }
    fun getList2():MutableList<String>{
        return lista2
    }




}