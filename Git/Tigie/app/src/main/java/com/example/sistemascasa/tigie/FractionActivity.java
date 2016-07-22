package com.example.sistemascasa.tigie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.adapter.FractionAdapter;
import com.example.sistemascasa.tigie.adapter.HeadingAdapter;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_Fractions;
import com.example.sistemascasa.tigie.pojo.Fractions;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentFractionPre;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentHeadingPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentFractionPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentHeadingPre;

import java.util.ArrayList;

public class FractionActivity extends AppCompatActivity implements IRecyclerview_Fractions{

    private RecyclerView listFractions;
    public static FractionActivity instance = null;
    private IRecyclerViewFragmentFractionPre presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction);

        Bundle parametros               = getIntent().getExtras();
        String idSubheading             = parametros.getString(getResources().getString(R.string.idTariffSubheading));
        String codeSubheading           = parametros.getString(getResources().getString(R.string.tariffSubheadingCode));
        String descriptionSubheading    = parametros.getString(getResources().getString(R.string.tariffSubheadingDescription));
        int imagen                      = parametros.getInt(getResources().getString(R.string.iconChapter));
        int idSubheadingInt             = parametros.getInt("idSubheading");

        TextView idTariffSubheading = (TextView) findViewById(R.id.idTariffSubheading);
        TextView tariffSubheadingCode = (TextView) findViewById(R.id.tariffSubheadingCode);
        TextView tariffSubheadingDescription = (TextView) findViewById(R.id.tariffSubheadingDescription);
        //ImageView ivIconChapSubHead = (ImageView) findViewById(R.id.ivIconChapSubHead);

        idTariffSubheading.setText(idSubheading);
        tariffSubheadingCode.setText(codeSubheading);
        tariffSubheadingDescription.setText(descriptionSubheading);

        listFractions = (RecyclerView) findViewById(R.id.rvFractions);
        presenter    = new RecyclerViewFragmentFractionPre(this,  getApplicationContext(), idSubheadingInt);

    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listFractions.setLayoutManager(llm);
    }

    @Override
    public FractionAdapter crearAdaptador(ArrayList<Fractions> fractionses) {
        FractionAdapter adaptader = new FractionAdapter(fractionses, this);
        return adaptader;
    }

    @Override
    public void inicializarAdaptadorRV(FractionAdapter adapter) {
        listFractions.setAdapter(adapter);
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
