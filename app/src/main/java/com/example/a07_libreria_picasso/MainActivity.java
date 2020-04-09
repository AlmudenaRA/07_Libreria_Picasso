package com.example.a07_libreria_picasso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView logotipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logotipo = (ImageView) findViewById(R.id.imageViewLogotipo);


        Picasso.get()
                .load("http://miguelcamposrivera.com/logo_mecaround.png")//Cargar la imagen de la url
                .resize(200,100) //redimensionar la imagen
                .centerCrop()//Centrar la imagen en el tamaño que hemos especificado y la corta ajustandola al tamaño
                .into(logotipo);
        //Con .placeholder() nos permite cargar una imagen por defecto en caso de que la nuestra no cargue
    }
}
