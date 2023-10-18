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
    
    public void agregar(Producto producto) {
        if (L == null) {
            L = producto;
        } else {
            Producto p = L;
            while (p.getSgte() != null)
                p = p.getSgte();
            p.setSgte(producto);
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
    
    public Producto buscar(String codigo) {
        Producto p = L;
        while (p != null) {
            if (p.getCodigo().compareTo(codigo) == 0)
                return p;
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean eliminar(String codigo) {
        if (L.getCodigo().compareTo(codigo) == 0) {
            L = L.getSgte();
            return true;
        } else {
            Producto ant;
            Producto p;
            ant = L;
            p = L.getSgte();
            while (p != null && p.getCodigo().compareTo(codigo) != 0) {
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
        Producto aux;
        p = L;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getNombre().compareTo(q.getNombre()) > 0) {
                    aux = p;
                    p = new Producto(q);
                    q = new Producto(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
    
}
