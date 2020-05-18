package com.example.apppizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    public void onClick(View v) {
        Intent Psiguiente=null;
        switch (v.getId()){
            case R.id.ingresar:
                Psiguiente = new Intent(MainActivity.this,menuActivity.class);
                break;

            case R.id.registrarse:
                Psiguiente= new Intent(MainActivity.this,registroActivity.class);
                break;
        }
    }
}
