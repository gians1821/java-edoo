package app;

public class Division {
    
    private int dividendo;
    private int divisor;

    public Division(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    
    private int getCociente(int a, int b) {
        if ((a-b) < 0) return 0;
        else return 1 + getCociente((a-b), b);
    }
    
    public int getCociente() {
        return getCociente(dividendo, divisor);
    }
    
    private int getResiduo(int a, int b) {
        if ((a-b) < 0) return a;
        else return getResiduo((a-b), b);
    }
    
    public int getResiduo() {
        return getResiduo(dividendo, divisor);
    }
    
}
