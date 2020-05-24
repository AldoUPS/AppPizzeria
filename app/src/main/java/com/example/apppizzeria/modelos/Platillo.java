package com.example.apppizzeria.modelos;

public class Platillo {
    public int id;
    public String nombre;
    public double precio;
    public String imagen;
    public String categoria_id;
    public String created_at;
    public String updated_at;

    public String getData()
    {
        return  "\nnombre : " + nombre +
                "\nprecio: " + precio +
                "\nimagen: " + imagen +
                "\ncategoria_id: " + categoria_id +
                "\ncreated_at: " + created_at +
                "\nupdated_at: " + updated_at + "\n";
    }
}
