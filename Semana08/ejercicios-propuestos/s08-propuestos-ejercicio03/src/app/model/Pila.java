package app.model;

import javax.swing.DefaultListModel;

public class Pila<T> {
    
    private Nodo<T> p;
    
    public Pila() {
        p = null;
    }

    public void push(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        nuevo.setSgte(p);
        p=nuevo;
    }
    
    public T pop() {
        T cima = p.getInfo();
        p = p.getSgte();
        return cima;
    }
    
    public T top() {
        return p.getInfo();
    }
    
    public boolean empty() {
        return p == null;
    }
    
    public void clear() {
        while (p != null)
            p = p.getSgte();
    }
    
    /* EJERCICIO 03 */
    public Pila<T> multiplicarPor(int valor) {
        Pila<T> auxiliar = new Pila<>();
        Pila<T> resultado = new Pila<>();
        
        while (!empty()) {
            T elemento = pop();
            if (elemento instanceof Integer) {
                Integer resultadoMultiplicacion = (Integer) elemento * valor;
                auxiliar.push((T) resultadoMultiplicacion);
            } else {
                System.out.println("Error: La pila debe contener enteros para realizar la multiplicación.");
                return null;
            }
        }
        
        while (!auxiliar.empty()) {
            resultado.push(auxiliar.pop());
        }
        
        return resultado;
    }
    
    public void mostrar(DefaultListModel modelo) {
        Nodo actual = p;
        modelo.removeAllElements();
        while (actual != null) {
            modelo.addElement(actual.getInfo());
            actual = actual.getSgte();
        }
    }
    
}
