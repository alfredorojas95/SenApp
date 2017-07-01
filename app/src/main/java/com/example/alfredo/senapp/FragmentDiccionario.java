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
import android.widget.SearchView;

import java.util.ArrayList;

import estructura.Adapter;
import estructura.Diccionario;
import estructura.Palabra;

/**
 * Created by wilfr on 05-06-2017.
 */

public class FragmentDiccionario extends Fragment implements View.OnClickListener{

    Diccionario c = new Diccionario();
    ArrayList<Palabra> palabras = c.initPalabras();
    Context context;
    public static Adapter adaptador;

    private ListView lista;
    private SearchView searchView;
    View layout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_fragment_diccionario, container, false);
        context = layout.getContext();

        searchView = (SearchView)layout.findViewById(R.id.barraBusqueda);
        lista = (ListView) layout.findViewById(R.id.list1);
        //lista.setDivider(null);

        adaptador = new Adapter(context, palabras);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(mMessageClickedHandler);


        //buscador xml searchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adaptador.getFilter().filter(newText);
                return false;
            }
        });
        return layout;
    }


    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            Palabra p = (Palabra)adaptador.getItem(position);
            Intent intent = new Intent(context, ListActivity.class);
            intent.putExtra("itemPalabraDiccionario", p);
            startActivity(intent);
        }
    };

    @Override
    public void onClick(View v) {

    }


}
