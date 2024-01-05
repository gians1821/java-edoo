package app.controller;

import app.model.Pila;
import javax.swing.DefaultListModel;

public class Control {
    
    public static void push(Pila pila, String valor) {
        if (valor.compareTo("") == 0) return;
        int x = Integer.parseInt(valor);
        pila.push(x);
        MessageController.showInfoMessage("Valor insertado: " + x);
    }
    
    public static void pop(Pila pila) {
        MessageController.showInfoMessage("Valor eliminado: " + pila.pop());
    }
    
    public static void top(Pila pila) {
        MessageController.showInfoMessage("Valor de la cima: " + pila.top());
    }
    
    public static void clear(Pila pila) {
        pila.clear();
        MessageController.showWarningMessage("PILA LIMPIADA");
    }
    
    public static void empty(Pila pila) {
        if (pila.empty()) MessageController.showInfoMessage("La pila ESTÁ VACÍA");
        else MessageController.showInfoMessage("La pila NO ESTÁ VACÍA");
    }
    
    public static void remplazarCima(Pila pila1, Pila pila2) {
        pila1.reemplazarCima(pila2);
    }
    
    public static void mostrar(Pila pila, DefaultListModel modelo) {
        pila.mostrar(modelo);
    }
    
}
