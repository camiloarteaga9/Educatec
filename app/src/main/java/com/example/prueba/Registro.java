package com.example.prueba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button iniciarsesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        iniciarsesion = (Button) findViewById(R.id.iniciarsesion);

        iniciarsesion.setOnClickListener( new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Registro.this, Main2Activity_ingresar.class );
                startActivity( intent );
                //finish();
            }
        } );
    }

        /** Se ejecuta cuando se presiona el botón  */
        public void sendMessage(View view) {
            //Intent corresponde a la Intencion que va a ejecutar Android
            //permite abrir una nueva Activity
            //en la siguiente linea aparece "prueba", alli deben escribir el nombre
            //de la activity seleccionada
            Intent intent = new Intent(this, Main3Activity_Registrarse.class);
            startActivity(intent);
        }




    }






