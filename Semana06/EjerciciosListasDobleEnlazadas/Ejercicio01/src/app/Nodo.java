package app;

public class Nodo {
    
    private Empleado valor;
    private Nodo ant;
    private Nodo sgte;

    public Nodo(Empleado valor) {
        this.valor = valor;
    }

    public Nodo(Empleado valor, Nodo ant, Nodo sgte) {
        this.valor = valor;
        this.ant = ant;
        this.sgte = sgte;
    }

    public Empleado getValor() {
        return valor;
    }

    public void setValor(Empleado valor) {
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
