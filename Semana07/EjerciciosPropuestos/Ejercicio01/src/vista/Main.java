package vista;

import modelo.ListaEnlazadaCircularSimple;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de la lista enlazada circular
        ListaEnlazadaCircularSimple lista1 = new ListaEnlazadaCircularSimple();
        ListaEnlazadaCircularSimple lista2 = new ListaEnlazadaCircularSimple();

        // Agregar elementos a las listas
        lista1.insertarAlFinal(3);
        lista1.insertarAlFinal(1);
        lista1.insertarAlFinal(5);

        lista2.insertarAlFinal(3);
        lista2.insertarAlFinal(1);
        lista2.insertarAlFinal(4);

        // Mostrar el contenido de las listas
        DefaultListModel<Integer> modeloLista1 = new DefaultListModel<>();
        DefaultListModel<Integer> modeloLista2 = new DefaultListModel<>();

        lista1.mostrar(modeloLista1);
        lista2.mostrar(modeloLista2);

        System.out.println("Contenido de lista1: " + modeloLista1);
        System.out.println("Contenido de lista2: " + modeloLista2);

        // Probar el método getPares
        System.out.println("Elementos pares en lista1: " + lista1.getPares());
        System.out.println("Elementos pares en lista2: " + lista2.getPares());

        // Probar el método sonIguales
        System.out.println("¿Las listas son iguales?: " + lista1.sonIguales(lista2));

        // Probar el método ordenar
        lista1.ordenar();
        lista1.mostrar(modeloLista1);
        System.out.println("Lista1 ordenada: " + modeloLista1);
    }
}
