package com.example.learnkotlin.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodel: ViewModel() {

       var liveData = MutableLiveData<String>()


       fun timer()  {
              object : CountDownTimer(20000, 5000){
                     override fun onTick(millisUntilFinished: Long) {
                            liveData.value = (millisUntilFinished/1000).toString()
                     }

                     override fun onFinish() {
                            liveData.value = "finish"
                     }

              }.start()
       }
}