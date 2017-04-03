package com.example.rafaelp.social.Modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rafael p on 2/4/2017.
 */

public class BaseDatos extends SQLiteOpenHelper {

    public BaseDatos(Context context) {
        super(context, "Contacto", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        final String queryTablaContactos="CREATE TABLE CONTACTOS(ID INTEGER AUTOINCREMENT PRIMARY KEY,NOMBRE TEXT,FOTO INTEGER,LIKES INTEGER)";
        final String queryTablaLikes="CREATE TABLE LIKE (ID INTEGER AUTOINCREMENT PRIMARY KEY,LIKE_CONTACTO INTEGER,CANTIDAD INTEGER" +
                "FOREIGN KEY(LIKE_CONTACTO) REFERENCES CONTACTOS(LIKES))";
        db.execSQL(queryTablaContactos);
        db.execSQL(queryTablaLikes);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST CONTACTOS");
        db.execSQL("DROP TABLE IF EXIST LIKE");
        onCreate(db);
    }
}
