package com.example.rafaelp.social.Presentador;

import com.example.rafaelp.social.Modelo.Contacto;
import com.example.rafaelp.social.Modelo.Datos;
import com.example.rafaelp.social.Vista.iFavoritos;

import java.util.ArrayList;

/**
 * Created by Rafael p on 2/4/2017.
 */

public class FavoritoPresentador implements iFavoritosPresentador {
    private iFavoritos ifavorito;
    private ArrayList<Contacto>contactos;

    public FavoritoPresentador(iFavoritos ifavorito,ArrayList<Contacto>contactos){
        this.ifavorito=ifavorito;
        this.contactos=contactos;
    }

    @Override
    public void obtenerDatos() {
        Datos datos=new Datos();
        contactos=datos.datos();
        mostrarRv();
    }

    @Override
    public void mostrarRv() {
        ifavorito.iniciarAdaptador(ifavorito.setAdaptador(contactos));
        ifavorito.setLayout();
    }
}
