package ST;

import java.util.Scanner;

public class SmartTask {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n--- Gestor de Tareas ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción: ");

            try {
                System.out.print("Ingrese su opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("Seleccione la prioridad de la tarea: 1. Normal | 5. Urgente\n");
                        int prioridad = scanner.nextInt();
                        scanner.nextLine();

                        if (prioridad !=1 && prioridad != 5) {
            
                            throw new Exception("Prioridad no válida. Debe ser 1 (Normal) o 5 (Urgente).");
                        }

                        System.out.println("Ingrese el ID de la tarea: \n");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese el nombre de la tarea: \n");
                        String nombre = scanner.nextLine();

                        Tarea t = null;
                        if (prioridad == 5) {
                            System.out.println("Ingrese la fecha límite de la tarea (formato: dd/MM/yyyy): \n");
                            String fechaLimite = scanner.nextLine();
                            t = new TareaUrgente(id, nombre, prioridad, false, fechaLimite); 

                        } else {
                            t = new TareaNormal(id, nombre, prioridad, false);
                        }
                        gestor.agregarTarea(t);
                        break;
                    case 2:
                        gestor.listarTareas();
                        break;
                    case 3:
                        System.out.println("Ingrese el ID de la tarea a eliminar: ");
                        gestor.eliminarTarea(scanner.nextInt());
                        scanner.nextLine();
                        break;
                    case 4:
                        System.out.println("Ingrese el ID de la tarea a marcar como completada: ");
                        gestor.marcarComoCompletada(scanner.nextInt());
                        scanner.nextLine();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + "\n");
                scanner.nextLine();
                opcion = -1;
            }
        } while (opcion != 0);
        scanner.close();
    }
}
