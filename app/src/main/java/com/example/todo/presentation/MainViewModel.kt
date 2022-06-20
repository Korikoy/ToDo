package com.example.todo.presentation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo.data.MainRepository
import com.example.todo.domain.MainBusiness

class MainViewModel: ViewModel() {
    private val mainRepository = MainRepository()
    val mainBusiness = MainBusiness(mainRepository, MainViewModel())

    val addToListLiveData1 = MutableLiveData<String>()
    val addToListLiveData2 = MutableLiveData<String>()
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