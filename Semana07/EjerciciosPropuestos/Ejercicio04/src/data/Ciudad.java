package data;

public class Ciudad {
    
    private String nombreCiudad;
    private String nombrePais;

    public Ciudad(String nombreCiudad, String nomberPais) {
        this.nombreCiudad = nombreCiudad;
        this.nombrePais = nomberPais;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNomberPais(String nomberPais) {
        this.nombrePais = nomberPais;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombreCiudad=" + nombreCiudad + ", nomberPais=" + nombrePais + '}';
    }
    
}
