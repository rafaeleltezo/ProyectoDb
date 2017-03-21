package com.example.rafaelp.social;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Intent intento;
    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    ImageView imagenAtras;
    ImageView imagenestrella;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.barra);
        imagenAtras=(ImageView)findViewById(R.id.imagenAtras);
        imagenestrella=(ImageView)findViewById(R.id.imagenestrella);
        setSupportActionBar(toolbar);
        viewPager=(ViewPager) findViewById(R.id.viewPager);
        agregandoFragment();
        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Principal");
        tabLayout.getTabAt(1).setText("Perfil");
        imagenAtras.setVisibility(View.INVISIBLE);
        intento=new Intent(this,Favoritos.class);
        imagenestrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intento);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_bar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Contacto:
                intento=new Intent(this,FormularioContacto.class);
                startActivity(intento);
                break;
            case R.id.AcercaDe:
                intento=new Intent(this,Biografia.class);
                startActivity(intento);
                break;
        }
        return true;
    }

    public void agregandoFragment(){
        ArrayList<Fragment> fragments=new ArrayList<>();
        fragments.add(new FragmentRecicler());
        fragments.add(new FragmenPerfil());
        viewPager.setAdapter(new AdaptadorViewPager(getSupportFragmentManager(),fragments));
    }
}
