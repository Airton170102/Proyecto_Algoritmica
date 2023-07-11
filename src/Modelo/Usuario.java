package Modelo;

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

    public String getPassword() {
        return password;
    }

    public boolean verificarCorreo(String correo) {
        return this.correo.equals(correo);  
    }
    
    public boolean verificarPassword(String password) {
        return this.password.equals(password);  
    }
}
