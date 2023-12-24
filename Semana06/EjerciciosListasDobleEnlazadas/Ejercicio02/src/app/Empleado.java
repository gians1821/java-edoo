package app;

public class Empleado {
    
    private String codigo;
    private String nombres;
    private String apellidos;
    private String sexo;
    private float sueldo;

    public Empleado(String codigo, String nombres, String apellidos, String sexo, float sueldo) {
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

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombres=" + nombres + ", apellidos=" + apellidos + ", sexo=" + sexo + ", sueldo=" + sueldo + '}';
    }
    
}
