package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HowToReachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_reach);

        getSupportActionBar().setTitle("How To Reach RKU");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}