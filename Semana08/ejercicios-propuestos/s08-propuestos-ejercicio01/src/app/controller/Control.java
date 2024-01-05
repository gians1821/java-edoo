package app.controller;

import app.model.Pila;
import javax.swing.DefaultListModel;

public class Control {
    
    public static boolean push(Pila pila, int valor) {
        return pila.push(valor);
    }
    
    public static int pop(Pila pila) {
        return pila.pop();
    }
    
    public static int top(Pila pila) {
        return pila.top();
    }
    
    public static void clear(Pila pila) {
        pila.clear();
    }
    
    public static boolean empty(Pila pila) {
        return pila.empty();
    }
    
    public static void mostrar(Pila pila, DefaultListModel modelo) {
        pila.mostrar(modelo);
    }
    
}
