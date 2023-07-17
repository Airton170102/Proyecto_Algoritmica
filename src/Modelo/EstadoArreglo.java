package Modelo;


import Modelo.Estado;
import java.io.Serializable;

public class EstadoArreglo implements Serializable {

    private int indice;
    private Estado[] estados;

    public EstadoArreglo(int tamano) {
        this.estados = new Estado[tamano];
        this.indice = 0;
    }

    public void agregar(Estado estado){
        this.estados[this.indice] = estado;
        this.indice++;
    }
    
    
}
