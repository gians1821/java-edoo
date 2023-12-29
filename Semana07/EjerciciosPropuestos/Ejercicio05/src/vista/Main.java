package vista;

import data.Estudiante;
import data.ListaEstudiantesCircularDoble;
import data.Nodo;
import javax.swing.DefaultListModel;

public class Main {

    public static void main(String[] args) {
        ListaEstudiantesCircularDoble lista = new ListaEstudiantesCircularDoble();

        // Inserción al inicio (aprobados)
        lista.agregarEstudiante(new Estudiante("001", "Juan", "Pérez", "juan@example.com", 15));
        lista.agregarEstudiante(new Estudiante("002", "Maria", "Gómez", "maria@example.com", 14));
        lista.agregarEstudiante(new Estudiante("003", "Pedro", "López", "pedro@example.com", 16));

        // Inserción al final (desaprobados)
        lista.agregarEstudiante(new Estudiante("004", "Ana", "Martínez", "ana@example.com", 13));
        lista.agregarEstudiante(new Estudiante("005", "Carlos", "Rodríguez", "carlos@example.com", 12));
        lista.agregarEstudiante(new Estudiante("006", "Laura", "Sánchez", "laura@example.com", 14));

        // Mostrar la lista
        DefaultListModel<Estudiante> modelo = new DefaultListModel<>();
        lista.mostrar(modelo);
        System.out.println("Lista después de inserciones:");
        for (int i = 0; i < modelo.getSize(); i++) {
            System.out.println(modelo.getElementAt(i));
        }

        // Prueba del método buscar
        Nodo nodoBuscado = lista.buscar("002");
        if (nodoBuscado != null) {
            System.out.println("\nEstudiante encontrado: " + nodoBuscado.getValor());
        } else {
            System.out.println("\nEstudiante no encontrado.");
        }

        // Prueba del método eliminar
        boolean eliminado = lista.eliminar("003");
        if (eliminado) {
            System.out.println("\nEstudiante eliminado exitosamente.");
        } else {
            System.out.println("\nNo se pudo eliminar al estudiante.");
        }

        // Mostrar la lista después de las operaciones
        modelo.removeAllElements();
        lista.mostrar(modelo);
        System.out.println("\nLista después de buscar, eliminar e insertar:");
        for (int i = 0; i < modelo.getSize(); i++) {
            System.out.println(modelo.getElementAt(i));
        }

        // Pruebas de las nuevas funciones
        System.out.println("\nNúmero de estudiantes aprobados: " + lista.contarEstudiantesAprobados());
        System.out.println("Número de estudiantes desaprobados: " + lista.contarEstudiantesDesaprobados());
    }
}
