
import java.util.Date;

public class Empleado extends Persona {

    private Contrato contrato;

    public Empleado(Contrato contrato, int id, String nombre, String apellido, Date nacimiento, String direccion, String telefono, String educacion) {
        super(id, nombre, apellido, nacimiento, direccion, telefono, educacion);
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }

     
    public void iniciarSesion() {
    }
}
