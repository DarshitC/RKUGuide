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

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fother1.jpeg?alt=media&token=66e57192-7988-4d35-b549-d25dac72234b", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fother2.jpeg?alt=media&token=8e56357f-f1e7-43b8-ae74-5c3fc705abc1", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fother3.jpeg?alt=media&token=5a3c1e87-73b4-4596-b666-f3cd04230bfd", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fother4.jpeg?alt=media&token=47c4a295-8ec8-4bb2-9e49-016fb3b1384c", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fother5.jpeg?alt=media&token=fa2c50ac-d084-47d8-8c38-1a642d458699", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fcanteen.jpg?alt=media&token=2c03e099-7bb3-41ae-ac5f-19a6bc00a812", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FOther%2Fcanteen2.jpg?alt=media&token=35dbf33e-faf5-45f4-9c2e-341919d0c8e8", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutlib);
        textView.setText(R.string.aboutLibrary);

        TextView textView1 = findViewById(R.id.abutsport);
        textView1.setText(R.string.aboutSports);

        TextView textView2 = findViewById(R.id.abutcanteen);
        textView2.setText(R.string.aboutCanteen);
    }
}