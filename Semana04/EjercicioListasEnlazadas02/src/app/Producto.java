package app;

public class Producto {
    
    private int entero;
    private Producto sgte;

    public Producto(int entero) {
        this.entero = entero;
        sgte = null;
    }

    public Producto(int entero, Producto sgte) {
        this.entero = entero;
        this.sgte = sgte;
    }

    public int getEntero() {
        return entero;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public Producto getSgte() {
        return sgte;
    }

    public void setSgte(Producto sgte) {
        this.sgte = sgte;
    }
    
}
