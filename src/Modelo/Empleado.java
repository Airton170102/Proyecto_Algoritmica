package Modelo;


import Modelo.Contrato;
import java.util.Date;

public class Empleado extends Persona {

    private Contrato contrato;
    private Usuario usuario;

    public Empleado(Contrato contrato, Usuario usuario, String id, String nombre, String apellido, String nacimiento, String direccion, String telefono, String educacion) {
        super(id, nombre, apellido, nacimiento, direccion, telefono, educacion);
        this.contrato = contrato;
        this.usuario = usuario;
    }

    
    
    public Contrato getContrato() {
        return contrato;
    }
    
   
}
