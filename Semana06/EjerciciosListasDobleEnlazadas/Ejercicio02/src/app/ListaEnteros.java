package app;

import static java.lang.Integer.MAX_VALUE;
import javax.swing.DefaultListModel;

public class ListaEnteros {
    
    protected Nodo primero;
    protected Nodo ultimo;

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia() {
        return primero == null && ultimo == null;
    }
    
    public Nodo getNodo(int pos) {
        int n = contar();
        if (!(pos >= 1 && pos <= n + 1)) {
            return null;
        }
        int contador = 0;
        Nodo resultado = primero;
        while (contador < pos - 1) {
            contador++;
            resultado = resultado.getSgte();
        }
        return resultado;
    }
    
    /**
     * @param x - Not null
     * @return
     */
    public boolean insertarAlFinal(int x) {
        Nodo nuevo = new Nodo(x);
        if (primero == null) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(null);
            nuevo.setAnt(ultimo);
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
        return true;
    }
    
    /**
     * @param x - Not null
     * @return 
     */
    public boolean insertarAlInicio(int x) {
        Nodo nuevo = new Nodo(x);
        if (primero == null) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(primero);
            nuevo.setAnt(null);
            primero.setAnt(nuevo);
            primero = nuevo;
        }
        return true;
    }
    
    public int contar() {
        int c = 0;
        Nodo p = primero;
        while (p != null) {
            c++;
            p = p.getSgte();   
        }
        return c;
    }
    
    public void mostrarHaciaAdelante(DefaultListModel modelo) {
        Nodo p = primero;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getValor());
            p = p.getSgte();
        }
    }
    
    public void mostrarHaciaAtras(DefaultListModel modelo) {
        Nodo p = ultimo;
        modelo.removeAllElements();
        while (p != null) {
            modelo.addElement(p.getValor());
            p = p.getAnt();
        }
    }
    
    // PARTE A
    
    public float getMediana() {
        Nodo p = primero;
        Nodo q = ultimo;
        int n = contar();
        if (n % 2 == 0) {
            while (p.getSgte() != q && q.getAnt() != p) {
                p = p.getSgte();
                q = q.getAnt();
            }
            return (float) (p.getValor() + q.getValor()) / (float) 2;
        } else {
            while (p != q) {
                p = p.getSgte();
                q = q.getAnt();
            }
            return p.getValor();
        }
    }
    
    // PARTE B
    
    private float sumar(Nodo a, Nodo b) {
        if (b == null) {
            return a.getValor();
        } else {
            return a.getValor() + sumar(b, b.getSgte());
        }
    }

    public float sumar() {
        Nodo p = primero;
        if (p == null) return 0;
        else return sumar(p, p.getSgte());
    }
    
    public float getDesvEstandar() {
        float promedio = sumar() / contar();
        float sumatoria = 0;
        Nodo p = primero;
        while (p != null) {
            sumatoria += Math.pow((p.getValor() - promedio), 2);
            p = p.getSgte();
        }
        return (float) Math.sqrt((float) sumatoria / (float) contar());
    }
    
    // PARTE C
    
    private boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) primo = false;
            contador++;
        }
        return primo;
    }
    
    public ListaEnteros getPrimos() {
        Nodo p = ultimo;
        ListaEnteros listaPrimos = new ListaEnteros();
        while (p != null) {
            if (esPrimo(p.getValor())) listaPrimos.insertarAlFinal(p.getValor());
            p = p.getAnt();
        }
        return listaPrimos;
    }
    
    // PARTE D
    
    public Nodo getMenorEntero() {
        Nodo p = primero;
        Nodo nodoMenor = null;
        int menor = MAX_VALUE;
        while (p != null) {
            if (p.getValor() <= menor) {
                menor = p.getValor();
                nodoMenor = p;
            }
            p = p.getSgte();
        }
        return nodoMenor;
    }

}
