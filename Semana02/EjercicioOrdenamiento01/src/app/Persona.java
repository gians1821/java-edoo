package app;

public class Persona {
    
    private String nombre;
    private String numeroDeTelefono;

    public Persona(String nombre, String numeroDeTelefono) {
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
}
