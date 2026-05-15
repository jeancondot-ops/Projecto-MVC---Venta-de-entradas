package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Venta {

    private Date fecha;
    private int monto;

    private ArrayList<Entrada> entradas;

    public Venta(Date fecha, int monto) {
        this.fecha = fecha;
        this.monto = monto;
        this.entradas = new ArrayList<>();
    }

    public boolean anular() {
        return true;
    }
}