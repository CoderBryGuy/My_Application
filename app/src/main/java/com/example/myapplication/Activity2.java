package com.example.myapplication;

import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textView = findViewById(R.id.act2_label);
        String nameText = getIntent().getStringExtra(MainActivity.NAME_LABEL);
        if(nameText != null) {
            textView.setText(nameText);
        }else{
            Toast.makeText(getBaseContext(), "String from activity 1 is null",
                    Toast.LENGTH_LONG).show();
        }
    }
}