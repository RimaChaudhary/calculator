package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        radioGroup =findViewById(R.id.rgsubject);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {if(i == R.id.rbAn){
                Toast.makeText(TestActivity.this, "Android", Toast.LENGTH_SHORT).show();
            }

            }
        });
    }
}
