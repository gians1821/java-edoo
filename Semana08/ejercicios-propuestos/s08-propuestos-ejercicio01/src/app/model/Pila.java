package app.model;

import javax.swing.DefaultListModel;

public class Pila {
    
    private int n;
    private int pIndex;
    private int[] pila;

    public Pila(int n) {
        this.n = n;
        this.pila = new int[n];
        pIndex = -1;
    }
    
    public boolean empty(){
        return (pIndex == -1);
    }
    
    public boolean push(int valor) {
        if (pIndex < n-1) {
            pila[++pIndex] = valor;
            return true;
        }
        return false;
    }
    
    public int pop(){
        if (pIndex > -1) {
            int cima = pila[pIndex--];
            return cima;            
        } else return Integer.MIN_VALUE;
    }
    
   public int top(){
        if (pIndex > -1) {
            return pila[pIndex];
        } else return Integer.MIN_VALUE;
    }
    
    public void clear(){
        pila = new int[n];
        pIndex = -1;
    }
    
    public void mostrar(DefaultListModel modelo){
        modelo.removeAllElements();
        for (int i = 0; i <= pIndex; i++) {
            modelo.addElement(pila[i]);
        }
    }
    
}
