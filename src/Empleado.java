
import java.util.Date;

public class Empleado extends Persona {

    private Contrato contrato;
    private Area area;
    private Usuario usuario;

    public Empleado(Contrato contrato, int id, String nombre, String apellido, Date nacimiento, String direccion, String telefono, String educacion, String correo, String password) {
        super(id, nombre, apellido, nacimiento, direccion, telefono, educacion);
        this.usuario = null;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void asignarUsuario(Usuario usuario) {
        if (area.getNombre().equalsIgnoreCase("Recursos Humanos")) {
            this.usuario = usuario;
        } else {
            System.out.println("El empleado no pertenece al área de Recursos Humanos y no puede tener un usuario.");
        }
    }

}
