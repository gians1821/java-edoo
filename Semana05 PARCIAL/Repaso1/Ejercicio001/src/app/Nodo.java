package app;

public class Nodo {
    float valor;
    Nodo sgte;

    public Nodo(float valor) {
        this.valor = valor;
        this.sgte = null;
    }
    
    public Nodo(float valor, Nodo sgte) {
        this.valor = valor;
        this.sgte = sgte;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
