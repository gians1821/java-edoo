package ejercicio02.app;

public class Prueba {
    
    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
        lista.insertar(1);
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        lista.insertar(5);
        lista.insertar(5);
        lista.mostrarHaciaAdelante();
        System.out.println("===============");
        lista.eliminarRepetidos();
        lista.mostrarHaciaAdelante();
    }
    
}
