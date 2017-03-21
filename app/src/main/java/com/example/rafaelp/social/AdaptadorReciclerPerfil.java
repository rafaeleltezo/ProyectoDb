package com.example.rafaelp.social;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rafaelp.social.Contacto;
import com.example.rafaelp.social.R;

import java.util.ArrayList;

/**
 * Created by Rafael p on 19/3/2017.
 */

public class AdaptadorReciclerPerfil extends RecyclerView.Adapter<AdaptadorRecicler.AdaptadorReciclerHolder> {

    ArrayList<Contacto>contactos;
    Activity activity;

    public  AdaptadorReciclerPerfil(ArrayList<Contacto> contactos,Activity activity){
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
        holder.contador.setText(String.valueOf(contacto.getContador()));
        holder.nombre.setVisibility(View.INVISIBLE);
        holder.like.setVisibility(View.INVISIBLE);
        holder.imagen.setImageResource(contacto.getFoto());

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }
}
