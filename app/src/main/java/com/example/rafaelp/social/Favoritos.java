package com.example.rafaelp.social;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rafaelp.social.R;

public class Favoritos extends AppCompatActivity {

    private Intent intento;
    private ImageView imagenAtras;
    private ImageView imagenEstrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        imagenEstrella=(ImageView)findViewById(R.id.imagenestrella);
        imagenAtras=(ImageView)findViewById(R.id.imagenAtras);
        imagenEstrella.setVisibility(View.INVISIBLE);
        intento=new Intent(this,MainActivity.class);
        imagenAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intento);
            }
        });
    }
}
