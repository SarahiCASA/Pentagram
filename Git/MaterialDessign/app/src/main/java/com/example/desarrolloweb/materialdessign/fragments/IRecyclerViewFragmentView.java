package com.example.desarrolloweb.materialdessign.fragments;

import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 6/07/16.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotasAdaptador crearAdaptador(ArrayList<Mascotas> mascotas);

    public void inicializarAdaptadorRV (MascotasAdaptador adaptador);

    public void generarGridLayout();

}
