package control;

import javax.swing.DefaultListModel;
import model.Cola;

public class Control {
    
    public static void encolar(Cola<Integer> cola, String txtInfo) {
        if (txtInfo.compareTo("") == 0) return;
        try {
            Integer entero = Integer.valueOf(txtInfo);
            cola.encolar(entero);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void desencolar(Cola<Integer> cola) {
        Integer entero = cola.desencolar();
        if (entero == null) return;
        MessageController.showInfoMessage(entero + " ha sido retirado");
    }
    
    public static void empty(Cola<Integer> cola) {
        if (cola.empty()) MessageController.showInfoMessage("La cola está vacía");
        else MessageController.showInfoMessage("La cola no está vacía");
    }
    
    public static void clear(Cola<Integer> cola) {
        cola.clear();
    }
    
    public static void frente(Cola<Integer> cola) {
        Integer entero = cola.frente();
        if (entero != null) MessageController.showInfoMessage(entero + " está al frente");
        else MessageController.showInfoMessage("No hay valor al frente");
    }
    
    public static void mostrar(Cola<Integer> cola, DefaultListModel modelo) {
        cola.mostrar(modelo);
    }
    
}
