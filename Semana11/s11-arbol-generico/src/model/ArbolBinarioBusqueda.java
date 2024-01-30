package model;

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
    
    public Nodo buscar(Nodo nodo, int dato) {
        if (nodo == null) return null;
        else if (dato < nodo.getDato()) return buscar(nodo.getIzdo(), dato);
        else if (dato > nodo.getDato()) return buscar(nodo.getDcho(), dato);
        else return nodo;
    }

}
