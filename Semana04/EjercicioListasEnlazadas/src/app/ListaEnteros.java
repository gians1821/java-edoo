package app;

import javax.swing.DefaultListModel;

public class ListaEnteros {
    
    private Entero L;

    public ListaEnteros() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }
    
    public Entero getL() {
        return L;
    }
    
    public void insertarAlInicio(int x) {
        Entero nuevo = new Entero(x);
        nuevo.setSgte(L);
        L = nuevo;
    }
    
    public void insertarAlFinal(int x) {
        Entero nuevo = new Entero(x);
        if (L == null) {
            L = nuevo;
        } else {
            Entero p = L;
            while (p.getSgte() != null)
                p = p.getSgte();
            p.setSgte(nuevo);
        }
    }
    
    public int contar() {
        int c = 0;
        Entero p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }
    
    public Entero buscar(int dato) {
        Entero p = L;
        while (p != null) {
            if (p.getEntero() == dato)
                return p;
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean eliminar(int dato) {
        if (L.getEntero() == dato) {
            L = L.getSgte();
            return true;
        } else {
            Entero ant, p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getEntero() != dato) {
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
        Entero p, q;
        int aux;
        p = L;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getEntero() > q.getEntero()) {
                    aux = p.getEntero();
                    p.setEntero(q.getEntero());
                    q.setEntero(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
    
    public void mostrar(DefaultListModel modelo) {
        Entero p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getEntero());
            p = p.getSgte();
        }
    }
    
    public void mostrarPares(DefaultListModel modelo) {
        Entero p = L;
        modelo.removeAllElements();
        while (p != null) {
            if (p.getEntero() % 2 == 0) modelo.addElement(p.getEntero());
            p = p.getSgte();
        }
    }
    
    public void reemplazar(int dato1, int dato2) {
        Entero entero = buscar(dato1);
        entero.setEntero(dato2);
    }
    
}
