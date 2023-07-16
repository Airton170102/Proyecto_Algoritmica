package Modelo;


import java.util.Date;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private Date nacimiento;
    private String direccion;
    private String telefono;
    private String educacion;

    public Persona(int id, String nombre, String apellido, Date nacimiento, String direccion, String telefono, String educacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.educacion = educacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getNacimiento() {
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


