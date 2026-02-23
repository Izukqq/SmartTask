                                        |||||| SmartTask ||||||

SmartTask es una aplicacion de consola desarrollada en Java que permite gestionar tareas desde la consola aplicacando
conceptos avanzados de Programacion Orientada a Objetos y pruebas automatizadas con JUnit 5. El objetivo principal es
asegurar el funcionamiento del codigo y detectar fallas de forma temprana mediante una suite de pruebas robustas.

1.- Características principales.

El sistema permite realizar las acciones fundamentales de gestión definidas en la interfaz Accionable:

-   Agregar Tareas: Soporte para tareas normales y urgentes identificadas con validación por su ID único.
-   Listado polimórfico: Visualización detallada de tareas según su tipo.
-   Gestión de estados: Posibilidad de marcar tareas como completadas.
-   Eliminación segura: Borrado de tareas mediante búsqueda por identificador único.

2.- Arquitectura del proyecto.

Este proyecto fue hecho con estandares de Clean Code y POO:

-   Abstracción y Herencia: Se utiliza una clase abstracta Tarea como base para TareaNormal y TareaUrgente.
    permitiendo el acceso solo a través de métodos públicos.
-   Encapsulamiento: Todos los atributos son privados, protegiendo la integridad de los datos y permitiendo
    el acceso solo a través de métodos públicos.
-   Inversión de Dependencia: El GestorTareas implementa la interfaz Accionable, desacoplando la definición 
    de las acciones de su implementación lógica.

3.- Pruebas Unitarias (JUnit 5)
    
Se implementaron metodologías Unit Testing, se implementó pruebas para verificar unidades aisladas de código.
Esto nos garantiza que cada funcionalidad sea independiente y produzca resultados consistentes.

-   Metodología: Uso del patrón AAA (Arrange, Act, Assert) para una mayor legibilidad y mantenimiento de pruebas.
-   Aislamiento: Uso de la anotación @BeforeEach para resetear el estado del gestor antes de cada prueba, asegurando que
    los test no dependan entre si.
-   Cobertura: Válidacion de los metodos críticos: testAgregarTarea, testListarTareas, testEliminarTarea y testMarcarComoCompletada.

4.- Tecnologías utilizadas

-   Lenguaje: Java SE
-   IDE: Visual Studio Code (Java Extension Pack)
-   Framework Testing: JUnit 5
-   Control de versiones: GIT / GitHub

||||| Instalación y ejecución |||||

1.- Clona el repositorio git clone https://github.com/Izukqq/SmartTask.git
2.- Importa el proyecto en tu IDE de preferencia.
3.- Asegurate de incluir las librerias de JUnit 5 en tu Classpath.
4.- Ejecuta SmartTask.java para iniciar la aplicación o GestorTareasTest.java para correr las pruebas.

