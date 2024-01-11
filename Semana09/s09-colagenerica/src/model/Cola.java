package model;

import javax.swing.DefaultListModel;

public class Cola<T> {
    
    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Cola() {
        primero = null;
        ultimo = null;
    }
    
    public boolean empty() {
        return primero == null;
    }

    public void encolar(T info) {
        Nodo<T> nuevo = new Nodo(info);
        if (empty()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
    }
    
    public T desencolar() {
        if (empty()) return null;
        Nodo<T> nodo = primero;
        if (nodo == ultimo) {
            primero = null;
            ultimo = null;
        } else {
            primero = primero.getSgte();
        }
        return nodo.getInfo();
    }
    
    public T frente() {
        if (empty()) return null;
        return primero.getInfo();
    }
    
    public void clear() {
        while (primero != null) {
            primero = primero.getSgte();
        }
        ultimo = null;
    }
    
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        Nodo p = primero;
        while (p != null) {
            modelo.addElement(p);
            p = p.getSgte();
        }
    }
    
    
}
