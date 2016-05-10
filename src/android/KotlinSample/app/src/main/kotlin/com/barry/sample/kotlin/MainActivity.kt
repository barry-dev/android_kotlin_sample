package com.barry.sample.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

  // Lambda Expression
  val sayHello: (String) -> String = { text ->
    String.format(getString(R.string.hello_sentence), text.capitalize())
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val btnHello = findViewById(R.id.btn_hello) as Button?
    btnHello?.setOnClickListener {
      val txtHello = findViewById(R.id.txt_hello) as TextView?
      val txtName = findViewById(R.id.txt_name) as EditText?
      if (txtHello != null && txtName != null) {
        txtHello.text = applyFormat(txtName.text.toString(), sayHello)
      }
    }
  }

  fun applyFormat(text: String, f: (String) -> String): String {
    return f(text)
  }
}


