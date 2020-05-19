package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pedidoDActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedido_domicilio);
    }

    public void ingresarD (View v){
        Intent z = new Intent(pedidoDActivity.this,direccionActivity.class);
        startActivity(z);
    }
}
