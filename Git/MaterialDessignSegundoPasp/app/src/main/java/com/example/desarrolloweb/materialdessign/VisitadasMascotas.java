package com.example.desarrolloweb.materialdessign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 25/06/16.
 */
public class VisitadasMascotas extends AppCompatActivity {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_visitadas);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas("Alex", "San Bernardo", R.drawable.bernardo, 2));
        mascotas.add(new Mascotas("Max", "Pastor Alemán", R.drawable.pastoraleman, 2));
        mascotas.add(new Mascotas("Willy", "Golden Retriever", R.drawable.golden, 2));
        mascotas.add(new Mascotas("Astro", "Maltes", R.drawable.maltes, 2));
        mascotas.add(new Mascotas("Rizos", "Pomeriana", R.drawable.pomeriano, 2));

    }


    public void inicializarAdaptador () {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void regresar () {
        Button button1  = (Button) findViewById(R.id.btnregresar);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent   = new Intent(VisitadasMascotas.this, MainActivity.class);
                startActivity(intent);
            }

        });
    }


}
