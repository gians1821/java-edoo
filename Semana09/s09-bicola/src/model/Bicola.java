package model;

public class Bicola<T> extends Cola {

    public Bicola() {
        super();
    }
    
    public void encolarFrente(T info) {
        Nodo nuevo = new Nodo(info);
        if (empty()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(primero);
            primero = nuevo;
        }
    }
    
    public void encolarFinal(T info) {
        encolar(info);
    }
    
    public T desencolarFrente() {
        return (T) desencolar();
    }
    
    public T desencolarFinal() {
        if (empty()) return null;
        if (primero == ultimo) return (T) desencolar();
        Nodo p = primero;
        Nodo aux;
        while (p.getSgte() != ultimo) {
            p = p.getSgte();
        }
        p.setSgte(null);
        aux = ultimo;
        ultimo = p;
        return (T) aux.getInfo();
    }
    
    public T frenteBicola() {
        return (T) frente();
    }
    
    public T finalBicola() {
        if (empty()) return null;
        return (T) ultimo.getInfo();
    }
    
}
