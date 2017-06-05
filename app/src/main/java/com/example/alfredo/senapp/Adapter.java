package com.example.alfredo.senapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import estructura.Palabra;

/**
 * Created by wilfr on 05-06-2017.
 */

public class Adapter extends BaseAdapter{


        private Context context;
        private ArrayList<Palabra> palabras;

        public Adapter(Context c, ArrayList<Palabra> palabras){
            this.context = c;
            this.palabras = palabras;
        }

        @Override
        public int getCount() {
            return palabras.size();
        }

        @Override
        public Object getItem(int position) {
            return palabras.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView==null){
                LayoutInflater layoutItem = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                convertView = layoutItem.inflate(R.layout.row,null);
            }

            //Elementos de XML de layout "row"
            ImageView images = (ImageView) convertView.findViewById(R.id.icon);
            TextView titulo = (TextView) convertView.findViewById(R.id.nombrePalabra);
            TextView descripcion = (TextView) convertView.findViewById(R.id.descripcionPalabra);

            Palabra p = palabras.get(position);

            //set contenido lista
            images.setImageResource(p.getImagen());
            titulo.setText(p.getNombre());
            descripcion.setText(p.getDescripcion());
            return convertView;
        }


}
