package com.example.sistemascasa.tigie;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sistemascasa.tigie.pojo.InfFRaction;
import com.example.sistemascasa.tigie.rest.ConstantesRestApi;
import com.example.sistemascasa.tigie.rest.InfFractionService;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class InformationFraccionFragment extends Fragment {
    TextView fracCode;
    TextView fracDesc;
    TextView fracChapter;
    TextView fracChapterDesc;
    TextView fracHeading;
    TextView fracHeadingDesc;
    TextView fracSubHeading;
    TextView fracSubHeadingDesc;

    public InformationFraccionFragment( ) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_information_fraccion, container, false);

        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint("http://10.40.68.153:8080/").build();
        fracCode               = (TextView)  v.findViewById(R.id.fracCode);
        fracDesc               = (TextView)  v.findViewById(R.id.fracDesc);
        fracChapter            = (TextView)  v.findViewById(R.id.fracChapter);
        fracChapterDesc        = (TextView)  v.findViewById(R.id.fracChapterDesc);
        fracHeading            = (TextView)  v.findViewById(R.id.fracHeading);
        fracHeadingDesc        = (TextView)  v.findViewById(R.id.fracHeadingDesc);
        fracSubHeading         = (TextView)  v.findViewById(R.id.fracSubHeading);
        fracSubHeadingDesc     = (TextView)  v.findViewById(R.id.fracSubHeadingDesc);

        InfFractionService service = restAdapter.create(InfFractionService.class);
        //Bundle parametros               = getIntent().getExtras();
        // String fractionCodigo           = parametros.getString("fractionCode");
        service.getInformationData("87021002",new Callback<InfFRaction>() {
            @Override
            public void success(InfFRaction infFRaction, Response response) {

                fracChapter.setText(infFRaction.getTariffChapterCode());
                fracChapterDesc.setText(infFRaction.getTariffChapterDescription());
                fracHeading.setText(infFRaction.getTariffHeadingCode());
                fracHeadingDesc.setText(infFRaction.getTariffHeadingDescription());
                fracSubHeading.setText(infFRaction.getTariffSubheadingCode());
                fracSubHeadingDesc.setText(infFRaction.getTariffSubheadingDescription());
                fracCode.setText(infFRaction.getTariffFractionCode());
                fracDesc.setText(infFRaction.getTariffFractionDescription());
            }

            @Override
            public void failure(RetrofitError error) {
                System.out.println("Hola 2");
            }
        });

        return v;
    }

}
