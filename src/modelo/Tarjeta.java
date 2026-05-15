package modelo;

public class Tarjeta {
    
    private int numero;
    private String nombre;
    private String fecha;
    private int CVV;
    
    public Tarjeta(int numero, String nombre, String fecha, int CVV){
        this.numero = numero;
        this.nombre = nombre;
        this.fecha  = fecha;
        this.CVV    = CVV;
     }
    
}
