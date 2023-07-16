package Modelo;


import Modelo.Estado;

public class EstadoArreglo {

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
