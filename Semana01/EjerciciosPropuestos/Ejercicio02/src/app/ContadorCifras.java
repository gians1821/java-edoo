package app;

public class ContadorCifras {
    
    private int numero;

    public ContadorCifras(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    private int getNCifras(int n) {
        if (n/10 == 0) return 1;
        else return 1 + getNCifras(n/10);
    }
    
    public int getNCifras() {
        return getNCifras(numero);
    }
    
}
