package model;

public class Empleado implements Comparable<Empleado> {
    
    private String codigo;
    private String nombres;
    private String apellidos;
    private String sexo;
    private double sueldo;

    public Empleado(String codigo) {
        this.codigo = codigo;
    }

    public Empleado(String codigo, String nombres, String apellidos, String sexo, double sueldo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public int compareTo(Empleado t) {
        return this.codigo.compareToIgnoreCase(t.getCodigo());
    }
    
}
