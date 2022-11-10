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

public class SOP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sop);

        getSupportActionBar().setTitle("School Of Pharmacy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOP%2Fsop1.jpeg?alt=media&token=7e1b8faa-180c-4cc6-84ff-a7ae4486fa9b", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOP%2Fsop2.jpeg?alt=media&token=820c53e9-c0c2-4dba-aad2-6d572dcc7098", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOP%2Fsop3.jpeg?alt=media&token=6392d18f-d42d-4c2a-b29b-c78cc21bb9ea", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOP%2Fsop4.jpeg?alt=media&token=3b8a972a-ef06-4f2a-981a-cd1e81b0a582", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsop);
        textView.setText(R.string.aboutSOP);

        TextView textRead = findViewById(R.id.readmore);
        textRead.setText(R.string.more);
        textRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://sop.rku.ac.in/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.sopCourse);
    }
}