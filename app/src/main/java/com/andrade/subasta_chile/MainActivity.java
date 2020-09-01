package com.andrade.subasta_chile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creamos la variable que haran referencia a los widgets.
    private TextView txtTitulo;
    private Button btnIniciarapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Realizar las referencias (Las variables que creamos arriba las conectaremos con los elementos graficos.)
        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciarapp = findViewById(R.id.btnIniciarapp);

    }
}