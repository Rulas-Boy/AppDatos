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
        registroUsuario();
        //registroUsuarioSql();
    }

    // Registro de usuario con sentencia SQL
    private void registroUsuarioSql() {
        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        // Código de insert
        String insert = "INSERT INTO " + Utilidades.TABLA_USUARIO + " (" + Utilidades.CAMPO_ID + ", " +
                Utilidades.CAMPO_NOMBRE + ", " + Utilidades.CAMPO_TELEFONO + ") VALUES (" +
                et1.getText().toString() + ", '" + et2.getText().toString() +"', '" +
                et3.getText().toString() + "');";

        // Para ejecutar cualquier código en SQL
        db.execSQL(insert);

        // Cierra base de datos
        db.close();
    }

    // Registro de usuario regular con ContentValues
    private void registroUsuario() {
        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this, "bd_usuarios", null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_ID, et1.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE, et2.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO, et3.getText().toString());

        long idRes = db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID, values);
        db.close();

        Toast.makeText(this, "Id Registrado: " + idRes, Toast.LENGTH_SHORT).show();
    }
}