package data;

import javax.swing.DefaultListModel;

public class ListaEnlazadaCircularDoble {

    private Nodo primero;
    private Nodo ultimo;

    public ListaEnlazadaCircularDoble() {
        primero = null;
        ultimo = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public boolean esVacia() {
        return primero == null;
    }
    
    public int contar() {
        if (esVacia()) return 0;
        int contador = 0;
        Nodo p = ultimo.getSgte();
        do {
            contador++;
            p = p.getSgte();
        } while (p != ultimo.getSgte());
        return contador;
    }
    
    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (esVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            primero.setSgte(primero);
            ultimo.setAnt(ultimo);
        } else {
            nuevoNodo.setAnt(ultimo);
            nuevoNodo.setSgte(primero);
            ultimo.setSgte(nuevoNodo);
            primero.setAnt(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public Nodo buscar(int valor) {
        if (esVacia()) return null;
        Nodo p = ultimo.getSgte();
        do {
            if (p.getValor() == valor) return p;
            p = p.getSgte();
        } while (p != primero);
        return null;
    }
    
    public void modificar(int valorBuscado, int nuevoValor) {
        Nodo nodoBuscado = buscar(valorBuscado);
        if (nodoBuscado != null) nodoBuscado.setValor(nuevoValor);
    }
    
    public boolean eliminar(int valor) {
        if (esVacia()) return false;
        Nodo nodoBuscado = buscar(valor);
        if (nodoBuscado == null) return false;
        Nodo p = ultimo.getSgte();
        if (contar() == 1) {
            ultimo = null;
            primero = null;
        } else {
            while (p.getSgte() != nodoBuscado) {
                p = p.getSgte();
            }
            if (p.getSgte() == ultimo) ultimo = p;
            if (p.getSgte() == primero) primero = primero.getSgte();
            p.setSgte(p.getSgte().getSgte());
            primero.setAnt(p);
        }
        return true;
    }
    
    public boolean mostrar(DefaultListModel modelo) {
        if (esVacia()) return false;
        Nodo p = ultimo.getSgte();
        modelo.removeAllElements();
        do {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        } while (p != primero);
        return true;
    }
    
}
