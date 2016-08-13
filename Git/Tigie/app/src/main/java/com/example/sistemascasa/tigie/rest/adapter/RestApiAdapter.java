package com.example.sistemascasa.tigie.rest.adapter;

import com.example.sistemascasa.tigie.rest.ConstantesRestApi;
import com.example.sistemascasa.tigie.rest.EndpointsApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by desarrolloweb on 10/08/16.
 */
public class RestApiAdapter {

    public EndpointsApi establecerConexionRestApi () {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(EndpointsApi.class);
    }

}
