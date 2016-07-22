package com.example.desarrolloweb.materialdessign.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.desarrolloweb.materialdessign.R;
import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.ciview);
        //circularImageView.setBorderColor(getResources().getColor(R.color.GrayLight));
        circularImageView.setBorderWidth(10);
        circularImageView.addShadow();
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);


        GridLayoutManager glm=new GridLayoutManager(getActivity(),2);
        listaMascotas.setLayoutManager(glm);

        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);*/
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }


    public void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.ben01, 170));
        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito0005, 202));
        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.ben05, 85));
        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito0, 252));
        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.buldog1, 105));
        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.bul1, 500));
        mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito3, 280));
        //mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito04, 236));
        //mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito03, 210));
        //mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito03, 210));
    }


    public void inicializarAdaptador () {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }
}
