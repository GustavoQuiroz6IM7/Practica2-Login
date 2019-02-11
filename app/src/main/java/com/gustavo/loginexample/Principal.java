package com.gustavo.loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView txt1;
    String usu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txt1 = (TextView) findViewById(R.id.ptxt1);

        Bundle recibe = this.getIntent().getExtras();

        usu = recibe.getString("usuario");

        txt1.setText("Bienvenido de nuevo: " + usu);

    }
}
