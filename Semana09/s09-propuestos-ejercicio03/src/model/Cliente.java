package model;

public class Cliente {
    
    private String nombre;
    private Float montoCompra;

    public Cliente(String nombre, Float montoCompra) {
        this.nombre = nombre;
        this.montoCompra = montoCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getMontoCompra() {
        return montoCompra;
    }

    public void setMontoCompra(Float montoCompra) {
        this.montoCompra = montoCompra;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", montoCompra=" + montoCompra + '}';
    }
    
}
