package com.example.rafaelp.social;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Rafael p on 19/3/2017.
 */

public class FragmenPerfil extends Fragment {
    private RecyclerView reciclar;
    private ArrayList<Contacto> contactos;
    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fracmentperfil, container, false);
        reciclar = (RecyclerView) vista.findViewById(R.id.reciclerPerfil);
        reciclar.setLayoutManager(new GridLayoutManager(getActivity(),2));
        reciclar.setAdapter(new AdaptadorReciclerPerfil(datos(),getActivity()));
        imageView=(ImageView)vista.findViewById(R.id.imagenPerfil);
        return vista;
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
