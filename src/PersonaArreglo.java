public class PersonaArreglo {

    private int indice;
    private Persona[] personas;

    public PersonaArreglo(int tamano) {
        this.personas = new Persona[tamano];
        this.indice = 0;
    }

    public void agregar(Persona persona){
        this.personas[this.indice] = persona;
        this.indice++;
    }
    
    
    public void registrarCandidato() {
    }

    public void buscarCandidato() {
    }

    public void registrarEmpleado() {
    }

    public void despedirEmpleado() {
    }
}
