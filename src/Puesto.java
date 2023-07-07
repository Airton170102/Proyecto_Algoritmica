public class Puesto {

    private String nombre;
    private double salario;
    private int vacante;

    public Puesto(String nombre, double salario, int vacante) {
        this.nombre = nombre;
        this.salario = salario;
        this.vacante = vacante;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getVacante() {
        return vacante;
    }
    
    
    
    
}
