package com.example.learnkotlin.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModel

class mainviewmodelfactory(val application: Application, val text: String) :
ViewModelProvider.AndroidViewModelFactory(application) {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return androidView (application,text) as T
    }


}
