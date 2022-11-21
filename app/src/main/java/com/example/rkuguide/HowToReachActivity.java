package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HowToReachActivity extends AppCompatActivity {

    AppCompatButton bookNow;
    TextView note;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_reach);

        getSupportActionBar().setTitle("How To Reach RKU");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView journey = findViewById(R.id.journey);
        journey.setText(R.string.journey);

        bookNow = findViewById(R.id.book);
        bookNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.makemytrip.com/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        note = findViewById(R.id.note);
        note.setText(R.string.note);
    }
}