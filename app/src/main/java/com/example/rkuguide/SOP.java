package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.sop, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sop, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sop, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.sop, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsop);
        textView.setText("School of Pharmacy is engaged in imparting education of Bachelors, " +
                "Masters and Doctorate degrees in Pharmacy. The school is a part of campus of " +
                "RK University and houses 20 laboratories, 4 class rooms, auditorium, library with " +
                "Wi-Fi network, learning resource centre, medicinal garden, museum, seminar hall, " +
                "central instrumentation room, animal house and administrative area. " +
                "The building is an architectural splendor with ultramodern amenities, specifically " +
                "designed to suit the requirements of Pharmacy education.");

        TextView course = findViewById(R.id.abutcourse);
        course.setText("1. Pharm D.\n     (Doctor Of Pharmacy)\n\n" +
                "2. B.Pharm\n     (Bachelor Of Pharmacy)\n\n" +
                "3. M.Pharm\n     (Master Of Pharmacy)");
    }
}