package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Physio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physio);

        getSupportActionBar().setTitle("School Of Physiotherapy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.physio, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.physio, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.physio, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.physio, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutphy);
        textView.setText("The institute established in 2005, with broad mission and vision to " +
                "develop excellence in health care profession. The institute was well known as a " +
                "RK College of Physiotherapy, RK Group of Colleges, Rajkot affiliated to Saurashtra " +
                "University, Rajkot and now famous as School of Physiotherapy, affiliated to " +
                "RK University, Rajkot.The school is also recognized by the Indian Association of " +
                "Physiotherapists (IAP), the IAP is a member organization of the World Confederation " +
                "of Physical Therapy (WCPT). Well qualified faculties, advance technology in laboratories " +
                "and large exposure to clinical setups remains first priority for the school.");

        TextView course = findViewById(R.id.abutcourse);
        course.setText("1. BPT\n    (Bachelor of Physiotherapy)\n\n" +
                "2. MPT\n    (Master of Physiotherapy)");
    }
}