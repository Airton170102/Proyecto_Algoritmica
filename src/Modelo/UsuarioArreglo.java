
package Modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsuarioArreglo {
    private int indice;
    private Usuario[] usuarios;

    public UsuarioArreglo(int tamano) {
        this.usuarios = new Usuario[tamano];
        this.indice = 0;
    }

    public void agregar(Usuario usuario){
        this.usuarios[this.indice] = usuario;
        this.indice++;
    }
    
    public void registrarCorreoYPassword(String correo, String password) {
        String rutaArchivo = "correos.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write(correo + "," + password);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    public void iniciarSesion(String correo, String password){
        
    }
           
}
