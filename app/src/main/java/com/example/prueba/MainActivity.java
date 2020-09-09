package com.example.prueba;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Se ejecuta cuando se presiona el botón  */
    public void sendMessage(View view) {
        //Intent corresponde a la Intencion que va a ejecutar Android
        //permite abrir una nueva Activity
        //en la siguiente linea aparece "prueba", alli deben escribir el nombre
        //de la activity seleccionada
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }
}
