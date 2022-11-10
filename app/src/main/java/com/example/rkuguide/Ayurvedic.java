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

public class Ayurvedic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayurvedic);

        getSupportActionBar().setTitle("Ayurvedic College & Hospital");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FAyurvedic%2Fayur1.jpeg?alt=media&token=7cfc7fef-6435-46f9-b6b2-77c13c48d2ae", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FAyurvedic%2Fayur2.jpeg?alt=media&token=a3b57138-1038-4faa-b368-2af66078820f", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FAyurvedic%2Fayur3.jpeg?alt=media&token=36f9e320-8eec-4ad9-a7d7-4ae3435ac26a", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FAyurvedic%2Fayur4.jpeg?alt=media&token=a2c5f6b6-6471-4293-9c68-2150f9362865", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutayur);
        textView.setText(R.string.aboutAyurvedic);

        TextView textRead = findViewById(R.id.readmore);
        textRead.setText(R.string.more);
        textRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://ach.rku.ac.in/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.ayurvedicCourse);
    }
}