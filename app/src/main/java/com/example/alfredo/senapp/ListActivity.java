package com.example.alfredo.senapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import estructura.Palabra;

public class ListActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView imageView;
    TextView categoria;
    TextView textDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        imageView = (ImageView) findViewById(R.id.imageClick);
        categoria = (TextView) findViewById(R.id.textCatPalabra);
        textDescripcion = (TextView)findViewById(R.id.textDescPalabra);

        Palabra p = (Palabra)getIntent().getExtras().getSerializable("itemPalabraDiccionario");
        mToolbar.setTitle(p.getNombre());
        categoria.setText("Categoría: "+p.getCategoria());
        imageView.setImageResource(p.getImagen());
        textDescripcion.setText(p.getDescripcion());


        /**Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            mToolbar.setTitle(bundle.getString("itemPalabraDiccionario"));
            imageView.setImageDrawable(ContextCompat.getDrawable(ListActivity.this, R.drawable.book));

        }*/
    }
}
