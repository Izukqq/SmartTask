package ST;
public class TareaUrgente extends Tarea {
    private String fechaLimite;

    public TareaUrgente(int id, String nombre, int prioridad, boolean completada , String fecha) {
        super(id, nombre, prioridad, completada);
        this.fechaLimite = fecha;
    }
    
    @Override
    public String toString() {
        return "TareaUrgente | " +
                "Id: " + this.getId() +
                ", Nombre: " + this.getNombre() +
                ", Prioridad: " + this.getPrioridad() +
                ", Completada: " + (this.getCompletada() ? "Sí" : "No") +
                ", Fecha Límite: " + this.fechaLimite + " | ";
    }
}
