package Modelo;


import Modelo.Puesto;
import java.io.Serializable;
import java.util.Date;

public class ProcesoSeleccion implements Serializable{

    private Puesto puesto;
    private Date inicio;
    private Date fin;
    private Date publicacion;

    public ProcesoSeleccion(Puesto puesto, Date inicio, Date fin, Date publicacion) {
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.publicacion = publicacion;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public Date getPublicacion() {
        return publicacion;
    }
    
    
    public void registrarPuesto() {
    }

    public void buscarPuesto() {
    }

    public void eliminarPuesto() {
    }
    public void evaluarCurriculum(Candidato candidato, int puntaje) {
        candidato.evaluarCurriculum(puntaje);
    }

    public void evaluarEntrevista(Candidato candidato, int puntaje) {
        candidato.evaluarEntrevista(puntaje);
    }

    public boolean pasarAProcesoEntrevista(Candidato candidato) {
        return candidato.getPuntajeCurriculum() > 7;
    }

    public boolean pasarContratacion(Candidato candidato) {
        return candidato.getPuntajeEntrevista() >= 9;
    }
}
