package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtTxtFirstName;
    private EditText edtTxtLastName;
    private EditText edtTxtEmail;
    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find views for all the members
        edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        edtTxtLastName = findViewById(R.id.edtTxtLastName);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);
    }

    public void onBtnRegisterClick(View view) {
        txtFirstName.setText("First Name : " + edtTxtFirstName.getText().toString());
        txtLastName.setText("Last Name : " + edtTxtLastName.getText().toString());
        txtEmail.setText("Email : " + edtTxtEmail.getText().toString());
    }
}