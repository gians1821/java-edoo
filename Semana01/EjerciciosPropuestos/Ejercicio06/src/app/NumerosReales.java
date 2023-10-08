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
    
    private int buscarNumero(double[] vector, int n, double numero) {
        if (n > 0) {
            if (vector[n - 1] == numero) return n;
            else return buscarNumero(vector, n - 1, numero);            
        } else return -1;
    }
    
    public int buscarNumero(double numero) {
        return buscarNumero(numeros, totalNumeros, numero);
    }
    
}
