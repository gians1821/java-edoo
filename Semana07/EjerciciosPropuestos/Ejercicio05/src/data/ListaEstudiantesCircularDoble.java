package data;

import javax.swing.DefaultListModel;

public class ListaEstudiantesCircularDoble {

    private Nodo primero;
    private Nodo ultimo;

    public ListaEstudiantesCircularDoble() {
        primero = null;
        ultimo = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public boolean esVacia() {
        return primero == null;
    }
    
    public int contar() {
        if (esVacia()) return 0;
        int contador = 0;
        Nodo p = ultimo.getSgte();
        do {
            contador++;
            p = p.getSgte();
        } while (p != ultimo.getSgte());
        return contador;
    }
    
    /* PARTE D */
    
    public int contarEstudiantesAprobados() {
        if (esVacia()) return 0;
        int contador = 0;
        Nodo p = ultimo.getSgte();
        do {
            if (p.getValor().getNota() > 13) contador++;
            p = p.getSgte();
        } while (p != ultimo.getSgte());
        return contador;
    }

    /* PARTE E */

    public int contarEstudiantesDesaprobados() {
        if (esVacia()) return 0;
        int contador = 0;
        Nodo p = ultimo.getSgte();
        do {
            if (p.getValor().getNota() < 14) contador++;
            p = p.getSgte();
        } while (p != ultimo.getSgte());
        return contador;
    }
    
    /* PARTE A */

    private boolean insertarAlInicio(Estudiante valor) {
        if (valor.getNota() < 14) return false;
        Nodo nuevoNodo = new Nodo(valor);
        if (esVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            primero.setSgte(primero);
            ultimo.setAnt(ultimo);
        } else {
            nuevoNodo.setSgte(primero);
            nuevoNodo.setAnt(ultimo);
            primero.setAnt(nuevoNodo);
            ultimo.setSgte(nuevoNodo);
            primero = nuevoNodo;
        }
        return true;
    }
    
    private boolean insertarAlFinal(Estudiante valor) {
        if (valor.getNota() > 13) return false;
        Nodo nuevoNodo = new Nodo(valor);
        if (esVacia()) {
            primero = nuevoNodo;
            ultimo = nuevoNodo;
            primero.setSgte(primero);
            ultimo.setAnt(ultimo);
        } else {
            nuevoNodo.setSgte(primero);
            nuevoNodo.setAnt(ultimo);
            ultimo.setSgte(nuevoNodo);
            primero.setAnt(nuevoNodo);
            ultimo = nuevoNodo;
        }
        return true;
    }

    public void agregarEstudiante(Estudiante valor) {
        float nota = valor.getNota();
        if (nota >= 14) insertarAlInicio(valor);
        else insertarAlFinal(valor);
    }
    
    /* PARTE B*/
    
    public Nodo buscar(String codigo) {
        if (esVacia()) return null;
        Nodo p = primero;
        do {
            if (p.getValor().getCodigo().compareTo(codigo) == 0) return p;
            p = p.getSgte();
        } while (p != primero);
        return null;
    }
    
    /* PARTE C */
    
    public boolean eliminar(String codigo) {
        if (esVacia()) return false;
        Nodo nodoBuscado = buscar(codigo);
        if (nodoBuscado == null) return false;
        Nodo p = primero;
        if (contar() == 1) {
            ultimo = null;
            primero = null;
        } else {
            while (p.getSgte() != nodoBuscado) {
                p = p.getSgte();
            }
            if (p.getSgte() == ultimo) ultimo = p;
            if (p.getSgte() == primero) primero = primero.getSgte();
            p.setSgte(p.getSgte().getSgte());
            primero.setAnt(p);
        }
        return true;
    }
    
    public boolean mostrar(DefaultListModel modelo) {
        if (esVacia()) return false;
        Nodo p = ultimo.getSgte();
        modelo.removeAllElements();
        do {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        } while (p != primero);
        return true;
    }
    
}
