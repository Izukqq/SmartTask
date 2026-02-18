package ST;
import java.util.ArrayList;

public class GestorTareas implements Accionable {
    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
    }

    @Override
    public void agregarTarea(Tarea t) {
        if (buscarTareaPorId(t.getId()) != null) {
            System.out.println("Ya existe una tarea con el ID: " + t.getId());
            return;
        }
        listaTareas.add(t);
        System.out.println("Tarea agregada.");   
    }

    @Override
    public void listarTareas() {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas para mostrar.");
        } else {
            for (Tarea t : listaTareas) {
                System.out.println(t);
            }
        }
    }
    public int obtenerCantidadTareas() {
        return listaTareas.size();
    }
    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }

    @Override
    public void eliminarTarea(int id) {
        Tarea encontrada = buscarTareaPorId(id);
        if (encontrada != null) {
            listaTareas.remove(encontrada);
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("No se encontro la tarea con el Id: " + id);
        }
    }

    @Override
    public void marcarComoCompletada(int id) {
        Tarea encontrada = buscarTareaPorId(id);
        if (encontrada != null) {
            encontrada.setCompletada(true);
            System.out.println("Tarea marcada como completada.");
        } else {
            System.out.println("No se encontro la tarea con el Id: " + id);
        }
    }
    private Tarea buscarTareaPorId(int id) {
        for (Tarea t : listaTareas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}
