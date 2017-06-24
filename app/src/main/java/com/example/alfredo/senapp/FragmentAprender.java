package com.example.alfredo.senapp;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import estructura.Palabra;


public class FragmentAprender extends Fragment {

    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_aprender, container, false);
        context = view.getContext();

        ImageButton btnIntro =( ImageButton) view.findViewById(R.id.btn_intro);
        btnIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, testQuiz.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
