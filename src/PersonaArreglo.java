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
        System.out.println("Candidato registrado exitosamente: " + candidato.getNombre() + " " + candidato.getApellido());
    }

    public Candidato buscarCandidato(String nombre, String apellido) {
        for(int i=0;i<indice;i++){
            if(personas[i] instanceof Candidato && personas[i].getNombre().equals(nombre)&& personas[i].getApellido().equals(apellido)){
                return (Candidato) personas[i];
            }
        }
        return null;
    }
    
    public void registrarEmpleado(Empleado empleado) {
        agregar(empleado);
        System.out.println("Empleado registrado exitosamente: " + empleado.getNombre() + " " + empleado.getApellido());
    }
    
    public Empleado buscarEmpleado(String nombre, String apellido) {
        for(int i=0;i<indice;i++){
            if(personas[i] instanceof Empleado && personas[i].getNombre().equals(nombre)&& personas[i].getApellido().equals(apellido)){
                return (Empleado) personas[i];
            }
        }
        return null;
    }
    
    public void despedirEmpleado(String nombre, String apellido) {
        for (int i = 0; i < indice; i++) {
            if (personas[i] instanceof Empleado && personas[i].getNombre().equals(nombre) && personas[i].getApellido().equals(apellido)) {
                personas[i] = null;
                System.out.println("Empleado despedido exitosamente: " + nombre + " " + apellido);
                return;
            }
        }
        System.out.println("No se encontró ningún empleado con el nombre: " + nombre + " " + apellido);
    }
}


