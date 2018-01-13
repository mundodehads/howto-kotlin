package com.mundodehads.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            var year:Int = input_Year.text.toString().toInt()
            var answer:Int = Calendar.getInstance().get(Calendar.YEAR)-year
            txtAnswer.text = "You'r age is $answer years"
        }
    }
}
