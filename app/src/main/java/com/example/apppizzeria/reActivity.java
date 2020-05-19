package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class reActivity extends AppCompatActivity {
    EditText et3,et4,et5,et6;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.registro);
        et3 = (EditText)findViewById(R.id.nombre);
        et4 = (EditText)findViewById(R.id.apellidos);
        et5 = (EditText)findViewById(R.id.contrasena2);
        et6 = (EditText)findViewById(R.id.correo2);
    }

    public void registrar(View v){
        if(validacion()){
            Intent x = new Intent(reActivity.this,TipoEnvioActivity.class);
            startActivity(x);
        }
    }

    public void cancelar(View v){
        Intent y = new Intent(reActivity.this,MainActivity.class);
        startActivity(y);
    }

    public boolean validacion(){
        boolean retorno = true;

        String T1 = et3.getText().toString();
        String T2 = et4.getText().toString();
        String T3 = et5.getText().toString();
        String T4 = et6.getText().toString();

        if(T1.isEmpty()){
            et3.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if(T2.isEmpty()){
            et4.setError("este campo no puede quedar vacio");

            retorno = false;
        }
        if(T3.isEmpty()){
            et5.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if(T4.isEmpty()) {
            et6.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        return retorno;
    }
}
