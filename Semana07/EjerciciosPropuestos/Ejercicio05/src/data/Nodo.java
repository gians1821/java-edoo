package data;

public class Nodo {
    
    private Estudiante valor;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Estudiante valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    public Estudiante getValor() {
        return valor;
    }

    public void setValor(Estudiante valor) {
        this.valor = valor;
    }

    public Nodo getSgte() {
        return siguiente;
    }

    public void setSgte(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnt() {
        return anterior;
    }

    public void setAnt(Nodo anterior) {
        this.anterior = anterior;
    }
    
}