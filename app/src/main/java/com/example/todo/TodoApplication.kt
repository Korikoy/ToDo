package com.example.todo

import android.app.Application
import com.example.todo.features.todo.di.MainModule
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TodoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                MainModule
            )
        }
    }

}