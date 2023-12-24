package app;

public class Nodo {
    Pelicula valor;
    Nodo sgte;

    public Nodo(Pelicula valor) {
        this.valor = valor;
        this.sgte = null;
    }
    
    public Nodo(Pelicula valor, Nodo sgte) {
        this.valor = valor;
        this.sgte = sgte;
    }
    
    public Pelicula getValor() {
        return valor;
    }

    public void setValor(Pelicula valor) {
        this.valor = valor;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
