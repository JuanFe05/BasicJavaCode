package uniajc.Trabajos.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    String nombreBiblioteca;
    ArrayList<Libro> coleccionLibros;

    //Constructor
    public Biblioteca() {
    }

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.coleccionLibros = new ArrayList<Libro>();
    }

    //Mis métodos
    public void aregarLibros(Libro libro) {
        this.coleccionLibros.add(libro);
    }

    public void mostrarLibros(){
        for (int i = 0; i < coleccionLibros.size(); i++) {
            Libro libro = (Libro) coleccionLibros.get(i);
            libro.imprimirLibros();
        }
    }

}
