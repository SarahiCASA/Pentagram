package com.example.sistemascasa.tigie;


import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.adapter.HeadingAdapter;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_Heading;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentHeadingPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentHeadingPre;


import java.util.ArrayList;

public class HeadingsActivity extends AppCompatActivity implements IRecyclerview_Heading {
    private ArrayList<Headings> headingses;
    private RecyclerView listHeadings;
    private IRecyclerViewFragmentHeadingPre presenter;

    public static HeadingsActivity instance = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headings);

        Bundle parametros   = getIntent().getExtras();
        String id           = parametros.getString(getResources().getString(R.string.idTariffChapter));
        String code         = parametros.getString(getResources().getString(R.string.tariffChapterCode));
        String description  = parametros.getString(getResources().getString(R.string.tariffChapterDescription));
        int imagen          = parametros.getInt(getResources().getString(R.string.iconChapter));
        int idChapter       = parametros.getInt("idChapter");


        TextView idTariffChapter            = (TextView) findViewById(R.id.idTariffChapter);
        TextView tariffChapterCode          = (TextView) findViewById(R.id.tariffChapterCode);
        TextView tariffChapterDescription   = (TextView) findViewById(R.id.tariffChapterDescription);
        ImageView iconChapter               = (ImageView) findViewById(R.id.ivIconChap);

        idTariffChapter.setText(id);
        tariffChapterCode.setText(code);
        tariffChapterDescription.setText(description);
        iconChapter.setImageResource(imagen);

        listHeadings = (RecyclerView) findViewById(R.id.rvHeadings);
        presenter    = new RecyclerViewFragmentHeadingPre(this,  getApplicationContext(), idChapter);

    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listHeadings.setLayoutManager(llm);
    }

    @Override
    public HeadingAdapter crearAdaptador(ArrayList<Headings> headingses) {
        HeadingAdapter adaptader = new HeadingAdapter(headingses, this);
        return adaptader;
    }

    @Override
    public void inicializarAdaptadorRV(HeadingAdapter adapter) {
        listHeadings.setAdapter(adapter);
    }

    @Override
    public void onResume()
    {
        super.onResume();
        instance = this;
    }

    @Override
    public void onPause()
    {
        super.onPause();
        instance = null;
    }

    @Override
    public void onStop() {
        super.onStop();
        instance = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        instance = null;
    }
}
