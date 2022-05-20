package com.example.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RegistroUsuario(View view) {
        Intent registar = new Intent(this, RegistroUsuarios.class);
        startActivity(registar);
    }

    public void ConsultaUsuario(View view) {
        Intent consulta = new Intent(this, ConsultaUsuario.class);
        startActivity(consulta);
    }

    public void ConsultaSpinner(View view) {
        Intent consulta = new Intent(this, RegistroUsuarios.class);
        startActivity(consulta);
    }

    public void ConsultaLista(View view) {
        Intent consulta = new Intent(this, RegistroUsuarios.class);
        startActivity(consulta);
    }
}