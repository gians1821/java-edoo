package app;

public class LogicApp {
    
    public static Curso crearCurso(String codigo, String nombre, String ciclo, int creditos) {
        return new Curso(codigo, nombre, ciclo, creditos);
    }
    
    public static void insertarAlInicio(ListaCursos lista, Curso curso) {
        lista.insertarAlInicio(curso);
    }

    public static void insertarAlFinal(ListaCursos lista, Curso curso) {
        lista.insertarAlFinal(curso);
    }
    
    public static boolean add(ListaCursos lista, Curso valor, int pos) {
        return lista.add(valor, pos);
    }
    
    public static boolean delete(ListaCursos lista, int pos) {
        return lista.delete(pos);
    }
    
    public static boolean esOrdenada(ListaCursos lista) {
        return lista.esOrdenada();
    }
    
    public static boolean invertir(ListaCursos lista) {
        lista.invertir();
        return true;
    }
    
    public static Curso[] getNUltimos(ListaCursos lista, int nUltimos) {
        if (!(nUltimos >= 1 && nUltimos <= lista.contar())) return null;
        return lista.getUltimosNElementos(nUltimos);
    }
    
    public static boolean delete(ListaCursos lista, String nombre) {
        return lista.delete(nombre);
    }
    
    public static void ordernarCreciente(ListaCursos lista ){
        lista.ordenar();
    }
    
}
