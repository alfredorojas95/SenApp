package com.example.alfredo.senapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mToolbar = (Toolbar) findViewById(R.id.toolbar1);
        imageView = (ImageView) findViewById(R.id.imageClick);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null) {
            mToolbar.setTitle(bundle.getString("itemPalabraDiccionario"));
            imageView.setImageDrawable(ContextCompat.getDrawable(ListActivity.this, R.drawable.book));

        }
    }
}
