package com.example.apppizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        et1 = (EditText) findViewById(R.id.correo);
        et2 = (EditText) findViewById(R.id.contrasena);
    }

    public void ingresar (View v){
        if(validar()) {
            Intent x = new Intent(MainActivity.this, menuActivity.class);
            startActivity(x);
        }
    }

    public void registro (View v){
        Intent x = new Intent(MainActivity.this,reActivity.class);
        startActivity(x);
    }

    public boolean validar(){
        boolean retorno = true;

        String T1 = et1.getText().toString();
        String T2 = et2.getText().toString();

        if(T1.isEmpty()){
            et1.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if(T2.isEmpty()){
            et2.setError("este campo no puede estar vacio");
            retorno = false;
        }
        
        return retorno;
    }
}
