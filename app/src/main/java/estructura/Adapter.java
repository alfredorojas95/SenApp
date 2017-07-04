package estructura;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alfredo.senapp.R;

import java.util.ArrayList;

import estructura.Palabra;

/**
 * Created by wilfr on 05-06-2017.
 */

public class Adapter extends BaseAdapter implements Filterable{


        private Context context;
        private ArrayList<Palabra> palabras;
        CustomFilter filter;
        private ArrayList<Palabra> listaFiltro;

        public Adapter(Context c, ArrayList<Palabra> palabras){
            this.context = c;
            this.palabras = palabras;
            this.listaFiltro = palabras;
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
            return position; //palabras.indexOf(getItemId(position));
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView==null){
                LayoutInflater layoutItem = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                convertView = layoutItem.inflate(R.layout.row,null);
            }

            //Elementos de XML de layout ""
            ImageView images = (ImageView) convertView.findViewById(R.id.icon);
            TextView titulo = (TextView) convertView.findViewById(R.id.nombrePalabra);
            TextView descripcion = (TextView) convertView.findViewById(R.id.descripcionPalabra);

            Palabra p = palabras.get(position);

            //set contenido lista
            images.setImageResource(p.getImagen());
            titulo.setText(p.getNombre());

            descripcion.setText(p.getCategoria());
            return convertView;
        }


    @Override
    public Filter getFilter() {
        if(filter == null){
            filter = new CustomFilter();
        }
        return filter;
    }

    class CustomFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            if((constraint!= null)&&(constraint.length()>0)){
                constraint=constraint.toString().toUpperCase();
                ArrayList<Palabra> filtrado = new ArrayList<Palabra>();

                for(int i=0; i < listaFiltro.size(); i++){
                    if(listaFiltro.get(i).getNombre().toUpperCase().contains(constraint)){
                        String nombreP = listaFiltro.get(i).getNombre();
                        String categoriaP = listaFiltro.get(i).getCategoria();
                        String descripcionP = listaFiltro.get(i).getDescripcion();
                        int imgP = listaFiltro.get(i).getImagen();
                        Palabra p = new Palabra(imgP, nombreP, categoriaP, descripcionP);
                        filtrado.add(p);
                    }
                }
                results.count=filtrado.size();
                results.values=filtrado;
            } else {
                results.count=listaFiltro.size();
                results.values=listaFiltro;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            palabras=(ArrayList<Palabra>) results.values;
            notifyDataSetChanged();
        }
    }
}

