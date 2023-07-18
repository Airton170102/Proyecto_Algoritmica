package Modelo;


import Vista.frmSeleccionCandidatos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class ProcesoSeleccion implements Serializable{

    public ProcesoSeleccion()
    {
        
    }

    public String buscarID(frmSeleccionCandidatos idSeleccionado)
    {
        String idBuscar = idSeleccionado.txtIdEntrevista.getText();
        String rutaArchivo = "registro.txt";
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
    
    public void agregarCandidatoEntrevista(frmSeleccionCandidatos idSeleccionado)
    {
        
        String rutaArchivo = "entrevista.txt";
        String lineaDatos = buscarID(idSeleccionado);
        
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
