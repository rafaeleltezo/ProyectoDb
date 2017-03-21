package com.example.rafaelp.social;

/**
 * Created by Rafael p on 17/3/2017.
 */

public class Contacto {
    private String nombre;
    private int foto,contador;

    public Contacto(String nombre, int foto, int contador) {
        this.nombre = nombre;
        this.foto = foto;
        this.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
