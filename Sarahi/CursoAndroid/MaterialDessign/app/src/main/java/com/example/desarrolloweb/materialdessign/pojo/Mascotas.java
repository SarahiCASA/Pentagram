package com.example.desarrolloweb.materialdessign.pojo;

/**
 * Created by desarrolloweb on 24/06/16.
 */
public class Mascotas {

    private int id;
    private String nombre;
    private int foto;
    private int raiting;
    private String raza;

    public Mascotas() {

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getRaiting() {
        return raiting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
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

    public Mascotas( String nombre, String raza, int foto, int raiting) {
        this.foto = foto;
        this.nombre = nombre;
        this.raza = raza;
        this.raiting = raiting;

    }
}
