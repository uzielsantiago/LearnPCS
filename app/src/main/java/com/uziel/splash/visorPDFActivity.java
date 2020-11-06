package com.uziel.splash;

import android.os.Bundle;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class visorPDFActivity extends AppCompatActivity {
    public final static long ONE_MEGABYTE = 1024 * 1024*50;

    private String libroNombre;
    private PDFView pdfView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_p_d_f);

        libroNombre = getIntent().getStringExtra("TITULO LIBRO");
        pdfView = findViewById(R.id.pdfView);

        FirebaseStorage mFirebaseStorage = FirebaseStorage.getInstance();
        StorageReference mmFirebaseStorageRef= mFirebaseStorage.getReference().child("libros");

        mmFirebaseStorageRef.child(libroNombre).getBytes(ONE_MEGABYTE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                pdfView.fromBytes(bytes).load();

            }
        });
    }
}