public class AreaArreglo {

    private int indice;
    private Area[] areas;

    public AreaArreglo(int tamano) {
        this.areas = new Area[tamano];
        this.indice = 0;
    }

    public void agregar(Area area){
        this.areas[this.indice] = area;
        this.indice++;
    }
   

    
}
