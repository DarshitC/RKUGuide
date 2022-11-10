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

public class GirlsHostel extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_girls_hostel, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageSlider imageSlider = view.findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FB%26GHostel%2Fgbuilding.jpeg?alt=media&token=8f0913e3-442e-4ff0-8d14-724ba32ef657", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://firebasestorage.googleapis.com/v0/b/rku-guide-47a13.appspot.com/o/Photos%2FB%26GHostel%2Fgirlsh3.jpg?alt=media&token=c2aebf8d-b1b8-423f-920e-63bd3a9f35c7", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        TextView hostelfacilities = view.findViewById(R.id.abutfacility);
        hostelfacilities.setText(R.string.aboutGirlsHostel);

        TextView rr = view.findViewById(R.id.abutrules);
        rr.setText(R.string.hostelRules);
    }
}