package com.example.todo.features.todo.di

import com.example.todo.features.todo.data.MainRepository
import com.example.todo.features.todo.domain.MainBusiness
import com.example.todo.features.todo.presentation.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val MainModule = module {
    single { MainRepository() }
    single { MainBusiness(get()) }
    viewModel { MainViewModel(get()) }
}