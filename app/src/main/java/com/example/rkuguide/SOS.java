package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sos%2FIMG_0891.JPG?alt=media&token=d7e19550-9ef3-4dbc-8503-e756bb7546fc", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sos%2FIMG_5717.JPG?alt=media&token=918554bc-7906-4fa9-a14b-f1905933de2f", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sos%2FIMG_5853.JPG?alt=media&token=d2e57a1e-ce36-4a8d-8dcc-cf30984dd33e", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/sos%2FIMG_5856.JPG?alt=media&token=ed285f8b-f1da-4f55-9f7d-e87f1fb86c92", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsos);
        textView.setText("RK University, formerly the RK Group of Colleges, is a leading " +
                "University offering variety of courses ranging from Diploma studies to " +
                "Doctorate research.\n\n" +
                "Since its inception in the year of 2005, the RK group of Colleges has made a " +
                "constant endeavour to provide quality education and a platform for overall development " +
                "to its students. The journey from Group of Colleges to A State-Private University Status has " +
                "been a daunting task with challenges and opportunities. It’s a collective and constant " +
                "effort of RK family that we have scaled this height.\n\n" +
                "The education pattern at RK University has a right blend of academia and " +
                "industry with professionals, mentors, and advisors interacting with student throughout " +
                "the year, offering enormous opportunities to our students for live projects, internships " +
                "and placements.\n\n" +
                "RK University strives to provide rich and complete study experience to its students " +
                "through cutting – edge amenities, research and innovation, that will assist students in " +
                "building a successful professional path.");

        TextView course = findViewById(R.id.abutcourse);
        course.setText("1. Diploma In Medical Laboratory Technology\n\n" +
                "2. B.Sc Chemistry\n    (Bachelor Of Science)\n\n" +
                "3. B.Sc Microbiology\n    (Bachelor Of Science)\n\n" +
                "4. B.Sc Physics\n    (Bachelor Of Science)\n\n" +
                "5. B.Sc Mathematics\n    (Bachelor Of Science)\n\n" +
                "6. M.Sc Organic Chemistry\n    (Master Of Science)\n\n" +
                "7. M.Sc Analytical Chemistry\n    (Master Of Science)\n\n" +
                "8. M.Sc Microbiology\n    (Master Of Science)\n\n" +
                "9. M.Sc Physics\n    (Master Of Science)");
    }
}