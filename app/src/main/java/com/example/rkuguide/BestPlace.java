package com.example.rkuguide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BestPlace extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_best_place, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvAnal = view.findViewById(R.id.aboutAnal);
        tvAnal.setText(R.string.aboutAnalgadh);

        TextView tvIshwariya = view.findViewById(R.id.aboutIshwariya);
        tvIshwariya.setText(R.string.aboutIshwariya);

        TextView tvPradu = view.findViewById(R.id.aboutPradu);
        tvPradu.setText(R.string.aboutPraduman);

        TextView tvLalPari = view.findViewById(R.id.aboutLalPari);
        tvLalPari.setText(R.string.aboutLalPari);

        TextView tvNyari = view.findViewById(R.id.aboutNyari);
        tvNyari.setText(R.string.aboutNyari);
    }
}