package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnumber1:EditText
    lateinit var etnumber2:EditText
    lateinit var btnAdd:Button
    lateinit var btnMutiply:Button
    lateinit var btnDivide:Button
    lateinit var btnSubstract:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubstract = findViewById(R.id.btnSubstract)
        btnAdd = findViewById(R.id.btnAdd)
        btnDivide = findViewById(R.id.btnDivide)
        btnMutiply = findViewById(R.id.btnMutiply)
        tvResult = findViewById(R.id.tvResult)

        btnSubstract.setOnClickListener {
            var sub = etnumber1.text.toString().toInt()
            var sub2 = etnumber2.text.toString().toInt()
            Subtraction(sub,sub2)

        }
        btnAdd.setOnClickListener {
            var add = etnumber1.text.toString().toInt()
            var add2 = etnumber2.text.toString().toInt()
            Addition(add,add2)
        }
        btnDivide.setOnClickListener {
            var div = etnumber1.text.toString().toInt()
            var div2 = etnumber2.text.toString().toInt()
            Division(div,div2)
        }
        btnMutiply.setOnClickListener {
            var multi = etnumber1.text.toString().toInt()
            var multi2 = etnumber2.text.toString().toInt()
            Multiplication(multi,multi2)
        }
    }
    fun Subtraction(sub:Int,sub2:Int){
        var minus = sub-sub2
        tvResult.text=minus.toString()
    }
    fun Addition(add:Int,add2:Int){
        var plus = add+add2
        tvResult.text=plus.toString()
    }
    fun Division(div:Int,div2:Int){
        var over = div/div2
        tvResult.text=over.toString()
    }
    fun Multiplication(multi:Int,multi2:Int){
        var times = multi*multi2
        tvResult.text=times.toString()
    }

}