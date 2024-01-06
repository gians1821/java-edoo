package app.controller;

import app.model.Pila;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.DefaultListModel;

public class Control {
    
    private static final String NOMBRE_ARCHIVO = "./src/app/assets/ejemplo.txt";
    private static final Pila<String> PILA = new Pila<>();
    private static BufferedReader lector;
    
    public static void leerArchivoTexto() {
        try {
            lector = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
            String linea;
            do {
                linea = lector.readLine();
                PILA.push(linea);
            } while (linea != null);
        } catch (IOException e) {
            System.out.println(e);   
        }
    }
    
    public static void mostrar(DefaultListModel modelo) {
        PILA.mostrar(modelo);
    }
    
}
