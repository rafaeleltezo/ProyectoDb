package com.example.rafaelp.social;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.rafaelp.social.R;

public class Biografia extends AppCompatActivity {

    private ImageView imagenAtras,imagenestrella;
    private Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biografia);
        imagenAtras=(ImageView) findViewById(R.id.imagenAtras);
        imagenestrella=(ImageView) findViewById(R.id.imagenestrella);
        imagenAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intento=new Intent(getBaseContext(),MainActivity.class);
                startActivity(intento);
            }
        });
        imagenestrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intento=new Intent(getBaseContext(),Favoritos.class);
                startActivity(intento);
            }
        });
    }
}
