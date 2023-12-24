package app;

public class LogicApp {
    
    public static Pelicula crearPelicula(String nombre, int horas, int minutos, int segundos) {
        return new Pelicula(nombre, horas, minutos, segundos);        
    }
    
    public static void insertarAlInicio(ListaPeliculas peliculas, Pelicula pelicula) {
        peliculas.insertarAlInicio(pelicula);
    }

    public static void insertarAlFinal(ListaPeliculas peliculas, Pelicula pelicula) {
        peliculas.insertarAlFinal(pelicula);
    }
    
    public static boolean add(ListaPeliculas peliculas, Pelicula valor, int pos) {
        return peliculas.add(valor, pos);
    }
    
    public static boolean delete(ListaPeliculas peliculas, int pos) {
        return peliculas.delete(pos);
    }
    
    public static boolean esOrdenada(ListaPeliculas peliculas) {
        return peliculas.esOrdenada();
    }
    
    public static boolean invertir(ListaPeliculas peliculas) {
        peliculas.invertir();
        return true;
    }
    
    public static Pelicula[] getNUltimos(ListaPeliculas peliculas, int nUltimos) {
        if (!(nUltimos >= 1 && nUltimos <= peliculas.contar())) return null;
        return peliculas.getUltimosNElementos(nUltimos);
    }
    
    public static boolean delete(ListaPeliculas peliculas, String nombre) {
        return peliculas.delete(nombre);
    }
    
    public static void ordernarCreciente(ListaPeliculas peliculas) {
        peliculas.ordenar();
    }
            
}
