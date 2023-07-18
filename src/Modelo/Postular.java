package Modelo;


import java.io.Serializable;
import java.util.Date;

public class Postular implements Serializable{

    private Date fecha;

    public Postular(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public void contratarCandidato() {
    }

    public void rechazarCandidato() {
    }
}
