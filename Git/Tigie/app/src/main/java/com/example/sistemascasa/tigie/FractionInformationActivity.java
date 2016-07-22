package com.example.sistemascasa.tigie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.pojo.Chapters;

public class FractionInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction_information);

        Bundle parametros               = getIntent().getExtras();
        String fractionCode             = parametros.getString("fractionCode");
        String fractionDescrip          = parametros.getString("fractionDescrip");
        String chapterCode              = parametros.getString("chapterCode");
        String chapterDescrip           = parametros.getString("chapterDescrip");
        String headingCode              = parametros.getString("headingCode");
        String headingDescrip           = parametros.getString("headingDescrip");
        String subheadingCode           = parametros.getString("subheadingCode");
        String subheadingDescrip        = parametros.getString("subheadingDescrip");

        TextView fracCode               = (TextView) findViewById(R.id.fracCode);
        TextView fracDesc               = (TextView) findViewById(R.id.fracDesc);
        TextView fracChapter            = (TextView) findViewById(R.id.fracChapter);
        TextView fracChapterDesc        = (TextView) findViewById(R.id.fracChapterDesc);
        TextView fracHeading            = (TextView) findViewById(R.id.fracHeading);
        TextView fracHeadingDesc        = (TextView) findViewById(R.id.fracHeadingDesc);
        TextView fracSubHeading         = (TextView) findViewById(R.id.fracSubHeading);
        TextView fracSubHeadingDesc     = (TextView) findViewById(R.id.fracSubHeadingDesc);

        fracCode.setText(fractionCode);
        fracDesc.setText(fractionDescrip);
        fracChapter.setText(chapterCode);
        fracChapterDesc.setText(chapterDescrip);
        fracHeading.setText(headingCode);
        fracHeadingDesc.setText(headingDescrip);
        fracSubHeading.setText(subheadingCode);
        fracSubHeadingDesc.setText(subheadingDescrip);




    }
}
