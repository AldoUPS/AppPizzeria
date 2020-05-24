package com.example.apppizzeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity  {
    EditText et1, et2;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        et1 = (EditText) findViewById(R.id.correo);
        et2 = (EditText) findViewById(R.id.contrasena);

        // codigo del boton de facebook

        callbackManager = CallbackManager.Factory.create();

        LoginButton loginButton = (LoginButton) findViewById(R.id.loginF);
        // Callback
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                Intent x = new Intent(MainActivity.this,menuActivity.class);
                startActivity(x);
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });
    }

    public void ingresar (View v){
//        if(validar()) {
            Intent x = new Intent(MainActivity.this, menuActivity.class);
            startActivity(x);
//        }
    }

    public void registro (View v){
        Intent x = new Intent(MainActivity.this,reActivity.class);
        startActivity(x);
    }

    public boolean validar() {
        boolean retorno = true;

        String T1 = et1.getText().toString();
        String T2 = et2.getText().toString();

        if (T1.isEmpty()) {
            et1.setError("este campo no puede quedar vacio");
            retorno = false;
        }
        if (T2.isEmpty()) {
            et2.setError("este campo no puede estar vacio");
            retorno = false;
        }

        return retorno;
    }
}
