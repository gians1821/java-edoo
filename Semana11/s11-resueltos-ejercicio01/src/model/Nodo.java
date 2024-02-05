package model;

public class Nodo {
    
    private int dato;
    private Nodo izdo;
    private Nodo dcho;

    public Nodo(int dato) {
        this.dato = dato;
        izdo = dcho = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
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
    
    public boolean tieneHijos() {
        return izdo != null && dcho != null;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + "}";
    }
    
}
