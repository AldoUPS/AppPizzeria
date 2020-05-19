package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TipoEnvioActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tipo_envio);
    }

    public void PedidoD(View v){
        Intent z = new Intent(TipoEnvioActivity.this,pedidoDActivity.class);
        startActivity(z);
    }

    /*public void PedidoS(View v){
        Intent y = new Intent(TipoEnvioActivity.this,);
    }
     */
}
