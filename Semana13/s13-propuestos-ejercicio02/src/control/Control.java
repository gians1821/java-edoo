package control;

import java.util.ArrayList;
import model.Grafo;
import model.Vertice;

public class Control {

    public static void crearVertice(Grafo grafo, String etiqueta) {
        grafo.añadirVertice(etiqueta);
    }
    
    public static void crearArco(Grafo grafo, String etiquetaA, String etiquetaB, int peso) {
        try {
            grafo.nuevoArco(etiquetaA, etiquetaB, peso);
        } catch (Exception e) {
            System.out.println(e);            
        }       
    }
    
    public static String gradoEntrada(Grafo grafo, String vertice) {
        if (vertice.compareTo("") == 0) return null;
        int grado = grafo.getGradoEntrada(new Vertice(vertice));
        return String.valueOf(grado);
    }
    
    public static String gradoSalida(Grafo grafo, String vertice) {
        if (vertice.compareTo("") == 0) return null;
        int grado = grafo.getGradoSalida(new Vertice(vertice));
        return String.valueOf(grado);
    }
    
    public static void mostrarAdyacentes(Grafo grafo, String vertice) {
        if (vertice.compareTo("") == 0) return;
        ArrayList<Vertice> adyacentes = grafo.getAdyacentes(new Vertice(vertice));
        String strAdyacentes = "";
        for (Vertice v : adyacentes) {
            strAdyacentes += v + "\n";
        }
        if (strAdyacentes.compareTo("") == 0) 
            MessageController.showInfoMessage("No hay adyacentes");
        else 
            MessageController.showInfoMessage("Los adyacentes son:\n" + strAdyacentes);
    }
    
    public static void mostrarAnchura(Grafo grafo, String vertice) {
        try {
            ArrayList<Vertice> recorrido = Grafo.recorrerAnchura(grafo, vertice);
            String strRecorrido = "";
            for (Vertice v : recorrido) {
                strRecorrido += v + "\n";
            }
            MessageController.showInfoMessage("El recorrido en anchura es:\n" + strRecorrido);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void mostrarProfundidad(Grafo grafo, String vertice) {
        try {
            ArrayList<Vertice> recorrido = Grafo.recorrerProfundidad(grafo, vertice);
            String strRecorrido = "";
            for (Vertice v : recorrido) {
                strRecorrido += v + "\n";
            }
            MessageController.showInfoMessage("El recorrido en profundidad es:\n" + strRecorrido);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
