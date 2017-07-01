package com.example.alfredo.senapp;


import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


import java.util.ArrayList;

import estructura.Cuestionario;
import estructura.Pregunta;


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

        ImageButton btnTiempo=( ImageButton) view.findViewById(R.id.btn_profesion);
        btnTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), testQuiz.class);
                cuestionarioSelect = new Cuestionario(initPreguntasProfesion());
                cuestionarioSelect.changeOrder(initPreguntasProfesion().size());
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
        preguntas.add(new Pregunta("Intro",1,"Pregunta N°1",R.drawable.abrazar,"Acalorado","Abrazar","Hola","Frío","Abrazar"));
        preguntas.add(new Pregunta("Intro",2,"Pregunta N°2",R.drawable.acalorado,"Abuelo","Acalorado","Adios","Mamá","Acalorado"));
        preguntas.add(new Pregunta("Intro",3,"Pregunta N°3",R.drawable.aburrido,"Mañana","Aburrido","Rápido","Noche","Aburrido"));
        preguntas.add(new Pregunta("Intro",3,"Pregunta N°4",R.drawable.acampar,"Extrañar","Acompañar","Acampar","Deber","Acampar"));
        return preguntas;
    }

    public ArrayList<Pregunta> initPreguntasCalendario(){
        preguntas.clear();
        preguntas.add(new Pregunta("Calendario",1,"",R.drawable.manana,"Domingo","Mañana","Septiembre","Ayer","Mañana"));
        preguntas.add(new Pregunta("Calendario",2,"",R.drawable.anteayer,"Anteayer","Abril","Domingo","Noviembre","Anteayer"));
        preguntas.add(new Pregunta("Calendario",3,"",R.drawable.septiembre,"Anteayer","hijo","Mañana","Septiembre","Septiembre"));
        preguntas.add(new Pregunta("Calendario",4,"",R.drawable.lunes,"Lunes","Anteayer","Mañana","Martes","Lunes"));
        return preguntas;

    }

    public ArrayList<Pregunta> initPreguntasProfesion(){
        preguntas.clear();
        preguntas.add(new Pregunta("Profesión",1,"",R.drawable.profesor,"Profesor","Matrona","Abogado","Diputado","Profesor"));
        preguntas.add(new Pregunta("Profesión",2,"",R.drawable.ingeniero,"Arbitro","Enfermero","Ingeniero","Pastor","Ingeniero"));
        preguntas.add(new Pregunta("Profesión",3,"",R.drawable.arbitro,"Mecánico","Arbitro","once","doce","Arbitro"));
        preguntas.add(new Pregunta("Profesión",4,"",R.drawable.abogado,"trece","Abogado","Enfermero","Profesor","Abogado"));
        return preguntas;

    }

    public ArrayList<Pregunta> initPreguntasFamilia(){
        preguntas.clear();
        preguntas.add(new Pregunta("Familia",1,"Pregunta N°1",R.drawable.hijo,"Papá","Hijo","Abuelo","Mamá","Hijo"));
        preguntas.add(new Pregunta("Familia",2,"Pregunta N°2",R.drawable.mama,"Bebé","Abuela","Mama","Padrastro","Mamá"));
        preguntas.add(new Pregunta("Familia",3,"Pregunta N°3",R.drawable.hermano,"Papá","hijo","Hermano","Nieto","Hermano"));
        preguntas.add(new Pregunta("Familia",4,"Pregunta N°4",R.drawable.abuelo,"Nieto","Papá","Abuel","Mamá","Abuelo"));
        return preguntas;

    }

    public ArrayList<Pregunta> initPreguntasTransporte(){
        preguntas.clear();
        preguntas.add(new Pregunta("Transporte",1,"",R.drawable.bus,"Bicicleta","Bus","Avión","Auto","Bus"));
        preguntas.add(new Pregunta("Transporte",2,"",R.drawable.bicicleta,"Motocicleta","Auto","Bicicleta","Tren","Bicicleta"));
        preguntas.add(new Pregunta("Transporte",3,"",R.drawable.auto,"Auto","Caballo","Tren","Avión","Auto"));
        preguntas.add(new Pregunta("Transporte",4,"",R.drawable.moto,"Micro","Barco","Motocicleta","Caballo","Motocicleta"));
        return preguntas;

    }

}
