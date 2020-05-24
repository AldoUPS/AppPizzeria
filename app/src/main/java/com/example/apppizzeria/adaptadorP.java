package com.example.apppizzeria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apppizzeria.modelos.Platillo;

import java.util.List;


public class adaptadorP extends RecyclerView.Adapter<adaptadorP.PlatilloViewHolder> implements View.OnClickListener {

    List<Platillo> listaPlatillos;
    View.OnClickListener Listener;

    public adaptadorP(List<Platillo> listaPlatillos) {
        this.listaPlatillos = listaPlatillos;
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

        holder.imagenP.setImageResource(R.mipmap.pizza);
        holder.titulo.setText(listaPlatillos.get(position).nombre);
        holder.precio.setText(String.valueOf(listaPlatillos.get(position).precio));

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
