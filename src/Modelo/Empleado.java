package Modelo;


import Modelo.Contrato;
import java.util.Date;

public class Empleado extends Persona {

    private Contrato contrato;
    private Usuario usuario;

    public Empleado(Contrato contrato, int id, String nombre, String apellido, Date nacimiento, String direccion, String telefono, String educacion, String correo, String password) {
        super(id, nombre, apellido, nacimiento, direccion, telefono, educacion);
        this.contrato = contrato;
        this.usuario = new Usuario(correo, password);
    }

    public Contrato getContrato() {
        return contrato;
    }
    
   
}
