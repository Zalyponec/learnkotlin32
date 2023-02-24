package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.learnkotlin.databinding.ActivityMainBinding
import com.example.learnkotlin.domain.model.GetInfoModel
import com.example.learnkotlin.domain.model.SetInfoModel
import com.example.learnkotlin.domain.usecase.GetInfo
import com.example.learnkotlin.domain.usecase.SetInfo
import com.example.learnkotlin.viewmodel.*


////private lateinit var viewModel: mainviewmodel
//private lateinit var androidViewModel: androidView



class MainActivity : AppCompatActivity() {

    lateinit var navContoller: NavController
     lateinit var main : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        navContoller = Navigation.findNavController(this,R.id.navhost)
        var getinfo = GetInfo()
        var setinfo = SetInfo()


        main.button.setOnClickListener{
           var info : GetInfoModel = getinfo.execute()

            main.textView2.text = "${info.engine} ${info.power} "

        }

        main.button2.setOnClickListener{
            var text = main.info.text.toString()
            var infomodel : SetInfoModel = SetInfoModel(text)





        }

//        //viewModel = ViewModelProvider(this, mainviewmodelfactory(application,"Siuuuuuuuu")).get(mainviewmodel::class.java)
//        androidViewModel = ViewModelProvider(this, mainviewmodelfactory(application,"siu")).get(
//            androidView::class.java)




    }


    override fun onStart() {

        super.onStart()


    }



}





