package ST;

public class TareaNormal extends Tarea {
    public TareaNormal(int id, String nombre, int prioridad, boolean completada) {
        super(id, nombre, prioridad, completada);
    }



    @Override
    public String toString() {
        return "TareaNormal  | " +
                "Id: " + this.getId() +
                ", Nombre: " + this.getNombre() + 
                ", Prioridad: " + this.getPrioridad() +
                ", Completada: " + (this.getCompletada() ? "Sí" : "No") + " | ";
    }
}
