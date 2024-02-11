package model;

import java.util.ArrayList;

public class GrafoMatriz {
    
    private int numeroVertices;
    public static final int MAX_VERTICES = 20;
    private Vertice[] vertices;
    private int[][] matrizAdyacencia;
    private static final int CLAVE = 1;

    public GrafoMatriz() {
        this(MAX_VERTICES);
    }

    public GrafoMatriz(int mx) {
        matrizAdyacencia = new int [mx][mx];
        vertices = new Vertice[mx];
        for (int i = 0; i < mx; i++)
            for (int j = 0; j < mx; j++)
                matrizAdyacencia[i][j] = 0;
        numeroVertices = 0;
    }
    
    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }

    public void añadirVertice(String nombre) {
        boolean exists = numeroVertice(nombre) >= 0;
        if (!exists) {
            try {
                Vertice vertice = new Vertice(nombre);
                vertice.setNumVertice(numeroVertices);
                vertices[numeroVertices++] = vertice;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public int numeroVertice(String nombre) {
        Vertice vertice = new Vertice(nombre);
        boolean encontrado = false;
        int i = 0;
        for (; (i < numeroVertices) && !encontrado;) {
            encontrado = vertices[i].equals(vertice);
            if (!encontrado) i++ ;
        }
        return (i < numeroVertices) ? i : -1 ;
    }
    
    public void nuevoArco(String a, String b) throws Exception {
        int va, vb;
        va = numeroVertice(a);
        vb = numeroVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        matrizAdyacencia[va][vb] = 1;
    }
    
    public boolean sonAdyacentes(String a, String b) throws Exception {
        int va, vb;
        va = numeroVertice(a);
        vb = numeroVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        return matrizAdyacencia[va][vb] == 1;
    }
    
    public int getGradoEntrada(Vertice vertice) {
        int contador = 0;
        for (int i = 0; i < numeroVertices; i++) {
            try {
                if (sonAdyacentes(vertices[i].getNombre(), vertice.getNombre())) {
                    contador++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return contador;
    }
    
    public int getGradoSalida(Vertice vertice) {
        int contador = 0;
        for (int i = 0; i < numeroVertices; i++) {
            try {
                if (sonAdyacentes(vertice.getNombre(), vertices[i].getNombre()))
                    contador++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return contador;
    }
    
    public ArrayList<Vertice> getAdyacentes(Vertice vertice) {
        ArrayList<Vertice> adyacentes = new ArrayList<>();
        for (int i = 0; i < numeroVertices; i++) {
            try {
                if (sonAdyacentes(vertice.getNombre(), vertices[i].getNombre()))
                    adyacentes.add(vertices[i]);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return adyacentes;
    }
    
    public static int[] recorrerAnchura(GrafoMatriz grafo, String vertice) throws Exception {
        int w, v;
        int[] m;
        v = grafo.numeroVertice(vertice);
        if (v < 0)
            throw new Exception("Vértice origen no existe");
        Cola cola = new Cola();
        m = new int[grafo.getNumeroVertices()];
        // inicializa los vértices como no marcados
        for (int i = 0; i < grafo.getNumeroVertices(); i++) {
            m[i] = CLAVE;
        }
        m[v] = 0; // vértice origen queda marcado
        cola.encolar(v);
        while (!cola.empty()) {
            Integer cw;
            cw = (Integer) cola.desencolar();
            w = cw;
            System.out.println("Vértice " + grafo.vertices[w] + "visitado");
            // inserta en la cola los adyacentes de w no marcados
            for (int u = 0; u < grafo.getNumeroVertices(); u++) {
                if ((grafo.matrizAdyacencia[w][u] == 1) && (m[u] == CLAVE)) {
                    // se marca vertice u con número de arcos hasta el
                    m[u] = m[w] + 1;
                    cola.encolar(u);
                }
            }
        }
        return m;
    }
    
    public static int[] recorrerProfundidad(GrafoMatriz grafo, String vertice) throws Exception {
        int w, v;
        int[] m;
        v = grafo.numeroVertice(vertice);
        if (v < 0)
            throw new Exception("Vértice origen no existe");
        Pila pila = new Pila();
        m = new int[grafo.getNumeroVertices()];
        // inicializa los vértices como no marcados
        for (int i = 0; i < grafo.getNumeroVertices(); i++) {
            m[i] = CLAVE;
        }
        m[v] = 0; // vértice origen queda marcado
        pila.push(v);
        while (!pila.empty()) {
            Integer cw;
            cw = (Integer) pila.pop();
            w = cw;
            System.out.println("Vértice " + grafo.vertices[w] + "visitado");
            for (int u = 0; u < grafo.getNumeroVertices(); u++) {
                if ((grafo.matrizAdyacencia[w][u] == 1) && (m[u] == CLAVE)) {
                    m[u] = m[w] + 1;
                    pila.push(u);
                }
            }
        }
        return m;
    }
    
    
    
}
