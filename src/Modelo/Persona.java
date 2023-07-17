package Modelo;

import java.io.Serializable;



public class Persona implements Serializable{

    private String id;
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String direccion;
    private String telefono;
    private String educacion;

    public Persona(String id, String nombre, String apellido, String nacimiento, String direccion, String telefono, String educacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.educacion = educacion;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
