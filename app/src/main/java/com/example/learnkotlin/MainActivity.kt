package com.example.learnkotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.example.learnkotlin.databinding.ActivityMainBinding
import com.example.learnkotlin.databinding.ActivityMainBinding.*
import com.example.learnkotlin.domain.model.GetInfoModel
import com.example.learnkotlin.domain.model.SetInfoModel
import com.example.learnkotlin.domain.usecase.GetInfo
import com.example.learnkotlin.domain.usecase.SetInfo
import com.example.learnkotlin.ui.FirstFragment
import com.example.learnkotlin.viewmodel.*
import com.github.javafaker.Faker

class MainActivity : AppCompatActivity() {

    lateinit var main : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        main = inflate(layoutInflater)
        setContentView(main.root)

//        var infotext = main.info.text.toString()
//        var getinfo = GetInfo(engine = infotext, power = 7878)
//        var setinfo = SetInfo()
//        main.button.setOnClickListener {
//            var info : GetInfoModel = getinfo.execute()
//            main.textView2.text = "${info.engine} ${info.power} "
//        }
//        main.button2.setOnClickListener {
//            var text = main.info.text.toString()
//            var infomodel : SetInfoModel = SetInfoModel(text)
//            var info : Boolean = setinfo.execute(infomodel)
//            main.textView2.text = "$info "
//        }

        if (savedInstanceState == null) {
            val fragment : FirstFragment = FirstFragment.newInstance(counter = 1, quote = getQuote())
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, fragment)
                .commit()
        }
    }
    fun getQuote() : String {
        val faker = Faker()
        return faker.harryPotter().quote()
    }

    fun getScreensCount() : Int {
        return supportFragmentManager.backStackEntryCount + 1
    }
    override fun onStart() {
        super.onStart()
    }
}





