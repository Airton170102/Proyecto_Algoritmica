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
            pw.println("Contrato Firmado: " + c.isContratoFirmado());
        }
        if(persona instanceof Empleado) {
            Empleado e = (Empleado) persona;
            pw.println("Contrato: " + e.getContrato());
            }
        pw.println("------");

        pw.close();
    } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
}

}
