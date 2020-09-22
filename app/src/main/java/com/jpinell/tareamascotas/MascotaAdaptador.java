package com.jpinell.tareamascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {

        Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewHolder.imgHuesoBlanco.setImageResource(mascota.getHuesoBlanco());
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.tvContador.setText(mascota.getContador());
        mascotaViewHolder.imgHuesoAmarillo.setImageResource(mascota.getHuesoAmarillo());

        
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private ImageView imgHuesoBlanco;
        private TextView tvNombre;
        private TextView tvContador;
        private ImageView imgHuesoAmarillo;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            imgHuesoBlanco = itemView.findViewById(R.id.imgHuesoBlanco);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvContador = itemView.findViewById(R.id.tvContador);
            imgHuesoAmarillo =itemView.findViewById(R.id.imgHuesoAmarillo);
        }
    }
}
