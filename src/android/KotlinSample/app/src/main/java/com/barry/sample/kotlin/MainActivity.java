package com.barry.sample.kotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btnHello = (Button) findViewById(R.id.btn_hello);
    if (btnHello != null) {
      btnHello.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
          TextView txtHello = (TextView) findViewById(R.id.txt_hello);
          EditText txtName = (EditText) findViewById(R.id.txt_name);
          if ((txtHello != null) && (txtName != null)) {
            String hello_sentence =
                String.format(getString(R.string.hello_sentence), txtName.getText());
            txtHello.setText(hello_sentence);
          }
        }
      });
    }
  }
}


