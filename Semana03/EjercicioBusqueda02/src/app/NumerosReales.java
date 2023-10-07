package app;

import javax.swing.DefaultListModel;

public class NumerosReales {
    
    private double[] numeros;
    private int totalElementos;
    
    public NumerosReales() {
        numeros = new double[50];
        totalElementos = 0;
    }
    
    public NumerosReales(int limite) {
        numeros = new double[limite];
        totalElementos = 0;
    }
    
    public void addNumero(double numero) {
        if (totalElementos < numeros.length) {
            numeros[totalElementos] = numero;
            totalElementos++;
        }
    }
    
    public DefaultListModel mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < totalElementos; i++) {
            modelo.addElement(numeros[i]);
        }
        return modelo;
    }
    
    private void sort(double[] v, int l, int r) {
        int i = l, j = r;
        double x, temporal;
        x = v[(l + r) / 2];
        do {
            while (v[i] < x && i < r) i++;
            while (v[j] > x && j > l) j--;
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (i < r) sort(v, i, r);
        if (l < j) sort(v, l, j);
    }
    
    private int buscarNumero(double[] vector, int izq, int der, double num) {
        int central = (izq + der)/2;
        if (izq > der) 
            return -1;
        else if (num == vector[central]) 
            return central;
        else if (num > vector[central]) 
            return buscarNumero(vector, central + 1, der, num);
        else
            return buscarNumero(vector, izq, central - 1, num);
    }
    
    public int buscarNumero(double numero) {
        sort(numeros, 0, totalElementos - 1);
        return buscarNumero(numeros, 0, totalElementos - 1, numero);
    }
    
}
