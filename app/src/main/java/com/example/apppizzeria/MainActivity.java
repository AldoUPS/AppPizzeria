package com.example.apppizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }

    public void onClick (View v){
        Intent x = null;

        switch (v.getId()){
            case R.id.ingresar:
                x= new Intent(MainActivity.this,menuActivity.class);

                break;
            case R.id.registrar:
                x= new Intent(MainActivity.this,registroActivity.class);
                break;
        }
        startActivity(x);
    }
}
