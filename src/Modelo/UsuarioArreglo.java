
package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

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
}
