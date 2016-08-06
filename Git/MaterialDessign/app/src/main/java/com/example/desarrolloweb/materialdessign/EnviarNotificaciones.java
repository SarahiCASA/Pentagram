package com.example.desarrolloweb.materialdessign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.desarrolloweb.materialdessign.restApi.EndpointsApi;
import com.example.desarrolloweb.materialdessign.restApi.adapter.RestApiAdap;
import com.example.desarrolloweb.materialdessign.restApi.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EnviarNotificaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_notificaciones);

    }


    public void enviarToken (View v) {
        String token =  FirebaseInstanceId.getInstance().getToken();
        enviarTokenRegistro(token);
    }

    public void enviarTokenRegistro(String token) {
        Log.d("TOKEN", token);
        RestApiAdap restApiAdap = new RestApiAdap();
        EndpointsApi endpointsApi = restApiAdap.establecerConexionRestAPI();
        Call<UsuarioResponse> usuarioResponseCall = endpointsApi.registrarTokenID(token);

        usuarioResponseCall.enqueue(new Callback<UsuarioResponse>() {
            @Override
            public void onResponse(Call<UsuarioResponse> call, Response<UsuarioResponse> response) {
                UsuarioResponse usuarioResponse = response.body();
                Log.d("ID_FIREBASE", usuarioResponse.getId_usuario());
                Log.d("TOKEN_FIREBASE", usuarioResponse.getId_usuario());
            }

            @Override
            public void onFailure(Call<UsuarioResponse> call, Throwable throwable) {

            }
        });
    }












}
