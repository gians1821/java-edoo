package view;

import model.ArbolBinarioBusqueda;
import model.Nodo;

public class Main {
    
    public static void main(String[] args) {
        
        ArbolBinarioBusqueda aquelArbolito = 
                new ArbolBinarioBusqueda(new Nodo(7));
        
        aquelArbolito.insertar(5);
        aquelArbolito.insertar(10);
        aquelArbolito.insertar(3);
        aquelArbolito.insertar(6);
        aquelArbolito.insertar(8);
        aquelArbolito.insertar(12);
        aquelArbolito.insertar(2);
        aquelArbolito.insertar(4);
        aquelArbolito.insertar(11);
        
        aquelArbolito.eliminar(4);
        aquelArbolito.eliminar(12);
        aquelArbolito.eliminar(7);
//        System.out.println(aquelArbolito.getRaiz().getDcho().getDcho());
        aquelArbolito.preOrden();
        
    }
    
}
