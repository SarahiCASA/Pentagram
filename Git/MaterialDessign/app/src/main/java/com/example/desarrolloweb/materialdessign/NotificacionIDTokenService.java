package com.example.desarrolloweb.materialdessign;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceIdService;
/**
 * Created by desarrolloweb on 5/08/16.
 */
public class NotificacionIDTokenService extends FirebaseInstanceIdService {

    private static final String TAG = "FIREBASE_TOKEN";
    @Override
    public void onTokenRefresh() {
        //super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();
        enviarTokenRegistro(token);
    }


    private void enviarTokenRegistro(String token) {
        Log.d(TAG, token);
    }
}
