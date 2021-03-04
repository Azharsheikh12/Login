package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mbutton;
    private TextView txtview;
    private EditText edtmail;
    private EditText edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton = findViewById(R.id.lgnbutton);
        txtview = findViewById(R.id.tx1);
        edtmail = findViewById(R.id.txtemail);
        edtpass = findViewById(R.id.txtpassword);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtview.setText("Hola! " + edtmail.getText()+ edtpass.getText());
            }
        });
    }
}