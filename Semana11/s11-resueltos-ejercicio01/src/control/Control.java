package control;

import javax.swing.DefaultListModel;
import model.ArbolBinarioBusqueda;

public class Control {
    
    public static void insertar(ArbolBinarioBusqueda arbol, String dato) {
        int intDato = Integer.parseInt(dato);
        arbol.insertar(intDato);
    }
    
}
