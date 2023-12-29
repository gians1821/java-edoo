package modelo;

import javax.swing.DefaultListModel;

public class ListaSoldadosCircularSimple {

    private Nodo u;

    public ListaSoldadosCircularSimple() {
        u = null;
    }

    public Nodo getU() {
        return u;
    }

    public void setU(Nodo u) {
        this.u = u;
    }

    public boolean esVacia() {
        return u == null;
    }
    
    public int contar() {
        if (esVacia()) return 0;
        int contador = 0;
        Nodo p = u.getSgte();
        do {
            contador++;
            p = p.getSgte();
        } while (p != u.getSgte());
        return contador;
    }
    
    public void insertarAlFinal(Soldado valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (esVacia()) {
            u = nuevoNodo;
            nuevoNodo.setSgte(u);
        } else {
            nuevoNodo.setSgte(u.getSgte());
            u.setSgte(nuevoNodo);
            u = nuevoNodo;
        }
    }
    
    public Nodo buscar(String nombre) {
        if (esVacia()) return null;
        Nodo p = u.getSgte();
        Nodo primero = u.getSgte();
        do {
            if (p.getValor().getNombre().equals(nombre)) return p;
            p = p.getSgte();
        } while (p != primero);
        return null;
    }
    
    public boolean eliminar(String nombre) {
        if (esVacia()) return false;
        Nodo nodoBuscado = buscar(nombre);
        if (nodoBuscado == null) return false;
        Nodo p = u.getSgte();
        if (contar() == 1) {
            u = null;
        } else {
            while (p.getSgte() != nodoBuscado) {
                p = p.getSgte();
            }
            if (p.getSgte() == u) u = p;
            p.setSgte(p.getSgte().getSgte());
        }
        return true;
    }
    
    public boolean mostrar(DefaultListModel modelo) {
        if (esVacia()) return false;
        Nodo p = u.getSgte();
        modelo.removeAllElements();
        do {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        } while (p != u.getSgte());
        return true;
    }
    
}
