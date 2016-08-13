package com.example.sistemascasa.tigie.rest;

import com.example.sistemascasa.tigie.pojo.Tlc;

import java.util.List;

import retrofit.http.GET;

/**
 * Created by desarrolloweb on 10/08/16.
 */
public interface TlcService {

    @GET("/gettlc")
    void getTlc(retrofit.Callback<List<Tlc>> callback);

}
