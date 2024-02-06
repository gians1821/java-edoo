package model;

public class Curso implements Comparable<Curso> {
    
    private String codigo;
    private String nombre;
    private String ciclo;
    private int creditos;
    private String carrera;

    public Curso(String codigo) {
        this.codigo = codigo;
    }

    public Curso(String codigo, String nombre, String ciclo, int creditos, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.creditos = creditos;
        this.carrera = carrera;
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

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public int compareTo(Curso t) {
        return this.codigo.compareToIgnoreCase(t.getCodigo());
    }

}
