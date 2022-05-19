package com.example.appdatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appdatos.utilidades.Utilidades;

public class RegistroUsuarios extends AppCompatActivity {

    EditText et1, et2, et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuarios);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
    }

    public void Registro(View view) {
        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID, et1.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE, et2.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO, et3.getText().toString());

        Long idRes = db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID, values);

        Toast.makeText(this, "Id Registrado: " + idRes, Toast.LENGTH_SHORT).show();
    }
}