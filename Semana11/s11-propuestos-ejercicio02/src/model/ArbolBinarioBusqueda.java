package model;

import javax.swing.DefaultListModel;

public class ArbolBinarioBusqueda {
    
    private Nodo raiz;
    private int sumatoria = 0;

    public ArbolBinarioBusqueda() {
    }

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
    
    private Nodo buscar(Nodo nodo, int dato) {
        if (nodo == null) return null;
        else if (dato < nodo.getDato()) return buscar(nodo.getIzdo(), dato);
        else if (dato > nodo.getDato()) return buscar(nodo.getDcho(), dato);
        else return nodo;
    }
    
    public void preOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        preOrden(raiz, modelo);
    }
    
    private void preOrden(Nodo nodo, DefaultListModel modelo) {
        if (nodo != null) {
            modelo.addElement(nodo.getDato());
            preOrden(nodo.getIzdo(), modelo);
            preOrden(nodo.getDcho(), modelo);
        }
    }
    
    public void enOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        enOrden(raiz, modelo);
    }
    
    private void enOrden(Nodo nodo, DefaultListModel modelo) {
        if (nodo != null) {
            enOrden(nodo.getIzdo(), modelo);
            modelo.addElement(nodo.getDato());
            enOrden(nodo.getDcho(), modelo);
        }
    }
    
    public void postOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        postOrden(raiz, modelo);
    }
    
    private void postOrden(Nodo nodo, DefaultListModel modelo) {
        if (nodo != null) {
            postOrden(nodo.getIzdo(), modelo);
            postOrden(nodo.getDcho(), modelo);
            modelo.addElement(nodo.getDato());
        }
    }
    
    public int buscarMax() {
        return buscarMax(raiz);
    }
    
    private int buscarMax(Nodo nodo) {
        int x;
        if (nodo.getDcho() == null) x = nodo.getDato();
        else x = buscarMax(nodo.getDcho());
        return x;
    }
    
    public int buscarMin() {
        return buscarMin(raiz);
    }
    
    private int buscarMin(Nodo nodo) {
        int x;
        if (nodo.getIzdo() == null) x = nodo.getDato();
        else x = buscarMin(nodo.getIzdo());
        return x;
    }
    
    public int contar() {
        return contar(raiz);
    }
    
    private int contar(Nodo nodo) {
        if (nodo == null) return 0;
        else return 1 + contar(nodo.getIzdo()) + contar(nodo.getDcho());
    }
    
    public void eliminarMin() {
        raiz = eliminarMin(raiz);
    }
    
    private Nodo eliminarMin(Nodo nodo) {
        if (nodo.getIzdo() == null) nodo = nodo.getDcho();
        else nodo.setIzdo(eliminarMin(nodo.getIzdo()));
        return nodo;
    }
    
    public void eliminar(int dato) {
        raiz = eliminar(raiz, dato);
    }
    
    private Nodo eliminar(Nodo nodo, int dato) {
        if (nodo == null) return null;
        else if (dato < nodo.getDato()) nodo.setIzdo(eliminar(nodo.getIzdo(), dato));
        else if (dato > nodo.getDato()) nodo.setDcho(eliminar(nodo.getDcho(), dato));
        else if (nodo.getIzdo() == null) nodo = nodo.getDcho();
        else if (nodo.getDcho() == null) nodo = nodo.getIzdo();
        else {
            nodo.setDato(buscarMin(nodo.getDcho()));
            nodo.setDcho(eliminarMin(nodo.getDcho()));
        }
        return nodo;
    }
    
    public int alturaArbol() {
        return alturaArbol(raiz);
    }
    
    private int alturaArbol(Nodo nodo) {
        int alturaIzdo, alturaDcho;
        if (nodo == null) return -1;
        else {
            alturaIzdo = 1 + alturaArbol(nodo.getIzdo());
            alturaDcho = 1 + alturaArbol(nodo.getDcho());
            if (alturaIzdo > alturaDcho) {
                return alturaIzdo;
            } else {
                return alturaDcho;
            }
        }
    }
    
    public int sumarTodo() {
        sumatoria = 0;
        sumarTodo(raiz);
        return sumatoria;
    }
    
    private void sumarTodo(Nodo nodo) {
        if (nodo != null) {
            sumarTodo(nodo.getIzdo());
            sumatoria += nodo.getDato();
            sumarTodo(nodo.getDcho());
        }
    }
    
    public int contarHojas() {
        return contarHojas(raiz);
    }
    
    private int contarHojas(Nodo nodo) {
        if (nodo == null) return 0;
        else if (nodo.getIzdo() == null && nodo.getDcho() == null)
            return 1 + contarHojas(nodo.getIzdo()) + contarHojas(nodo.getDcho());            
        else return contarHojas(nodo.getIzdo()) + contarHojas(nodo.getDcho());
    }
    
    public int getProfundidad(int dato) {
        return getProfundidad(raiz, buscar(dato), 0);
    }
    
    public int getProfundidad(Nodo nodo, Nodo buscado, int profundidadActual) {
        if (nodo == null) {
            return -1; 
        } else if (nodo.getDato() == buscado.getDato()) {
            return profundidadActual;
        } else if (buscado.getDato() < nodo.getDato()) {
            return getProfundidad(nodo.getIzdo(), buscado, profundidadActual + 1);
        } else {
            return getProfundidad(nodo.getDcho(), buscado, profundidadActual + 1);
        }
    }
    
    public String resultados() {
        return "La sumatoria es: " + sumarTodo() + "\n"
                + "La cantidad de hojas es: " + contarHojas();
    }
    
}
