package model;

import java.util.ArrayList;

public class ArbolBinarioBusqueda {
    
    private Nodo raiz;

    public ArbolBinarioBusqueda(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }
    
    public boolean esVacio() {
        return raiz == null;
    }
    
    public void insertar(int dato) {
        raiz = insertar(raiz, dato);
    }
    
    private Nodo insertar(Nodo nodo, int dato) {
        if (nodo == null) {
            nodo = new Nodo(dato);
        } else if (dato < nodo.getDato()) {
            nodo.setIzdo(insertar(nodo.getIzdo(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDcho(insertar(nodo.getDcho(), dato));
        }
        return nodo;
    }
    
    public Nodo buscar(int dato) {
        return buscar(raiz, dato);
    }
    
    private Nodo buscar(Nodo nodo, int dato) {
        if (nodo == null) return null;
        else if (dato < nodo.getDato()) return buscar(nodo.getIzdo(), dato);
        else if (dato > nodo.getDato()) return buscar(nodo.getDcho(), dato);
        else return nodo;
    }
    
    public void eliminar(int dato) {
        raiz = eliminar(raiz, null, dato);
    }
    
    private Nodo eliminar(Nodo nodoActual, Nodo nodoPadre, int dato) {
        if (nodoActual == null) return null;
        else if (dato < nodoActual.getDato())
            nodoActual.setIzdo(eliminar(nodoActual.getIzdo(), nodoActual, dato));
        else if (dato > nodoActual.getDato())
            nodoActual.setDcho(eliminar(nodoActual.getDcho(), nodoActual, dato));
        else {
            // AQUÍ SE ENCUENTRA EL NODO A ELIMINAR
            if (!nodoActual.tieneHijos()) {                 // 0 hijos
                if (nodoActual.getIzdo() == null && nodoActual.getDcho() == null) {
                    return null;
                } else {                                    // 1 hijo al menos
                    Nodo subArbol;
                    // Hallamos subarbol
                    if (nodoActual.getIzdo() != null) subArbol = nodoActual.getIzdo();
                    else subArbol = nodoActual.getDcho();
                    // Lo enlazamos con el nodo padre
                    return subArbol;
                }
            } else if (nodoActual.tieneHijos()) {           // 2 hijos
                Nodo sucesor = sucesor(nodoActual.getDcho());
                nodoActual.setDato(sucesor.getDato());
                nodoActual.setDcho(eliminar(nodoActual.getDcho(), nodoActual, sucesor.getDato()));
            }
        }
        return nodoActual;
    }
    
    private Nodo sucesor(Nodo nodo) {
        Nodo sucesor = nodo;
        while (sucesor.getIzdo() != null) {
            sucesor = sucesor.getIzdo();
        }
        return sucesor;
    }

    public void preOrden() {
        preOrden(raiz);
    }
    
    private void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.println(nodo);
            preOrden(nodo.getIzdo());
            preOrden(nodo.getDcho());
        }
    }
    
}
