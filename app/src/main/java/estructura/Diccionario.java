package estructura;

import com.example.alfredo.senapp.R;

import java.util.ArrayList;

/**
 * Created by wilfr on 05-06-2017.
 */

public class Diccionario {

    private ArrayList<Palabra> palabras;

    public Diccionario (){
        this.palabras = new ArrayList<Palabra>();
    }

    public void addPalabra(Palabra palabra){
        this.palabras.add(palabra);
    }

    public ArrayList<Palabra> initPalabras(){

        //A
        palabras.add(new Palabra( R.drawable.abandonar,"Abandonar","Profesión"));
        palabras.add(new Palabra( R.drawable.abril,"Abril","Mes"));
        palabras.add(new Palabra( R.drawable.abanicar,"Abanicar",""));
        palabras.add(new Palabra( R.drawable.abrazar,"Abrazar","Tiempo"));
        palabras.add(new Palabra( R.drawable.agosto,"Agosto","Mes"));
        palabras.add(new Palabra( R.drawable.aburrirse,"Aburrirse","Tiempo"));
        palabras.add(new Palabra( R.drawable.anteayer,"Anteayer","Tiempo"));
        palabras.add(new Palabra( R.drawable.antes,"Antes","Tiempo"));
        //B
        palabras.add(new Palabra( R.drawable.bonito,"Bonito","Adjetivo"));
        palabras.add(new Palabra( R.drawable.bueno,"Bueno","Adjetivo"));
        //C
        palabras.add(new Palabra( R.drawable.casa,"Casa","Sustantivo"));
        palabras.add(new Palabra( R.drawable.cambiar,"Cambiar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.conversar,"Conversar","Verbo"));
        palabras.add(new Palabra( R.drawable.clima,"Clima","Verbo"));
        //D
        palabras.add(new Palabra( R.drawable.dentista,"Dentista","Mes"));
        palabras.add(new Palabra( R.drawable.despues,"Después","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.diciembre,"Diciembre","Mes"));
        palabras.add(new Palabra( R.drawable.dia,"Día","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.dificil,"Dificil","Verbo"));
        palabras.add(new Palabra( R.drawable.domingo,"Domingo","Verbo"));
        palabras.add(new Palabra( R.drawable.dentista,"Dentista","Profesión"));
        //E
        palabras.add(new Palabra( R.drawable.enfermero,"Enfermero","Profesión"));
        palabras.add(new Palabra( R.drawable.edificio,"Edificio","Sustantivo"));
        palabras.add(new Palabra( R.drawable.escuela,"Escuela","Sustantivo"));
        palabras.add(new Palabra( R.drawable.enero,"Enero","Mes"));
        palabras.add(new Palabra( R.drawable.ensenar,"Enseñar","Verbo"));
        palabras.add(new Palabra( R.drawable.escribir,"Escribir","Verbo"));
        //F
        palabras.add(new Palabra( R.drawable.faltar,"Faltar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.febrero,"Febrero","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.fecha,"Fecha","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.feo,"Feo","Adjetivo"));
        palabras.add(new Palabra( R.drawable.facil,"Fácil","Adjetivo"));
        palabras.add(new Palabra( R.drawable.feliz,"Feliz","Adjetivo"));
        //H
        palabras.add(new Palabra( R.drawable.hoy,"Hoy","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hacer,"Hacer","Verbo"));
        palabras.add(new Palabra( R.drawable.hablar,"Hablar","mano hacía abajo"));
        //I
        palabras.add(new Palabra( R.drawable.ir,"Ir","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.ingeniero,"Ingeniero","Profesión"));
        palabras.add(new Palabra( R.drawable.instructor,"Instructor","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.instituto,"Instituto","Sustantivo"));
        //J
        palabras.add(new Palabra( R.drawable.jueves,"Jueves","Día de la semana"));
        palabras.add(new Palabra( R.drawable.jugar,"Jugar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.junio,"Julio","Mes"));
        palabras.add(new Palabra( R.drawable.julio,"Junio","Mes"));
        //L
        palabras.add(new Palabra( R.drawable.leer,"Leer","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.llamar,"Llamar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.llorar,"Llorar","Adjetivo"));
        palabras.add(new Palabra( R.drawable.lunes,"Lunes","Día de la semana"));
        //M
        palabras.add(new Palabra( R.drawable.manana,"Mañana","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.miercoles,"Miercoles","Día de la semana"));
        palabras.add(new Palabra( R.drawable.mecanico,"Mecánico","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.madrugada,"Madrugada","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.marzo,"Marzo","Mes"));
        palabras.add(new Palabra( R.drawable.mayo,"Mayo","Mes"));
        palabras.add(new Palabra( R.drawable.mirar,"Mirar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.malo,"Malo","Adjetivo"));
        palabras.add(new Palabra( R.drawable.martes,"Martes","Día de la semana"));
        //N
        palabras.add(new Palabra( R.drawable.noviembre,"Noviembre","Mes"));
        //O
        palabras.add(new Palabra( R.drawable.octubre,"Octubre","Mes"));
        palabras.add(new Palabra( R.drawable.olvidar,"Olvidar","mano hacía abajo"));
        //P
        palabras.add(new Palabra( R.drawable.pagar,"Pagar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.poco,"Poco","Adjetivo"));
        palabras.add(new Palabra( R.drawable.profesor,"Profesor","mano hacía abajo"));
        //R
        palabras.add(new Palabra( R.drawable.romper,"Romper","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.robar,"Robar","mano hacía abajo"));
        //S
        palabras.add(new Palabra( R.drawable.septiembre,"Septiembre","Mes"));
        palabras.add(new Palabra( R.drawable.sabado,"Sábado","Día de la semana"));
        //T
        palabras.add(new Palabra( R.drawable.tiempo,"Tiempo","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.triste,"Triste","Adjetivo"));
        //U
        palabras.add(new Palabra( R.drawable.universidad,"Universidad","Sustantivo"));
        //V
        palabras.add(new Palabra( R.drawable.viernes,"Viernes","Día de la semana"));
        palabras.add(new Palabra( R.drawable.verdad,"Verdad","Adjetivo"));

        return palabras;
    }
}
