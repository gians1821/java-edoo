package app;

import javax.swing.DefaultListModel;

public class VectorReales {
    
    private double[] vector;
    private int totalElementos;
    
    public VectorReales() {
        vector = new double[50];
        totalElementos = 0;
    }
    
    public boolean addNumero(double numero) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = numero;
            totalElementos++;
            return true;
        }
        return false;
    }
    
    public int getTotalElementos() {
        return totalElementos;
    }
    
    public double getNumero(int index) {
        return vector[index];
    }
    
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < totalElementos; i++) {
            modelo.addElement(vector[i]);
        }
    }
    
    public double getPromedio() {
        double suma = 0;
        for (double numero : vector) {
            suma += numero;
        }
        return suma/totalElementos;
    }
    
    public double getDesviacionEstandar() {
        double suma = 0;
        for (int i = 0; i < totalElementos; i++) {
            suma += Math.pow(vector[i] - getPromedio(), 2);
        }
        return Math.sqrt(suma/(totalElementos - 1));
    }
    
    public void ordenar() {
        double temp;
        for (int i = 0; i < totalElementos; i++) {
            for (int j = i+1; j < totalElementos; j++) {
                if (vector[i] > vector[j]) {
                    temp = vector[i];
                    vector[i] = vector[j];
                    vector[j] = temp;
                }
            }
        }
    }
    
    public double mediana() {
        ordenar();
        if (totalElementos % 2 != 0) return vector[totalElementos/2];
        return (vector[totalElementos/2-1] + vector[totalElementos/2]) / 2;
    }
    
}
