package app.controller;

import app.model.Pila;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;

public class Control {
    
    private static final String NOMBRE_ARCHIVO = "./src/app/assets/Ejemplo.java";
    private static final Pila<String> pilaStrings = new Pila<>();
    private static BufferedReader lector;
    
    public static Character analizarSimbolos() {
        String elemento;
        Pila<Character> curlyBrackets = new Pila<>();
        Pila<Character> squareBrackets = new Pila<>();
        Pila<Character> parentheses = new Pila<>();
        while (!pilaStrings.empty()) {
            char car;
            elemento = pilaStrings.pop();
            if (elemento != null) {
                System.out.println(elemento);
                for (int i = 0; i < elemento.length(); i++) {
                    car = elemento.charAt(i);
                    switch (car) {
                        case '{':
                            curlyBrackets.push(car);
                            break;
                        case '}':
                            if ((curlyBrackets.pop()) != '{') return '{';
                            break;
                        case '[':
                            squareBrackets.push(car);
                            break;
                        case ']':
                            if ((squareBrackets.pop()) != '[') return '[';
                            break;
                        case '(':
                            parentheses.push(car);
                            break;
                        case ')':
                            if ((parentheses.pop()) != '(') return '(';
                            break;
                    }
                }
            }
        }
        return 'Y';
    }
    
    public static void mostrar(DefaultListModel modelo) {
        pilaStrings.mostrar(modelo);
    }
    
}
