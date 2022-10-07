package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SOM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_som);

        getSupportActionBar().setTitle("School Of Management");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.som, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.som, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.som, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.som, ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsom);
        textView.setText("School of Management started its journey offering MBA " +
                "program in the year 2005 as RK College of Business Management. " +
                "Since becoming a university in the year 2011, now the institution is known as " +
                "School of Management, a constituent school of RK University, Rajkot.\n\n" +
                "School of Management of RK University offers three academic programs. " +
                "Flagship program is the 2 Years full time MBA Program, offering since the year 2005. " +
                "Experienced faculty members-majority having Ph.D, updated and industry relevant curriculum " +
                "and pedagogy, and focus on improving communication abilities have helped MBA students in " +
                "getting best placements in this region. With package of more than Rs. 9 Lakhs per annum to a " +
                "student in the recently passing out batch of MBA 2015-17, school is at par with all leading " +
                "Business Schools of the country. School of Management has drastically improved curriculum since " +
                "becoming a constituent school of the first private university of Rajkot; focusing more on " +
                "applications, real life case analysis, simulation, and pedagogical features including extensive " +
                "use of ICTs in curriculum design and delivery, and on soft skills – like communications, " +
                "presentation abilities, group discussions, role plays, team work, etc. School has adopted best " +
                "evaluation practices, including components like practical projects, simulation, real life " +
                "case studies, presentations and class participations as continuous internal evaluations, " +
                "helping students learn, improve and get assessed on real time.");

        TextView course = findViewById(R.id.abutcourse);
        course.setText("1. BBA\n    (Bachelor of Business Administration)\n\n" +
                "2. B.Voc\n    (Bachelor of Vocational Studies)\n\n" +
                "3. MBA\n    (Master of Business Administration)");

    }
}