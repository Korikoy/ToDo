package com.example.todo.features.todo.presentation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todo.features.todo.data.MainRepository
import com.example.todo.features.todo.domain.MainBusiness

class MainViewModel(
    private val mainBusiness: MainBusiness
): ViewModel() {

    val listFromDatabase1 = MutableLiveData<List<String>>()
    val listFromDatabase2 = MutableLiveData<List<String>>()


    fun addToList(task: String){
        mainBusiness.addToList(task)
    }

    fun getList1(){
        val list = mainBusiness.getList1()
        listFromDatabase1.value = list
    }

    fun getList2(){
        val list = mainBusiness.getList2()
        listFromDatabase2.value = list
    }


}