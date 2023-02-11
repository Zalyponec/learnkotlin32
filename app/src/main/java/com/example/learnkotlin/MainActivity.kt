package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learnkotlin.databinding.ActivityMainBinding
import com.example.learnkotlin.viewmodel.mainviewmodel

private lateinit var main : ActivityMainBinding
private lateinit var viewModel: mainviewmodel



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        viewModel = ViewModelProvider(this).get(mainviewmodel::class.java)



    }

    override fun onStart() {

        super.onStart()
        viewModel.timer()
        viewModel.liveData.observe(this, Observer {
            main.textview.text = it
        })
    }

    }





