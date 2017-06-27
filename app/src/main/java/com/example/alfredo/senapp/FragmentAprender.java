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


import java.io.Serializable;
import java.util.ArrayList;

import estructura.Palabra;


public class FragmentAprender extends Fragment {

    Cuestionario cuestionarioSelect;
    ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();


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
                Intent intent = new Intent(getActivity(), testQuiz.class);
                cuestionarioSelect = new Cuestionario(initPreguntasIntro());
                cuestionarioSelect.changeOrder(initPreguntasIntro().size());
                intent.putExtra("cuestionario", cuestionarioSelect);
                startActivity(intent);
            }
        });

        ImageButton btnFechas=( ImageButton) view.findViewById(R.id.btn_calendar);
        btnFechas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), testQuiz.class);
                cuestionarioSelect = new Cuestionario(initPreguntasCalendario());
                cuestionarioSelect.changeOrder(initPreguntasCalendario().size());
                intent.putExtra("cuestionario", cuestionarioSelect);
                startActivity(intent);
            }
        });

        ImageButton btnTiempo=( ImageButton) view.findViewById(R.id.btn_time);
        btnTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), testQuiz.class);
                cuestionarioSelect = new Cuestionario(initPreguntasTiempo());
                cuestionarioSelect.changeOrder(initPreguntasTiempo().size());
                intent.putExtra("cuestionario", cuestionarioSelect);
                startActivity(intent);
            }
        });

        ImageButton btnFamilia=( ImageButton) view.findViewById(R.id.btn_family);
        btnFamilia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), testQuiz.class);
                cuestionarioSelect = new Cuestionario(initPreguntasFamilia());
                cuestionarioSelect.changeOrder(initPreguntasFamilia().size());
                intent.putExtra("cuestionario", cuestionarioSelect);
                startActivity(intent);
            }
        });

        ImageButton btnTransporte=( ImageButton) view.findViewById(R.id.btn_transport);
        btnTransporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), testQuiz.class);
                cuestionarioSelect = new Cuestionario(initPreguntasTransporte());
                intent.putExtra("cuestionario", cuestionarioSelect);
                startActivity(intent);
            }
        });

        return view;
    }

    public ArrayList<Pregunta> initPreguntasIntro(){
        preguntas.clear();
        preguntas.add(new Pregunta("Intro",1,"Pregunta N°1",1,"Hola","Adios","Buenos Días","Hasta luego","Adios"));
        preguntas.add(new Pregunta("Intro",2,"Pregunta N°2",2,"Adios","Temprano","Buenas noches","Hola","Hola"));
        preguntas.add(new Pregunta("Intro",3,"Pregunta N°3",3,"Hasta Luego","Día","Rápido","Noche","Día"));
        preguntas.add(new Pregunta("Intro",3,"Pregunta N°4",4,"Día","Hola","Noche","Adios","Noche"));
        return preguntas;
    }

    public ArrayList<Pregunta> initPreguntasCalendario(){
        preguntas.clear();
        preguntas.add(new Pregunta("Calendario",1,"",1,"papa","dos","dosmil","cuatro","papa"));
        preguntas.add(new Pregunta("Calendario",2,"",2,"hola","seis","mama","ocho","mama"));
        preguntas.add(new Pregunta("Calendario",3,"",3,"nueve","hijo","once","doce","hijo"));
        preguntas.add(new Pregunta("Calendario",4,"",4,"trece","catorce","quince","dieciseis","quince"));
        return preguntas;

    }

    public ArrayList<Pregunta> initPreguntasTiempo(){
        preguntas.clear();
        preguntas.add(new Pregunta("Tiempo",1,"",1,"papa","dos","dosmil","cuatro","papa"));
        preguntas.add(new Pregunta("Tiempo",2,"",1,"hola","seis","mama","ocho","mama"));
        preguntas.add(new Pregunta("Tiempo",3,"",1,"nueve","hijo","once","doce","hijo"));
        preguntas.add(new Pregunta("Tiempo",4,"",1,"trece","catorce","quince","dieciseis","quince"));
        return preguntas;

    }

    public ArrayList<Pregunta> initPreguntasFamilia(){
        preguntas.clear();
        preguntas.add(new Pregunta("Familia",1,"Pregunta N°1",1,"Papá","Hijo","Abuelo","Mamá","Hijo"));
        preguntas.add(new Pregunta("Familia",2,"Pregunta N°2",1,"Bebé","Abuela","Mama","Padrastro","Mamá"));
        preguntas.add(new Pregunta("Familia",3,"Pregunta N°3",1,"Papá","hijo","once","Nieto","hijo"));
        preguntas.add(new Pregunta("Familia",4,"Pregunta N°4",1,"Nieto","Papá","Abuela","Mamá","Abuela"));
        return preguntas;

    }

    public ArrayList<Pregunta> initPreguntasTransporte(){
        preguntas.clear();
        preguntas.add(new Pregunta("Transporte",1,"",1,"papa","dos","dosmil","cuatro","papa"));
        preguntas.add(new Pregunta("Transporte",2,"",1,"hola","seis","mama","ocho","mama"));
        preguntas.add(new Pregunta("Transporte",3,"",1,"nueve","hijo","once","doce","hijo"));
        preguntas.add(new Pregunta("Transporte",4,"",1,"trece","catorce","quince","dieciseis","quince"));
        return preguntas;

    }

}
