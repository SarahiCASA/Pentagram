package com.example.desarrolloweb.materialdessign.restApi.adapter;

import com.example.desarrolloweb.materialdessign.restApi.ConstantesRestApi;
import com.example.desarrolloweb.materialdessign.restApi.EndpointsApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by desarrolloweb on 5/08/16.
 */
public class RestApiAdap {

    public EndpointsApi establecerConexionRestAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.KEY_POST_ID_USUARIO_INSTAGRAM)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(EndpointsApi.class);
    }
}
