
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class UsuarioArreglo implements Serializable{
    private int indice;
    private Usuario[] usuarios;

    public UsuarioArreglo(int tamano) {
        this.usuarios = new Usuario[tamano];
        this.indice = 0;
        loadRegistros();
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
    /*
    public boolean iniciarSesion(String correo, String password) {
        String rutaArchivo = "correos.txt";
        try (Scanner scanner = new Scanner(new File(rutaArchivo))) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    String correoGuardado = datos[0];
                    String passwordGuardado = datos[1];
                    if (correo.equals(correoGuardado) && password.equals(passwordGuardado)) {
                        return true; 
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo de correos no encontrado: " + e.getMessage());
        }
        return false;
    }
*/
    public void loadRegistros() {
        String rutaArchivo = "correos.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int i = 0;
            while ((linea = reader.readLine()) != null && i < usuarios.length) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    String correo = partes[0].trim();
                    String password = partes[1].trim();
                    usuarios[i] = new Usuario(correo, password);
                    i++;
                    System.out.println(correo+" "+password);
                }
            }
            indice = i;
        } catch (IOException e) {
            System.err.println("Error al leer en el archivo: " + e.getMessage());
        }
    }
    public boolean exist(String c, String p){
        for (Usuario u : usuarios) {
            if(u!= null)
                if (u.verificarCorreo(c) && u.verificarPassword(p))
                    return true;
        }
        return false;
    }      
}
