package app;

public class Main {
    
    public static void main(String[] args) {
        ListaNodoSimple lista = new ListaNodoSimple();
        
        System.out.println("===========");
        lista.mostrar();
        
        lista.add(5.2f, 1);
        lista.add(5.5f, 2);
        lista.add(5.342f, 3);

        System.out.println("===========");
        lista.mostrar();
        

        System.out.println("===========");
        lista.mostrar();

        System.out.println(lista.esOrdenada());

    }

    
}
