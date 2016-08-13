package com.example.sistemascasa.tigie;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sistemascasa.tigie.adapter.ChapterAdapter;
import com.example.sistemascasa.tigie.adapter.TlcAdapter;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_tlc;
import com.example.sistemascasa.tigie.pojo.Tlc;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentChapterPre;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentTlcPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentTlcPre;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TlcFragmen extends Fragment implements IRecyclerview_tlc {
    private Context context;
    private RecyclerView listTlc;
    private IRecyclerViewFragmentTlcPre presenter;

    public TlcFragmen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tlc, container, false);
        listTlc = (RecyclerView) v.findViewById(R.id.rvTlc);
        presenter = new RecyclerViewFragmentTlcPre(this, getContext());
        return v;
    }

    @Override
    public TlcAdapter crearAdaptador(ArrayList<Tlc> tlcs) {
        TlcAdapter adapter = new TlcAdapter(tlcs, getActivity());
        return adapter;
    }

    @Override
    public void inicializarAdaptadorRV(TlcAdapter adapter) {
        listTlc.setAdapter(adapter);
    }

    @Override
    public void generarGridLayout() {
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);
        listTlc.setLayoutManager(glm);
    }
}
