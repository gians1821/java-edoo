package control;

import javax.swing.DefaultListModel;
import model.Cola;

public class Control {
    
    public static void encolar(Cola cola, String txtEntero) {
        if (txtEntero.compareTo("") == 0) return;
        try {
            cola.encolar(Integer.valueOf(txtEntero));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void desencolar(Cola cola) {
        Integer entero = cola.desencolar();
        if (entero != null) MessageController.showInfoMessage("Numero extraído: " + entero);
    }
    
    public static void empty(Cola cola) {
        if (cola.isEmpty()) MessageController.showInfoMessage("La cola está vacía");
        else MessageController.showInfoMessage("La cola NO está vacía");
    }
    
    public static void clear(Cola cola) {
        cola.clear();
        MessageController.showInfoMessage("La cola ha sido despejada");
    }
    
    public static void frente(Cola cola) {
        Integer entero = cola.frente();
        if (entero != null) MessageController.showInfoMessage("Numero en frente: " + entero);
    }
    
    public static void mostrar(Cola cola, DefaultListModel modelo) {
        cola.mostrar(modelo);
    }
    
}
