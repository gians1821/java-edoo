package app;

public class LogicApp {
    
    public static Empleado crearEmpleado(String codigo, String nombres, String apellidos, String sexo, float sueldo) {
        if (codigo.compareTo("") == 0 && nombres.compareTo("") == 0 &&
                apellidos.compareTo("") == 0 && sexo.compareTo("") == 0 && sueldo <= 0) {
            return null;
        }
        return new Empleado(codigo, nombres, apellidos, sexo, sueldo);
    }

    public static boolean guardarEmpleado(ListaEmpleados lista, Empleado empleado) {
        if (empleado == null) return false;
        return lista.insertarAlFinal(empleado);
    }

    public static void insertarAlInicio(ListaEmpleados lista, Empleado Empleado) {
        lista.insertarAlInicio(Empleado);
    }

    public static boolean eliminar(ListaEmpleados lista, String codigo) {
        if (codigo.compareTo("") == 0) return false;
        return lista.eliminar(codigo);
    }

    public static void ordernarCreciente(ListaEmpleados lista) {
        if (lista.contar() > 0) lista.ordenar();
    }
    
    public static Nodo buscar(ListaEmpleados lista, String codigo) {
        if (codigo.compareTo("") == 0) return null;
        return lista.buscar(codigo);
    }
    
    public static boolean actualizar(ListaEmpleados lista, Nodo nodo, Empleado empleado) {
        return lista.actualizar(nodo, empleado);
    }
    
    public static Nodo buscarMayorSueldo(ListaEmpleados lista) {
        return lista.buscarMayorSueldo();
    }
    
    public static float sumarSueldos(ListaEmpleados lista) {
        return lista.sumar();
    }
    
}
