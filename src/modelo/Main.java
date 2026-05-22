package modelo;

import vista.VentanaPrincipal;
import modelo.controlador.BoletoController;

public class Main {
    public static void main(String[] args) {
        BoletoController control = new BoletoController();

        VentanaPrincipal vista = new VentanaPrincipal();
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
}