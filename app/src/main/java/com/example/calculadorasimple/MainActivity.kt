package com.example.calculadorasimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_suma.setOnClickListener {
            operacion(1)
        }
        btn_resta.setOnClickListener {
            operacion(2)
        }
        btn_multi.setOnClickListener {
            operacion(3)
        }
        btn_div.setOnClickListener {
            operacion(4)
        }
    }

    fun operacion(tipo:Int){
        val numero1=et_numero1.text.toString().toDouble()
        val numero2=et_numero2.text.toString().toDouble()
        when(tipo){
            1->et_resultado.setText((numero1+numero2).toString())
            2->et_resultado.setText((numero1-numero2).toString())
            3->et_resultado.setText((numero1*numero2).toString())
            4->if(numero1!=0.0&&numero2!=0.0){
                et_resultado.setText((numero1/numero2).toString())
            }else{
                Toast.makeText(this,"Error: División entre 0", Toast.LENGTH_LONG).show()
            }
        }
    }
}
