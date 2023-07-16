package Modelo;


import java.util.Date;

public class Contrato {

    private String codigo;
    private Date inicio;
    private Date fin;
    private String tipo;
    private double salario;
    private String descripcion;

    public Contrato(String codigo, Date inicio, Date fin, String tipo, double salario, String descripcion) {
        this.codigo = codigo;
        this.inicio = inicio;
        this.fin = fin;
        this.tipo = tipo;
        this.salario = salario;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSalario() {
        return salario;
    }

    public String getDescripcion() {
        return descripcion;
    }   
    
}
