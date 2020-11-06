package com.uziel.splash;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;

public class LibrosActivity2 extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> libros;


    private StorageReference nStorageRef;
    private AlertDialog.Builder builder1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros2);

        listView = findViewById(R.id.listviewLibros);

        libros = new ArrayList<>();

        //inicializacion del objeto en firebase storage
        nStorageRef = FirebaseStorage.getInstance().getReference();

        //traigo la referencia el bucket donde tengo guardado mis libros en pdf de firebase
        StorageReference reference = nStorageRef.child("libros");
        //codigo para traer todos los titulos de los libros
        reference.listAll().addOnSuccessListener(new OnSuccessListener<ListResult>() {

            @Override
            public void onSuccess(ListResult listResult) {
                Log.e("libros", "entrando a recuperar libros");
                for (StorageReference item : listResult.getItems()) {
                    libros.add(item.getName() + "");
                    Log.e("Libro: --->", item.getPath() + "---" + item.getName());
                }
                //configuro el adaptador de la lista
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, libros);

                //muestro el adaptador en la vista
                listView.setAdapter(adapter);


            }

            //  }).addOnFailureListener(
            //    AlertDialog.Builder builder1 = new AlertDialog.Builder(LibrosActivity2.this);
            //  builder1.setMessage("Ha ocurrido un error al cargar los libros revisa tu conexion a internet");
            //builder1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            //  @Override
            //public void onClick(DialogInterface dialog, int id) {
            //  dialog.cancel();
            //                  }
            //            });

            //});
            //  AlertDialog alert11 =  builder1.create();
            //alert11.show();


        });

    }

}
