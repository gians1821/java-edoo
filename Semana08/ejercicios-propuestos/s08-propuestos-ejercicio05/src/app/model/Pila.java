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
    
    public void invertir() {
        Pila<T> auxiliar1 = new Pila<>();
        Pila<T> auxiliar2 = new Pila<>();
        while (!empty()) {
            auxiliar1.push(pop());
        }
        while (!auxiliar1.empty()) {
            auxiliar2.push(auxiliar1.pop());
        }
        while (!auxiliar2.empty()) {
            push(auxiliar2.pop());
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
