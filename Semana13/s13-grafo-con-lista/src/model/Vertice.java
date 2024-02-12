package model;

import java.util.ArrayList;

public class Vertice {
    
    private String nombre;
    private int numVertice;
    private ArrayList<Nodo> listaAdyacencia;

    public Vertice(String nombre) {
        this.nombre = nombre;
        numVertice = -1;
        listaAdyacencia = new ArrayList<>();
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

    public ArrayList<Nodo> getListaAdyacencia() {
        return listaAdyacencia;
    }
    
    public void añadirArco(Arco arco) {
        listaAdyacencia.add(new Nodo(arco));
    }
    
    public boolean esAdyacente(Arco arco) {
        return listaAdyacencia.contains(new Nodo(arco));
    }

    @Override
    public String toString() {
        return "Vertice{" + "nombre=" + nombre + ", numVertice=" + numVertice + '}';
    }   
    
}
