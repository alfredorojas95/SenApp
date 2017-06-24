package com.example.alfredo.senapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class testQuiz extends AppCompatActivity {

    Pregunta preguntas = new Pregunta();

    private TextView textPregunta;
    private TextView textPuntaje;
    private Button opc1;
    private Button opc2;
    private Button opc3;
    private Button opc4;

    private String respuesta;
    private int puntaje = 0;
    private int numPregunta = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textPregunta = (TextView)findViewById(R.id.descripcion);
        textPuntaje = (TextView)findViewById(R.id.score);
        opc1 = (Button)findViewById(R.id.btnOpt1);
        opc2 = (Button)findViewById(R.id.btnOpt2);
        opc3 = (Button)findViewById(R.id.btnOpt3);
        opc4 = (Button)findViewById(R.id.btnOpt4);

        actualizarPregunta();

        //btn 1
        opc1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(opc1.getText() == respuesta){
                    puntaje += 1;
                    actualizarPuntaje(puntaje);
                    actualizarPregunta();
                    Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(testQuiz.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //btn 2
        opc2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(opc2.getText() == respuesta){
                    puntaje += 1;
                    actualizarPuntaje(puntaje);
                    actualizarPregunta();
                    Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(testQuiz.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //btn 3
        opc3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(opc3.getText() == respuesta){
                    puntaje += 1;
                    actualizarPuntaje(puntaje);
                    actualizarPregunta();
                    Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(testQuiz.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //btn 4
        opc4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(opc4.getText() == respuesta){
                    puntaje += 1;
                    actualizarPuntaje(puntaje);
                    actualizarPregunta();
                    Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(testQuiz.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        /**
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void actualizarPregunta(){
        textPregunta.setText(preguntas.getPregunta(numPregunta));
        opc1.setText(preguntas.getAlternativa1(numPregunta));
        opc2.setText(preguntas.getAlternativa2(numPregunta));
        opc3.setText(preguntas.getAlternativa3(numPregunta));
        opc4.setText(preguntas.getAlternativa4(numPregunta));

        respuesta = preguntas.getRespuestaCorrecta(numPregunta);
        numPregunta++;

    }

    public void actualizarPuntaje(int punto){
        textPuntaje.setText("Puntaje: "+puntaje);
    }


}
