package Modelo;

import java.io.Serializable;

public class Area implements Serializable{

    private String nombre;

    public Area(String nombre, boolean cuenta) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;//nombre 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    
}
