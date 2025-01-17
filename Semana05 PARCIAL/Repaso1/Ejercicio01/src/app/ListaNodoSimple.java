package app;

import javax.swing.DefaultListModel;

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
        int n = contar();
        if (!(pos >= 1 && pos <= n+1)) return null;
        int contador = 0;
        Nodo resultado = L;
        while (contador < pos - 1) {
            contador++;
            resultado = resultado.getSgte();
        }
        return resultado;
    }
    
    public int contar() {
        int contador = 0;
        Nodo p = L;
        while (p != null) {
            contador++;
            p = p.getSgte();
        }
        return contador;
    }
    
    public void insertarAlInicio(float x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }
    
    public void insertarAlFinal(float x) {
        Nodo nuevo = new Nodo(x);
        if (L == null) {
            L = nuevo;
        } else {
            Nodo p = L;
            while (p.getSgte() != null)
                p = p.getSgte();
            p.setSgte(nuevo);
        }
    }
    
    public Nodo buscar(float valor) {
        Nodo p = L;
        while (p != null) {
            if (p.getValor() == valor)
                return p;
            p = p.getSgte();
        }
        return null;
    }
    
    // PARTE A
    
    public boolean add(float valor, int pos) {
        Nodo nuevo = new Nodo(valor);
        int n = contar();
        if (pos < 1 || pos > n+1) {
            return false;
        }       
        if (pos == 1) {
            nuevo.setSgte(L);
            L = nuevo;
        } else {
            Nodo nodo = getNodo(pos-1);
            nuevo.setSgte(nodo.getSgte());
            nodo.setSgte(nuevo);
        }
        return true;
    }
    
    // PARTE B
    
    public boolean delete(int pos) {
        if (!(pos > 0 && pos <= contar())) return false;
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
            resultado = primero <= segundo;
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
    
    // PARTE E
    
    public float[] getUltimosNElementos(int n) {
        int inicial = contar() - n + 1;
        Nodo p = getNodo(inicial);
        float ultimosNElementos[] = new float[n];
        int contador = 0;
        while (p != null) {
            ultimosNElementos[contador] = p.getValor();
            contador++;
            p = p.getSgte();
        }
        return ultimosNElementos;
    }
    
    // PARTE F
    
    public boolean delete(float valor) {
        Nodo q = null, p = L;
        while (p != null) {
            if (p == L)
                if (p.getValor() == valor) L = p.getSgte();
                else q = p;
            else
                if (p.getValor() == valor) q.setSgte(p.getSgte());
                else q = q.getSgte();
            p = p.getSgte();
        }
        return true;
    }
    
    // PARTE G
    
    public boolean sonIguales(ListaNodoSimple lista2) {
        int n = contar();
        int m = lista2.contar();
        if (n != m) return false;
        Nodo p = L;
        Nodo q = lista2.getL();
        while (p != null) {
            if (p.getValor() != p.getValor()) return false;
            p = p.getSgte();
            q = q.getSgte();
        }
        return true;
    }
    
    // PARTE H
    
    private float sumar(Nodo a, Nodo b) {
        if (b == null) return a.getValor();
        else return a.getValor() + sumar(b, b.getSgte());
    }
    
    public float sumar() {
        Nodo p = L;
        if (p == null) return 0;
        else return sumar(p, p.getSgte());
    }
    
    public void mostrar(DefaultListModel modelo) {
        Nodo p = L;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        }
    }
    
}
