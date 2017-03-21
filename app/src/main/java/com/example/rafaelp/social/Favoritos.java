package com.example.rafaelp.social;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.rafaelp.social.R;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    private ArrayList<Contacto> contactos;
    private RecyclerView reciclar;
    private Intent intento;
    private ImageView imagenAtras;
    private ImageView imagenEstrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        reciclar=(RecyclerView) findViewById(R.id.reciclar);
        imagenEstrella=(ImageView)findViewById(R.id.imagenestrella);
        imagenAtras=(ImageView)findViewById(R.id.imagenAtras);
        imagenEstrella.setVisibility(View.INVISIBLE);
        intento=new Intent(this,MainActivity.class);
        reciclar.setLayoutManager(new LinearLayoutManager(this));
        reciclar.setAdapter(new AdaptadorFavoritos(datos(),this));
        imagenAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intento);
            }
        });
    }
    public ArrayList<Contacto> datos() {
        contactos = new ArrayList<>();
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 2));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 3));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 4));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 6));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 12));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 10));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 1));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 5));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 12));
        contactos.add(new Contacto("Rafael barboza", R.drawable.mascota, 9));
        return contactos;
    }
}
