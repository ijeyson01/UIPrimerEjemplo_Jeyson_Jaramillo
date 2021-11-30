package com.example.uiprimerejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnEnviarDatos(View view)
    {

        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, Bienvenida.class);
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        String txtGenero = "";
        RadioButton selec1 = findViewById(R.id.rbtMasculino);
        RadioButton selec2 = findViewById(R.id.rbtFemenino);
        if (selec1.isChecked() == false){
            txtGenero = "Femenino";
        }else{
            txtGenero = "Masculino";
        }
        EditText txtFecha = (EditText)findViewById(R.id.dtpfecNac);
        EditText txtTelf = (EditText)findViewById(R.id.txtTelf);

        //Creamos la información a pasar entre actividades - Pares Key-Value
        Bundle b = new Bundle();
        b.putString("Nombre", txtNombre.getText().toString());
        b.putString("Genero", txtGenero);
        b.putString("FecNac", txtFecha.getText().toString());
        b.putString("Telefono", txtTelf.getText().toString());
        //Añadimos la información al intent
        intent.putExtras(b);
        // Iniciamos la nueva actividad
        startActivity(intent);
        }
    }

