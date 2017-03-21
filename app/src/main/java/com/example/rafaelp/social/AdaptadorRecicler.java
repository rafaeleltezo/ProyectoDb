package com.example.rafaelp.social;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rafaelp.social.Contacto;
import com.example.rafaelp.social.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Rafael p on 17/3/2017.
 */

public class AdaptadorRecicler extends RecyclerView.Adapter<AdaptadorRecicler.AdaptadorReciclerHolder> {

    ArrayList<Contacto>contactos;
    Activity actividad;
    Intent intento;

    public AdaptadorRecicler(Activity actividad,ArrayList<Contacto>contactos){
        this.contactos=contactos;
        this.actividad=actividad;
    }

    @Override
    public AdaptadorReciclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.carta,parent,false);
        return new AdaptadorReciclerHolder(vista);
    }

    @Override
    public void onBindViewHolder(AdaptadorReciclerHolder holder, int position) {
        final Contacto contacto=this.contactos.get(position);

        holder.contador.setText(String.valueOf(contacto.getContador()));
        holder.nombre.setText(contacto.getNombre());
        holder.imagen.setImageResource(contacto.getFoto());


    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class AdaptadorReciclerHolder extends RecyclerView.ViewHolder{
        TextView nombre,contador;
        ImageView imagen,hueso,like;
        public AdaptadorReciclerHolder(View itemView) {
            super(itemView);
            nombre=(TextView)itemView.findViewById(R.id.nombreCarta);
            contador=(TextView)itemView.findViewById(R.id.contadorLike);
            imagen=(ImageView)itemView.findViewById(R.id.imagenCarta);
            hueso=(ImageView)itemView.findViewById(R.id.hueso);
            like=(ImageView)itemView.findViewById(R.id.like);
        }
    }
}
