package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    /*public void onClick (View v){
        Intent x=null;

        switch (v.getId()){
            case R.id.pedidosD:
                x= new Intent(menuActivity.this,);
                break;
            case R.id.recogerO:
                x = new Intent(menuActivity.this);
                break;
            case R.id.carrito:
                x = new Intent(menuActivity.this,);
                break;
        }
        startActivity(x);
    }*/
}
