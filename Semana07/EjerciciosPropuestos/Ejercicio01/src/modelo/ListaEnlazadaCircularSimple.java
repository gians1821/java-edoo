package modelo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class ListaEnlazadaCircularSimple {

    private Nodo u;

    public ListaEnlazadaCircularSimple() {
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
    
    public void insertarAlFinal(int valor) {
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
    
    public Nodo buscar(int valor) {
        if (esVacia()) return null;
        Nodo p = u.getSgte();
        Nodo primero = u.getSgte();
        do {
            if (p.getValor() == valor) return p;
            p = p.getSgte();
        } while (p != primero);
        return null;
    }
    
    public void modificar(int valorBuscado, int nuevoValor) {
        Nodo nodoBuscado = buscar(valorBuscado);
        if (nodoBuscado != null) nodoBuscado.setValor(nuevoValor);
    }
    
    public boolean eliminar(int valor) {
        if (esVacia()) return false;
        Nodo nodoBuscado = buscar(valor);
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
    
    /* PARTE A */
    
    public ArrayList<Integer> getPares() {
        ArrayList<Integer> enterosPares = new ArrayList<>();
        if (esVacia()) return enterosPares;
        Nodo primero = u.getSgte();
        Nodo p = primero;
        do {
            if (p.getValor() % 2 == 0) enterosPares.add(p.getValor());
            p = p.getSgte();
        } while (p != primero);
        return enterosPares;
    }
    
    /* PARTE B */
    
    public boolean sonIguales(ListaEnlazadaCircularSimple lista2) {
        int n = contar();
        int m = lista2.contar();
        if (esVacia() && lista2.esVacia()) return true;
        if (n != m) return false;
        Nodo primero = u.getSgte();
        Nodo p = primero;
        Nodo q = lista2.getU().getSgte();
        do {
            if (p.getValor() != q.getValor()) return false;
            p = p.getSgte();
            q = q.getSgte();
        } while (p != primero);
        return true;
    }
    
    /* PARTE C */
    
    public boolean ordenar() {
        if (esVacia() || contar() == 1) return false;
        int temp;
        Nodo p = u.getSgte();
        do {
            Nodo q = p.getSgte();
            do {
                if (p.getValor() > q.getValor()) {
                    temp = p.getValor();
                    p.setValor(q.getValor());
                    q.setValor(temp);
                }
                q = q.getSgte();
            } while (q != u.getSgte());
        } while (p != u.getSgte());
        return true;
    }
    
}
