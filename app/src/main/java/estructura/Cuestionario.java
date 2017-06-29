package estructura;

import estructura.Pregunta;

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

    public int getImagen(int i){
        int imagen = preguntas.get(i).getImagen();
        return imagen;
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

    public void changeOrder(int largo){
        int [] orden =  getRandomList(largo);
        ArrayList<Pregunta> random = new ArrayList<Pregunta>();
        for (int i = 0; i < preguntas.size(); i++){
            Pregunta p = obtenerPregunta(orden[i]-1);
            random.add(p);
        }
        preguntas.clear();
        preguntas = random;
    }

    public int getRandom(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public int[] getRandomList(int largo){
        int i = 0;
        int [] random = new int[largo];
        while(!(random[random.length-1]!=0)){
            int numRandom = getRandom(1, largo);
            if(exist(random, numRandom)==false){
                random[i]= numRandom;
                i++;
                System.out.println("pos-> "+i +" = "+numRandom);
            }

        }
        return random;
    }

    public boolean exist(int[] array, int num){
        boolean existe = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                existe = true;
            }
        }
        return existe;
    }

    public Pregunta obtenerPregunta(int id){
        Pregunta p = preguntas.get(id);
        p = setOrdenAlternativas(p);
        return p;
    }

    public Pregunta setOrdenAlternativas(Pregunta p){
        int [] orden =  getRandomList(4);
        String [] alternativas = {p.getAlternativa1(),p.getAlternativa2(), p.getAlternativa3(), p.getAlternativa4()};

        p.setAlternativa1(alternativas[orden[0]-1]);
        p.setAlternativa2(alternativas[orden[1]-1]);
        p.setAlternativa3(alternativas[orden[2]-1]);
        p.setAlternativa4(alternativas[orden[3]-1]);
        return p;
    }

    public int getLargo(){
        return preguntas.size();
    }
}
