package com.example.alfredo.senapp;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by wilfr on 30-05-2017.
 */

public class ListDiccionario extends ListFragment{


    String palabras[]={
      "A","B","C","D","E","F","G","H","I"
    };

    int images[] = {
            R.drawable.hand, R.drawable.hand2, R.drawable.hand, R.drawable.hand2,
            R.drawable.hand,R.drawable.hand2, R.drawable.hand, R.drawable.hand2,
            R.drawable.hand2
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.list_diccionario, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, palabras);
        setListAdapter(adapter);

        //ListView listDiccionario=(ListView) findViewById(R.id.list);
    }

    /**
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutinflater().inflate(R.layout.customlayout, null);
            ImageView imageView = (ImageView)convertView.findViewById(R.id.imageSena);
            TextView textViewPalabra = (TextView)convertView.findViewById(R.id.textPalabra);
            imageView.setImageResource(images[position]);
            textViewPalabra.setText(palabras[position]);
            return convertView;
        }
    }**/

}
