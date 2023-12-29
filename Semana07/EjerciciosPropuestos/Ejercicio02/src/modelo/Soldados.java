package modelo;

import java.util.ArrayList;

public class Soldados {
    
    private final ListaSoldadosCircularSimple soldados = new ListaSoldadosCircularSimple();
    private Nodo nodoSoldadoSeleccionado;
    private int nSalto;
    
    public Soldados(Soldado[] arraySoldados) {
        for (Soldado soldado : arraySoldados) {
            soldados.insertarAlFinal(soldado);
        }
    }

    public ArrayList<Soldado> empezarJuego(String nombre, int n) {
        if (soldados.buscar(nombre) == null || n < 2 || n > soldados.contar()) return null;
        nodoSoldadoSeleccionado = soldados.buscar(nombre);
        nSalto = n;
        return realizarEliminaciones();
    }

    private ArrayList<Soldado> realizarEliminaciones() {
        ArrayList<Soldado> soldadosResultado = new ArrayList<>();
        int contador = 0;
        /* Listar soldados eliminados */
        while (soldados.contar() != 1) {
            while (contador < nSalto - 1) {
                nodoSoldadoSeleccionado = nodoSoldadoSeleccionado.getSgte();
                contador++;
            }
            Nodo siguiente = nodoSoldadoSeleccionado.getSgte();
            soldadosResultado.add(nodoSoldadoSeleccionado.getValor());
            soldados.eliminar(nodoSoldadoSeleccionado.getValor().getNombre());
            nodoSoldadoSeleccionado = siguiente;
            contador = 0;
        }
        /* Listar soldado salvado */
        soldadosResultado.add(nodoSoldadoSeleccionado.getValor());
        return soldadosResultado;
    }
    
}
