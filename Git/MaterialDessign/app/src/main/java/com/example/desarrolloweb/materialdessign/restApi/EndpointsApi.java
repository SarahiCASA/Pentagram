package com.example.desarrolloweb.materialdessign.restApi;

import com.example.desarrolloweb.materialdessign.restApi.model.ContactoResponse;
import com.example.desarrolloweb.materialdessign.restApi.model.UserIDTokenResponse;
import com.example.desarrolloweb.materialdessign.restApi.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by desarrolloweb on 22/07/16.
 */
public interface EndpointsApi {
    //Definir la peticion hacia el endpoint
    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<ContactoResponse> getRecentMedia(); //Generar un modelo de esa respuesta

    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_ID_USUARIO_INSTAGRAM)
    Call<UsuarioResponse> registrarTokenID(@Field("id_usuario_instagram") String id_usuario_instagram);

    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_LIKE)
    Call<UserIDTokenResponse> darLike(
            @Field("id_dispositivo") String id_dispositivo,
            @Field("id_usuario_instagram") String id_usuario_instagram,
            @Field("id_foto_instagram") String nombre_usuario_instagram
    );

    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_NOTIFICACION)
    Call<UserIDTokenResponse> notificacionUsuario(
            @Field("id_token") String token,
            @Field("id_usr_inst") String usrInstID,
            @Field("url_foto_usuario") String urlFotoUsr

    );

    @FormUrlEncoded
    @POST(ConstantesRestApi.KEY_POST_ID_USR)
    Call<UserIDTokenResponse> registrarTokenID(
            @Field("id_dispositivo") String id_dispositivo,
            @Field("id_usuario_instagram") String id_usuario_instagram,
            @Field("nombre_usuario_instagram") String nombre_usuario_instagram
    );
}
