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
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FragmentBienvenida extends Fragment {

    //firebase
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference refPuntajes = database.getReference();
    DatabaseReference puntajeIntro = MainActivity.user.child("puntaje").child("Intro");
    DatabaseReference puntajeCalendario = MainActivity.user.child("puntaje").child("Calendario");
    DatabaseReference puntajeProfesion = MainActivity.user.child("puntaje").child("Profesión");
    DatabaseReference puntajeFamilia = MainActivity.user.child("puntaje").child("Familia");
    DatabaseReference puntajeTransporte = MainActivity.user.child("puntaje").child("Transporte");

    //imageButons
    private ImageButton btnIntro;
    private ImageButton btnCalendario;
    private ImageButton btnProfesion;
    private ImageButton btnFamilia;
    private ImageButton btnTransporte;

    //textViews
    private TextView txtPuntajeIntro;
    private TextView txtPuntajeCalendario;
    private TextView txtPuntajeProfesion;
    private TextView txtPuntajeFamilia;
    private TextView txtPuntajeTransporte;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_bienvenida, container, false);

        //referencias botones
        btnIntro = (ImageButton) view.findViewById(R.id.btn_intro);
        btnCalendario = (ImageButton) view.findViewById(R.id.btn_calendar);
        btnProfesion = (ImageButton) view.findViewById(R.id.btn_profesion);
        btnFamilia = (ImageButton) view.findViewById(R.id.btn_family);
        btnTransporte = (ImageButton) view.findViewById(R.id.btn_transport);

        //referencias text field
        txtPuntajeIntro = (TextView) view.findViewById(R.id.text_puntaje_intro);
        txtPuntajeCalendario = (TextView) view.findViewById(R.id.text_puntaje_tiempo);
        txtPuntajeProfesion = (TextView) view.findViewById(R.id.text_puntaje_profesion);
        txtPuntajeFamilia = (TextView) view.findViewById(R.id.text_puntaje_familia);
        txtPuntajeTransporte = (TextView) view.findViewById(R.id.text_puntaje_reansporte);

        //btn go quiz
        Button btn = (Button) view.findViewById(R.id.btn_goQuiz);

        //intro
        puntajeIntro.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                if(value == null){
                    value = "0";
                } else if(Integer.parseInt(value)==100){
                    btnIntro.setImageResource(R.drawable.facecry);
                    txtPuntajeIntro.setText(Integer.parseInt(value)+"/"+400);

                }  else if((Integer.parseInt(value)>100)&&(Integer.parseInt(value)<400)){
                    btnIntro.setImageResource(R.drawable.faceconfunded);
                    txtPuntajeIntro.setText(Integer.parseInt(value)+"/"+400);

                }  else if(Integer.parseInt(value)==400){
                    btnIntro.setImageResource(R.drawable.facesmile);
                    txtPuntajeIntro.setText(Integer.parseInt(value)+"/"+400);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //calendario
        puntajeCalendario.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                if(value == null){
                    value = "0";
                } else if(Integer.parseInt(value)==100){
                    btnCalendario.setImageResource(R.drawable.facecry);
                    txtPuntajeCalendario.setText(Integer.parseInt(value)+"/"+400);

                }  else if((Integer.parseInt(value)>100)&&(Integer.parseInt(value)<400)){
                    btnCalendario.setImageResource(R.drawable.faceconfunded);
                    txtPuntajeCalendario.setText(Integer.parseInt(value)+"/"+400);

                }  else if(Integer.parseInt(value)==400){
                    btnCalendario.setImageResource(R.drawable.facesmile);
                    txtPuntajeCalendario.setText(Integer.parseInt(value)+"/"+400);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //profesion
        puntajeProfesion.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                if(value == null){
                    value = "0";
                } else if(Integer.parseInt(value)==100){
                    btnProfesion.setImageResource(R.drawable.facecry);
                    txtPuntajeProfesion.setText(Integer.parseInt(value)+"/"+400);

                }  else if((Integer.parseInt(value)>100)&&(Integer.parseInt(value)<400)){
                    btnProfesion.setImageResource(R.drawable.faceconfunded);
                    txtPuntajeProfesion.setText(Integer.parseInt(value)+"/"+400);

                }  else if(Integer.parseInt(value)==400){
                    btnProfesion.setImageResource(R.drawable.facesmile);
                    txtPuntajeProfesion.setText(Integer.parseInt(value)+"/"+400);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //familia
        puntajeFamilia.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                if(value == null){
                    value = "0";
                } else if(Integer.parseInt(value)==100){
                    btnFamilia.setImageResource(R.drawable.facecry);
                    txtPuntajeFamilia.setText(Integer.parseInt(value)+"/"+400);

                }  else if((Integer.parseInt(value)>100)&&(Integer.parseInt(value)<400)){
                    btnFamilia.setImageResource(R.drawable.faceconfunded);
                    txtPuntajeFamilia.setText(Integer.parseInt(value)+"/"+400);

                }  else if(Integer.parseInt(value)==400){
                    btnFamilia.setImageResource(R.drawable.facesmile);
                    txtPuntajeFamilia.setText(Integer.parseInt(value)+"/"+400);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        //transporte
        puntajeTransporte.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                if(value == null){
                    value = "0";
                } else if(Integer.parseInt(value)==100){
                    btnTransporte.setImageResource(R.drawable.facecry);
                    txtPuntajeTransporte.setText(Integer.parseInt(value)+"/"+400);

                }  else if((Integer.parseInt(value)>100)&&(Integer.parseInt(value)<400)){
                    btnTransporte.setImageResource(R.drawable.faceconfunded);
                    txtPuntajeTransporte.setText(Integer.parseInt(value)+"/"+400);

                }  else if(Integer.parseInt(value)==400){
                    btnTransporte.setImageResource(R.drawable.facesmile);
                    txtPuntajeTransporte.setText(Integer.parseInt(value)+"/"+400);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

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
