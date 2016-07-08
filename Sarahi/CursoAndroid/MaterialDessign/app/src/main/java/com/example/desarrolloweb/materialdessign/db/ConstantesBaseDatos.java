package com.example.desarrolloweb.materialdessign.db;

/**
 * Created by desarrolloweb on 7/07/16.
 */
public final class ConstantesBaseDatos {

    public static final String DATABASE_NAME= "mascotas";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_PETS           = "mascota";
    public static final String TABLE_PETS_ID        = "id";
    public static final String TABLE_PETS_NOMBRE    = "nombre";
    public static final String TABLE_PETS_RAZA      = "raza";
    public static final String TABLE_PETS_FOTO      = "foto";

    public static final String TABLE_LIKES_MASCOTAS = "mascotas_likes";
    public static final String TABLE_LIKES_MASCOTAS_ID = "table_likes_mascotas_id";
    public static final String TABLE_LIKES_MASCOTAS_ID_MASCOTA= "id_mascota";
    public static final String TABLE_LIKES_MASCOTAS_NUMERO_LIKES = "numero_likes";

    public static final String TABLE_MASCOTA_FOTO           = "mascotafoto";
    public static final String TABLE_MASCOTA_FOTO_ID        = "id_mascota_foto";
    public static final String TABLE_MASCOTA_FOTO_NOMBRE    = "mascota_nombre";
    public static final String TABLE_MASCOTA_FOTO_RAZA      = "mascota_raza";
    public static final String TABLE_MASCOTA_FOTO_F         = "mascota_foto";
}
