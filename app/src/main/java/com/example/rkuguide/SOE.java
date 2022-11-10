package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SOE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soe);

        getSupportActionBar().setTitle("School Of Engineering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOE%2Fsoe1.jpeg?alt=media&token=8d5e9e57-6b60-4c2d-867f-92e0b58f3a98", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOE%2Fsoe2.jpeg?alt=media&token=819c4bb5-9dc6-45fd-82f0-ffdad572a71d", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOE%2Fsoe3.jpeg?alt=media&token=262b6625-e825-4739-9613-e23f41fbb614", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOE%2Fsoe4.jpeg?alt=media&token=e0262966-329a-488a-b284-0a1457403808", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsoe);
        textView.setText(R.string.aboutSOE);

        TextView textRead = findViewById(R.id.readmore);
        textRead.setText(R.string.more);
        textRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://soe.rku.ac.in/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.soeCourse);
    }
}