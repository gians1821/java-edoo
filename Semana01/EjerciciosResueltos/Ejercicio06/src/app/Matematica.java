package app;

public class Matematica {
    private double numero;
    private int exponente;

    public Matematica(double numero, int exponente) {
        this.numero = numero;
        this.exponente = exponente;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    private double calcularPotencia(double x, int n) {
        if (n == 0) return 1;
        else return x * calcularPotencia(x, n-1);
    }
    
    public double calcularPotencia() {
        return calcularPotencia(numero, exponente);
    }
    
}
