package app;

public class Pelicula {
    
    private String nombre;
    private int horas;
    private int minutos;
    private int segundos;

    public Pelicula(String nombre, int horas, int minutos, int segundos) {
        this.nombre = nombre;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public int getDuracionSec() {
        return 3600*horas + 60*minutos + segundos;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
    
}
