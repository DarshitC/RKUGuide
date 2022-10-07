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
        textView.setText("➠ There are so many libraries like : Engineering Library, Pharmacy Library, " +
                "Ayurvedic Library, Management Library, Physiotherapy Library, Science Library.\n\n" +
                "➠  All books are available in the library.\n\n" +
                "➠ Student can issue any book from their library account for limited time duration.\n\n" +
                "➠ WI-FI facility also available in all libraries.");

        TextView textView1 = findViewById(R.id.abutsport);
        textView1.setText("➠ State-of-the-art gymnasium, Sports building, fully-equipped with the " +
                "latest equipment within the campus.\n\n" +
                "➠ Instructors and trainers are also available to train the students and staff.");

        TextView textView2 = findViewById(R.id.abutcanteen);
        textView2.setText("➠ The students who come from faraway places, start their journey to " +
                "the College early in the morning. The mid-day meal is provided. " +
                "Even many day-scholars use canteen facilities for their breakfast and evening " +
                "tea with snacks.\n\n" +
                "➠ Only one common eating facility (canteen facility) shall be provided in the campus for " +
                "day scholars, hostellers, guests of the College, teaching and non-teaching staff of the College. " +
                "The management is fully committed to keeping the quality of the canteen for the utmost " +
                "benefit of all concerned.");
    }
}