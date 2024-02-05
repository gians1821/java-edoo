package control;

import javax.swing.DefaultListModel;
import model.ArbolBinarioBusqueda;
import model.Nodo;

public class Control {
    
    public static void insertar(ArbolBinarioBusqueda arbol, String dato) {
        try {
            int intDato = Integer.parseInt(dato);
            arbol.insertar(intDato);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
    }

    public static void buscar(ArbolBinarioBusqueda arbol, String dato) {
        try {
            int intDato = Integer.parseInt(dato);
            Nodo nodo = arbol.buscar(intDato);
            if (nodo != null)
                MessageController.showInfoMessage("El dato encontrado es: " + nodo);
            else
                MessageController.showInfoMessage("No se ha encontrado el dato.");            
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public static void eliminar(ArbolBinarioBusqueda arbol, String dato) {
        try {
            int intDato = Integer.parseInt(dato);
            arbol.eliminar(intDato);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void mostrar(ArbolBinarioBusqueda arbol, 
            DefaultListModel modelo1, DefaultListModel modelo2, DefaultListModel modelo3) {
        arbol.preOrden(modelo1);
        arbol.enOrden(modelo2);
        arbol.postOrden(modelo3);
    }
    
}
