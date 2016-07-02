package com.example.desarrolloweb.materialdessign.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desarrolloweb.materialdessign.R;
import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;


public class fragment_recycler extends Fragment {
    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment_recycler, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
        //return super.onCreateView(inflater, container, savedInstanceState);
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

}
