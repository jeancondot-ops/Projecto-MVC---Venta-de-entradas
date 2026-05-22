package modelo.controlador;

import modelo.Venta;   
import modelo.Entrada; 
import java.util.Date;

public class BoletoController {
    private Venta ventaActual;

    public BoletoController() {
        this.ventaActual = new Venta(new Date(), 0);
    }

    public void registrarVenta(String zona, int cantidad) {
        int precioBase = 50;
        int montocalculado = precioBase * cantidad;
        this.ventaActual = new Venta(new Date(), montocalculado);
        
        System.out.println("Controlador: Venta registrada con monto: " + zona + " por un monto calculaoo " + montocalculado );
    }
}