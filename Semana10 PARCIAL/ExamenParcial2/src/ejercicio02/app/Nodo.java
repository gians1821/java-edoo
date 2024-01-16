package ejercicio02.app;

public class Nodo {
    
    private int info;
    private Nodo ant;
    private Nodo sgte;

    public Nodo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
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

    @Override
    public String toString() {
        return "Nodo{" + "info=" + info + '}';
    }
    
}
