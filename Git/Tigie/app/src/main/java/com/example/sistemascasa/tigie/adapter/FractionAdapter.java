package com.example.sistemascasa.tigie.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.FractionInformationActivity;
import com.example.sistemascasa.tigie.HeadingsActivity;
import com.example.sistemascasa.tigie.R;
import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.pojo.Fractions;
import com.example.sistemascasa.tigie.pojo.Headings;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 20/07/16.
 */
public class FractionAdapter extends RecyclerView.Adapter<FractionAdapter.FractionViewHolder>{

    ArrayList<Fractions> fractions;
    Activity activity;

    public FractionAdapter(ArrayList<Fractions> fractions, Activity activity) {
        this.fractions = fractions;
        this.activity = activity;
    }

    @Override
    public FractionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_fractions, parent, false);
        return new FractionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FractionViewHolder fractionViewHolder, int position) {
        final Fractions fraction = fractions.get(position);

        //System.out.println();

        fractionViewHolder.idTariffFraction.setText(String.valueOf(fraction.getIdTariffFraction()));
        fractionViewHolder.idTariffSubheadingFrac.setText(String.valueOf(fraction.getIdTariffSubheading()));
        fractionViewHolder.tariffFractionCode.setText(fraction.getTariffFractionCode());
        fractionViewHolder.tariffFractionDescription.setText(fraction.getTariffFractionDescription());
        fractionViewHolder.tariffFractionIcon.setImageResource(fraction.getTariffFractionIcon());
        //System.out.println(chapters.getCodigo());
        fractionViewHolder.tariffFractionIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent intent = new Intent(activity, FractionInformationActivity.class);
                intent.putExtra("chapterCode", fraction.getTariffChapterCode());
                intent.putExtra("chapterDescrip", fraction.getTariffChapterDescription());
                intent.putExtra("headingCode", fraction.getTariffHeadingCode());
                intent.putExtra("headingDescrip", fraction.getTariffHeadingDescription());
                intent.putExtra("subheadingCode", fraction.getTariffSubheadingCode());
                intent.putExtra("subheadingDescrip", fraction.getTariffSubheadingDescription());
                intent.putExtra("fractionDescrip", fraction.getTariffFractionDescription());
                intent.putExtra("fractionCode", fraction.getTariffFractionCode());
                activity.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return fractions.size();
    }


    public static class FractionViewHolder extends RecyclerView.ViewHolder {

        private ImageView tariffFractionIcon;
        private TextView idTariffFraction;
        private TextView idTariffSubheadingFrac;
        private TextView tariffFractionCode;
        private TextView tariffFractionDescription;

        public FractionViewHolder(View itemView) {

            super(itemView);

            idTariffFraction                = (TextView)  itemView.findViewById(R.id.idTariffFraction);
            idTariffSubheadingFrac          = (TextView)  itemView.findViewById(R.id.idTariffSubheadingFrac);
            tariffFractionCode              = (TextView)  itemView.findViewById(R.id.tvtariffFractionCode);
            tariffFractionDescription       = (TextView)  itemView.findViewById(R.id.tariffFractionDescription);
            tariffFractionIcon              = (ImageView) itemView.findViewById(R.id.tariffFractionIcon);
        }
    }
}
