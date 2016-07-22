package com.example.sistemascasa.tigie.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sistemascasa.tigie.HeadingsActivity;
import com.example.sistemascasa.tigie.R;
import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.pojo.Headings;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 12/07/16.
 * Pasa los elementos de la lista
 */
public class ChapterAdapter extends RecyclerView.Adapter<ChapterAdapter.ChapterViewHolder> {

    ArrayList<Chapters> chapters;
    Activity activity;

    public ChapterAdapter(ArrayList<Chapters> chapters, Activity activity) {
        this.chapters = chapters;
        this.activity = activity;
    }

    @Override
    //Infla el layout y da vida al cardview
    public ChapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_chapters, parent, false); //Cual sera el layout que estara reciclando la lista
        return new ChapterViewHolder(v);
    }

    @Override
    //Vamos a pasar nuestra lista de capitulos a cada uno de los objetos de la lista Capitulos
    public void onBindViewHolder(ChapterViewHolder chapterViewHolder, int position) {
        final Chapters chapter = chapters.get(position);

        chapterViewHolder.tvId.setText(String.valueOf(chapter.getId()));
        chapterViewHolder.tvCode.setText(chapter.getCodigo());
        chapterViewHolder.tvDescripcion.setText(chapter.getDescripcion());
        chapterViewHolder.imgIcon.setImageResource(chapter.getIcono());

        chapterViewHolder.imgIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(activity, HeadingsActivity.class);
                intent.putExtra("iconChapter", chapter.getIcono());
                intent.putExtra("idTariffChapter", String.valueOf(chapter.getId()));
                intent.putExtra("tariffChapterCode", chapter.getCodigo());
                intent.putExtra("tariffChapterDescription", chapter.getDescripcion());
                intent.putExtra("idChapter", chapter.getId());
                activity.startActivity(intent);

            }
        });

        chapterViewHolder.tvDescripcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(activity, HeadingsActivity.class);
                intent.putExtra("iconChapter", chapter.getIcono());
                intent.putExtra("idTariffChapter", String.valueOf(chapter.getId()));
                intent.putExtra("tariffChapterCode", chapter.getCodigo());
                intent.putExtra("tariffChapterDescription", chapter.getDescripcion());
                intent.putExtra("idChapter", chapter.getId());
                activity.startActivity(intent);

            }
        });
    }

    @Override
    //Cantidad de elementos que contiene mi lista de capitulos
    public int getItemCount() {
        return chapters.size();
    }

    /** Declara viesws
    * Metodo Constructor
     ***/
    public static class ChapterViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgIcon;
        private TextView  tvId;
        private TextView  tvCode;
        private TextView  tvDescripcion;

        public ChapterViewHolder(View itemView) {
            super(itemView);
            imgIcon         = (ImageView) itemView.findViewById(R.id.ivIcon);
            tvId            = (TextView)  itemView.findViewById(R.id.tvId);
            tvCode          = (TextView)  itemView.findViewById(R.id.tvChapter);
            tvDescripcion   = (TextView)  itemView.findViewById(R.id.tvChapterDesc);
        }
    }

}
