package com.example.alfredo.senapp;

/**
 * Created by wilfr on 30-05-2017.
 */

public class Sena {
    private String nombre;
    private int id;

    public Sena(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
