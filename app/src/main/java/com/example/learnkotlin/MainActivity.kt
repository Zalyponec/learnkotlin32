package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learnkotlin.databinding.ActivityMainBinding
import com.example.learnkotlin.viewmodel.*

private lateinit var main : ActivityMainBinding
//private lateinit var viewModel: mainviewmodel
private lateinit var androidViewModel: androidView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        //viewModel = ViewModelProvider(this, mainviewmodelfactory(application,"Siuuuuuuuu")).get(mainviewmodel::class.java)
        androidViewModel = ViewModelProvider(this, mainviewmodelfactory(application,"siu")).get(
            androidView::class.java)




    }

    override fun onStart() {

        super.onStart()
        androidViewModel.timer()
        androidViewModel.liveData.observe(this, Observer {
            main.textview.text = it
        })

    }

    }





