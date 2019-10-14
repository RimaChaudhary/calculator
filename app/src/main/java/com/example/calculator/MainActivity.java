package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button btnadd,btnsub,btnmultiply,btndivide;
    TextView resulview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        resulview = findViewById(R.id.resultView);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmultiply = findViewById(R.id.btnmultiply);
        btndivide = findViewById(R.id.btndivide);
/*
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = a + b;
                resulview.setText("result :" + String.valueOf(c));

            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = a - b;
                resulview.setText("result :" + String.valueOf(c));


            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = a * b;
                resulview.setText("result :" + String.valueOf(c));


            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = a / b;
                resulview.setText("result :" + String.valueOf(c));


            }
        });
            */



        }
    }