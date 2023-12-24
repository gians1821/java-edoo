package app;

public class Nodo {
    Curso valor;
    Nodo sgte;

    public Nodo(Curso valor) {
        this.valor = valor;
        this.sgte = null;
    }
    
    public Nodo(Curso valor, Nodo sgte) {
        this.valor = valor;
        this.sgte = sgte;
    }
    
    public Curso getValor() {
        return valor;
    }

    public void setValor(Curso valor) {
        this.valor = valor;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
