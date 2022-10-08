package com.example.rkuguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SOE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soe);

        getSupportActionBar().setTitle("School Of Engineering");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageSlider imageSlider = findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOE%2FIMG_6003.JPG?alt=media&token=28887592-76f4-40c9-b2c5-af376fcbbeae", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOE%2F_MG_7903-1.jpg?alt=media&token=a240d0d3-9dc0-4778-91a3-e06d300c3e77", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOE%2FIMG_6000.JPG?alt=media&token=0a935b75-6081-4342-9b11-7d1a9a7f1c66", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide.appspot.com/o/SOE%2FRKU_ITN_SOE_2021-0024.JPG?alt=media&token=84c54506-d90f-4f72-8cec-3d3eaea89f5d", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView textView = findViewById(R.id.abutsoe);
        textView.setText("School of Engineering is one of the best degree engineering colleges " +
                "in Gujarat state. School of Engineering is AICTE approved and located in a " +
                "40 acre of lush-green campus on Rajkot-Bhavnagar highway at Rajkot, Gujarat. Earlier " +
                "known as RK College of Engineering and Technology, the school envisage a world-class " +
                "education system that assures quality and empowers the students to be the global " +
                "leaders of tomorrow. The school strives to bring excellence in the teaching-learning " +
                "process through continuous evaluation and training in educational pedagogy.");

        TextView course = findViewById(R.id.abutcourse);
        course.setText("1. Mechanical Engineering\n    Diploma\n\n" +
                "2. Civil Engineering\n    Diploma\n\n"+
                "3. Computer Engineering\n    Diploma\n\n"+
                "4. Electrical Engineering\n    Diploma\n\n"+
                "5. Information and Technology\n    Diploma\n\n"+
                "6. Computer Engineering\n    Bachelor of Technology (BTech)\n\n" +
                "7. Civil Engineering\n    Bachelor of Technology (BTech)\n\n" +
                "8. Electrical Engineering\n    Bachelor of Technology (BTech)\n\n" +
                "9. Information Technology\n    Bachelor of Technology (BTech)\n\n" +
                "10. Artificial Intelligence\n      Bachelor of Technology (BTech)\n\n" +
                "11. Cyber Security\n      Bachelor of Technology (BTech)\n\n" +
                "12. Mechanical Engineering\n      Bachelor of Technology (BTech)\n\n" +
                "13. Computer Engineering\n      Master of Technology (MTech)\n\n" +
                "14. Construction Technology\n      Master of Technology (MTech)\n\n" +
                "15. Humanities & Applied Science\n\n" +
                "16. Electrical Power System\n      Master of Technology (MTech)\n\n" +
                "17. Machine Design\n      Master of Technology (MTech)\n\n" +
                "18. Structural Engineering\n      Master of Technology (MTech)\n\n" +
                "19. Thermal Sciences\n      Master of Technology (MTech)\n\n" +
                "20. BCA\n      Bachelor of Computer Applications\n\n" +
                "21. MCA\n      Master of Computer Applications");
    }
}