package com.barry.sample.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val btnHello = findViewById(R.id.btn_hello) as Button?
    btnHello?.setOnClickListener {
      val txtHello = findViewById(R.id.txt_hello) as TextView?
      val txtName = findViewById(R.id.txt_name) as EditText?
      if (txtHello != null && txtName != null) {
        val hello_sentence = String.format(getString(R.string.hello_sentence), txtName.text)
        txtHello.text = hello_sentence
      }
    }
  }
}


