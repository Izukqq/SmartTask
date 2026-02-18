package ST;

public class TareaNormal extends Tarea {
    public TareaNormal(int id, String nombre, int prioridad, boolean completada) {
        super(id, nombre, prioridad, completada);
    }



    @Override
    public String toString() {
        return "TareaNormal { " +
                "id= " + this.getId() +
                ", nombre= '" + this.getNombre() + '\'' +
                ", prioridad= " + this.getPrioridad() +
                ", completada= '" + (this.getCompletada() ? "Sí" : "No") + '\'' +
                '}';
    }

}
