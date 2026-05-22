package modelo.controlador;

import modelo.Venta;   
import modelo.Entrada; 
import java.util.Date;

public class BoletoController {
    private Venta ventaActual;

    public BoletoController() {
        this.ventaActual = new Venta(new Date(), 0);
    }

    public void registrarVenta(int montoTotal) {
        this.ventaActual = new Venta(new Date(), montoTotal);
        
        System.out.println("Controlador: Venta registrada con monto: " + montoTotal);
    }
}