package app;

import javax.swing.DefaultListModel;

public class ListaProductos {
    
    private Producto L;

    public ListaProductos() {
        L = null;
    }

    public boolean esVacia() {
        return L == null;
    }
    
    public Producto getL() {
        return L;
    }
    
    public void insertarAlInicio(int x) {
        Producto nuevo = new Producto(x);
        nuevo.setSgte(L);
        L = nuevo;
    }
    
    public void insertarAlFinal(int x) {
        Producto nuevo = new Producto(x);
        if (L == null) {
            L = nuevo;
        } else {
            Producto p = L;
            while (p.getSgte() != null)
                p = p.getSgte();
            p.setSgte(nuevo);
        }
    }
    
    public int contar() {
        int c = 0;
        Producto p = L;
        while (p != null) {
            c++;
            p = p.getSgte();
        }
        return c;
    }
    
    public Producto buscar(int dato) {
        Producto p = L;
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
            Producto ant;
            Producto p;
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
        Producto p;
        Producto q;
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
        Producto p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getEntero());
            p = p.getSgte();
        }
    }
    
    public void mostrarPares(DefaultListModel modelo) {
        Producto p = L;
        modelo.removeAllElements();
        while (p != null) {
            if (p.getEntero() % 2 == 0) modelo.addElement(p.getEntero());
            p = p.getSgte();
        }
    }
    
    public void reemplazar(int dato1, int dato2) {
        Producto entero = buscar(dato1);
        entero.setEntero(dato2);
    }
    
}
