
package Modelo;

import Vista.frmListaEmpleados;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

public class ListaEmpleados 
{
    public ListaEmpleados(){
        
    }
    
    public void mostrarEmpleados(frmListaEmpleados frLE)
    {
        String rutaArchivo = "empleados.txt";
        
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

                JTextArea txtArea = frLE.txtListaEmpleados;
                
                frLE.txtListaEmpleados.append("\n\t\tEMPLEADO"+(i+1)+"\n\t"+"ID: "+id+"\n\tNombres: "+nombres+"\n\tApellidos: "+apellidos+"\n\tDireccion: "+direccion+"\n\tTelefono: "+telefono+"\n\tEducacion: "+educacion+"\n\tExperiencia: "+experiencia+"\n\tCertificacion: "+certificaciones+"\n\tHabilidades: "+habilidades+"\n\tObjetivo: "+objetivo+"\n\tPuesto a postular: "+puestoaPostular+"\n");
                //txtArea.setEditable(false);
                i++;
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
