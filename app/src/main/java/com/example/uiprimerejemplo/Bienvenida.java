package com.example.uiprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenida extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_bienvenida);
        super.onCreate(savedInstanceState);
        TextView txtNombreN = (TextView)findViewById(R.id.txtNombre1);
        TextView txtGeneroN = (TextView)findViewById(R.id.txtGenero);
        TextView txtfechN = (TextView)findViewById(R.id.txtFecha);
        TextView txtTlfN = (TextView)findViewById(R.id.txtTelf1);
        Bundle bundle = this.getIntent().getExtras();
        txtNombreN.setText(bundle.getString("Nombre"));
        txtGeneroN.setText(bundle.getString("Genero"));
        txtfechN.setText(bundle.getString("FecNac"));
        txtTlfN.setText(bundle.getString("Telefono"));



    }
}