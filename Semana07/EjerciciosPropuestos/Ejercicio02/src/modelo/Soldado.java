package modelo;

public class Soldado {
    
    private String nombre;

    public Soldado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + '}';
    }
    
}
