package com.example.sistemascasa.tigie.rest;

import com.example.sistemascasa.tigie.pojo.Tlc;
import com.example.sistemascasa.tigie.rest.model.TlcResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by desarrolloweb on 10/08/16.
 */
public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_TLC)
    Call<TlcResponse> getRecentTlc();

}
