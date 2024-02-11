package model;

public class Vertice {
    
    String nombre;
    int numVertice;

    public Vertice(String nombre) {
        this.nombre = nombre;
        numVertice = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }
    
    public boolean equals(Vertice vertice) {
        return nombre.equals(vertice.getNombre());
    }

    @Override
    public String toString() {
        return "Vertice{" + "nombre=" + nombre + ", numVertice=" + numVertice + '}';
    }   
    
}
