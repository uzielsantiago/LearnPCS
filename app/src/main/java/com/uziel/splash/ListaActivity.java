package com.uziel.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lista);

    }


    public void prociegos_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://prociegosysordos.org.gt/"));
        startActivity(i);
    }

    public void Conadi_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://conadi.gob.gt/"));
        startActivity(i);
    }

    public void faceAsorgua(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ASORGUA/"));
        startActivity(i);
    }

    public void Parlacen_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://oddca.org/"));
        startActivity(i);
    }

    public void Ascated_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ascated.org.gt/"));
        startActivity(i);
    }

    public void Anini_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://heroesanini.org/"));
        startActivity(i);
    }

    public void Alida_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sbs.gob.gt/alida-espana-de-arana/"));
        startActivity(i);
    }

    public void Fundal_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.fundal.org.gt/"));
        startActivity(i);
    }

    public void Mineduc_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mineduc.gob.gt/"));
        startActivity(i);
    }

    public void Bienestar_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sbs.gob.gt/"));
        startActivity(i);
    }

    public void Sosep_btn(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sosep.gob.gt/"));
        startActivity(i);
    }

    public void faceAsedes(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/asedesguatemala/"));
        startActivity(i);
    }

    public void faceEnsenas(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ensenasguatemala/"));
        startActivity(i);
    }

    public void faceRub(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Rubelssy/"));
        startActivity(i);
    }

    public void instaRub(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/rubel_ssy?fbclid=IwAR1UGRplNZ_vbARByoZgtgqOd8mc8gzrrmsF1WeMD2mHQCZVt-0j4xBkdqo"));
        startActivity(i);
    }

    public void faceUvg(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/lenguauvg/"));
        startActivity(i);
    }

    public void faceLdsi(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/senasguateldsi/"));
        startActivity(i);
    }

    public void faceLey(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/LENSEGUAOficial/"));
        startActivity(i);
    }

    public void faceViaje(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.me/sordosviajeros?fbclid=IwAR3ZQnuhpy17-cK-JeIlFlbXCjARtk3ya6HRLC379LcKtCu8NgRMGIPd5Bc"));
        startActivity(i);
    }

    public void faceConferencia(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/CONFERENCIASCESGUA/"));
        startActivity(i);
    }

    public void faceLatino(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/LDSIguatemala/"));
        startActivity(i);
    }

    public void faceUsac(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EduEspecialUsac/"));
        startActivity(i);
    }



}