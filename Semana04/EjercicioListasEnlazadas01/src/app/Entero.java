package app;

public class Entero {
    
    private int entero;
    private Entero sgte;

    public Entero(int entero) {
        this.entero = entero;
        sgte = null;
    }

    public Entero(int entero, Entero sgte) {
        this.entero = entero;
        this.sgte = sgte;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public Entero getSgte() {
        return sgte;
    }

    public void setSgte(Entero sgte) {
        this.sgte = sgte;
    }
    
}
