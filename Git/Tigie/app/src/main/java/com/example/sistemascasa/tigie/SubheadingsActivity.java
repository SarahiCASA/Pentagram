package com.example.sistemascasa.tigie;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.adapter.HeadingAdapter;
import com.example.sistemascasa.tigie.adapter.SubHeadingAdapter;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_SubHeading;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.pojo.Subheadings;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentHeadingPre;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentSubheadingPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentHeadingPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentSubheadingPre;

import java.util.ArrayList;

public class SubheadingsActivity extends AppCompatActivity implements IRecyclerview_SubHeading{
    private ArrayList<Subheadings> subheadingses;
    private RecyclerView listSubheadings;
   // private IRecyclerViewFragmentHeadingPre presenter;
    private IRecyclerViewFragmentSubheadingPre presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subheadings);

        Bundle parametrosHeading   = getIntent().getExtras();
        String idHeading           = parametrosHeading.getString(getResources().getString(R.string.idTariffHeading));
        String codeHeading         = parametrosHeading.getString(getResources().getString(R.string.tariffHeadingCode));
        String descriptionHeading  = parametrosHeading.getString(getResources().getString(R.string.tariffHeadingDescription));
        //int imagen                 = parametrosHeading.getInt(getResources().getString(R.string.iconChapter));
        int idHeadingInt           = parametrosHeading.getInt("idHeading");

        TextView idTariffheading = (TextView) findViewById(R.id.idTariffheading);
        TextView tariffSubheadingCode = (TextView) findViewById(R.id.tariffSubheadingCode);
        TextView tariffSuheadingDescription = (TextView) findViewById(R.id.tariffSuheadingDescription);
        //ImageView ivIconChapSubHead = (ImageView) findViewById(R.id.ivIconChapSubHead);

        idTariffheading.setText(idHeading);
        tariffSubheadingCode.setText(codeHeading);
        tariffSuheadingDescription.setText(descriptionHeading);
        //ivIconChapSubHead.setImageResource(imagen);

        listSubheadings = (RecyclerView) findViewById(R.id.rvSubheadings);
        presenter = new RecyclerViewFragmentSubheadingPre(this,  getApplicationContext(), idHeadingInt);
        //presenter    = new RecyclerViewFragmentHeadingPre(this, getApplicationContext(), 9);

    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listSubheadings.setLayoutManager(llm);
    }

    @Override
    public SubHeadingAdapter crearAdaptador(ArrayList<Subheadings> subheadingses) {
        SubHeadingAdapter adaptader = new SubHeadingAdapter(subheadingses, this);
        return adaptader;
    }

    @Override
    public void inicializarAdaptadorRV(SubHeadingAdapter adapter) {
        listSubheadings.setAdapter(adapter);
    }
}
