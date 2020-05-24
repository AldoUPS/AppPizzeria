package com.example.apppizzeria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.apppizzeria.modelos.Platillo;

import java.util.List;


public class adaptadorP extends RecyclerView.Adapter<adaptadorP.PlatilloViewHolder> implements View.OnClickListener {

    List<Platillo> listaPlatillos;
    View.OnClickListener Listener;
    Context context;

    public adaptadorP(Context context, List<Platillo> listaPlatillos) {
        this.listaPlatillos = listaPlatillos;
        this.context = context;
    }

    @NonNull
    @Override
    public adaptadorP.PlatilloViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vistap, parent,false);
        PlatilloViewHolder pizza = new PlatilloViewHolder(v);
        v.setOnClickListener(this);
        return pizza;
    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorP.PlatilloViewHolder holder, int position) {

        Platillo platisho = listaPlatillos.get(position);

        holder.imagenP.setImageResource(R.mipmap.pizza);
        holder.titulo.setText(platisho.nombre);
        holder.precio.setText(String.valueOf(platisho.precio));
        Glide.with(context).load(platisho.imagen).into(holder.imagenP);
    }

    @Override
    public int getItemCount() {
        return listaPlatillos.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.Listener=listener;
    }

    @Override
    public void onClick(View v) {
        if(Listener!=null){
            Listener.onClick(v);
        }
    }

    public class PlatilloViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenP;
        TextView precio, titulo;

        public PlatilloViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenP = itemView.findViewById(R.id.imagen);
            titulo = itemView.findViewById(R.id.tipo_pizza);
            precio = itemView.findViewById(R.id.descripcion);
        }
    }
}
