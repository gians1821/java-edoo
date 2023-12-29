package vista;

import java.util.ArrayList;
import modelo.Soldado;
import modelo.Soldados;

public class Main {

    public static void main(String[] args) {
        // Crear un array de soldados
        Soldado[] arraySoldados = {
            new Soldado("A"),
            new Soldado("B"),
            new Soldado("C"),
            new Soldado("D"),
            new Soldado("E")
        };

        // Crear una instancia de la clase Soldados
        Soldados soldadosJuego = new Soldados(arraySoldados);

        // Empezar el juego con un soldado inicial y un valor de salto
        String soldadoInicial = "A";
        int nSalto = 3;
        ArrayList<Soldado> resultadoJuego = soldadosJuego.empezarJuego(soldadoInicial, nSalto);

        // Mostrar el resultado del juego
        if (resultadoJuego != null) {
            System.out.println("Soldados eliminados en orden:");
            for (Soldado soldado : resultadoJuego) {
                if (soldado != resultadoJuego.get(resultadoJuego.size()-1)) 
                    System.out.println(soldado);
            }
            System.out.println("\nSoldado salvado:");
            System.out.println(resultadoJuego.get(resultadoJuego.size()-1));
        } else {
            System.out.println("No se pudo iniciar el juego. Verifica los parámetros iniciales.");
        }
    }
}
