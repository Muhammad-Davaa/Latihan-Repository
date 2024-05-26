package com.example.praktikum4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nama = (TextView) findViewById(R.id.textViewNama);
        nama.setText(Preferences.getLoggedInUser(getBaseContext()));
    }
}