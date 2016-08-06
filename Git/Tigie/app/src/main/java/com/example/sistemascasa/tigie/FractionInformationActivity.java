package com.example.sistemascasa.tigie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.pojo.InfFRaction;
import com.example.sistemascasa.tigie.rest.InfFractionService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FractionInformationActivity extends AppCompatActivity {
    TextView fracCode;
    TextView fracDesc;
    TextView fracChapter;
    TextView fracChapterDesc;
    TextView fracHeading;
    TextView fracHeadingDesc;
    TextView fracSubHeading;
    TextView fracSubHeadingDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction_information);

        Bundle parametros               = getIntent().getExtras();
        String fractionCodigo           = parametros.getString("fractionCode");
        fractionCodigo = "87021002";
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL).setEndpoint("http://10.40.68.153:8080/").build();
        fracCode               = (TextView) findViewById(R.id.fracCode);
        fracDesc               = (TextView) findViewById(R.id.fracDesc);
        fracChapter            = (TextView) findViewById(R.id.fracChapter);
        fracChapterDesc        = (TextView) findViewById(R.id.fracChapterDesc);
        fracHeading            = (TextView) findViewById(R.id.fracHeading);
        fracHeadingDesc        = (TextView) findViewById(R.id.fracHeadingDesc);
        fracSubHeading         = (TextView) findViewById(R.id.fracSubHeading);
        fracSubHeadingDesc     = (TextView) findViewById(R.id.fracSubHeadingDesc);

        InfFractionService service = restAdapter.create(InfFractionService.class);

        service.getInformationData(fractionCodigo,new Callback<InfFRaction>() {
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

    }
}
