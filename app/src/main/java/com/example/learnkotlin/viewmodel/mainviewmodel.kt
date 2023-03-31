package com.example.learnkotlin.viewmodel

import android.app.Application
import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodel(val application: Application, val text: String): ViewModel() {

       var liveData = MutableLiveData<String>()
       fun timer()  {
              object : CountDownTimer(5000, 1000){
                     override fun onTick(millisUntilFinished: Long) {
                            liveData.value = (millisUntilFinished/1000).toString()
                     }
                     override fun onFinish() {
                            liveData.value = text
                     }

              }.start()
       }
}