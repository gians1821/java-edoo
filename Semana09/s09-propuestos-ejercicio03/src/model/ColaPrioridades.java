package model;

import javax.swing.DefaultListModel;

public class ColaPrioridades<T> {
    
    private Cola[] listaColas;
    private int maxPrioridad;

    public ColaPrioridades(int maxPrioridad) {
        if (maxPrioridad < 1) return;
        this.maxPrioridad = maxPrioridad;
        listaColas = new Cola[this.maxPrioridad + 1];
        for (int i = 0; i < this.maxPrioridad + 1; i++) {
            listaColas[i] = new Cola();
        }
    }
    
    public boolean insertar(T info, int prioridad) {
        if (prioridad > maxPrioridad) return true;
        listaColas[prioridad].encolar(info);
        return true;
    }
    
    public T frenteMin() {
        for (int i = 0; i <= maxPrioridad; i++) {
            if (!listaColas[i].empty()) return (T) listaColas[i].frente();
        }
        return null;
    }
    
    public T quitarMin() {
        for (int i = 0; i <= maxPrioridad; i++) {
            if (!listaColas[i].empty()) return (T) listaColas[i].desencolar();
        }
        return null;
    }
    
    public boolean empty() {
        for (int i = 0; i <= maxPrioridad; i++) {
            if (listaColas[i].empty()) return true;
        }
        return false;
    }
    
    public void mostrarColas(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i <= maxPrioridad; i++) {
            if (!listaColas[i].empty()) {
                Nodo p = listaColas[i].getPrimero();
                while (p != null) {
                    modelo.addElement(p.getInfo());
                    p = p.getSgte();
                }
            }
        }
    }
    
}
