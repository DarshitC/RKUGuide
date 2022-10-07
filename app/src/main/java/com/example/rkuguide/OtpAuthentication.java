package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OtpAuthentication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_authentication);

        getSupportActionBar().setTitle("OTP Authentication");
    }
}