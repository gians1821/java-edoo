package app;

public class ListaCarreras {
    
    public static ListaCursos[] listaCarreras = new ListaCursos[5];
    public static String[] carreras = {"Ingeniería de Sistemas", 
        "Medicina", "Informática", "Derecho", "Enfermería"};
    
    public static boolean addCarrera(ListaCursos listaCursos, String carrera) {
        for (int i = 0; i < carreras.length; i++)
            if (carrera.compareTo(carreras[i]) == 0) {
                listaCarreras[i] = listaCursos;
                return true;
            }
        return false;        
    }
    
    public static ListaCursos getCarrera(String carrera) {
        for (int i = 0; i < carreras.length; i++)
            if (carrera.compareTo(carreras[i]) == 0) return listaCarreras[i];
        return null;
    }
    
}
