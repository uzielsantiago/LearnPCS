package com.uziel.splash;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class InformateActivity extends AppCompatActivity {

    WebView webView;

    VideoView videoView;
    VideoView videoView2;
    VideoView videoView3;
    VideoView videoView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_informate);

        ////video 1

        videoView = (VideoView) findViewById(R.id.vv1);

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v1));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        ////video 2

        videoView2 = (VideoView) findViewById(R.id.vv2);

        videoView2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v2));
        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);

        ////video 3

        videoView3 = (VideoView) findViewById(R.id.vv3);

        videoView3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v3));
        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);

        ////video 4

        videoView4 = (VideoView) findViewById(R.id.vv4);

        videoView4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.v4));
        MediaController mediaController4 = new MediaController(this);
        videoView4.setMediaController(mediaController4);

        //videoView.start();
    }

}