package model;

public class Arco {
    
    int destino;
    double peso;

    public Arco(int destino) {
        this.destino = destino;
    }

    public Arco(int destino, double peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public boolean equals(Object n) {
        Arco a = (Arco) n;
        return destino == a.destino;
    }
    
}
