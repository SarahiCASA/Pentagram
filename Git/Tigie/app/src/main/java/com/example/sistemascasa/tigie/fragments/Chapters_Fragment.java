package com.example.sistemascasa.tigie.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sistemascasa.tigie.R;
import com.example.sistemascasa.tigie.adapter.ChapterAdapter;
import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentChapterPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentChapterPre;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Chapters_Fragment extends Fragment implements IRecyclerview_Fragment {
    private Context context;
    private RecyclerView listChapters;
    private IRecyclerViewFragmentChapterPre presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chapters, container, false);

        listChapters = (RecyclerView) v.findViewById(R.id.rvChapters);
        presenter = new RecyclerViewFragmentChapterPre(this, getContext());
        return v;
    }

    @Override
    /*
    ** Se comporte como un Layout
    ** Seteamos la lista en un formato de lista vertical
     */
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listChapters.setLayoutManager(llm);

    }

    @Override
    public ChapterAdapter crearAdaptador(ArrayList<Chapters> chapters) {
        ChapterAdapter adapter = new ChapterAdapter(chapters, getActivity());
        return adapter;
    }

    @Override
    public void inicializarAdaptadorRV(ChapterAdapter adapter) {
        listChapters.setAdapter(adapter);

    }

    @Override
    public void generarGridLayout() {
        GridLayoutManager glm=new GridLayoutManager(getActivity(),2);
        listChapters.setLayoutManager(glm);
    }
}
