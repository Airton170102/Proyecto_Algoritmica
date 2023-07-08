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
    
    public void registrarCandidato(Candidato candidato) {
        agregar(candidato);
        System.out.println("Candidato registrado exitosamente");
    }

    public Candidato buscarCandidato(String nombre, String apellido) {
        for(int i=0;i<indice;i++){
            if(personas[i] instanceof Candidato && personas[i].getNombre().equals(nombre)&& personas[i].getApellido().equals(apellido)){
                return (Candidato) personas[i];
            }
        }
        return null;
    }
    

    public void registrarEmpleado() {
    }
    
    public Empleado buscarEmpleado(String nombre) {
        for(int i=0;i<indice;i++){
            if(personas[i] instanceof Candidato && personas[i].getNombre().equals(nombre)){
                return (Candidato) personas[i];
            }
        }
        return null;
    }
    

    public void despedirEmpleado() {
    }
}
