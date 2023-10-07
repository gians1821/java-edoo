package app;

public class Empleado {
    
    private String nombre;
    private int edad;
    private int nVentas;

    public Empleado(String nombre, int edad, int nVentas) {
        this.nombre = nombre;
        this.edad = edad;
        this.nVentas = nVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getnVentas() {
        return nVentas;
    }

    public void setnVentas(int nVentas) {
        this.nVentas = nVentas;
    }
    
}
