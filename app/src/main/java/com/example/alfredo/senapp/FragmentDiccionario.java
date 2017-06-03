package com.example.alfredo.senapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;


public class FragmentDiccionario extends Fragment {

    Context thisContext;
    ListView list;
    String[] titles;// = {"A", "b", "C"};
    String [] descripcion;// = {"Descripcion A", "Descripcion B", "Descripcion C"};
    int [] img = {
        R.drawable.hand, R.drawable.hand2, R.drawable.book
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        thisContext = container.getContext();

        //arreglos
        Resources res = getResources();
        titles = res.getStringArray(R.array.titles);
        descripcion = res.getStringArray(R.array.descripcion);


        list = (ListView) getActivity().findViewById(R.id.list1);


        //adapter
        MyAdapter adapter = new MyAdapter(thisContext,titles,img,descripcion);
        list.setAdapter(adapter);


        return inflater.inflate(R.layout.fragment_fragment_diccionario, container, false);
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        int [] imgs;
        String myTiles[];
        String myDescription[];

        MyAdapter(Context c, String[] titles, int[] imgs, String[] descripcion){
            super(c, R.layout.row, R.id.textPalabra, titles);
            this.context = c;
            this.imgs = imgs;
            this.myTiles = titles;
            this.myDescription = descripcion;

        }


        public View getsView(int position, View convertView, ViewGroup parent){
            LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);


            ImageView images = (ImageView) getActivity().findViewById(R.id.icon);

            TextView titulo = (TextView) getActivity().findViewById(R.id.textPalabra);
            TextView descripcion = (TextView) getActivity().findViewById(R.id.descripcionPalabra);

            //set contenido lista
            images.setImageResource(imgs[position]);
            titulo.setText(titles[position]);
            //descripcion.setText(descripcion[position]);
            return row;
        }

    }
}
