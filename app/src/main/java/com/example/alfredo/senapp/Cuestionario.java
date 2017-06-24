package com.example.alfredo.senapp;

import com.example.alfredo.senapp.Pregunta;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by wilfr on 23-06-2017.
 */

public class Cuestionario implements Serializable {

    private ArrayList<Pregunta> preguntas;

    public Cuestionario(ArrayList<Pregunta> preguntas){
        this.preguntas = preguntas;
    }

    public String getCategoria(int i){
        String pregunta = preguntas.get(i).getCategoria();
        return pregunta;
    }

    public String getPregunta(int i){
        String pregunta = preguntas.get(i).getDescripcion();
        return pregunta;
    }

    public String getAlternativa1(int i){
        String alternativa = preguntas.get(i).getAlternativa1();
        return alternativa;
    }

    public String getAlternativa2(int i){
        String alternativa = preguntas.get(i).getAlternativa2();
        return alternativa;
    }

    public String getAlternativa3(int i){
        String alternativa = preguntas.get(i).getAlternativa3();
        return alternativa;
    }

    public String getAlternativa4(int i){
        String alternativa = preguntas.get(i).getAlternativa4();
        return alternativa;
    }

    public String getRespuestaCorrecta(int i){
        String respuesta = preguntas.get(i).getRespuesta();
        return respuesta;
    }
}
