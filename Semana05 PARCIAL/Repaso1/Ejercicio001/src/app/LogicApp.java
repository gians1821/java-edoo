package app;

public class LogicApp {
    
    public static boolean add(ListaNodoSimple reales, float valor, int pos) {
        return reales.add(valor, pos);
    }
    
    public static boolean delete(ListaNodoSimple reales, int pos) {
        return reales.delete(pos);
    }
    
    public static boolean esOrdenada(ListaNodoSimple reales) {
        return reales.esOrdenada();
    }
    
    public static boolean invertir(ListaNodoSimple reales) {
        reales.invertir();
        return true;
    }
    
}
