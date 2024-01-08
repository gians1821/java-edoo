package app.controller;

import app.model.Pila;

public class Control {
    
    public static String convertir(String infija) {
        Pila<Character> pilaOperadores = new Pila<>();
        String posfija = "";
        for (char car : infija.toCharArray()) {
            System.out.println(car);
            switch (car) {
                case '+':
                case '-':
                    if (pilaOperadores.empty()) pilaOperadores.push(car);
                    else if (pilaOperadores.top() == '(') {
                        pilaOperadores.push(car);
                    } else {
                        while (!pilaOperadores.empty()) {
                            posfija += pilaOperadores.pop();
                        }
                        pilaOperadores.push(car);
                    }   break;
                case '*':
                case '/':
                    if (pilaOperadores.empty()) {
                        pilaOperadores.push(car);
                    } else if (pilaOperadores.top() == '-' 
                            || pilaOperadores.top() == '+'
                            || pilaOperadores.top() == '(') {
                        pilaOperadores.push(car);
                    } else {
                        while (!pilaOperadores.empty()) {
                            posfija += pilaOperadores.pop();
                        }
                        pilaOperadores.push(car);
                    }
                    break;
                case '^':
                    if (pilaOperadores.empty()) {
                        pilaOperadores.push(car);
                    } else if (pilaOperadores.top() == '+' 
                            || pilaOperadores.top() == '-'
                            || pilaOperadores.top() == '*'
                            || pilaOperadores.top() == '/'
                            || pilaOperadores.top() == '(') {
                        pilaOperadores.push(car);
                    } else {
                        while (!pilaOperadores.empty()) {
                            posfija += pilaOperadores.pop();
                        }
                        pilaOperadores.push(car);
                    }
                    break;
                case '(':
                    pilaOperadores.push(car);
                    break;
                case ')':
                    if (!pilaOperadores.empty()) {
                        while (pilaOperadores.top() != '(') {
                            posfija += pilaOperadores.pop();
                        }
                        pilaOperadores.pop();
                    }
                    break;
                default:
                    posfija += car;
                    break;
            }
        }
        while (!pilaOperadores.empty()) {
            posfija += pilaOperadores.pop();
        }
        return posfija;
    }
    
}
