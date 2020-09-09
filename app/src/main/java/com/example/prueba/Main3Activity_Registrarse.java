package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity_Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3__registrarse);
    }

    /**
     * Se ejecuta cuando se presiona el botón
     */
    public void sendMessage(View view) {
        //Intent corresponde a la Intencion que va a ejecutar Android
        //permite abrir una nueva Activity
        //en la siguiente linea aparece "prueba", alli deben escribir el nombre
        //de la activity seleccionada
        Intent intent = new Intent(this, Main2Activity_ingresar.class);
        startActivity(intent);
    }

}
