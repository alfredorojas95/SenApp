package com.example.alfredo.senapp;


public class Pregunta {

    private String preguntas[]= {
            "question1",
            "question2",
            "question3",
            "question4"
    };

    private String alternativas[][] ={
            {"uno","DOS","tres","cuatro"},
            {"cinco","seis","siete","ocho"},
            {"nueve","diez","once","doce"},
            {"trece","catorce","quince","dieciseis"}
    } ;

    private String respuestaCorrecta[] = {
            "DOS","siete","once","quince"
    };

    public String getPregunta(int i){
        String pregunta = preguntas[i];
        return pregunta;
    }

    public String getAlternativa1(int i){
        String alternativa = alternativas[i][0];
        return alternativa;
    }

    public String getAlternativa2(int i){
        String alternativa = alternativas[i][1];
        return alternativa;
    }

    public String getAlternativa3(int i){
        String alternativa = alternativas[i][2];
        return alternativa;
    }

    public String getAlternativa4(int i){
        String alternativa = alternativas[i][3];
        return alternativa;
    }


    public String getRespuestaCorrecta(int i){
        String respuesta = respuestaCorrecta[i];
        return respuesta;
    }
}
