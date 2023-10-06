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
    
    private int buscarNumero(double[] vector, int n, double num) {
        if (n == -1) return -1;
        else if (num == vector[n-1]) return n-1;
        else return buscarNumero(vector, n-1, num);
    }
    
    public int buscarNumero(double numero) {
        return buscarNumero(numeros, totalElementos, numero);
    }
    
}
