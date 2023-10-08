package app;

public class NumerosEnteros {
    
    private int n;

    public NumerosEnteros(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    private int getSumaHastaN(int n) {
        if (n == 1) return 1;
        else return n + getSumaHastaN(n-1);
    }
    
    public int getSumaHastaN() {
        return getSumaHastaN(n);
    }

    
}
