package com.example.alfredo.senapp;



import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class FragmentBienvenida extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_bienvenida, container, false);

        ImageButton btnIntro = (ImageButton) view.findViewById(R.id.btn_intro);
        ImageButton btnTiempo = (ImageButton) view.findViewById(R.id.btn_calendar);
        Button btn = (Button) view.findViewById(R.id.btn_goQuiz);

        //cambiar imagenes botones
        btnIntro.setImageResource(R.drawable.facesmile);
        btnTiempo.setImageResource(R.drawable.facecry);



        //btn go quiz
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.main.goToQuiz();
            }
        });
        return view;
    }

}
