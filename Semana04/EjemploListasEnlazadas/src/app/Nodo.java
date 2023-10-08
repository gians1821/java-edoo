package app;

public class Nodo {
    
    private int info;
    private Nodo sgte;

    public Nodo() {
        sgte = null;
    }

    public Nodo(int info) {
        this.info = info;
        sgte = null;
    }
    
    public Nodo(int info, Nodo sgte) {
        this.info = info;
        this.sgte = sgte;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
