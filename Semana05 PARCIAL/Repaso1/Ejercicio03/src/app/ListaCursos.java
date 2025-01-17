package app;

import javax.swing.DefaultListModel;

public class ListaCursos {

    private Nodo L;

    public ListaCursos() {
        this.L = null;
    }
    
    public ListaCursos(Nodo L) {
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
    
    public void insertarAlInicio(Curso x) {
        Nodo nuevo = new Nodo(x);
        nuevo.setSgte(L);
        L = nuevo;
    }
    
    public void insertarAlFinal(Curso x) {
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
    
    public Nodo buscar(String nombre) {
        Nodo p = L;
        while (p != null) {
            if (p.getValor().getNombre().compareTo(nombre) == 0)
                return p;
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean add(Curso valor, int pos) {
        Nodo nuevo = new Nodo(valor);
        int n = contar();
        if (pos < 1 || pos > n+1) return false;
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
    
    public boolean esOrdenada() {
        boolean resultado = true;
        int i = 1;
        int n = contar();
        while (resultado != false && i < n) {
            String nombrePrimero = getNodo(i).getValor().getNombre();
            String nombreSegundo = getNodo(i+1).getValor().getNombre();
            resultado = nombrePrimero.compareTo(nombreSegundo) <= 0;
            i++;
        }
        return resultado;
    }
    
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
    
    public Curso[] getUltimosNElementos(int n) {
        int inicial = contar() - n + 1;
        Nodo p = getNodo(inicial);
        Curso ultimosNElementos[] = new Curso[n];
        int contador = 0;
        while (p != null) {
            ultimosNElementos[contador] = p.getValor();
            contador++;
            p = p.getSgte();
        }
        return ultimosNElementos;
    }
    
    public boolean delete(String nombre) {
        Nodo q = null, p = L;
        while (p != null) {
            if (p == L)
                if (p.getValor().getNombre().compareTo(nombre) == 0) L = p.getSgte();
                else q = p;
            else
                if (p.getValor().getNombre().compareTo(nombre) == 0) q.setSgte(p.getSgte());
                else q = q.getSgte();
            p = p.getSgte();
        }
        return true;
    }
    
    public void ordenar() {
        Nodo p, q;
        Curso aux;
        p = L;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getValor().getNombre().compareTo(q.getValor().getNombre()) >= 0) {
                    aux = p.getValor();
                    p.setValor(q.getValor());
                    q.setValor(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
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
