package control;

import javax.swing.DefaultListModel;
import model.Bicola;

public class Control {
    
    public static void encolarFrente(Bicola<Integer> bicola, String txtEntero) {
        if (txtEntero.compareTo("") == 0) return;
        try {
            bicola.encolarFrente(Integer.valueOf(txtEntero));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void encolarFinal(Bicola<Integer> bicola, String txtEntero) {
        if (txtEntero.compareTo("") == 0) return;
        try {
            bicola.encolarFinal(Integer.valueOf(txtEntero));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
    
    public static void desencolarFrente(Bicola<Integer> bicola) {
        Integer entero = bicola.desencolarFrente();
        if (entero != null) MessageController.showInfoMessage("Numero extraído: " + entero);
    }
    
    public static void desencolarFinal(Bicola<Integer> bicola) {
        Integer entero = bicola.desencolarFinal();
        if (entero != null) MessageController.showInfoMessage("Numero extraído: " + entero);
    }
    
    public static void empty(Bicola<Integer> bicola) {
        if (bicola.empty()) MessageController.showInfoMessage("La cola está vacía");
        else MessageController.showInfoMessage("La cola NO está vacía");
    }
    
    public static void clear(Bicola<Integer> bicola) {
        bicola.clear();
        MessageController.showInfoMessage("La cola ha sido despejada");
    }
    
    public static void frenteBicola(Bicola<Integer> bicola) {
        Integer entero = bicola.frenteBicola();
        if (entero != null) MessageController.showInfoMessage("Numero en frente: " + entero);
    }
    
    public static void finalBicola(Bicola<Integer> bicola) {
        Integer entero = bicola.finalBicola();
        if (entero != null) MessageController.showInfoMessage("Numero al final: " + entero);
    }
    
    public static void mostrar(Bicola<Integer> cola, DefaultListModel modelo) {
        cola.mostrar(modelo);
    }
    
}
