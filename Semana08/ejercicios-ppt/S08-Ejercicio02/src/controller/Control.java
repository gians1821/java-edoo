package controller;

import model.Pila;

public class Control {
    
    public static boolean verificaPalidromo(String expresion) {
        int mitad = expresion.length() / 2;
        int n = expresion.length();
        char car;
        Pila<Character> pila = new Pila();
        for (int i = 0; i < mitad; i++) {
            car = expresion.charAt(i);
            pila.push(car);
        }
        if (!(n % 2 == 0)) mitad += 1; 
        for (int i = mitad; i < n; i++) {
            car = expresion.charAt(i);
            if (car != pila.pop()) return false;
        }
        return true;
        
    }
    
}
