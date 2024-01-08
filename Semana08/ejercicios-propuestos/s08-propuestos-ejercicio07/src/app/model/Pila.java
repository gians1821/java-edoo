package app.model;

import javax.swing.DefaultListModel;

public class Pila<T> {
    
    private Nodo<T> p;
    
    public Pila() {
        p = null;
    }

    public void push(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSgte(p);
        p = nuevo;
    }
    
    public T pop() {
        T cima = p.getInfo();
        p = p.getSgte();
        return cima;
    }
    
    public T top() {
        return p.getInfo();
    }
    
    public boolean empty() {
        return p == null;
    }
    
    public void clear() {
        while (p != null) {
            Nodo<T> temp = p;
            p = p.getSgte();
            temp = null; // Liberar el nodo
        }
    }
    
    public void mostrar(DefaultListModel modelo) {
        Nodo actual = p;
        modelo.removeAllElements();
        while (actual != null) {
            modelo.addElement(actual.getInfo());
            actual = actual.getSgte();
        }
    }
    
}
