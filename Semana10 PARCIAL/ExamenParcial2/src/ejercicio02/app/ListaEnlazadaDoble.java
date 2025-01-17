package ejercicio02.app;

public class ListaEnlazadaDoble {
    
    private Nodo primero;
    private Nodo ultimo;

    public ListaEnlazadaDoble() {
    }
    
    public void insertar(int entero) {
        Nodo nuevo = new Nodo(entero);
        if (esVacia()) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            ultimo = nuevo;
            primero = nuevo;
        } else if (contar() == 1) {
            if (nuevo.getInfo() <= primero.getInfo()) insertarInicio(nuevo);
            else insertarFinal(nuevo);
        } else {
            Nodo p = primero;
            while (p != null && nuevo.getInfo() > p.getInfo()) p = p.getSgte();
            if (p == primero) insertarInicio(nuevo);
            else if (p == null) insertarFinal(nuevo);
            else {
                p.getAnt().setSgte(nuevo);
                nuevo.setSgte(p);
                nuevo.setAnt(p.getAnt());
                p.setAnt(nuevo);                
            }
            
        }
    }
    
    public void eliminarRepetidos() {
        if (esVacia() || contar() == 1) return;
        Nodo p = primero;
        while (p != null) {
            Nodo q = p.getSgte();
            while (q != null) {
                if (q.getInfo() == p.getInfo()) {
                    Nodo siguiente = q.getSgte();
                    if (q != ultimo) {
                        q.getAnt().setSgte(q.getSgte());
                        q.getSgte().setAnt(q.getAnt());
                        q.setAnt(null);
                        q.setSgte(null);
                    } else {
                        q.getAnt().setSgte(null);
                        ultimo = q.getAnt();
                        q.setAnt(null);
                        q.setSgte(null);
                    }
                    q = siguiente;
                } else q = q.getSgte();
            }
            p = p.getSgte();
        }
    }

    private boolean esVacia() {
        return primero == null;
    }

    private int contar() {
        if (esVacia()) return 0;
        Nodo p = primero;
        int contador = 0;
        while (p.getSgte() != null) {
            p = p.getSgte();
            contador++;
        }
        return contador;
    }

    private void insertarInicio(Nodo nodo) {
        nodo.setSgte(primero);
        nodo.setAnt(null);
        primero.setAnt(nodo);
        primero = nodo;
    }

    private void insertarFinal(Nodo nodo) {
        nodo.setAnt(ultimo);
        nodo.setSgte(null);
        ultimo.setSgte(nodo);
        ultimo = nodo;
    }
    
    public void mostrarHaciaAdelante() {
        Nodo p = primero;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getSgte();
        }
    }
    
}
