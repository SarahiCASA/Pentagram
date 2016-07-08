package com.example.desarrolloweb.materialdessign.presentador;

import android.content.Context;

import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.db.ConstructorMascotas;
import com.example.desarrolloweb.materialdessign.fragments.IRecyclerViewFragmentView;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 6/07/16.
 */
public class RecylerViewFragmentePresenter implements IRecyclerViewFragmentPresenter{

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascotas> mascotas;

    public RecylerViewFragmentePresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerDatosBaseDatos();
    }

    @Override
    public void obtenerDatosBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarDatosRV();
    }

    @Override
    public void mostrarDatosRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
