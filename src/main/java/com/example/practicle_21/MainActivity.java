package com.example.practicle_21;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e1=findViewById(R.id.e1);
        EditText e2=findViewById(R.id.e2);
        EditText e3=findViewById(R.id.e3);

        String name=e1.getText().toString();
        String age=e2.getText().toString();
        String phone=e3.getText().toString();



    }
}