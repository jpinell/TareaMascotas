package com.jpinell.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Siguiente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}