package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        getSupportActionBar().setTitle("Recreational Facilities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.library, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.library1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sports, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.canteen, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.canteen1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.canteen2, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutlib);
        textView.setText(R.string.aboutLibrary);

        TextView textView1 = findViewById(R.id.abutsport);
        textView1.setText(R.string.aboutSports);

        TextView textView2 = findViewById(R.id.abutcanteen);
        textView2.setText(R.string.aboutCanteen);
    }
}