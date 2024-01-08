package app.controller;

import app.model.Pila;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;

public class Control {
    
    private static final String NOMBRE_ARCHIVO = "./src/app/assets/Ejemplo.java";
    private static final Pila<Character> pilaCorchetes = new Pila<>();
    private static final Pila<Character> pilaParentesis = new Pila<>();
    private static final Pila<Character> pilaLlaves = new Pila<>();
    private static BufferedReader lector;
    
    public static Character analizarSimbolos() {
        pilaCorchetes.clear();
        pilaParentesis.clear();
        pilaLlaves.clear();
        try {
            FileReader fileReader = new FileReader(NOMBRE_ARCHIVO);
            lector = new BufferedReader(fileReader);
            String linea;
            String cadena = "";
            while ((linea = lector.readLine()) != null) {
                cadena += linea;
            }
            Character simbolo = analizarLinea(cadena);
            lector.close();
            fileReader.close();
            if (simbolo != 'Y') return simbolo;
        } catch (IOException e) {
            System.out.println(e);
        }
        return 'Y';
    }
    
    private static Character analizarLinea(String linea) {
        int n = linea.length(), i;
        char car = 'Y';
        for(i = 0; i < n; i++)
        {
            car = linea.charAt(i);
            if (car == '[') pilaCorchetes.push(car);
            else if (car == ']') {
                if (pilaCorchetes.empty()) return car;
                else pilaCorchetes.pop();
            } else if(car == '(') pilaParentesis.push(car);
            else if(car == ')') {
                if (pilaParentesis.empty()) return car;
                else pilaParentesis.pop();
            } else if(car=='{') pilaLlaves.push(car);
            else if (car=='}') {
                if (pilaLlaves.empty()) return car;
                else pilaLlaves.pop();
            }
        }
        if (pilaCorchetes.empty() && pilaParentesis.empty() && pilaLlaves.empty()) return 'Y';
        else if (!pilaCorchetes.empty()) return pilaCorchetes.top();
        else if (!pilaParentesis.empty()) return pilaParentesis.top();
        return pilaLlaves.top();
    }
    
    public static void mostrar(DefaultListModel modelo) {
        modelo.removeAllElements();
        try {
            FileReader fileReader = new FileReader(NOMBRE_ARCHIVO);
            lector = new BufferedReader(fileReader);
            String linea;
            while ((linea = lector.readLine()) != null) {
                modelo.addElement(linea);
            }
            lector.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
