package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class PizzasM extends AppCompatActivity {

    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzas);
        rv = (RecyclerView)findViewById(R.id.RvP);
        LinearLayoutManager esp = new LinearLayoutManager(this);
        rv.setLayoutManager(esp);

        final List <Pizzas> listaPizzas;

        //por si no se llena de forma automatica xD****

        listaPizzas = Arrays.asList(new Pizzas(R.mipmap.pizza, "Pizza de Pepperoni","Pepperoni con Queso Mozzarella"));

        adaptadorP adptador = new adaptadorP(listaPizzas);
        rv.setAdapter(adptador);

        adptador.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent x = new Intent(PizzasM.this,CantidadP.class);
                startActivity(x);
            }
        });
    }

}
