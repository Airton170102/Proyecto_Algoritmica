package Modelo;


import java.io.Serializable;
import java.util.Date;

public class Movimiento implements Serializable {

    private Date fecha;

    public Movimiento(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    
    
}
