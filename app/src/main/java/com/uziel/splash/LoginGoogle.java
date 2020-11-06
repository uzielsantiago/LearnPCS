package com.uziel.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class LoginGoogle extends AppCompatActivity {

    FirebaseAuth mFirebaseAuth;
    FirebaseAuth.AuthStateListener mAuthListener;

    public static final int RESQUEST_CODE = 1234;

    List<AuthUI.IdpConfig> provider = Arrays.asList(


            new AuthUI.IdpConfig.GoogleBuilder().build()

    );


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null){
                    Toast.makeText(LoginGoogle.this, "iniciaste sesion",Toast.LENGTH_SHORT).show();
                }else {
                    startActivityForResult(AuthUI.getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(provider)
                            .setIsSmartLockEnabled(false)
                            .build(),RESQUEST_CODE
                    );
                }
            }
        };

    }///fin del oncreate


    public void irAprende(View view){
        Intent i = new Intent(this, AprenderActivity.class);
        startActivity(i);
    }

    public void irNoticias(View view){
        Intent i = new Intent(this, interNoticias.class);
        startActivity(i);
    }

    public void irLibros(View view){
        Intent i = new Intent(this, LibrosActivity.class);
        startActivity(i);
    }
    public void irContactos(View view){
        Intent i = new Intent(this, ListaActivity.class);
        startActivity(i);
    }

    public void irInformate(View view){
        Intent i = new Intent(this, InformateActivity.class);
        startActivity(i);
    }




    @Override
    protected void onResume() {
        super.onResume();
        mFirebaseAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mFirebaseAuth.removeAuthStateListener(mAuthListener);
    }

    public void CerrarSesion(View view) {

        AuthUI.getInstance().signOut(this).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                Toast.makeText(LoginGoogle.this, "SESION CERRADA!", Toast.LENGTH_SHORT).show();

            }
        });
    }
}