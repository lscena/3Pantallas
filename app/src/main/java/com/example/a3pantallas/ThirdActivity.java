package com.example.a3pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void volver(View view) {
        onBackPressed(); //Forma de simular el comportamiento de cuando el usuario presiona el botón BACK del celu
    }
}
