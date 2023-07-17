package Modelo;

import java.io.Serializable;

public class Area implements Serializable{

    private String nombre;
    private boolean cuenta;

    public Area(String nombre, boolean cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;//nombre 
    }

    public boolean isCuenta() {
        return cuenta;
    }
    
    
    
    
}
