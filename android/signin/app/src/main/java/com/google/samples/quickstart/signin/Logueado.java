package com.google.samples.quickstart.signin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Auxiliadora Fernández on 08/10/17.
 */

public class Logueado extends AppCompatActivity {

    TextView titulo;
    TextView mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logueado);

        mail = findViewById(R.id.mail);
        titulo = findViewById(R.id.titulo);

        titulo.setText(getIntent().getExtras().getString("titulo"));
        mail.setText(getIntent().getExtras().getString("mail"));
    }

    public void salir(View v){
        finish();
    }
}
