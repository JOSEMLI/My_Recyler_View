package com.example.myrecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Persona> personas;
    private void inicializardatos()
    {
        personas = new ArrayList<>();
        personas.add(new Persona("leonela","25 años de edad" , R.drawable.foto2));
        personas.add(new Persona("juan","15 años de edad" , R.drawable.fot));
        personas.add(new Persona("pedro","20 años de edad" , R.drawable.imagen));
        personas.add(new Persona("Mario Fernandez","19 años de edad" , R.drawable.foto2));
        personas.add(new Persona("Juan Pipa","20 años de edad" , R.drawable.fot));
        personas.add(new Persona("Brisa Maria","22 años de edad" , R.drawable.imagen));
        personas.add(new Persona("Yosselin Padilla","25 años de edad" , R.drawable.foto2));
        personas.add(new Persona("Leidy Illana ","14 años de edad" , R.drawable.fot));
        personas.add(new Persona("Thexhan Mamani","12 años de edad" , R.drawable.imagen));

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv);
        //para que concuerde el tamano de la pantalla inicial
        recyclerView.setHasFixedSize(true);

        //si queremoa grillas la opcion es gridlayoutmanger
        LinearLayoutManager linearLayout = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(linearLayout);

        inicializardatos();
        RVAdapter rvAdapter = new RVAdapter(personas, getApplicationContext());
        recyclerView.setAdapter(rvAdapter);

    }

}