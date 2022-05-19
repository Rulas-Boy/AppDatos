package com.example.appdatos.utilidades;

// Creado por Raúl Alvarez

public class Utilidades {
    // Constantes de los campos de la tabla 'usuarios'
    public static final String TABLA_USUARIO = "usuario";
    public static final String CAMPO_ID = "id";
    public static final String CAMPO_NOMBRE = "nombre";
    public static final String CAMPO_TELEFONO = "telefono";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLA_USUARIO +
            " (" + CAMPO_ID + " INTEGER, " + CAMPO_NOMBRE + " TEXT, " + CAMPO_TELEFONO + " TEXT);";

}
