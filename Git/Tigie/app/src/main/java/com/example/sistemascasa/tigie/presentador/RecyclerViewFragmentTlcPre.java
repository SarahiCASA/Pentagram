package com.example.sistemascasa.tigie.presentador;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.sistemascasa.tigie.db.ConstructorData;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_tlc;
import com.example.sistemascasa.tigie.pojo.Tlc;
import com.example.sistemascasa.tigie.rest.EndpointsApi;
import com.example.sistemascasa.tigie.rest.TlcService;
import com.example.sistemascasa.tigie.rest.adapter.RestApiAdapter;
import com.example.sistemascasa.tigie.rest.model.TlcResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by desarrolloweb on 10/08/16.
 */
public class RecyclerViewFragmentTlcPre implements IRecyclerViewFragmentTlcPre {

    private IRecyclerview_tlc iRecyclerview_tlc;
    private Context context;
    private RecyclerView listTlc;
    private ConstructorData constructorData;
    private ArrayList<Tlc> tlcs;

    public RecyclerViewFragmentTlcPre(IRecyclerview_tlc iRecyclerview_tlc, Context context) {

        this.iRecyclerview_tlc = iRecyclerview_tlc;
        this.context = context;
        getTlcWS();
        //getTlcBD();
    }

    @Override
    public void getTlcBD() {
        constructorData = new ConstructorData(context);
        tlcs = constructorData.getTlc();
        showTlcDataRV();
    }

    @Override
    public void getTlcWS() { //Ejecutando la llamada al servidor

        //RestAdapter restAdapter = new  RestAdapter().Builder().setEndpoint;
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint("http://10.40.68.153:8080/").build();

        TlcService service = restAdapter.create(TlcService.class);
        service.getTlc(new retrofit.Callback<List<Tlc>>() {
            @Override
            public void success(List<Tlc> tlcs2, retrofit.client.Response response) {

                tlcs.clear();
                tlcs.addAll(tlcs2);
                showTlcDataRV();
                //TlcResponse tlcResponse = response.getBody();
                //tlcs = tlcResponse.getTlcs();
                System.out.println(tlcs.toString());
            }

            @Override
            public void failure(RetrofitError error) {
                System.out.println("Algo salio mal :( ");
            }
        });
        /*RestApiAdapter restApiAdapter = new RestApiAdapter();
        EndpointsApi endpointsApi = restApiAdapter.establecerConexionRestApi();

        Call<TlcResponse> tlcResponseCall = endpointsApi.getRecentTlc();

        tlcResponseCall.enqueue(new Callback<TlcResponse>() {
            @Override
            public void onResponse(Call<TlcResponse> call, Response<TlcResponse> response) {
                TlcResponse tlcResponse = response.body();
                tlcs = tlcResponse.getTlcs();
                showTlcDataRV();
                System.out.println("Voy bien :) ");
            }

            @Override
            public void onFailure(Call<TlcResponse> call, Throwable t) {
                Toast.makeText(context, "Falló la conexión", Toast.LENGTH_LONG).show();
                Log.e("Fallo algo", t.toString());
                System.out.println("Algo salio mal :( ");
            }
        });*/
    }

    @Override
    public void showTlcDataRV() {
        iRecyclerview_tlc.inicializarAdaptadorRV(iRecyclerview_tlc.crearAdaptador(tlcs));
        iRecyclerview_tlc.generarGridLayout();
    }
}
