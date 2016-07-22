package com.example.desarrolloweb.materialdessign.restApi.deserializador;

import com.example.desarrolloweb.materialdessign.pojo.Mascotas;
import com.example.desarrolloweb.materialdessign.restApi.JsonKeys;
import com.example.desarrolloweb.materialdessign.restApi.model.ContactoResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by desarrolloweb on 22/07/16.
 */
public class ContactoDeserializador implements JsonDeserializer<ContactoResponse> {


    @Override
    public ContactoResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        ContactoResponse contactoResponse = gson.fromJson(json, ContactoResponse.class);
        JsonArray contactoResponseData = json.getAsJsonObject().getAsJsonArray(JsonKeys.MEDIA_RESPONSE_ARRAY);
        contactoResponse.setMascotas(deserializarContactoDeJson(contactoResponseData)); //Recibe data y los deserializa

        return contactoResponse;
    }

    private ArrayList<Mascotas> deserializarContactoDeJson (JsonArray contactoResponseData) {
        ArrayList<Mascotas> mascotas = new ArrayList<>();

        for (int i = 0; i< contactoResponseData.size(); i++ ){
            JsonObject contactoResponseDataObject = contactoResponseData.get(i).getAsJsonObject();

            JsonObject userJson     = contactoResponseDataObject.getAsJsonObject(JsonKeys.USER);
            String id               = userJson.get(JsonKeys.USER_ID).getAsString();
            String nombreCompleto   = userJson.get(JsonKeys.USER_FULLNAME).getAsString();

            JsonObject imageJson  = contactoResponseDataObject.getAsJsonObject(JsonKeys.MEDIA_IMAGES);
            JsonObject stdResolutionJson = imageJson.getAsJsonObject(JsonKeys.MEDIA_STANDART_RESOLUTION);
            String urlFoto              = stdResolutionJson.get(JsonKeys.MEDIA_URL).getAsString();

            JsonObject likesJson = contactoResponseDataObject.getAsJsonObject(JsonKeys.MEDIA_LIKES);
            int likes = likesJson.get(JsonKeys.MEDIA_LIKES_COUNT).getAsInt();

            Mascotas mascotaActual = new Mascotas();
            mascotaActual.setId(id);
            mascotaActual.setNombreCompleto(nombreCompleto);
            mascotaActual.setUrlFoto(urlFoto);
            mascotaActual.setLikes(likes);

            mascotas.add(mascotaActual);
        }
        return mascotas;
    }







}
