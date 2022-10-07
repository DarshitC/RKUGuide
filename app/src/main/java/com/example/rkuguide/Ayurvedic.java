package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.ayurvedic, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ayurvedic, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ayurvedic, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.ayurvedic, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutayur);
        textView.setText(R.string.aboutAyurvedic);

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.ayurvedicCourse);
    }
}