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
import com.example.desarrolloweb.materialdessign.presentador.IRecyclerViewFragmentPresenter;
import com.example.desarrolloweb.materialdessign.presentador.RecyclerViewFragmentPresenterMV;
import com.example.desarrolloweb.materialdessign.presentador.RecylerViewFragmentePresenter;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment implements IRecyclerViewFragmentView{

    ArrayList<Mascotas> mascotas;
    private RecyclerView listaMascotas;
    private IRecyclerViewFragmentPresenter presenter;

    public PerfilFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenterMV(this, getContext());

        /*CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.ciview);
        //circularImageView.setBorderColor(getResources().getColor(R.color.GrayLight));
        circularImageView.setBorderWidth(10);
        circularImageView.addShadow();
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);*/
        return v;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }


    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenterMV(this, getContext());
        CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.ciview);
        circularImageView.setBorderWidth(10);
        circularImageView.addShadow();
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.RED);


        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);*/
        //inicializarListaMascotas();
        //inicializarAdaptador();

      //  return v;
    //}



    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotasAdaptador crearAdaptador(ArrayList<Mascotas> mascotas) {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotasAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }

    @Override
    public void generarGridLayout() {
        GridLayoutManager glm=new GridLayoutManager(getActivity(),2);
        listaMascotas.setLayoutManager(glm);
    }


    /*public void inicializarListaMascotas () {
        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.ben01, 170));
        mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.benito0005, 202));
        mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.ben05, 85));
        mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.benito0, 252));
        mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.buldog1, 105));
        //mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.bul1, 500));
        //mascotas.add(new Mascotas( "Benito", "Buldog Frances", R.drawable.benito3, 280));
        //mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito04, 236));
        //mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito03, 210));
        //mascotas.add(new Mascotas("Benito", "Buldog Frances", R.drawable.benito03, 210));
    }*/


    /*public void inicializarAdaptador () {
        MascotasAdaptador adaptador = new MascotasAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }*/
}
