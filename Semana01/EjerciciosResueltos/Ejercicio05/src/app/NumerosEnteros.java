package app;

public class NumerosEnteros {
    private int numero1;
    private int numero2;

    public NumerosEnteros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    private int mcd(int a, int b) {
        if (a%b == 0) return b;
        else return mcd(b, a%b);
    }
    
    public int mcd() {
        return mcd(numero1, numero2);
    }
    
}
