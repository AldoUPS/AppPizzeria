package com.example.apppizzeria.servicios;

import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.apppizzeria.modelos.Platillo;

import java.util.List;

public class ServicioPlatillo implements Servicio {

    private Platillo platillo;
    private List<Platillo> listaPlatillo;

    private static final String URL_LISTAR = "https://angelotti.herokuapp.com/api/platillos";
    private static final String URL_MOSTRAR = "https://angelotti.herokuapp.com/api/platillos/{id}";
    private static final String URL_BUSCAR = "https://angelotti.herokuapp.com/api/platillos/{platillo}";

    public ServicioPlatillo() {
        platillo = new Platillo();
    }


    public Platillo obtenerPorId(int id) {
        final String url = URL_MOSTRAR;
        Log.d("GET: ", url);

        AndroidNetworking.get(url)
                .setPriority(Priority.LOW)
                .build()
                .getAsObject(Platillo.class, new ParsedRequestListener<Platillo>() {
                            @Override
                            public void onResponse(Platillo response) {
                                Log.d("RESPONSE: ", response.toString());
                                platillo = response;
                            }

                            @Override
                            public void onError(ANError anError) {
                                Log.e("FAILED REQUEST", url);
                                platillo = null;
                            }
                        }
                );

        return platillo;
    }

    public List<Platillo> buscar(String nombre) {
        final String url = URL_BUSCAR;
        Log.d("GET: ", url);

        AndroidNetworking.get(URL_BUSCAR)
                .addPathParameter("nombre", nombre)
                .setPriority(Priority.LOW)
                .build()
                .getAsObjectList(Platillo.class, new ParsedRequestListener<List<Platillo>>() {
                    @Override
                    public void onResponse(List<Platillo> response) {
                        Log.d("RESPONSE: ", response.toString());
                        listaPlatillo = response;
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.e("FAILED REQUEST", url);
                        listaPlatillo = null;
                    }
                });
        return listaPlatillo;
    }

    public List<Platillo> listar() {

        final String url = URL_LISTAR;
        Log.d("GET: ", url);

        AndroidNetworking.get(URL_LISTAR)
                .setPriority(Priority.LOW)
                .build()
                .getAsObjectList(Platillo.class, new ParsedRequestListener<List<Platillo>>() {
                    @Override
                    public void onResponse(List<Platillo> response) {
                        Log.d("RESPONSE: ", response.toString());
                        listaPlatillo = response;
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.e("FAILED REQUEST", url);
                        listaPlatillo = null;
                    }
                });

        return listaPlatillo;
    }

}
