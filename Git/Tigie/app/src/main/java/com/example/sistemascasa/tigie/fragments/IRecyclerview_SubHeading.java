package com.example.sistemascasa.tigie.fragments;

import com.example.sistemascasa.tigie.adapter.HeadingAdapter;
import com.example.sistemascasa.tigie.adapter.SubHeadingAdapter;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.pojo.Subheadings;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 20/07/16.
 */
public interface IRecyclerview_SubHeading {
    public void generarLinearLayoutVertical();

    public SubHeadingAdapter crearAdaptador(ArrayList<Subheadings> subheadingses);

    public void inicializarAdaptadorRV (SubHeadingAdapter adapter); //Recibiendo Adaptador


}



