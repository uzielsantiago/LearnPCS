package com.uziel.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

///agregar animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);


        TextView LearnTextView = findViewById(R.id.LearnTextView);
        ImageView LogoImageView = findViewById(R.id.LogoImageView);

        LearnTextView.setAnimation(animation1);
        LogoImageView.setAnimation(animation2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginGoogle.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }

}