package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class direccionActivity extends AppCompatActivity {
    EditText et7,et8,et9,et10,et11,et12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.direccion);
        et7=(EditText)findViewById(R.id.calle);
        et8=(EditText)findViewById(R.id.colonia);
        et9=(EditText)findViewById(R.id.cp);
        et10=(EditText)findViewById(R.id.numI);
        et11=(EditText)findViewById(R.id.numE);
        et12=(EditText)findViewById(R.id.referencias);
    }

    public void aceptarD (View v){
        if(validarD()) {
            Intent y = new Intent(direccionActivity.this, menuActivity.class);
            startActivity(y);
        }
    }
    public void cancelarD (View w){
        Intent z = new Intent(direccionActivity.this,pedidoDActivity.class);
        startActivity(z);
    }

    public boolean validarD(){
        boolean retorno= true;

        String T1=et7.getText().toString();
        String T2=et8.getText().toString();
        String T3=et9.getText().toString();
        String T4=et10.getText().toString();
        String T5=et11.getText().toString();
        String T6=et12.getText().toString();

        if(T1.isEmpty()){
            et7.setError("este campo no puede estar vacio");
            retorno = false;
        }
        if(T2.isEmpty()){
            et8.setError("este campo no puede estar vacio");
            retorno = false;
        }
        if(T3.isEmpty()){
            et9.setError("este campo no puede estar vacio");
            retorno = false;
        }
        if(T4.isEmpty()){
            et10.setError("este campo no puede estar vacio");
            retorno = false;
        }
        if(T5.isEmpty()){
            et11.setError("este campo no puede estar vacio");
            retorno = false;
        }
        if(T6.isEmpty()){
            et12.setError("este campo no puede estar vacio");
            retorno = false;
        }
        return retorno;
    }
}
