package controller;

import model.Pila;

public class Control {
    
    public static String conversion(int numero) {
        Pila<Integer> pila = new Pila();
        int res;
        String cadena = "";
        while (numero > 0) {
            res = numero % 16;
            pila.push(res);
            numero /= 16;
        }
        while (!pila.empty()) {
            int car = pila.pop();
            if (car < 10) cadena += car;
            else if (car <= 16) cadena += Character.toString(car + 55);
        }
        return cadena;
    }
    
}
