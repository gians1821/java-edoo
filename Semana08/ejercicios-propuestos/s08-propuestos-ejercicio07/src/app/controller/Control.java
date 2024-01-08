package app.controller;

import app.model.Pila;

public class Control {
    
    public static int convertir(String posfija) {
        Pila<Integer> pilaOperandos = new Pila<>();
        int resultado = 0;
        for (char car :  posfija.toCharArray()) {
            System.out.println(car);
            switch (car) {
                case '+':
                    resultado = pilaOperandos.pop() + (int) pilaOperandos.pop();
                    System.out.println(resultado);
                    pilaOperandos.push(resultado);
                    break;
                case '-':
                    int sustraendo = pilaOperandos.pop();
                    int minuendo = pilaOperandos.pop();
                    resultado = minuendo - sustraendo;
                    System.out.println(resultado);
                    pilaOperandos.push(resultado);
                    break;
                case '*':
                    int factor1 = pilaOperandos.pop();
                    int factor2 = pilaOperandos.pop();
                    resultado = factor1 * factor2;
                    System.out.println(resultado);
                    pilaOperandos.push(resultado);
                    break;
                case '/':
                    int divisor = pilaOperandos.pop();
                    int dividendo = pilaOperandos.pop();
                    resultado = dividendo / divisor;
                    System.out.println(resultado);
                    pilaOperandos.push(resultado);
                    break;
                case '^':
                    int exponente = pilaOperandos.pop();
                    int base = pilaOperandos.pop();
                    resultado = (int) Math.pow(base, exponente);
                    System.out.println(resultado);
                    pilaOperandos.push(resultado);
                    break;
                default:
                    if (Character.isDigit(car)) {
                        pilaOperandos.push(Character.getNumericValue(car));
                    }
            }
        }
        return pilaOperandos.pop();
    }
    
}
