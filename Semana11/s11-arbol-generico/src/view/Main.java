package view;

import model.ArbolBinarioBusqueda;
import model.Nodo;

public class Main {
    
    public static void main(String[] args) {
        
        ArbolBinarioBusqueda aquelArbolito = 
                new ArbolBinarioBusqueda(new Nodo(5));
        
        aquelArbolito.insertar(4);
        aquelArbolito.insertar(4);
        aquelArbolito.insertar(3);
        aquelArbolito.insertar(6);
        aquelArbolito.insertar(7);
        aquelArbolito.insertar(7);
        aquelArbolito.insertar(5);
        
        System.out.println(aquelArbolito.buscar(5).getIzdo().getIzdo());
        
    }
    
}
