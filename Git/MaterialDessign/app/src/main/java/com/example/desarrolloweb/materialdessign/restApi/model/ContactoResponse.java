package com.example.desarrolloweb.materialdessign.restApi.model;

import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 22/07/16.
 */
public class ContactoResponse {

    ArrayList<Mascotas> mascotas;

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }
}
