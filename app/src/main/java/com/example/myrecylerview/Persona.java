package com.example.myrecylerview;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    String edad;
    int foto;

    public Persona(String nombre, String edad, int foto) {
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
    }

    private List<Persona> personas;

    private void inicializardatos()
    {
        personas = new ArrayList<>();
        personas.add(new Persona("leonela","25 años de edad" , R.drawable.foto2));
        personas.add(new Persona("juan","15 años de edad" , R.drawable.fot));
        personas.add(new Persona("pedro","20 años de edad" , R.drawable.imagen));
    }

}
