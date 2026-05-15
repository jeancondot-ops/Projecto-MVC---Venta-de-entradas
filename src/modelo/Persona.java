package modelo;

public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String dni;
    protected String contrasena;

    public Persona(String nombres, String apellidos, String dni, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.contrasena = contrasena;
    }

    public boolean registrarTarjeta() {
        return true;
    }

    public boolean eliminarTarjeta() {
        return true;
    }

    public boolean anularVenta() {
        return true;
    }

    public boolean comprar() {
        return true;
    }
    
}
