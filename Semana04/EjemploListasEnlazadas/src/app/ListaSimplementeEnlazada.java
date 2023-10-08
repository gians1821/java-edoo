package app;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class ListaSimplementeEnlazada {
    
    private Nodo L;

    public ListaSimplementeEnlazada() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }
    
    public Nodo getL() {
        return L;
    }
    
    public void insertarAlInicio(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }
    
    public void insertarAlFinal(int x) {
        Nodo nuevo = new Nodo(x);
        if (L == null) {
            L = nuevo;
        } else {
            Nodo p = L;
            while (p.getSgte() != null)
                p = p.getSgte();
            p.setSgte(nuevo);
        }
    }
    
    public int contar() {
        int c = 0;
        Nodo p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }
    
    public Nodo buscar(int dato) {
        Nodo p = L;
        while (p != null) {
            if (p.getInfo() == dato)
                return p;
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean eliminar(int dato) {
        if (L.getInfo() == dato) {
            L = L.getSgte();
            return true;
        } else {
            Nodo ant, p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getInfo() != dato) {
                ant = p;
                p = p.getSgte();
            }
            if (p != null) {
                ant.setSgte(p.getSgte());
                return true;
            } else return false;
        }
    }
    
    public void ordenar() {
        Nodo p, q;
        int aux;
        p = L;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getInfo() > q.getInfo()) {
                    aux = p.getInfo();
                    p.setInfo(q.getInfo());
                    q.setInfo(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
    
    public void mostrar(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getInfo());
            p = p.getSgte();
        }
    }
    
}
