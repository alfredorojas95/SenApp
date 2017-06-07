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
        palabras.add(new Palabra( R.drawable.hand,"Abogado","Profesión"));
        palabras.add(new Palabra( R.drawable.hand,"Abril","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Anteayer",""));
        palabras.add(new Palabra( R.drawable.hand,"Antes","Tiempo"));
        palabras.add(new Palabra( R.drawable.hand,"Agosto","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Ahora","Tiempo"));
        palabras.add(new Palabra( R.drawable.hand,"Ayer","Tiempo"));
        //B
        palabras.add(new Palabra( R.drawable.hand,"Bonito","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Bueno","Adjetivo"));
        //C
        palabras.add(new Palabra( R.drawable.hand,"Casa","Sustantivo"));
        palabras.add(new Palabra( R.drawable.hand,"Constructor","Profesión"));
        palabras.add(new Palabra( R.drawable.hand,"Cambiar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Comunicar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Conversar","Verbo"));
        //D
        palabras.add(new Palabra( R.drawable.hand2,"Después","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Diciembre","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Día","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Disculpar","Verbo"));
        palabras.add(new Palabra( R.drawable.hand,"Doctor","Profesión"));
        palabras.add(new Palabra( R.drawable.hand,"Dentista","Profesión"));
        palabras.add(new Palabra( R.drawable.hand,"Domingo","Día de la semana"));
        palabras.add(new Palabra( R.drawable.hand,"Difícil","Adjetivo"));
        //E
        palabras.add(new Palabra( R.drawable.hand,"Enfermera","Profesión"));
        palabras.add(new Palabra( R.drawable.hand,"Edificio","Sustantivo"));
        palabras.add(new Palabra( R.drawable.hand,"Escuela","Sustantivo"));
        palabras.add(new Palabra( R.drawable.hand,"Enero","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Enseñar","Verbo"));
        palabras.add(new Palabra( R.drawable.hand,"Escribir","Verbo"));
        palabras.add(new Palabra( R.drawable.hand,"Escuchar","Verbo"));
        palabras.add(new Palabra( R.drawable.hand,"Estar","mano hacía abajo"));
        //F
        palabras.add(new Palabra( R.drawable.hand,"Faltar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Febrero","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Fecha","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Feo","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Fácil","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Feliz","Adjetivo"));
        //H
        palabras.add(new Palabra( R.drawable.hand,"Hoy","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Hacer","Verbo"));
        palabras.add(new Palabra( R.drawable.hand,"Hablar","mano hacía abajo"));
        //I
        palabras.add(new Palabra( R.drawable.hand,"Ir","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Ingeniero","Profesión"));
        palabras.add(new Palabra( R.drawable.hand,"Instructor","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Instituto","Sustantivo"));
        //J
        palabras.add(new Palabra( R.drawable.hand,"Jueves","Día de la semana"));
        palabras.add(new Palabra( R.drawable.hand,"Jugar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Julio","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Junio","Mes"));
        //L
        palabras.add(new Palabra( R.drawable.hand,"Leer","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Llamar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Luego","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Llorar","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Liceo","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Lunes","Día de la semana"));
        //M
        palabras.add(new Palabra( R.drawable.hand,"Mañana","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Miercoles","Día de la semana"));
        palabras.add(new Palabra( R.drawable.hand,"Mecánico","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Madrugada","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Marzo","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Mayo","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Mirar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Malo","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Mucho","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Martes","Día de la semana"));
        //N
        palabras.add(new Palabra( R.drawable.hand,"Noviembre","Mes"));
        //O
        palabras.add(new Palabra( R.drawable.hand,"Octubre","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Olvidar","mano hacía abajo"));
        //P
        palabras.add(new Palabra( R.drawable.hand,"Pagar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Pelear","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Pasado","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Perdonar","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Poco","Adjetivo"));
        palabras.add(new Palabra( R.drawable.hand,"Profesor","mano hacía abajo"));
        //R
        palabras.add(new Palabra( R.drawable.hand,"Romper","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Robar","mano hacía abajo"));
        //S
        palabras.add(new Palabra( R.drawable.hand,"Septiembre","Mes"));
        palabras.add(new Palabra( R.drawable.hand,"Sábado","Día de la semana"));
        palabras.add(new Palabra( R.drawable.hand,"Ser","mano hacía abajo"));
        //T
        palabras.add(new Palabra( R.drawable.hand,"Tiempo","mano hacía abajo"));
        palabras.add(new Palabra( R.drawable.hand,"Triste","Adjetivo"));
        //U
        palabras.add(new Palabra( R.drawable.hand,"Universidad","Sustantivo"));
        //V
        palabras.add(new Palabra( R.drawable.hand,"Viernes","Día de la semana"));
        palabras.add(new Palabra( R.drawable.hand,"Verdad","Adjetivo"));

        return palabras;
    }
}
