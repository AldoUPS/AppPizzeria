package com.example.apppizzeria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public class adaptadorP extends RecyclerView.Adapter<adaptadorP.PizzasViewHolder> implements View.OnClickListener {
    List<Pizzas> listaPizza;
    View.OnClickListener Listener;

    public adaptadorP(List<Pizzas> listaPizza) {
        this.listaPizza = listaPizza;
    }

    @NonNull
    @Override
    public adaptadorP.PizzasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vistap, parent,false);
        PizzasViewHolder pizza = new PizzasViewHolder(v);
        v.setOnClickListener(this);
        return pizza;
    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorP.PizzasViewHolder holder, int position) {
        holder.imagenP.setImageResource(listaPizza.get(position).getImagen());
        holder.titulo.setText(listaPizza.get(position).getTitulo());
        holder.descripcion.setText(listaPizza.get(position).getDescripcion());

    }

    @Override
    public int getItemCount() {
        return listaPizza.size();
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

    public class PizzasViewHolder extends RecyclerView.ViewHolder{

        ImageView imagenP;
        TextView descripcion, titulo;

        public PizzasViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenP = (ImageView)itemView.findViewById(R.id.imagen);
            titulo = (TextView)itemView.findViewById(R.id.tipo_pizza);
            descripcion = (TextView)itemView.findViewById(R.id.descripcion);
        }
    }
}
