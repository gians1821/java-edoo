package app;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

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
    
    public Producto consultar(String codigo) {
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
    
    public void modificar(String productoAntiguo, Producto nuevo) {
        Producto antiguo = consultar(productoAntiguo);
        antiguo.setCodigo(nuevo.getCodigo());
        antiguo.setNombre(nuevo.getNombre());
        antiguo.setPrecio(nuevo.getPrecio());
        antiguo.setStock(nuevo.getStock());
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object[][] datos = new Object[contar()][4];
        
        String[] titulos = {"Codigo", "Nombre", "Precio", "Stock"};
        modelo.setColumnIdentifiers(titulos);
        
        int i = 0;
        Producto producto = L;
        
        while (i < contar() && producto != null) {
            datos[i][0] = producto.getCodigo();
            datos[i][1] = producto.getNombre();
            datos[i][2] = producto.getPrecio();
            datos[i][3] = producto.getStock();
            producto = producto.getSgte();
            i++;
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
