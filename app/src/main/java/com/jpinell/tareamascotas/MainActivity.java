package com.jpinell.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView ListaMascotas;
    /*int contador = 0;
    ImageView sumar;
    TextView contar;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        ListaMascotas = findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        /*sumar = findViewById(R.id.imgHuesoBlanco);
        contar = findViewById(R.id.tvContador);*/

       /* sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                contar.setText(contador);
            }
        });*/

    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.cusuco,"Ruper",R.mipmap.hueso,"0",R.mipmap.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.gallo, "Claudio",R.mipmap.hueso,"0",R.mipmap.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.gato, "Misha",R.mipmap.hueso,"0",R.mipmap.hueso_amarillo));
        mascotas.add(new Mascota(R.drawable.leon, "Rey",R.mipmap.hueso,"0",R.mipmap.hueso_amarillo));
    }

    //Metodo para mostrar los botones de accion
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuacciones, menu);
        return true;
    }

    //Metodo para agregar las acciones de nuestros botones
    /*public boolean onOptionsItemSelected(MenuItem item){
     int id = item.getItemId();

        if(id == R.id.siguiente){
            irSiguiente(getActionView());
        }

    }*/

    /*public void irSiguiente(View v){

    }*/

    public void irSiguiente(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.siguiente){
            Intent intent = new Intent(this, Siguiente.class);
            startActivity(intent);
        }


    }


    /*public void onClick(View view) {
        contador++;
        contar.setText(contador);
    }*/
}