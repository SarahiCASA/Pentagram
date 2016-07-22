package com.example.desarrolloweb.materialdessign.pojo;

/**
 * Created by desarrolloweb on 24/06/16.
 */
public class Mascotas {

    private String id;
    private String nombreCompleto;
    private String urlFoto;
    private int likes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Mascotas() {

    }

    public Mascotas( String urlFoto, String nombreCompleto, int likes) {
        this.urlFoto = urlFoto;
        this.nombreCompleto = nombreCompleto;
        this.likes = likes;
    }
}
