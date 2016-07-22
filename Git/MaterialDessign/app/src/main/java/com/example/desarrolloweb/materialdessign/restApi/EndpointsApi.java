package com.example.desarrolloweb.materialdessign.restApi;

import com.example.desarrolloweb.materialdessign.restApi.model.ContactoResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by desarrolloweb on 22/07/16.
 */
public interface EndpointsApi {
    //Definir la peticion hacia el endpoint
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<ContactoResponse> getRecentMedia(); //Generar un modelo de esa respuesta


}
