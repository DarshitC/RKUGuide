package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SAS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sas);

        getSupportActionBar().setTitle("School Of Agriculture Science");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOA%2FIMG_6265.JPG?alt=media&token=69f921c2-da55-4790-bf17-f1344db5c6d0", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOA%2FIMG_6283.JPG?alt=media&token=55dc94df-22c1-4a4e-85de-9db5fe548e25", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOA%2FIMG_6293.JPG?alt=media&token=78bf4ddc-6778-427a-8300-791483deedef", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOA%2FRKU-0783.jpg?alt=media&token=6e5aabe7-e962-488d-86de-4048588ec8ff", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsas);
        textView.setText(R.string.aboutAgriculture);

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.agricultureCourse);
    }
}