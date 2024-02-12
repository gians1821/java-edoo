package model;

import java.util.ArrayList;
import java.util.Collections;

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
    
    public ArrayList<Integer> getVerticesAdyacentes() {
        ArrayList<Integer> destinos = new ArrayList<>();
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            Nodo nodo = listaAdyacencia.get(i);
            Arco arco = (Arco) nodo.getInfo();
            destinos.add(arco.getDestino());
        }
        return destinos;
    }
    
    public ArrayList<Arco> getArcos() {
        ArrayList<Arco> arcos = new ArrayList<>();
        for (int i = 0; i < listaAdyacencia.size(); i++) {
            Nodo nodo = listaAdyacencia.get(i);
            Arco arco = (Arco) nodo.getInfo();
            arcos.add(arco);
        }
        Collections.sort(arcos);
        return arcos;
    }

    public boolean existeArco(int destino) {
        for (Nodo nodo : listaAdyacencia) {
            Arco arco = (Arco) nodo.getInfo();
            if (destino == arco.getDestino()) return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Vertice{" + "nombre=" + nombre + ", numVertice=" + numVertice + '}';
    }   
    
}
