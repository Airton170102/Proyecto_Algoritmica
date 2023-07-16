package Modelo;

import Modelo.Empleado;
import Modelo.Candidato;
import java.io.*;
import java.util.Scanner;
import java.util.Date;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class PersonaArreglo {

    private int indice;
    private Persona[] personas;

    public PersonaArreglo(int tamano) {
        this.personas = new Persona[tamano];
        this.indice = 0;
    }

    public void agregar(Persona persona){
        this.personas[this.indice] = persona;
        this.indice++;
    }
    
    public void registrarUsuario(Usuario usuario) {
        try(PrintWriter pw = new PrintWriter(new FileWriter("usuarios.txt", true))) {
            pw.println(usuario.getCorreo() + "," + usuario.getPassword());
        } catch(IOException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }

    public void cargarUsuarios() {
        try(Scanner sc = new Scanner(new File("usuarios.txt"))) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String correo = parts[0];
                String password = parts[1];
                // Aquí podrías crear tus objetos Usuario o añadirlos a una lista
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error al cargar usuarios: " + e.getMessage());
        }
    }
    
    public void registrarCandidato(Candidato candidato) {
        agregar(candidato);
        System.out.println("Candidato registrado exitosamente");
        escribirEnArchivo(candidato);
    }

    public Candidato buscarCandidato(String nombre, String apellido) {
        for(int i=0;i<indice;i++){
            if(personas[i] instanceof Candidato && personas[i].getNombre().equals(nombre)&& personas[i].getApellido().equals(apellido)){
                return (Candidato) personas[i];
            }
        }
        return null;
    }
    

    public void registrarEmpleado(Empleado empleado) {
        agregar(empleado);
        System.out.println("Empleado registrado exitosamente");
        escribirEnArchivo(empleado);
    }
    
    public Empleado buscarEmpleado(String nombre, String apellido) {
        for(int i=0;i<indice;i++){
            if(personas[i] instanceof Empleado && personas[i].getNombre().equals(nombre)&& personas[i].getApellido().equals(apellido)){
                return (Empleado) personas[i];
            }
        }
        return null;
    }
    public void despedirEmpleado(String nombre, String apellido) {
    for(int i=0;i<indice;i++){
        if(personas[i] instanceof Empleado && personas[i].getNombre().equals(nombre)&& personas[i].getApellido().equals(apellido)){
            // Simplest way to remove an item from array in Java is to create a new array of size less one
            Persona[] newPersonas = new Persona[personas.length - 1];
            for(int j=0, k=0;j<personas.length;j++,k++) {
                if(j == i) k--; // skip current index
                else newPersonas[k] = personas[j];
            }
            personas = newPersonas;
            indice--;
            System.out.println("Empleado despedido exitosamente");
            break; // stop the loop after finding and firing the employee
        }
    }
}
    private void escribirEnArchivo(Persona persona) {
        try {
            File file = new File("registro.txt");
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println("ID: " + persona.getId());
            pw.println("Nombre: " + persona.getNombre());
            pw.println("Apellido: " + persona.getApellido());
            pw.println("Nacimiento: " + persona.getNacimiento());
            pw.println("Dirección: " + persona.getDireccion());
            pw.println("Teléfono: " + persona.getTelefono());
            pw.println("Educación: " + persona.getEducacion());
            if(persona instanceof Candidato) {
                Candidato c = (Candidato) persona;
                pw.println("Experiencia: " + c.getExperiencia());
                pw.println("Certificaciones: " + c.getCertificaciones());
                pw.println("Habilidades: " + c.getHabilidades());
                pw.println("Objetivo: " + c.getObjetivo());
                pw.println("Contrato Firmado: " + c.isContratofirmado());
            }
            // similar section for Empleado if needed
            pw.println("------");

            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Iterable<Usuario> getUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
