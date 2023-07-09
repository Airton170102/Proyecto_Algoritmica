package sistema.de.rrhh;
import app.modelo.PersonaArreglo;
import app.modelo.Candidato;
import app.modelo.Usuario;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class App {
     public static void main(String[] args) throws ParseException {
        PersonaArreglo personaArreglo = new PersonaArreglo(100); // capacidad para 100 personas
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while(keepRunning) {
            System.out.println("¿Qué te gustaría hacer?");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesión");
            System.out.println("3. Registrar candidato");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

        if(opcion == 1) {
            System.out.println("Registro de usuario:");
            System.out.print("Correo: ");
            String correo = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();
            Usuario nuevoUsuario = new Usuario(correo, contrasena);
            personaArreglo.registrarUsuario(nuevoUsuario);
            System.out.println("Usuario registrado exitosamente");
        } else if(opcion == 2) {
            System.out.println("Inicio de sesión:");
            System.out.print("Correo: ");
            String correo = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();
            boolean loginExitoso = false;
            personaArreglo.cargarUsuarios();
            for(Usuario usuario : personaArreglo.getUsuarios()) {
                if(usuario.getCorreo().equals(correo) && usuario.getPassword().equals(contrasena)) {
                    loginExitoso = true;
                    break;
                }
            }
            if(loginExitoso) {
                System.out.println("Inicio de sesión exitoso");
            } else {
                System.out.println("Correo electrónico o contraseña incorrectos");
            }
        } else if(opcion == 3) {
            System.out.println("Introduce los detalles del candidato:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Fecha de Nacimiento (dd/MM/yyyy): ");
            String fechaNacimientoStr = scanner.nextLine();
            Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Educación: ");
            String educacion = scanner.nextLine();
            System.out.print("Experiencia: ");
            String experiencia = scanner.nextLine();
            System.out.print("Certificaciones: ");
            String certificaciones = scanner.nextLine();
            System.out.print("Habilidades: ");
            String habilidades = scanner.nextLine();
            System.out.print("Objetivo: ");
            String objetivo = scanner.nextLine();
            Candidato candidato1 = new Candidato(
            nombre, 
            new String[]{apellido}, 
            direccion, 
            telefono, 
            "email@example.com", 
            false, 
            1, 
            educacion, 
            experiencia, 
            fechaNacimiento, 
            certificaciones, 
            habilidades, 
            objetivo
        );
            personaArreglo.registrarCandidato(candidato1);
            System.out.println("Candidato registrado exitosamente");
        }else if(opcion == 4) {
                keepRunning = false;  // salir del bucle
            } else {
                System.out.println("Opción no válida");
            }
        }
        scanner.close();
    }
}