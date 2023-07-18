package Modelo;


import Vista.frmPrincipal;
import Vista.frmRegistroCandidato1;
import Vista.frmSeleccionCandidatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Candidato /*extends Persona*/ {
//Al hacer que la clase Candidato ya no sea hija de Persona, tengo que poner como variable a todos los campos del Registro de Candidato
    private String id;
    private String nomnbres;
    private String apellidos;
    private String nacimiento;
    private String direccion;
    private String telefono;
    private String educacion;
    private String experiencia;
    private String certificaciones;
    private String habilidades;
    private String objetivo;
    private String puestoaPostular;
    
    
    public Candidato (String id, String nombres, String apellidos, String nacimiento, String direccion, String telefono, String educacion, String experiencia, String certificaciones, String habilidades, String objetivo, String puestoaPostular)
    {
        this.id = id;
        this.nomnbres = nombres;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.educacion = educacion;
        this.experiencia = experiencia;
        this.certificaciones = certificaciones;
        this.habilidades = habilidades;
        this.objetivo = objetivo;
        this.puestoaPostular = puestoaPostular;
    }
    
    //No borren esto :v, le hice una SobreCarga al Constructor para poder usar
    //un Constructor Vacío xd 
    public Candidato()
    {
        
    }
    
    public void registrarCandidato(String id, String nombres, String apellidos, String nacimiento, String direccion, String telefono, String educacion, String experiencia, String certificaciones, String habilidades, String objetivo, String puestoaPostular) {
        String rutaArchivo = "registro.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            writer.write(id+","+nombres+","+apellidos+","+nacimiento+","+direccion+","+telefono+","+educacion+","+experiencia+","+certificaciones+","+habilidades+","+objetivo+","+puestoaPostular);
            writer.newLine();
           
            frmRegistroCandidato1 frame = new frmRegistroCandidato1();
            System.out.println("\nDatos guardados en el TXT");
            JOptionPane.showMessageDialog(frame, "Datos Registrados");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
    
    public void mostrarCandidatos(frmSeleccionCandidatos listaCandidatos)
    {
        String rutaArchivo = "registro.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String id = datos[0];
                String nombres = datos[1];
                String apellidos = datos[2];
                String nacimiento = datos[3];
                String direccion = datos[4];
                String telefono = datos[5];
                String educacion = datos[6];
                String experiencia = datos[7];
                String certificaciones = datos[8];
                String habilidades = datos[9];
                String objetivo = datos[10];
                String puestoaPostular = datos[11];
                             
                JTextArea txtArea = listaCandidatos.txtListaCandidatos;
                
                    listaCandidatos.txtListaCandidatos.append("\n\t\tCANDIDATO"+(i+1)+"\n\t"+"ID: "+id+"\n\tNombres: "+nombres+"\n\tApellidos: "+apellidos+"\n\tDireccion: "+direccion+"\n\tTelefono: "+telefono+"\n\tEducacion: "+educacion+"\n\tExperiencia: "+experiencia+"\n\tCertificacion: "+certificaciones+"\n\tHabilidades: "+habilidades+"\n\tObjetivo: "+objetivo+"\n\tPuesto a postular: "+puestoaPostular+"\n");
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

    
