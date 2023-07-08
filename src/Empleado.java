
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

     
    public void iniciarSesion() {
        String correo = usuario.getCorreo();
        String password = usuario.getPassword();
        
        if(correo.equals("usuario@gmail.com") && password.equals("password")){
            System.out.println("Inicio de sesion exitoso");    
        }else{
            System.out.println("Error al iniciar sesion");
        }
    }
}
