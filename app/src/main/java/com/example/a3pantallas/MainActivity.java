package com.example.a3pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Variable estatica, constante:
    final static String TAG_MAIN="MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Log:
        Log.v(TAG_MAIN,"Corrió OnCreate");
    }

    @Override
    protected void onStart() {
        //llama al onStart original:
        super.onStart();

        //log:
        Log.v(TAG_MAIN,"Corrió onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        //log:
        Log.v(TAG_MAIN,"Corrió onDestroy");
    }

    //Funcion para ir a la segunda Activitie
    public void goSecondActivity(View view) {
        //Intención de ir al SecondActivity:
        Intent fromMainToSecondIntent = new Intent(MainActivity.this,SecondActivity.class); //indico en dónde estoy y a dónde quiero ir

        //Inicio el intent
        startActivity(fromMainToSecondIntent);
    }
}
