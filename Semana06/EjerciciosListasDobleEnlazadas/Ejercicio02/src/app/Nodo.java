package app;

public class Nodo {
    
    private int valor;
    private Nodo ant;
    private Nodo sgte;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public Nodo(int valor, Nodo ant, Nodo sgte) {
        this.valor = valor;
        this.ant = ant;
        this.sgte = sgte;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
