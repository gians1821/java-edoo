package app;

public class NumerosPares {
    
    private int n;

    public NumerosPares(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    private int getSumaNPares(int n) {
        if (n == 1) return 2;
        else return 2*n + getSumaNPares(n-1);
    }
    
    public int getSumaNPares() {
        return getSumaNPares(n);
    }
}
