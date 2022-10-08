package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AboutDept extends AppCompatActivity {

    LinearLayout soe,som,ayur,physio,sop,sos,sas,other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_dept);

        getSupportActionBar().setTitle("Schools");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        soe = findViewById(R.id.soe);
        soe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,SOE.class);
                startActivity(intent);
            }
        });
        som = findViewById(R.id.som);
        som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,SOM.class);
                startActivity(intent);
            }
        });
        ayur = findViewById(R.id.ayurvedic);
        ayur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,Ayurvedic.class);
                startActivity(intent);
            }
        });
        physio = findViewById(R.id.physio);
        physio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,Physio.class);
                startActivity(intent);
            }
        });
        sop = findViewById(R.id.sop);
        sop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,SOP.class);
                startActivity(intent);
            }
        });
        sos = findViewById(R.id.sos);
        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,SOS.class);
                startActivity(intent);
            }
        });
        sas = findViewById(R.id.sas);
        sas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,SAS.class);
                startActivity(intent);
            }
        });
        other = findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutDept.this,OtherActivity.class);
                startActivity(intent);
            }
        });
    }
}