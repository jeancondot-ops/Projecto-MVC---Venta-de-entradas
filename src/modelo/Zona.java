package modelo;

import java.util.ArrayList;

public class Zona {

    private String nombre;
    private int capacidad;
    private int precio;

    private ArrayList<Entrada> entradas;

    public Zona(String nombre, int capacidad, int precio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.precio = precio;
        this.entradas = new ArrayList<>();
    }

    public boolean generarEntradas() {
        return true;
    }

    public ArrayList<Entrada> mostrarEntrada() {
        return entradas;
    }

    public Entrada venderEntrada(int numero) {

        for (Entrada e : entradas) {
            if (e != null) {
                return e;
            }
        }

        return null;
    }
}
