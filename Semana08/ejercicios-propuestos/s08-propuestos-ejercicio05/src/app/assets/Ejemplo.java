package app.assets;

public class Ejemplo {
    private String nombre;

    public Ejemplo(String ] nombre) {
        this.nombre = nombre;
    }

    public void saludar() {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        Ejemplo miObjeto = new Ejemplo("Juan");
        miObjeto.saludar();
    }
}
