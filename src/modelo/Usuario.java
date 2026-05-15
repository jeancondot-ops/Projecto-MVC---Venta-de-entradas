package modelo;

public class Usuario extends Persona {
    
    private boolean estado;

    public Usuario(String nombres, String apellidos, String dni, String contrasena, boolean estado){
        super (nombres, apellidos,dni,contrasena);
        this.estado = estado;
    }
    public void registrarZona(){
        System.out.println("Zona Registrada");
    }
}
