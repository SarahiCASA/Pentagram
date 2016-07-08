package com.example.desarrolloweb.materialdessign.presentador;

import android.content.Context;

import com.example.desarrolloweb.materialdessign.db.ConstructorMascotas;
import com.example.desarrolloweb.materialdessign.fragments.IRecyclerViewFragmentView;
import com.example.desarrolloweb.materialdessign.fragments.PerfilFragment;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 7/07/16.
 */
public class RecyclerViewFragmentPresenterMV implements IRecyclerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascotas> mascotas;

    public RecyclerViewFragmentPresenterMV(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerDatosBaseDatos();
    }


    @Override
    public void obtenerDatosBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        //mascotas = constructorMascotas.obtenerDatos();
        mascotas = constructorMascotas.obtenerMascotaMasVisitada();
        mostrarDatosRV();
    }

    @Override
    public void mostrarDatosRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarGridLayout();
    }




    /*public RecylerViewFragmentePresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerDatosBaseDatos();
    }*/




}
