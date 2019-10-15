package com.example.activity2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScreenTwo extends AppCompatActivity {

    TextView civilization1, civilization2, civilization3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_two);
        Bundle bundle = getIntent().getExtras();

        civilization1 = findViewById(R.id.civilization1);
        civilization2 = findViewById(R.id.civilization2);
        civilization3 = findViewById(R.id.civilization3);
        civilization1.setText("CIVILIZATION1: " + bundle.getString("civil1"));
        civilization2.setText("CIVILIZATION2: " + bundle.getString("civil2"));
        civilization3.setText("CIVILIZATION3: " + bundle.getString("civil3"));
    }
}
