package com.example.desarrolloweb.materialdessign.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.design.widget.Snackbar;

import com.example.desarrolloweb.materialdessign.pojo.Mascotas;
import com.example.desarrolloweb.materialdessign.R;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 24/06/16.
 */
public class MascotasAdaptador extends RecyclerView.Adapter<MascotasAdaptador.MascotaViewHolder>{

    public MascotasAdaptador(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    ArrayList<Mascotas> mascotas;

    //Infla el layout con los elementos
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false);
        return new MascotaViewHolder(v);
    }
 //Asocia cada elemento de nuestra lista con cada View
    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int position) {
        final Mascotas mascota = mascotas.get(position);
        mascotaViewHolder.imgfoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvnombre.setText(mascota.getNombre());
        mascotaViewHolder.tvraza.setText(mascota.getRaza());
        //mascotaViewHolder.raiting.setText(mascota.getRaiting());

        mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Diste like a la mascota : " + mascota.getNombre(), Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgfoto;
        private TextView tvnombre;
        private TextView tvraza;
        private ImageButton btnLike;
        private TextView raiting;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgfoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvnombre = (TextView) itemView.findViewById(R.id.nombre);
            tvraza = (TextView) itemView.findViewById(R.id.mascotaRaza);
            btnLike = (ImageButton) itemView.findViewById(R.id.btnLike);
            raiting = (TextView) itemView.findViewById(R.id.raiting);
        }
    }

}
