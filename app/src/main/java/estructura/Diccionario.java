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
        Palabra p1 = new Palabra( R.drawable.hand,"A","mano hacía abajo");
        Palabra p2 = new Palabra( R.drawable.hand2,"E","mano hacía abajo");
        Palabra p3 = new Palabra( R.drawable.hand,"I","mano hacía abajo");
        Palabra p4 = new Palabra( R.drawable.hand2,"O","mano hacía abajo");
        Palabra p5 = new Palabra( R.drawable.hand,"U","mano hacía abajo");

        palabras.add(p1);
        palabras.add(p2);
        palabras.add(p3);
        palabras.add(p4);
        palabras.add(p5);

        return palabras;
    }
}
