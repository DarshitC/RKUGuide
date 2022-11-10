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

public class SOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);

        getSupportActionBar().setTitle("School Of Science");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOS%2Fsos1.jpeg?alt=media&token=4317a7c6-b619-4e0a-ac82-d56d8d816d02", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOS%2Fsos2.jpeg?alt=media&token=9b406019-5b22-422b-a74e-2a104e1ab0b3", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOS%2Fsos3.jpeg?alt=media&token=4ec48b64-a934-4c79-b983-3a2b317d9c60", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FSOS%2Fsos4.jpeg?alt=media&token=8e269e7d-cc59-44ac-acd2-14abad1b52ad", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsos);
        textView.setText(R.string.aboutSOS);

        TextView textRead = findViewById(R.id.readmore);
        textRead.setText(R.string.more);
        textRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://sos.rku.ac.in/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.sosCourse);
    }
}