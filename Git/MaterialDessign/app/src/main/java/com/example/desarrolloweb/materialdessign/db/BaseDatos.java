package com.example.desarrolloweb.materialdessign.db;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by desarrolloweb on 7/07/16.
 */
public class BaseDatos extends SQLiteOpenHelper {

    private Context context;

    public BaseDatos(Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME, null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) { //Estructura de BD, create table

        String queryCrearTablaMascotas = "CREATE TABLE " + ConstantesBaseDatos.TABLE_PETS + "(" +
                ConstantesBaseDatos.TABLE_PETS_ID       + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatos.TABLE_PETS_NOMBRE   + " TEXT, "     +
                ConstantesBaseDatos.TABLE_PETS_RAZA     + " TEXT, "     +
                ConstantesBaseDatos.TABLE_PETS_FOTO     + " INTEGER "   +
                ")";

        String queryCrearTablaLikesContatco = "CREATE TABLE " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS + "(" +
                ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID             + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTA     + " INTEGER, " +
                ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES   + " INTEGER, " +
                "FOREIGN KEY (" +  ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTA + ") " +
                "REFERENCES "   +  ConstantesBaseDatos.TABLE_PETS + "(" + ConstantesBaseDatos.TABLE_PETS_ID + ")" +
                ")";

        String queryCrearTablaMascotaMasFotos = "CREATE TABLE " + ConstantesBaseDatos.TABLE_MASCOTA_FOTO + "(" +
                ConstantesBaseDatos.TABLE_MASCOTA_FOTO_ID       + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ConstantesBaseDatos.TABLE_MASCOTA_FOTO_NOMBRE   + " TEXT, "     +
                ConstantesBaseDatos.TABLE_MASCOTA_FOTO_RAZA     + " TEXT, "     +
                ConstantesBaseDatos.TABLE_MASCOTA_FOTO_F        + " INTEGER "  +
                ")";

        db.execSQL(queryCrearTablaMascotas);
        db.execSQL(queryCrearTablaLikesContatco);
        db.execSQL(queryCrearTablaMascotaMasFotos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {//Con ayuda de db,restructura la BD
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_PETS);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_MASCOTA_FOTO);
        onCreate(db);
    }

    public ArrayList<Mascotas> obtenerTodasLasMascotas () {
        ArrayList<Mascotas> mascotas = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_PETS;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);   //Devolver coleccion de datos del query que consulto  "null" es para definir parametros
        int contador = 1;
        while (registros.moveToNext()  ) {

            /*if(contador <= 5){
                Mascotas mascotaActual = new Mascotas();
                mascotaActual.setId(registros.getInt(0));
                mascotaActual.setNombre(registros.getString(1));
                mascotaActual.setRaza(registros.getString(2));
                mascotaActual.setFoto(registros.getInt(3));

                String queryLikes = "SELECT COUNT(" + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES +") as likes " +
                        " FROM " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS +
                        " WHERE " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTA + "=" + mascotaActual.getId();

                Cursor registrosLikes = db.rawQuery(queryLikes, null);

                if(registrosLikes.moveToNext()){
                    mascotaActual.setRaiting(registrosLikes.getInt(0));
                } else {
                    mascotaActual.setRaiting(0);
                }

                mascotas.add(mascotaActual);
            }*/
            contador ++;

        }

        db.close();

        return mascotas;

    }

    public ArrayList<Mascotas> obtenerMascotaYFotos () {
        ArrayList<Mascotas> mascotas = new ArrayList<>();
        //Mascotas mascotaActuald = new Mascotas();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_MASCOTA_FOTO;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);   //Devolver coleccion de datos del query que consulto  "null" es para definir parametros
        int contador = 1;
        while (registros.moveToNext()  ) {

            if(contador <= 5){
                Mascotas mascotaActual = new Mascotas();
                //mascotaActual.setId(registros.getInt(0));
                /*mascotaActual.setNombre(registros.getString(1));
                mascotaActual.setRaza(registros.getString(2));
                mascotaActual.setFoto(registros.getInt(3));*/

                /*String queryLikes = "SELECT COUNT(" + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES +") as likes " +
                        " FROM " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS +
                        " WHERE " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTA + "=" + mascotaActual.getId();

                Cursor registrosLikes = db.rawQuery(queryLikes, null);

                if(registrosLikes.moveToNext()){
                    mascotaActual.setRaiting(registrosLikes.getInt(0));
                } else {
                    mascotaActual.setRaiting(0);
                }*/

                mascotas.add(mascotaActual);
            }
            contador ++;

        }

        db.close();

        return mascotas;

        /*String queryMascotasFotos = "SELECT " + ConstantesBaseDatos.TABLE_MASCOTA_FOTO_FOTO + " FROM "  + ConstantesBaseDatos.TABLE_MASCOTA_FOTO +
                " WHERE " + ConstantesBaseDatos.TABLE_MASCOTA_FOTO_MASCOTA  + "=" + mascotaActual.getId();*/
        //db.close();
        //return mascotas;
    }

    public void insertarMascota (ContentValues contentValues){ // va a tener asociado el valor con el campo (punto de clave valor)
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_PETS, null, contentValues);
        db.close();
    }

    public void insertarLikeMascota(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_LIKES_MASCOTAS, null, contentValues);
        db.close();
    }

    public void insertarMAscotaFotos(ContentValues contentValues){
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, null, contentValues);
        db.close();
    }

    public int obtenerLikes (Mascotas mascota) {
        int likes    = 0;
        String query = "SELECT COUNT("+ ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES + ")" +
                " FROM "  + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS +
                " WHERE " + ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTA + " = " + mascota.getId();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);

        if (registros.moveToNext()) {
            likes = registros.getInt(0);
        }

        db.close();

        return likes;
    }
}
