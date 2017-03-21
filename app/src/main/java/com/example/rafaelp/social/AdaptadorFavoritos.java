package com.example.rafaelp.social;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Rafael p on 21/3/2017.
 */

public class AdaptadorFavoritos extends RecyclerView.Adapter<AdaptadorRecicler.AdaptadorReciclerHolder>{
    ArrayList<Contacto> contactos;
    Activity activity;

    public  AdaptadorFavoritos(ArrayList<Contacto> contactos,Activity activity){
        this.contactos=contactos;
        this.activity=activity;
    }
    @Override
    public AdaptadorRecicler.AdaptadorReciclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.carta,parent,false);
        return new AdaptadorRecicler.AdaptadorReciclerHolder(vista);
    }

    @Override
    public void onBindViewHolder(AdaptadorRecicler.AdaptadorReciclerHolder holder, int position) {
        final Contacto contacto=this.contactos.get(position);
        if(contacto.getContador()>=5){
        holder.contador.setText(String.valueOf(contacto.getContador()));
        holder.nombre.setText(contacto.getNombre());
        holder.imagen.setImageResource(contacto.getFoto());
        }
        else {
            Toast.makeText(activity,"No hay favoritos para mostrar",Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }
}
