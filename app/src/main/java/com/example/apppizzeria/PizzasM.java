package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apppizzeria.modelos.Platillo;
import com.example.apppizzeria.servicios.PlatilloService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PizzasM extends AppCompatActivity {

    RecyclerView rv;
    adaptadorP adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizzas);

        rv = findViewById(R.id.RvP);

        LinearLayoutManager esp = new LinearLayoutManager(this);
        rv.setLayoutManager(esp);

        listar();
    }

    private void listar(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://angelotti.herokuapp.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PlatilloService platilloService = retrofit.create(PlatilloService.class);

        Call< List<Platillo> > call = platilloService.listar();

        call.enqueue(new Callback<List<Platillo>>() {
            @Override
            public void onResponse(Call<List<Platillo>> call, Response<List<Platillo>> response) {
                adaptador = new adaptadorP(response.body());

                rv.setAdapter(adaptador);

                adaptador.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent x = new Intent(PizzasM.this,CantidadP.class);
                        startActivity(x);
                    }
                });
            }

            @Override
            public void onFailure(Call<List<Platillo>> call, Throwable t) {

            }
        });
    }

}
