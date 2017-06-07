package com.example.alfredo.senapp;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import estructura.Diccionario;
import estructura.Palabra;

/**
 * Created by wilfr on 05-06-2017.
 */

public class FragmentDiccionario extends Fragment {

    Diccionario c = new Diccionario();
    ArrayList<Palabra> palabras = c.initPalabras();
    Context context;

    private ListView lista;
    View layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_fragment_diccionario, container, false);
        context = layout.getContext();
        lista = (ListView) layout.findViewById(R.id.list1);
        Adapter adaptador = new Adapter(context, palabras);
        lista.setAdapter(adaptador);
        return layout;
    }



}
