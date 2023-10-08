package app;

import javax.swing.DefaultListModel;

public class NumerosReales {
    
    private double[] numeros;
    private int totalNumeros;
    
    public NumerosReales() {
        numeros = new double[50];
        totalNumeros = 0;
    }
    
    public NumerosReales(int limite) {
        numeros = new double[limite];
        totalNumeros = 0;
    }
    
    public boolean addNumero(double n) {
        if (totalNumeros < numeros.length) {
            numeros[totalNumeros] = n;
            totalNumeros++;
            return true;
        } else return false;
    }
    
    public void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        for (int i = 0; i < totalNumeros; i++) {
            modelo.addElement(numeros[i]);
        }
    }
    
    private double multiplicacion(double vector[], int n) {
        if (n == 0) return vector[n];
        else return vector[n-1] * multiplicacion(vector, n-1);
    }
    
    public double multiplicacion() {
        return multiplicacion(numeros, totalNumeros);
    }
    
}
