package com.example.desarrolloweb.materialdessign.restApi.adapter;

import com.example.desarrolloweb.materialdessign.restApi.ConstantesRestApi;
import com.example.desarrolloweb.materialdessign.restApi.EndpointsApi;
import com.example.desarrolloweb.materialdessign.restApi.deserializador.ContactoDeserializador;
import com.example.desarrolloweb.materialdessign.restApi.model.ContactoResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by desarrolloweb on 22/07/16.
 */
public class RestApiAdapter {

    public EndpointsApi establecerConexionRestApiInstagram (Gson gson) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson)) //Hace la deserializacion
                .build();

        return retrofit.create(EndpointsApi.class); //generar la llamada al root_url, ejecutar la llamada e inicializa el objeto
    }

    public Gson construyeGsonDeserializadorMediaRecent() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(ContactoResponse.class, new ContactoDeserializador());

        return gsonBuilder.create();
    }

}
