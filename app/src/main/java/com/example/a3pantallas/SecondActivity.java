package com.example.a3pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void goThirdActivity(View view) {
        //Intención de ir al SecondActivity:
        Intent fromSecondToThirdIntent = new Intent(SecondActivity.this,ThirdActivity.class); //indico en dónde estoy y a dónde quiero ir

        //Inicio el intent
        startActivity(fromSecondToThirdIntent);

        //Finalizo la Second Activity, para quitarla de la pila
        //NOTA: Hay casos puntuales en que quiero quitarlas de la pila, para q si el usuario presiona BACK no vuelva ahí
        finish();
    }
}
