package com.example.desarrolloweb.materialdessign.restApi;

/**
 * Created by desarrolloweb on 22/07/16.
 */
public final class ConstantesRestApi {

    public static final String VERSION  = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCESS_TOKEN = "3571553443.bdc9637.b7c90b214aff430db36c448002e9b37d";
    public static final String KEY_ACCESS_TOKEN = "?access_token";
    public static final String KEY_GET_INFORMATION_USER = "users/self/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_INFORMATION_USER + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
//https://api.instagram.com/v1/users/self/media/recent/?access_token=3571553443.bdc9637.b7c90b214aff430db36c448002e9b37d

}
