package app.modelo;


import java.util.Date;

public class Candidato extends Persona {

    private String experiencia;
    private String[] referencia;
    private String certificaciones;
    private String habilidades;
    private String objetivo;
    private boolean Contratofirmado;

    public Candidato(String experiencia, String[] referencia, String certificaciones, String habilidades, String objetivo, boolean Contratofirmado, int id, String nombre, String apellido, Date nacimiento, String direccion, String telefono, String educacion) {
        super(id, nombre, apellido, nacimiento, direccion, telefono, educacion);
        this.experiencia = experiencia;
        this.referencia = referencia;
        this.certificaciones = certificaciones;
        this.habilidades = habilidades;
        this.objetivo = objetivo;
        this.Contratofirmado = Contratofirmado;
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
 
    
    public boolean evaluarCurriculum() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void verificarContrato() {
    }

    public void establecerContrato() {
    }
}
