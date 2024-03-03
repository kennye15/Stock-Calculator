package com.example.mykotlinapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    lateinit var btnA : Button
    lateinit var btnB : Button
    lateinit var btnC : Button
    lateinit var btnD : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnA = findViewById(R.id.btn_a)
        btnB = findViewById(R.id.btn_b)
        btnC = findViewById(R.id.btn_c)
        btnD = findViewById(R.id.btn_d)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnA.setOnClickListener(this)
        btnB.setOnClickListener(this)
        btnC.setOnClickListener(this)
        btnD.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_a ->{
                result = a+b
            }
            R.id.btn_b ->{
                result = a-b
            }
            R.id.btn_c ->{
                result = a*b
            }
            R.id.btn_d ->{
                result = a/b
            }

        }
        resultTv.text = "Result is $result"
    }

}