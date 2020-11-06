package com.uziel.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AprenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender);

    }

    public void imageAbc(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7192673-abecedario.html"));
        startActivity(i);

    }

    public void imageSemana(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7193645-dias_de_la_semana.html"));
        startActivity(i);

    }

    public void imageNum(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7194468-numeros.html"));
        startActivity(i);


    }

    public void imageCortesia(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7277313-frases_de_cortesia.html"));
        startActivity(i);


    }

    public void imageMeses(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7277399-meses_del_ano.html"));
        startActivity(i);


    }

    public void imagePronombres(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7277446-pronombres_personales.html"));
        startActivity(i);


    }

    public void imageEmociones(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7277667-emociones.html"));
        startActivity(i);


    }

    public void imageColores(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7277578-colores.html"));
        startActivity(i);


    }

    public void imageFamilia(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7280416-la_familia.html"));
        startActivity(i);


    }

    public void imageSentimientos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7280822-sentimientos.html"));
        startActivity(i);


    }

    public void imageUtiles(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7385381-utiles.html"));
        startActivity(i);


    }

    public void imageDepartamentos(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7385476-departamentos.html"));
        startActivity(i);


    }

    public void imageTiempo(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7385577-el_tiempo.html"));
        startActivity(i);


    }

    public void imageInterrogantes(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://es.educaplay.com/recursos-educativos/7396050-interrogantes.html"));
        startActivity(i);


    }


}