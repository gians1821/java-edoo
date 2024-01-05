package controller;

import model.Pila;

public class Control {
    
    public static boolean verificaParentesis(String expresion){
        int n=expresion.length(),i;
        Pila<Character> pc = new Pila();
        char car;
        for(i=0;i<n;i++) {
            car = expresion.charAt(i);
            if (car == '(') pc.push(car);
            else if (car == ')') {
                if (pc.empty()) return false;
                else pc.pop();
            }
        }
        return pc.empty();
    }
    
}
