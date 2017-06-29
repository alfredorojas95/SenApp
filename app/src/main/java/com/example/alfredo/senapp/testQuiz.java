package com.example.alfredo.senapp;

import android.app.FragmentManager;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import estructura.Cuestionario;

public class testQuiz extends AppCompatActivity {

    private int contadorTimer = 15;
    Thread t;
    MediaPlayer mpWin;
    MediaPlayer mpFail;

    private Cuestionario cuestionario;
    private ImageView imagen;
    private TextView textPregunta;
    private TextView textPuntaje;
    private TextView textTimer;
    private Button opc1;
    private Button opc2;
    private Button opc3;
    private Button opc4;

    private String respuesta;
    private int puntaje = 0;
    private int numPregunta = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_quiz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mpWin = MediaPlayer.create(this, R.raw.win);
        mpFail = MediaPlayer.create(this, R.raw.fail);

        imagen = (ImageView)findViewById(R.id.gifQuiz);
        textPregunta = (TextView)findViewById(R.id.descripcion);
        textPuntaje = (TextView)findViewById(R.id.score);
        //textTimer = (TextView)findViewById(R.id.timer);
        opc1 = (Button)findViewById(R.id.btnOpt1);
        opc2 = (Button)findViewById(R.id.btnOpt2);
        opc3 = (Button)findViewById(R.id.btnOpt3);
        opc4 = (Button)findViewById(R.id.btnOpt4);

        this.cuestionario = (Cuestionario)getIntent().getExtras().getSerializable("cuestionario");
        System.out.println("------> "+cuestionario.getCategoria(numPregunta));
        this.setTitle(cuestionario.getCategoria(numPregunta));
        actualizarPregunta();

        //btn 1
        opc1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(numPregunta<cuestionario.getLargo()){
                    if(opc1.getText() == respuesta){
                        mpWin.start();//sonido
                        puntaje += 1;//sumar puntaje
                        actualizarPuntaje(puntaje);
                        Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                    } else {
                        mpFail.start();
                        Toast.makeText(testQuiz.this, respuesta, Toast.LENGTH_SHORT).show();
                    }
                    numPregunta++;
                    if(numPregunta<4){
                        actualizarPregunta();
                    }else {
                        goDialog();
                    }
                }
            }
        });

        //btn 2
        opc2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if(numPregunta<cuestionario.getLargo()){
                    if(opc2.getText() == respuesta){
                        mpWin.start();
                        puntaje += 1;
                        actualizarPuntaje(puntaje);
                        Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                    } else {
                        mpFail.start();
                        Toast.makeText(testQuiz.this, respuesta, Toast.LENGTH_SHORT).show();
                    }
                    numPregunta++;
                    if(numPregunta<4){
                        actualizarPregunta();
                    }else {
                        goDialog();
                    }
                }
            }
        });

        //btn 3
        opc3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(numPregunta<cuestionario.getLargo()){
                    if(opc3.getText() == respuesta){
                        mpWin.start();
                        puntaje += 1;
                        actualizarPuntaje(puntaje);
                        Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                    } else {
                        mpFail.start();
                        Toast.makeText(testQuiz.this, respuesta, Toast.LENGTH_SHORT).show();
                    }
                    numPregunta++;
                    if(numPregunta<4){
                        actualizarPregunta();
                    }else {
                        goDialog();
                    }

                }

            }
        });

        //btn 4
        opc4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(numPregunta<cuestionario.getLargo()){
                    if(opc4.getText() == respuesta){
                        mpWin.start();
                        puntaje += 1;
                        actualizarPuntaje(puntaje);
                        Toast.makeText(testQuiz.this, "Correcto", Toast.LENGTH_SHORT).show();
                    } else {
                        mpFail.start();
                        Toast.makeText(testQuiz.this,respuesta, Toast.LENGTH_SHORT).show();
                    }
                    numPregunta++;
                    if(numPregunta<4){
                        actualizarPregunta();
                    } else {
                        goDialog();
                    }
                }
            }
        });

        /**
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    public void actualizarPregunta(){
        imagen.setImageResource(cuestionario.getImagen(numPregunta));
        textPregunta.setText(cuestionario.getPregunta(numPregunta));
        opc1.setText(cuestionario.getAlternativa1(numPregunta));
        opc2.setText(cuestionario.getAlternativa2(numPregunta));
        opc3.setText(cuestionario.getAlternativa3(numPregunta));
        opc4.setText(cuestionario.getAlternativa4(numPregunta));

        respuesta = cuestionario.getRespuestaCorrecta(numPregunta);
    }


    public void startTimer(){
        contadorTimer = 15;
        textPregunta.setTextColor(Color.parseColor("#FFFFFF"));
        new CountDownTimer(15000, 1000){
            public void onTick(long millisUntilFinished){
                textPregunta.setText(String.valueOf(contadorTimer));
                contadorTimer--;
                if(contadorTimer==5){
                    textPregunta.setTextColor(Color.parseColor("#D22F2F"));
                }
            }

            public void onFinish(){
               actualizarPregunta();
            }
        }.start();
    }

    public void actualizarPuntaje(int punto){
        System.out.println("num pregunta -> "+numPregunta);
        System.out.println("puntaje ---> "+puntaje);
        textPuntaje.setText("Puntaje: "+puntaje);
    }


    private void goQuiz(){
        //setContentView(R.layout.fragment_fragment_aprender);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_main, new FragmentAprender()).commit();
        this.setTitle("Quiz");
    }

    public void goDialog(){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(testQuiz.this);
        View mView = getLayoutInflater().inflate(R.layout.dialog_complete_quiz, null);

        //textos e imagen de xml dialogo
        TextView wText = (TextView)mView.findViewById(R.id.textDialog);
        TextView wTextPuntaje = (TextView)mView.findViewById(R.id.textQuizPuntaje);
        ImageView wImage = (ImageView)mView.findViewById(R.id.imageWin);

        if(puntaje==0){
            wText.setText("Inténtalo nuevamente");
            wTextPuntaje.setText("Puntaje: "+puntaje+"/"+cuestionario.getLargo());
            wImage.setImageResource(R.drawable.lose);
        } else if(puntaje==1){
            wText.setText("Aún debes practicar!");
            wTextPuntaje.setText("Puntaje: "+puntaje+"/"+cuestionario.getLargo());
            wImage.setImageResource(R.drawable.losertest);
        } else if(puntaje>1 && puntaje < cuestionario.getLargo()){
            wText.setText("Puedes mejorar!");
            wTextPuntaje.setText("Puntaje: "+puntaje+"/"+cuestionario.getLargo());
            wImage.setImageResource(R.drawable.winmedal);
        }


        wTextPuntaje.setText("Puntaje: "+puntaje);
        Button wBtn = (Button)mView.findViewById(R.id.btnWin);

        wBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(testQuiz.this, "go quiz activity", Toast.LENGTH_SHORT).show();
                //volver a quiz
            }
        });

        mBuilder.setView(mView);
        AlertDialog dialog = mBuilder.create();
        dialog.show();;

    }

    public void sayBye(){
        goQuiz();
    }
}
