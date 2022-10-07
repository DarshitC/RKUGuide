package com.example.rkuguide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BestFood extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_best_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvDal = view.findViewById(R.id.aboutDalpakwan);
        tvDal.setText(R.string.aboutDal);

        TextView tvGhu = view.findViewById(R.id.aboutGhughara);
        tvGhu.setText(R.string.aboutGhu);

        TextView tvBhungada = view.findViewById(R.id.aboutBhungada);
        tvBhungada.setText(R.string.aboutBhungada);

        TextView tvDabeli = view.findViewById(R.id.aboutDabeli);
        tvDabeli.setText(R.string.aboutDabeli);

        TextView tvGathiya = view.findViewById(R.id.aboutGathiya);
        tvGathiya.setText(R.string.aboutGathiya);
    }
}