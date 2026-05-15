package modelo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                "Juan",
                "Perez",
                "12345678",
                "1234",
                100
        );
        Tarjeta tarjeta = new Tarjeta(
                12345,
                "Juan Perez",
                "12/28",
                123
        );
        Concierto concierto = new Concierto(
                "Rock Fest",
                new Date()
        );
        Zona zona = new Zona(
                "VIP",
                100,
                500
        );
        Entrada entrada = new Entrada(
                1,
                "Disponible"
        );
        System.out.println("Sistema funcionando");
    }
}
