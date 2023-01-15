package com.example.learnkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import com.example.learnkotlin.databinding.ActivityMainBinding

private lateinit var main : ActivityMainBinding



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        setuplistView()

    }

    private fun setuplistView() {
        val data: List<Map<String, String>> = listOf(
            mapOf(
                KEY_TITLE to "First",
                KEY_DESCRIPTION to "desc1"
            ),
            mapOf(
                KEY_TITLE to "Second",
                KEY_DESCRIPTION to "desc2"
            ),
            mapOf(
                KEY_TITLE to "Third",
                KEY_DESCRIPTION to "desc3"
            )

        )

        val adapter = SimpleAdapter(
            this,
            data,
            android.R.layout.simple_list_item_2,
            arrayOf(KEY_TITLE,KEY_DESCRIPTION),
            intArrayOf(android.R.id.text1,android.R.id.text2)
        )
        main.listview.adapter = adapter
    }

    companion object {
        @JvmStatic val KEY_TITLE = "TITLE"
        @JvmStatic val KEY_DESCRIPTION = "DESCRIPTION"

    }


}