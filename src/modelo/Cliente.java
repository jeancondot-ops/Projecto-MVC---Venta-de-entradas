package modelo;

public class Cliente extends Persona {
    
    private int puntos;
    private Tarjeta tarjeta;

    public Cliente(String nombres, String apellidos, String dni, String contrasena, int puntos) {
        super(nombres, apellidos, dni, contrasena);
        this.puntos = puntos;
    }

    public void ingresar(String usuario, String clave) {
        System.out.println("Ingreso correcto");
    }
}
