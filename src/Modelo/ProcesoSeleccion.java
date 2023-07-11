package Modelo;


import Modelo.Puesto;
import java.util.Date;

public class ProcesoSeleccion {

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
}
