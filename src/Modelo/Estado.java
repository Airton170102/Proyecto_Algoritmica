package Modelo;

public class Estado {

    private String nombre;
    private boolean disponible;

    public Estado(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    
    public void cambiarEstado() {
    }
}
