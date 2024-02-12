package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Grafo {
    
    private static final int CLAVE = 5;

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
    
    public Vertice getVertice(int numero) {
        return tablaAdyacencia[numero];
    }
    
    public void nuevoArco(String a, String b) throws Exception {
        int va, vb;
        va = numeroVertice(a);
        vb = numeroVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        if (!tablaAdyacencia[va].existeArco(vb))
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
        ArrayList<Arco> arcos = verticeEncontrado.getArcos();
        for (Arco a : arcos) {
            adyacentes.add(tablaAdyacencia[a.getDestino()]);
        }
        return adyacentes;
    }
    
    public static ArrayList<Vertice> recorrerAnchura(Grafo grafo, String vertice) throws Exception {
        int v, w;
        Cola cola = new Cola();
        int[] m;
        ArrayList<Vertice> recorrido = new ArrayList<>();
        m = new int[grafo.getNumeroVertices()];
        // inicializa los vértices como no marcados
        v = grafo.numeroVertice(vertice);
        if (v < 0) throw new Exception("Vértice origen no existe");
        for (int i = 0; i < grafo.getNumeroVertices(); i++) {
            m[i] = CLAVE;
        }
        m[v] = 1; // vértice origen queda marcado
        cola.encolar(v);
        while (!cola.empty()) {
            Integer cw;
            cw = (Integer) cola.desencolar();
            if (m[cw] == 1 && !recorrido.contains(grafo.getVertice(cw))) 
                recorrido.add(grafo.getVertice(cw));
            w = cw;
            // inserta en la pila los adyacentes de w no marcados
            // recorre la lista con un iterador
            ArrayList<Arco> arcos = grafo.tablaAdyacencia[w].getArcos();
            Arco ck;
            for (Arco a : arcos) {
                int k;
                ck = a;
                if (ck != null) {
                    k = ck.getDestino(); // vértice adyacente
                    if (m[k] == CLAVE) {
                        cola.encolar(k);
                        m[k] = 1;
                        // vértice queda marcado
                    }
                }
            }
        }
        return recorrido;
    }
    
    public static ArrayList<Vertice> recorrerProfundidad(Grafo grafo, String vertice) throws Exception {
        int v, w;
        Pila pila = new Pila();
        int[] m;
        ArrayList<Vertice> recorrido = new ArrayList<>();
        m = new int[grafo.getNumeroVertices()];
        // inicializa los vértices como no marcados
        v = grafo.numeroVertice(vertice);
        if (v < 0) throw new Exception("Vértice origen no existe");
        for (int i = 0; i < grafo.getNumeroVertices(); i++) {
            m[i] = CLAVE;
        }
        m[v] = 1; // vértice origen queda marcado
        pila.push(v);
        while (!pila.empty()) {
            Integer cw;
            cw = (Integer) pila.pop();
            if (m[cw] == 1 && !recorrido.contains(grafo.getVertice(cw))) 
                recorrido.add(grafo.getVertice(cw));
            w = cw;
            // inserta en la pila los adyacentes de w no marcados
            // recorre la lista con un iterador
            ArrayList<Arco> arcos = grafo.tablaAdyacencia[w].getArcos();
            Arco ck;
            for (Arco a : arcos) {
                int k;
                ck = a;
                if (ck != null) {
                    k = ck.getDestino(); // vértice adyacente
                    if (m[k] == CLAVE) {
                        pila.push(k);
                        m[k] = 1;
                        // vértice queda marcado
                    }
                }
            }
        }
        return recorrido;
    }
    
    
    
}
