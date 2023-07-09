package app.modelo;

public class Usuario {

    private String correo;
    private String password;

    public Usuario(String correo, String password) {
        this.correo = correo;
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verificarPassword() {
        return this.password.equals(password);  
    }
    
    private boolean verificarCredenciales() {
        return correo.equals("usuario@example.com") && password.equals("contraseña123");
    }
  
    public void iniciarSesion() {
        if (verificarCredenciales()) {
            System.out.println("Inicio de sesión exitoso");
        } else {
            System.out.println("Inicio de sesión fallido");
        }
    }
}
