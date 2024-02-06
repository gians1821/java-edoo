package control;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.ArbolBinarioBusqueda;
import model.Empleado;
import model.Nodo;

public class Control {
    
    public static void insertar(ArbolBinarioBusqueda arbol, String codigo, String nombres, String apellidos, String sexo, String sueldo) {
        try {
            Empleado empleado = new Empleado(codigo, nombres, apellidos, sexo, Float.parseFloat(sueldo));
            arbol.insertar(empleado);    
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void modificar(ArbolBinarioBusqueda arbol, String codigo, String nombres, String apellidos, String sexo, String sueldo) {
        try {
            Empleado empleadoViejo = new Empleado(codigo);
            Empleado empleadoNuevo = new Empleado(codigo, nombres, apellidos, sexo, Float.parseFloat(sueldo));
            arbol.modificar(empleadoViejo, empleadoNuevo);    
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void eliminar(ArbolBinarioBusqueda arbol, String codigo, String nombres, String apellidos, String sexo, String sueldo) {
        try {
            Empleado empleado = new Empleado(codigo, nombres, apellidos, sexo, Float.parseFloat(sueldo));
            arbol.eliminar(empleado);    
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static Nodo consultar(ArbolBinarioBusqueda arbol, String codigo) {
        Empleado empleado = new Empleado(codigo);
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
