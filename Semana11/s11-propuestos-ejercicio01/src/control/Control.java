package control;

import javax.swing.table.DefaultTableModel;
import model.ArbolBinarioBusqueda;
import model.Curso;
import model.Nodo;

public class Control {
    
    public static void insertar(ArbolBinarioBusqueda arbol, String codigo, String nombre, String ciclo, String creditos, String carrera) {
        try {
            Curso curso = new Curso(codigo, nombre, ciclo, Integer.parseInt(creditos), carrera);
            arbol.insertar(curso);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void modificar(ArbolBinarioBusqueda arbol, String codigo, String nombre, String ciclo, String creditos, String carrera) {
        try {
            Curso cursoViejo = new Curso(codigo);
            Curso cursoNuevo = new Curso(codigo, nombre, ciclo, Integer.parseInt(creditos), carrera);
            arbol.modificar(cursoViejo, cursoNuevo);    
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void eliminar(ArbolBinarioBusqueda arbol, String codigo, String nombre, String ciclo, String creditos, String carrera) {
        try {
            Curso curso = new Curso(codigo, nombre, ciclo, Integer.parseInt(creditos), carrera);
            arbol.eliminar(curso);    
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static Nodo consultar(ArbolBinarioBusqueda arbol, String codigo) {
        Curso empleado = new Curso(codigo);
        return arbol.buscar(empleado);
    }
    
    public static void mostrarPre(ArbolBinarioBusqueda arbol, DefaultTableModel modelo) {
        arbol.preOrden(modelo);
    }

    public static void mostrarEn(ArbolBinarioBusqueda arbol, DefaultTableModel modelo) {
        arbol.enOrden(modelo);
    }

    public static void mostrarPos(ArbolBinarioBusqueda arbol, DefaultTableModel modelo) {
        arbol.postOrden(modelo);
    }
    
}
