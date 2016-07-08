package com.example.desarrolloweb.materialdessign.db;

import android.content.ContentValues;
import android.content.Context;

import com.example.desarrolloweb.materialdessign.R;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 6/07/16.
 */
public class ConstructorMascotas {
    private static final int LIKE = 1; //El interactor
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascotas> obtenerDatos () {
        /*ArrayList<Mascotas> mascotas = new ArrayList<Mascotas>();
        mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.buldogfrances, 170));
        mascotas.add(new Mascotas( "Dolly", "Chow Chow",  R.drawable.chow, 202));
        mascotas.add(new Mascotas( "Mariano", "Alaska", R.drawable.alaska, 105));
        mascotas.add(new Mascotas( "Alex", "San Bernardo", R.drawable.bernardo, 500));
        mascotas.add(new Mascotas( "Romina", "Chihuahua", R.drawable.chihuahua, 85));
        //mascotas.add(new Mascotas( "Willy", "Golden Retriever", R.drawable.golden, 252));
        //mascotas.add(new Mascotas( "Astro", "Maltes", R.drawable.maltes, 280));*/
        //mascotas.add(new Mascotas( "Max", "Pastor Alemán", R.drawable.pastoraleman, 236));
        //mascotas.add(new Mascotas( "Rizos", "Pomeriana", R.drawable.pomeriano, 210));
        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        return db.obtenerTodasLasMascotas();
    }

    public ArrayList<Mascotas> obtenerMascotaMasVisitada () {
        BaseDatos db = new BaseDatos(context);
        insertarMascotasMasVisitadas(db);
        return db.obtenerMascotaYFotos();
    }

    public void insertarTresMascotas (BaseDatos db) {
        ContentValues contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLE_PETS_NOMBRE, "Benito");
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_RAZA, "Buldog Frances");
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_FOTO,  R.drawable.buldogfrances);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_NOMBRE, "Dolly");
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_RAZA, "Chow Chow");
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_FOTO,  R.drawable.chow);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_NOMBRE, "Alex");
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_RAZA, "San Bernardo");
        contentValues.put(ConstantesBaseDatos.TABLE_PETS_FOTO,  R.drawable.bernardo);

        db.insertarMascota(contentValues);
    }

    public void darLike (Mascotas mascotas) {
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_ID_MASCOTA, mascotas.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTAS_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);
    }

    public int obtenerLikes(Mascotas mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikes(mascota);
    }

    public void insertarMascotasMasVisitadas (BaseDatos db){
        ContentValues contentValuesd = new ContentValues();
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_NOMBRE, "Benito");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_RAZA, "Buldog Frances");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_F,  R.drawable.ben01);
        db.insertarMAscotaFotos(contentValuesd);

        contentValuesd = new ContentValues();
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_NOMBRE, "Benito");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_RAZA, "Buldog Frances");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_F,  R.drawable.benito0005);
        db.insertarMAscotaFotos(contentValuesd);

        contentValuesd = new ContentValues();
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_NOMBRE, "Benito");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_RAZA, "Buldog Frances");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_F,   R.drawable.ben05);
        db.insertarMAscotaFotos(contentValuesd);

        contentValuesd = new ContentValues();
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_NOMBRE, "Benito");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_RAZA, "Buldog Frances");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_F,  R.drawable.benito0);
        db.insertarMAscotaFotos(contentValuesd);

        contentValuesd = new ContentValues();
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_NOMBRE, "Benito");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_RAZA, "Buldog Frances");
        contentValuesd.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO_F,  R.drawable.buldog1);
        db.insertarMAscotaFotos(contentValuesd);



    }


}
