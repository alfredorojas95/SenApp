package com.example.alfredo.senapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import estructura.Diccionario;
import estructura.Palabra;

/**
 * Created by wilfr on 05-06-2017.
 */

public class FragmentDiccionario extends Fragment {

    Diccionario c = new Diccionario();
    ArrayList<Palabra> palabras = c.initPalabras();

    private ListView lista;
    View layout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_fragment_diccionario, container, false);

        lista = (ListView) layout.findViewById(R.id.list1);
        Adapter adaptador = new Adapter(layout.getContext(), palabras);
        lista.setAdapter(adaptador);
        return layout;
    }
}
