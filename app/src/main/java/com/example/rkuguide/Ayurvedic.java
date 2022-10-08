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
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sach%2FIMG_1745.JPG?alt=media&token=bed016d6-6eff-4e85-b18b-37c17ef82caf", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sach%2FIMG_1756.JPG?alt=media&token=db59c379-6196-45ed-a916-32e70257e455", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sach%2FIMG_1763.JPG?alt=media&token=09c0ac79-8c6e-4d1c-a7f6-dc59fff7ab9d", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sach%2FIMG_1765.JPG?alt=media&token=008c62d8-54f9-4308-846a-c4bb8e4bd987", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutayur);
        textView.setText(R.string.aboutAyurvedic);

        TextView course = findViewById(R.id.abutcourse);
        course.setText(R.string.ayurvedicCourse);
    }
}