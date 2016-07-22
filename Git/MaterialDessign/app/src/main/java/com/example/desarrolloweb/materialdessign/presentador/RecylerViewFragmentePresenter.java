package com.example.desarrolloweb.materialdessign.presentador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.db.ConstructorMascotas;
import com.example.desarrolloweb.materialdessign.fragments.IRecyclerViewFragmentView;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;
import com.example.desarrolloweb.materialdessign.restApi.EndpointsApi;
import com.example.desarrolloweb.materialdessign.restApi.adapter.RestApiAdapter;
import com.example.desarrolloweb.materialdessign.restApi.model.ContactoResponse;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        obtenerMediosRecientes();
        //obtenerDatosBaseDatos();
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
        iRecyclerViewFragmentView.generarGridLayout();
    }

    @Override
    public void obtenerMediosRecientes() {
        RestApiAdapter restApiAdapter   = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecent();

        EndpointsApi endpointsApi       = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent); //alamacena la informacion en un objeto endpoint

        Call<ContactoResponse> contactoResponseCall = endpointsApi.getRecentMedia();

        contactoResponseCall.enqueue(new Callback<ContactoResponse>() {
            @Override
            public void onResponse(Call<ContactoResponse> call, Response<ContactoResponse> response) {
                ContactoResponse contactoResponse = response.body();
                mascotas = contactoResponse.getMascotas();
                mostrarDatosRV();
            }

            @Override
            public void onFailure(Call<ContactoResponse> call, Throwable t) {
                Toast.makeText(context, "Fallo la conexión", Toast.LENGTH_LONG).show();
                Log.e("FALLO LA CONEXION", t.toString());
            }
        });
    }











}
