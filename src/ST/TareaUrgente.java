package ST;
public class TareaUrgente extends Tarea {
    private String fechaLimite;

    public TareaUrgente(int id, String nombre, int prioridad, boolean completada , String fecha) {
        super(id, nombre, prioridad, completada);
        this.fechaLimite = fecha;
    }
    
    @Override
    public String toString() {
        return "TareaUrgente { " +
                "id= " + this.getId() +
                ", nombre= '" + this.getNombre() + '\'' +
                ", prioridad= " + this.getPrioridad() +
                ", completada= '" + (this.getCompletada() ? "Sí" : "No") + '\'' +
                ", fechaLimite= '" + this.fechaLimite + '\'' +
                '}';
    }
}
