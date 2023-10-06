package app;

public class Telefono {
    
    String codigo;
    String nombre;
    double sueldo;

    public Telefono(String codigo, String nombre, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado " + codigo + "\n"
                + "Nombre: " + nombre + "\n"
                + "Sueldo: " + sueldo;
    }
    
}
