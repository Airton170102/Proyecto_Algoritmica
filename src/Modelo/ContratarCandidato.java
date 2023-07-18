
package Modelo;

import Vista.frmContratarCandidatos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

public class ContratarCandidato 
{
    public ContratarCandidato()
    {
        
    }
    
    public void mostrarCandidatosContratar(frmContratarCandidatos candidatoContratar)
    {
        String rutaArchivo = "entrevista.txt";
        
        try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo)))
        {
            String linea;
            int i=0;
            
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
                
                JTextArea txtArea = candidatoContratar.txtListaContratar;
                
                candidatoContratar.txtListaContratar.append("\n\t\tCANDIDATO"+(i+1)+"\n\t"+"ID: "+id+"\n\tNombres: "+nombres+"\n\tApellidos: "+apellidos+"\n\tDireccion: "+direccion+"\n\tTelefono: "+telefono+"\n\tEducacion: "+educacion+"\n\tExperiencia: "+experiencia+"\n\tCertificacion: "+certificaciones+"\n\tHabilidades: "+habilidades+"\n\tObjetivo: "+objetivo+"\n\tPuesto a postular: "+puestoaPostular+"\n");
                
                i++;
            }
        }
        catch (IOException e)
        {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
    public String buscarID(frmContratarCandidatos frCont)
    {
        String idBuscar = frCont.txtIdContratado.getText();
        String rutaArchivo = "entrevista.txt";
        String lineaDatos = null;
        String idTxt=null;
        
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) 
            {
                String[] datos = linea.split(",");
                idTxt = datos[0];

                if (idTxt.equals(idBuscar)) {
                   lineaDatos = linea;
                   break;
                }
            }
        } 
        catch (IOException e) { 
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return lineaDatos;
    }
    
    
    public void agregarListaEmpleado(frmContratarCandidatos frCont)
    {
        String rutaArchivo = "empleados.txt";
        String lineaDatos = buscarID(frCont);
        
        if(lineaDatos != null)
        {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            
            bw.write(lineaDatos);
            bw.newLine();
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
        }
        else
        {
            System.out.println("Error al guardar datos");
        }
    }
}
