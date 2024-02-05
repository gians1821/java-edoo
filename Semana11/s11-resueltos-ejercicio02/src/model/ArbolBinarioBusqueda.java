package model;

import javax.swing.table.DefaultTableModel;

public class ArbolBinarioBusqueda {
    
    private Nodo raiz;

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
    
    public void insertar(Empleado dato) {
        raiz = insertar(raiz, dato);
    }
    
    private Nodo insertar(Nodo nodo, Empleado dato) {
        if (nodo == null) {
            nodo = new Nodo(dato);
        } else if (dato.compareTo(nodo.getDato()) < 0) {
            nodo.setIzdo(insertar(nodo.getIzdo(), dato));
        } else if (dato.compareTo(nodo.getDato()) > 0) {
            nodo.setDcho(insertar(nodo.getDcho(), dato));
        }
        return nodo;
    }
    
    public Nodo buscar(Empleado dato) {
        return buscar(raiz, dato);
    }
    
    private Nodo buscar(Nodo nodo, Empleado dato) {
        if (nodo == null) return null;
        else if (dato.compareTo(nodo.getDato()) < 0) return buscar(nodo.getIzdo(), dato);
        else if (dato.compareTo(nodo.getDato()) > 0) return buscar(nodo.getDcho(), dato);
        else return nodo;
    }
    
    private void agregarFila(DefaultTableModel modelo, Empleado dato) {
        Object[] fila = {dato.getCodigo(), dato.getNombres(), dato.getApellidos(), dato.getSexo(), dato.getSueldo()};
        modelo.addRow(fila);
    }
    
    private void limpiarTabla(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }
    
    public void preOrden(DefaultTableModel modelo) {
        String titulos[] = {"CÓDIGO", "NOMBRE", "APELLIDOS", "SEXO", "SUELDO"};
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        preOrden(raiz, modelo);
    }
    
    private void preOrden(Nodo nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            agregarFila(modelo, nodo.getDato());
            preOrden(nodo.getIzdo(), modelo);
            preOrden(nodo.getDcho(), modelo);
        }
    }
    
    public void enOrden(DefaultTableModel modelo) {
        String titulos[] = {"CÓDIGO", "NOMBRE", "APELLIDOS", "SEXO", "SUELDO"};
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        enOrden(raiz, modelo);
    }
    
    private void enOrden(Nodo nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            enOrden(nodo.getIzdo(), modelo);
            agregarFila(modelo, nodo.getDato());
            enOrden(nodo.getDcho(), modelo);
        }
    }
    
    public void postOrden(DefaultTableModel modelo) {
        String titulos[] = {"CÓDIGO", "NOMBRE", "APELLIDOS", "SEXO", "SUELDO"};
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        postOrden(raiz, modelo);
    }
    
    private void postOrden(Nodo nodo, DefaultTableModel modelo) {
        if (nodo != null) {
            postOrden(nodo.getIzdo(), modelo);
            postOrden(nodo.getDcho(), modelo);
            agregarFila(modelo, nodo.getDato());
        }
    }
    
    public Empleado buscarMax() {
        return buscarMax(raiz);
    }
    
    private Empleado buscarMax(Nodo nodo) {
        Empleado x;
        if (nodo.getDcho() == null) x = nodo.getDato();
        else x = buscarMax(nodo.getDcho());
        return x;
    }
    
    public Empleado buscarMin() {
        return buscarMin(raiz);
    }
    
    private Empleado buscarMin(Nodo nodo) {
        Empleado x;
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
    
    public void eliminar(Empleado dato) {
        raiz = eliminar(raiz, dato);
    }
    
    private Nodo eliminar(Nodo nodo, Empleado dato) {
        if (nodo == null) return null;
        else if (dato.compareTo(nodo.getDato()) < 0) nodo.setIzdo(eliminar(nodo.getIzdo(), dato));
        else if (dato.compareTo(nodo.getDato()) > 0) nodo.setDcho(eliminar(nodo.getDcho(), dato));
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
    
}
