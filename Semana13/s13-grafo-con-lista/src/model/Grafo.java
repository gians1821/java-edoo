package model;

import java.util.ArrayList;

public class Grafo {
    
    private static final int CLAVE = 1;

    private int numeroVertices;
    private Vertice[] tablaAdyacencia;
    public static int maxVertices = 20;
    
    
    public Grafo() {
        this(maxVertices);
    }

    public Grafo(int mx) {
        tablaAdyacencia = new Vertice[mx];
        numeroVertices = 0;
        maxVertices = mx;
    }
    
    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    public Vertice[] getVertices() {
        return tablaAdyacencia;
    }

    public void añadirVertice(String nombre) {
        boolean exists = numeroVertice(nombre) >= 0;
        if (!exists) {
            try {
                Vertice vertice = new Vertice(nombre);
                vertice.setNumVertice(numeroVertices);
                tablaAdyacencia[numeroVertices++] = vertice;
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
            encontrado = tablaAdyacencia[i].equals(vertice);
            if (!encontrado) i++ ;
        }
        return (i < numeroVertices) ? i : -1 ;
    }
    
    public String nombreVertice(int numeroVertice) {
        return tablaAdyacencia[numeroVertice].getNombre();
    }
    
    public void nuevoArco(String a, String b) throws Exception {
        int va, vb;
        va = numeroVertice(a);
        vb = numeroVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        tablaAdyacencia[va].añadirArco(new Arco(vb, 1));
    }
    
    public boolean sonAdyacentes(String a, String b) throws Exception {
        int va, vb;
        va = numeroVertice(a);
        vb = numeroVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        return tablaAdyacencia[va].getListaAdyacencia().contains(new Nodo(new Arco(vb, 1)));
    }
    
    public boolean sonAdyacentes(int a, int b) throws Exception {
        if (a < 0 || b < 0) throw new Exception("Vértice no existe");
        return tablaAdyacencia[a].getListaAdyacencia().contains(new Nodo(new Arco(b, 1)));
    }
    
    public int getGradoEntrada(Vertice vertice) {
        int contador = 0;
        for (int i = 0; i < numeroVertices; i++) {
            try {
                for (Nodo nodo : tablaAdyacencia[i].getListaAdyacencia()) {
                    Arco arco = (Arco) nodo.getInfo();
                    if (arco.getDestino() == this.numeroVertice(vertice.getNombre())) {
                        contador++;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return contador;
    }
    
    public int getGradoSalida(Vertice vertice) {
        Vertice verticeEncontrado = tablaAdyacencia[numeroVertice(vertice.getNombre())];
        return verticeEncontrado.getListaAdyacencia().size();
    }
    
    public ArrayList<Vertice> getAdyacentes(Vertice vertice) {
        ArrayList<Vertice> adyacentes = new ArrayList<>();
        Vertice verticeEncontrado = tablaAdyacencia[numeroVertice(vertice.getNombre())];
        ArrayList<Nodo> nodosAdyacentes = verticeEncontrado.getListaAdyacencia();
        for (Nodo nodo : nodosAdyacentes) {
            Arco arco = (Arco) nodo.getInfo();
            adyacentes.add(tablaAdyacencia[arco.getDestino()]);
        }
        return adyacentes;
    }
    
    public static int[] recorrerAnchura(Grafo grafo, String vertice) throws Exception {
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
            System.out.println("Vértice " + grafo.tablaAdyacencia[w] + "visitado");
            // inserta en la cola los adyacentes de w no marcados
            for (int u = 0; u < grafo.getNumeroVertices(); u++) {
                if ((grafo.sonAdyacentes(w, u)) && (m[u] == CLAVE)) {
                    // se marca vertice u con número de arcos hasta el
                    m[u] = m[w] + 1;
                    cola.encolar(u);
                }
            }
        }
        return m;
    }
    
    public static int[] recorrerProfundidad(Grafo grafo, String vertice) throws Exception {
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
            System.out.println("Vértice " + grafo.tablaAdyacencia[w] + "visitado");
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
