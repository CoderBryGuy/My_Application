package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String NAME_LABEL ="name_label";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.act1_label);
        Button button = findViewById(R.id.act1_button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       Intent intent = new Intent(getBaseContext(), Activity2.class);
       intent.putExtra(NAME_LABEL, editText.getText().toString());
       startActivity(intent);
    }
}