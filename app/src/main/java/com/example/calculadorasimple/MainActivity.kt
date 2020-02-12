package com.example.calculadorasimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_suma.setOnClickListener({
            operacion()
        })
        btn_resta.setOnClickListener({
            operacion()
        })
        btn_multi.setOnClickListener({
            operacion()
        })
        btn_div.setOnClickListener({
            operacion()
        })
    }

    fun operacion(){

    }
}
