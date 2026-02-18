package ST;

public abstract class Tarea {
    private int id;
    private String nombre;
    private int prioridad;
    private boolean completada;

    public Tarea() {
    }

    public Tarea(int id, String nombre, int prioridad, boolean completada) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public boolean getCompletada() {
        return this.completada;
    }

}
