package com.example.rafaelp.social.Vista;

import com.example.rafaelp.social.Modelo.Contacto;

import java.util.ArrayList;

/**
 * Created by Rafael p on 2/4/2017.
 */

public interface iFragmentoPerfil {
    public void setLayaout();
    public AdaptadorReciclerPerfil setAdaptador(ArrayList<Contacto>contactos);
    public void iniciandoAdatador(AdaptadorReciclerPerfil adaptadorReciclerPerfil);
}
