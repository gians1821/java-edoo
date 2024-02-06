package model;

public class Nodo {
    
    private Empleado dato;
    private Nodo izdo;
    private Nodo dcho;

    public Nodo(Empleado dato) {
        this.dato = dato;
        izdo = dcho = null;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
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
