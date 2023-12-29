package data;

import java.util.ArrayList;

public class LineaEcuatorial {

    private final ListaEnlazadaCircularDoble ciudadesEcuador = new ListaEnlazadaCircularDoble();

    public LineaEcuatorial() {
        for (Ciudad ciudad : crearCiudades()) {
            ciudadesEcuador.insertar(ciudad);
        }
    }
    
    public ListaEnlazadaCircularDoble getCiudadesEcuador() {
        return ciudadesEcuador;
    }

    private ArrayList<Ciudad> crearCiudades() {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Isla Isabela", "Ecuador"));
        ciudades.add(new Ciudad("Quito", "Ecuador"));
        ciudades.add(new Ciudad("Puerto Leguízamo", "Colombia"));
        ciudades.add(new Ciudad("Pacoa", "Colombia"));
        ciudades.add(new Ciudad("Macapá", "Brasil"));
        ciudades.add(new Ciudad("Ilhéu das Rolas", "Santo Tomé y Príncipe"));
        ciudades.add(new Ciudad("Libreville", "Gabón"));
        ciudades.add(new Ciudad("Owando", "República del Congo"));
        ciudades.add(new Ciudad("Mbandaka", "República Democrática del Congo"));
        ciudades.add(new Ciudad("Lago Victoria", "Uganda"));
        ciudades.add(new Ciudad("Kisumu", "Kenia"));
        ciudades.add(new Ciudad("Nanyuki", "Kenia"));
        ciudades.add(new Ciudad("Kismaayo", "Somalia"));
        ciudades.add(new Ciudad("Cruza sus aguas territoriales", "Maldivas"));
        ciudades.add(new Ciudad("Sumatra", "Indonesia"));
        ciudades.add(new Ciudad("Borneo", "Indonesia"));
        ciudades.add(new Ciudad("Sulawesi", "Indonesia"));
        ciudades.add(new Ciudad("Islas Gilbert", "Kiribati"));
        return ciudades;
    }

    private Nodo getNodoAleatorio() {
        int numeroAleatorio = (int) (Math.random() * 30);
        Nodo nodo = ciudadesEcuador.getUltimo();
        for (int i = 0; i < numeroAleatorio; i++) {
            nodo = nodo.getSgte();
        }
        return nodo;
    }
    
    public Object[] getCiudadAleatoria() {
        Nodo nodo = getNodoAleatorio();
        Ciudad ciudad = nodo.getValor();
        Object[] resultados = {nodo, ciudad};
        return resultados;
    }
    
}
