package modelo;

public class Nodo {

    Soldado valor;
    Nodo sgte;

    public Nodo(Soldado valor) {
        this.valor = valor;
    }

    public Soldado getValor() {
        return valor;
    }

    public void setValor(Soldado valor) {
        this.valor = valor;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
