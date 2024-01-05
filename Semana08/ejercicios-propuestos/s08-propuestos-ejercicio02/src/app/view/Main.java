package app.view;

import app.model.Pila;

public class Main {
    
    public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>();
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);

        Pila<Integer> pila2 = new Pila<>();
        pila2.push(10);
        pila2.push(20);
        pila2.push(30);

        System.out.println("Pila 1 antes del reemplazo: " + pila1.pop());

        pila1.reemplazarCima(pila2);

        System.out.println("Pila 1 después del reemplazo: " + pila1.pop());

        new MainFrame().setVisible(true);
    }
    
}
