package com.example.apppizzeria.servicios;

import com.example.apppizzeria.modelos.Platillo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PlatilloService
{
     String URL_LISTAR = "platillos";
     String URL_MOSTRAR = "/platillos/{id}";
     String URL_BUSCAR = "/platillos/{platillo}";

     @GET(URL_LISTAR)
     Call<List<Platillo>> listar();
}
