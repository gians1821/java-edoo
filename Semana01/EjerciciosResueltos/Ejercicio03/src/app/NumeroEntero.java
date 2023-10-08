package app;

public class NumeroEntero {
    private int numero;

    public NumeroEntero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private String conversionBase(int n, int b) {
        if (n > 0) return conversionBase(n/b, b) + (n%b);
        else return "";
    }
    
    public String conversionBase(int b) {
        return conversionBase(numero, b);
    }
}
