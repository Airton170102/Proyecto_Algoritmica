package Modelo;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Date;

public class Candidato extends Persona implements Serializable {

    private String experiencia;
    private String[] referencia;
    private String certificaciones;
    private String habilidades;
    private String objetivo;
    private boolean Contratofirmado;
    private int puntajeCurriculum;
    private int puntajeEntrevista;

    public Candidato(String experiencia, String[] referencia, String certificaciones, String habilidades, String objetivo, boolean Contratofirmado, int puntajeCurriculum, int puntajeEntrevista, String id, String nombre, String apellido, String nacimiento, String direccion, String telefono, String educacion) {
        super(id, nombre, apellido, nacimiento, direccion, telefono, educacion);
        this.experiencia = experiencia;
        this.referencia = referencia;
        this.certificaciones = certificaciones;
        this.habilidades = habilidades;
        this.objetivo = objetivo;
        this.Contratofirmado = Contratofirmado;
        this.puntajeCurriculum = puntajeCurriculum;
        this.puntajeEntrevista = puntajeEntrevista;
    }
    
    public String getExperiencia() {
        return experiencia;
    }

    public String[] getReferencia() {
        return referencia;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public boolean isContratofirmado() {
        return Contratofirmado;
    }
     public int getPuntajeCurriculum() {
        return puntajeCurriculum;
    }

    public int getPuntajeEntrevista() {
        return puntajeEntrevista;
    }

    public void evaluarCurriculum(int puntaje) {
        puntajeCurriculum = puntaje;
    }

    public void evaluarEntrevista(int puntaje) {
        puntajeEntrevista = puntaje;
    }

    public boolean pasarAProcesoEntrevista() {
        return puntajeCurriculum > 7;
    }

    public boolean pasarContratacion() {
        return puntajeEntrevista >= 9;
    }

    String isContratoFirmado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    
    

    
