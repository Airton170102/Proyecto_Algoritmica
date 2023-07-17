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
    public void registrarPersona(Persona persona) {
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("registro.txt", true)))) {
            pw.println("ID: " + persona.getId());
            pw.println("Nombre: " + persona.getNombre());
            pw.println("Apellido: " + persona.getApellido());
            pw.println("Nacimiento: " + persona.getNacimiento());
            pw.println("Dirección: " + persona.getDireccion());
            pw.println("Teléfono: " + persona.getTelefono());
            pw.println("Educación: " + persona.getEducacion());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    public void registrarCandidato(Candidato candidato) {
        agregar(candidato);
        registrarPersona(candidato);
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("registro.txt", true)))) {
            pw.println("Experiencia: " + candidato.getExperiencia());
            pw.println("Certificaciones: " + candidato.getCertificaciones());
            pw.println("Habilidades: " + candidato.getHabilidades());
            pw.println("Objetivo: " + candidato.getObjetivo());
            pw.println("Contrato Firmado: " + candidato.isContratoFirmado());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}    

    


