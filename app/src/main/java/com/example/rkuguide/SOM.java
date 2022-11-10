package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SOM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som);

        getSupportActionBar().setTitle("School Of Management");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOM%2Fsom1.jpeg?alt=media&token=1bd58b50-ff6f-45cb-9bfa-6927099905e0", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOM%2Fsom2.jpeg?alt=media&token=cab76ba0-69bb-4313-9b3c-4af605c2155d", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOM%2Fsom3.jpeg?alt=media&token=d8c92a03-13a6-4790-94e3-0cefa166c71f", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOM%2Fsom4.jpeg?alt=media&token=f64ae5c4-f04c-4fb3-92da-24f48de47dbb", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsom);
        textView.setText(R.string.aboutSOM);

        TextView textRead = findViewById(R.id.readmore);
        textRead.setText(R.string.more);
        textRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://som.rku.ac.in/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.somCourse);

    }
}