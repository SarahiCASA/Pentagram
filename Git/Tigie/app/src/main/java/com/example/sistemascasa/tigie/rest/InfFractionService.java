package com.example.sistemascasa.tigie.rest;

import com.example.sistemascasa.tigie.pojo.InfFRaction;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;


/**
 * Created by desarrolloweb on 3/08/16.
 */
public interface InfFractionService {

    @GET("/informationdata")
    void getInformationData( @Query("fraccion") String fraccion, Callback<InfFRaction> callback);

}
