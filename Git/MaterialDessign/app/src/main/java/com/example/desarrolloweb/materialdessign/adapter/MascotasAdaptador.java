package com.example.desarrolloweb.materialdessign.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.design.widget.Snackbar;

import com.example.desarrolloweb.materialdessign.VisitadasMascotas;
import com.example.desarrolloweb.materialdessign.db.ConstructorMascotas;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;
import com.example.desarrolloweb.materialdessign.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 24/06/16.
 */
public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotaViewHolder>{

    ArrayList<Mascotas> mascotas;
    Activity activity;

    public MascotasAdaptador(ArrayList<Mascotas> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Infla el layout con los elementos
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_grid_mascota, parent, false);

        return new MascotaViewHolder(v);

    }
 //Asocia cada elemento de nuestra lista con cada View
    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascotas mascota = mascotas.get(position);
        Picasso.with(activity).load(mascota.getUrlFoto())
                .placeholder(R.drawable.alaska)
                .into(mascotaViewHolder.imgfoto);
        //mascotaViewHolder.imgfoto.setImageResource(mascota.getUrlFoto());
        //mascotaViewHolder.tvnombre.setText(mascota.getNombre());
        //mascotaViewHolder.tvraza.setText(mascota.getRaza());
        mascotaViewHolder.tvLikes.setText(String.valueOf(mascota.getLikes()));

        mascotaViewHolder.imgfoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, VisitadasMascotas.class);
                intent.putExtra("url", mascota.getUrlFoto());
                intent.putExtra("like", mascota.getLikes());
                activity.startActivity(intent);
            }
        });

        /*mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Diste like a la mascota : " + mascota.getNombre(), Snackbar.LENGTH_SHORT).show();

                ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                constructorMascotas.darLike(mascota);

                mascotaViewHolder.tvLikes.setText(constructorMascotas.obtenerLikes(mascota) + " " + " Likes");
            }
        });*/

        //ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgfoto;
        //private TextView tvnombre;
        //private TextView tvraza;
        //private ImageButton btnLike;
        private TextView tvLikes;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            //tvnombre = (TextView) itemView.findViewById(R.id.nombre);
            //tvraza = (TextView) itemView.findViewById(R.id.mascotaRaza);
            //btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
            tvLikes = (TextView) itemView.findViewById(R.id.tvLikes);
        }
    }

}
