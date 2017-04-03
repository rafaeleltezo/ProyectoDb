package com.example.rafaelp.social.Presentador;

import com.example.rafaelp.social.Modelo.Contacto;
import com.example.rafaelp.social.Modelo.Datos;
import com.example.rafaelp.social.Vista.iFragmentoPerfil;

import java.util.ArrayList;

/**
 * Created by Rafael p on 2/4/2017.
 */

public class FragmentPerfilPresentador implements iFragmenPerfilPresentador {

    ArrayList<Contacto>contactos;
    iFragmentoPerfil ifragmentoperfil;

    public FragmentPerfilPresentador(iFragmentoPerfil ifragmentoperfil){
        this.ifragmentoperfil=ifragmentoperfil;
    }
    @Override
    public void obtenerDatos() {
        Datos datos=new Datos();
        contactos=datos.datos();
        mostarRv();
    }

    @Override
    public void mostarRv() {
        ifragmentoperfil.iniciandoAdatador(ifragmentoperfil.setAdaptador(contactos));
    }
}
