package com.example.rafaelp.social;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Rafael p on 17/3/2017.
 */

public class FragmentRecicler extends Fragment {

    private ArrayList<Contacto>contactos;
    private RecyclerView reciclar;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_recicler, container, false);
        reciclar=(RecyclerView) vista.findViewById(R.id.recicler);
        reciclar.setLayoutManager(new LinearLayoutManager(getActivity()));
        reciclar.setAdapter(new AdaptadorRecicler(getActivity(),datos()));


        return vista;
    }

    private ArrayList<Contacto> datos(){
        contactos=new ArrayList<>();
        contactos.add(new Contacto("Rafael barboza",R.drawable.dog_150920_640,3));
        contactos.add(new Contacto("Juan jose",R.drawable.dog_150923_640,3));
        contactos.add(new Contacto("Flaco jose",R.drawable.dog_150963_640,5));
        contactos.add(new Contacto("Camilo fermando",R.drawable.mascota_kawaii,12));
        contactos.add(new Contacto("jose andrade",R.drawable.mascota,5));
        contactos.add(new Contacto("Rafael barboza",R.drawable.dog_150920_640,3));
        contactos.add(new Contacto("Juan jose",R.drawable.dog_150923_640,3));
        contactos.add(new Contacto("Flaco jose",R.drawable.dog_150963_640,5));
        contactos.add(new Contacto("Camilo fermando",R.drawable.mascota_kawaii,12));
        contactos.add(new Contacto("jose andrade",R.drawable.mascota,5));
        return contactos;
    }
}
