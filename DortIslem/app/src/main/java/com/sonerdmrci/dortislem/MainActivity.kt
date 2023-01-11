package com.sonerdmrci.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun topla(view: View){
        val sayi1 = txtSayi1.text.toString().toInt()
        val sayi2 = txtSayi2.text.toString().toInt()
        textView.setText("Sonuç: ${sayi1 + sayi2}")

    }
    fun cikar(view: View){
        val sayi1 = txtSayi1.text.toString().toInt()
        val sayi2 = txtSayi2.text.toString().toInt()
        textView.setText("Sonuç: ${sayi1 - sayi2}")
    }
    fun carp(view: View){
        val sayi1 = txtSayi1.text.toString().toInt()
        val sayi2 = txtSayi2.text.toString().toInt()
        textView.setText("Sonuç: ${sayi1 * sayi2}")
    }
    fun bol(view: View){
        val sayi1 = txtSayi1.text.toString().toDouble()
        val sayi2 = txtSayi2.text.toString().toDouble()

        textView.setText("Sonuç: ${sayi1 / sayi2 }")


    }
}