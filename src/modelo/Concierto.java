package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Concierto {
    
    private String nombre;
    private Date fecha; 
    private ArrayList<Zona> zonas;
    
    public Concierto(String nombre, Date fecha){
        this.nombre = nombre;
        this.fecha  = fecha;
        this.zonas  = new ArrayList<>();
    }
    
    public boolean agregarZona( String nombre){
        return true;
    }
    
    public boolean eliminarZona ( String nombre ) {
        return true;
    }
}
