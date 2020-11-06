package com.uziel.splash;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class interNoticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_noticias);

        WebView myWebView = (WebView) findViewById(R.id.interNoticiass);
        myWebView.loadUrl("https://prociegosysordos.org.gt/Noticias.php");
    }
}