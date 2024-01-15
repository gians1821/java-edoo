package model;

import javax.swing.DefaultListModel;

public class Cola {
    
    private int maxTamaño;
    private final Integer[] cola;
    private int indexPrimero;
    private int indexUltimo;
    
    private int siguiente(int r) {
        return (r + 1) % maxTamaño;
    }

    public Cola(int maxTamaño) {
        this.maxTamaño = maxTamaño;
        cola = new Integer[this.maxTamaño];
        indexPrimero = 0;
        indexUltimo = this.maxTamaño - 1;
    }

    public int getIndexPrimero() {
        return indexPrimero;
    }

    public int getIndexUltimo() {
        return indexUltimo;
    }
    
    public boolean isEmpty() {
        return indexPrimero == siguiente(indexUltimo);
    }
    
    public boolean isFull() {
        return indexPrimero == siguiente(siguiente(indexUltimo));
    }

    public void encolar(Integer entero) {
        if (!isFull()) {
            indexUltimo = siguiente(indexUltimo);
            cola[indexUltimo] = entero;
        }
    }
    
    public Integer desencolar() {
        if (!isEmpty()) {
            Integer entero = cola[indexPrimero];
            indexPrimero = siguiente(indexPrimero);
            return entero;
        }
        return null;
    }
    
    public Integer frente() {
        if (!isEmpty()) return cola[indexPrimero];
        return null;
    }
    
    public void clear() {
        indexPrimero = 0;
        indexUltimo = maxTamaño - 1;
    }
    
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        if (isEmpty()) return;
        int p = indexPrimero;
        if (p == indexUltimo) {
            modelo.addElement(cola[p]);
        } else {
            while (p != indexUltimo) {
                modelo.addElement(cola[p]);
                p = siguiente(p);
            }
            modelo.addElement(cola[p]);
        }
    }
    
}
