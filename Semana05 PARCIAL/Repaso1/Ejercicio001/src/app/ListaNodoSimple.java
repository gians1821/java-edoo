package app;

public class ListaNodoSimple {

    Nodo L;

    public ListaNodoSimple() {
        this.L = null;
    }
    
    public ListaNodoSimple(Nodo L) {
        this.L = L;
    }

    public Nodo getL() {
        return L;
    }

    public void setL(Nodo L) {
        this.L = L;
    }
    
    public Nodo getNodo(int pos) {
        int contador = 0;
        Nodo resultado = L;
//        System.out.println("getnodo-a");
        while (contador < pos - 1) {
//            System.out.println("getnodo-b");
            contador++;
            resultado = resultado.getSgte();
        }
        return resultado;
    }
    
    private int contar() {
        int contador = 0;
        Nodo p = L;
//        System.out.println("contar-a");
        while (p != null) {
//            System.out.println("contar-b");
            contador++;
            p = p.getSgte();
        }
        return contador;
    }
    
    // PARTE A
    
    public void add(float valor, int pos) {
        Nodo nuevo = new Nodo(valor);
        int n = contar();
//        System.out.println("add-a");
        if (pos <= n+1) {
//            System.out.println("add-b");
            if (pos == 1) {
//                System.out.println("add-c1");
                nuevo.setSgte(L);
                L = nuevo;
            } else {
//                System.out.println("add-c2");
                Nodo nodo = getNodo(pos-1);
                nuevo.setSgte(nodo.getSgte());
                nodo.setSgte(nuevo);
            }
        }
    }
    
    // PARTE B
    
    public boolean delete(int pos) {
        if (!(pos <= contar())) {
            return false;
        }
        if (pos == 1) {
            L = getNodo(pos+1);
        } else {
            Nodo anterior = getNodo(pos-1);
            Nodo posterior = getNodo(pos+1);
            anterior.setSgte(posterior);
        }
        return true;
    }
    
    // PARTE C
    
    public boolean esOrdenada() {
        boolean resultado = true;
        int i = 1;
        int n = contar();
        while (resultado != false && i < n) {
            float primero = getNodo(i).getValor();
            float segundo = getNodo(i+1).getValor();
            resultado = primero < segundo;
            i++;
        }
        return resultado;
    }
    
    // PARTE D
    
    public void invertir() {
        Nodo inicio = L;
        int n = contar();
        while (inicio != null) {
            add(inicio.getValor(), 1);
            inicio = inicio.getSgte();
        }
        Nodo q = getNodo(n+1);
        while (q != null) {
            delete(n+1);
            q = q.getSgte();
        }
    }
    
    public void mostrar() {
        Nodo p = L;
//        System.out.println("mostrar-a");
        while (p != null) {
//            System.out.println("mostrar-b");
            System.out.println(p.getValor());
            p = p.getSgte();
        }
    }
    
}
