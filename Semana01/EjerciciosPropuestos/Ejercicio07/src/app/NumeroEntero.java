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
    
    private boolean tieneCifrasIguales(int n) {
        if (n / 10 != 0) {
            if ((n % 10) == ((n / 10) % 10))
                return true;
            else
                return tieneCifrasIguales(n / 10);
        } else {
            return false;
        }
    }
    
    public boolean tieneCifrasIguales() {
        return tieneCifrasIguales(numero);
    }
    
}
