package com.gustavo.loginexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText usu, contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu = (EditText) findViewById(R.id.usuario);
        contra = (EditText) findViewById(R.id.contrasenia);


    }

    public void ingresar (View v){

        String usuario = usu.getText().toString();
        String contrasenia = contra.getText().toString();

        if(usuario.equals("Gustavo Quiroz") && contrasenia.equals("1234")){
            Intent intento = new Intent(this, Principal.class);
            Bundle datos = new Bundle();
            datos.putString("usuario", usu.getText().toString().trim());
            datos.putString("contra", contra.getText().toString().trim());
            intento.putExtras(datos);
            finish();
            startActivity(intento);
        } else{
            Toast.makeText(this, "Credenciales invalidas", Toast.LENGTH_SHORT).show();
        }

    }
}
