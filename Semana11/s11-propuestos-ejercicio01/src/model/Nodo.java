package model;

public class Nodo {
    
    private Curso dato;
    private Nodo izdo;
    private Nodo dcho;

    public Nodo(Curso dato) {
        this.dato = dato;
        izdo = dcho = null;
    }

    public Curso getDato() {
        return dato;
    }

    public void setDato(Curso dato) {
        this.dato = dato;
    }

    public Nodo getIzdo() {
        return izdo;
    }

    public void setIzdo(Nodo izdo) {
        this.izdo = izdo;
    }

    public Nodo getDcho() {
        return dcho;
    }

    public void setDcho(Nodo dcho) {
        this.dcho = dcho;
    }
    
    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + "}";
    }

}
