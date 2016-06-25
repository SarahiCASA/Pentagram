package com.example.desarrolloweb.materialdessign;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
        siguiente();
        /*ArrayList<String> nombresMascotas = new ArrayList<>();
        for (Mascotas mascota: mascotas) {
            nombresMascotas.add(mascota.getNombre());
        }*/
    }

    public void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.buldogfrances, 170));
        mascotas.add(new Mascotas("Dolly", "Chow Chow",  R.drawable.chow, 202));
        mascotas.add(new Mascotas("Mariano", "Alaska", R.drawable.alaska, 105));
        mascotas.add(new Mascotas("Alex", "San Bernardo", R.drawable.bernardo, 500));
        mascotas.add(new Mascotas("Romina", "Chihuahua", R.drawable.chihuahua, 85));
        mascotas.add(new Mascotas("Willy", "Golden Retriever", R.drawable.golden, 252));
        mascotas.add(new Mascotas("Astro", "Maltes", R.drawable.maltes, 280));
        mascotas.add(new Mascotas("Max", "Pastor Alemán", R.drawable.pastoraleman, 236));
        mascotas.add(new Mascotas("Rizos", "Pomeriana", R.drawable.pomeriano, 210));
    }


    public void inicializarAdaptador () {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void siguiente (){

        /*Button button1  = (Button) findViewById(R.id.btnSiguiente);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent   = new Intent(MainActivity.this, VisitadasMascotas.class);
                startActivity(intent);
            }

        });*/
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.btnSiguiente);
        miFab.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent   = new Intent(MainActivity.this, VisitadasMascotas.class);
                startActivity(intent);
                //Snackbar.make(v, "HOLAA: " , Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
