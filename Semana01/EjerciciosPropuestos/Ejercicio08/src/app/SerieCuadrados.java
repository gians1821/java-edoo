package app;

public class SerieCuadrados {
    
    private int nroCuadrados;
    private double lado;

    public SerieCuadrados(int nroCuadrados, double lado) {
        this.nroCuadrados = nroCuadrados;
        this.lado = lado;
    }

    public int getNroCuadrados() {
        return nroCuadrados;
    }

    public void setNroCuadrados(int nroCuadrados) {
        this.nroCuadrados = nroCuadrados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    private double getPerimetro(int n, double lado) {
        double nuevoLado = Math.sqrt(2 * (double) Math.pow(lado / 2, 2));
        if (n == 1) return 4 * lado;
        else return 4 * lado + getPerimetro(n - 1, nuevoLado);
    }
    
    public double getPerimetro() {
        return getPerimetro(nroCuadrados, lado);
    }
    
}
