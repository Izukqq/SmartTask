package ST;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class GestorTareasTest {
    private GestorTareas gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorTareas();
    }

    @Test
    public void testAgregarTarea() {
        Tarea t = new TareaNormal(1, "Terminar proyecto ABP 4", 1, false);
        gestor.agregarTarea(t);
        assertEquals(1, gestor.obtenerCantidadTareas());
        assertEquals(t, gestor.getListaTareas().get(0));
    }

    @Test
    public void testListarTareas() {
        Tarea t1 = new TareaNormal(1, "Hacer Proyecto ABP 4", 1, false);
        Tarea t2 = new TareaUrgente(2, "Hacer portafolio", 5, false, "30/12/2024");
        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        assertEquals(2, gestor.obtenerCantidadTareas());
    }

    @Test
    public void testEliminarTarea() {
        Tarea t = new TareaNormal(1, "Tarea 1", 1, false);
        gestor.agregarTarea(t);
        gestor.eliminarTarea(t.getId());
        assertEquals(0, gestor.obtenerCantidadTareas());
    }

    @Test
    public void testMarcarComoCompletada() {
        Tarea t = new TareaNormal(1, "Hacer ABP 4", 1, false);
        gestor.agregarTarea(t);
        gestor.marcarComoCompletada(1);
        assertTrue(t.getCompletada());
    }

}
