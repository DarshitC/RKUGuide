package com.example.rkuguide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class BoysHostel extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_boys_hostel, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Image Slider List For Retrieving Image From Database
        ImageSlider imageSlider = view.findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FB%26GHostel%2Fbbuilding.jpeg?alt=media&token=c958f020-9119-43e4-9833-0644e906f257", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FB%26GHostel%2Fboysh2.jpg?alt=media&token=2cf1aa1c-0b1a-44c1-b743-0b857be40322", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FB%26GHostel%2Fboysh3.jpg?alt=media&token=df69110b-362d-4bd3-9c53-d21f389ccb51", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView hostelfacilities = view.findViewById(R.id.abutfacility);
        hostelfacilities.setText(R.string.aboutBoysHostel);

        TextView rr = view.findViewById(R.id.abutrules);
        rr.setText(R.string.hostelRules);
    }
}