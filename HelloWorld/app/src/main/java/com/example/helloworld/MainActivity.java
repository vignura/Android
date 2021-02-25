    package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;
    EditText edtTxtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHello = findViewById(R.id.txtMessage);
        edtTxtName =  findViewById(R.id.edtTxtName);
    }

    public void onBtnHelloClick(View view) {
        txtHello.setText("hello " + edtTxtName.getText().toString()+" !!");
    }
}