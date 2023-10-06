package app;

public class EmpleadosVector {
    
    private Telefono[] empleados;
    private int totalElementos;
    
    public EmpleadosVector() {
        empleados = new Telefono[50];
        totalElementos = 0;
    }
    
    public EmpleadosVector(int limite) {
        empleados = new Telefono[limite];
        totalElementos = 0;
    }
    
    public void addEmpleado(Telefono empleado) {
        if (totalElementos < empleados.length) {
            empleados[totalElementos] = empleado;
            totalElementos++;
        }
    }
    
    public Telefono mostrarEmpleado(int index) {
        if (index != -1)
            for (int i = 0; i < totalElementos; i++)
                if (empleados[index] == empleados[i]) return empleados[i];
        return null;
    }
    
    private void sortByCodigo(Telefono[] v, int l, int r) {
        int i = l, j = r;
        Telefono x;
        Telefono temporal;
        x = v[(l + r) / 2];
        do {
            while (v[i].getCodigo().compareToIgnoreCase(x.getCodigo()) < 0 && i < r) i++;
            while (v[j].getCodigo().compareToIgnoreCase(x.getCodigo()) > 0 && j > l) j--;
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (i < r) sortByCodigo(v, i, r);
        if (l < j) sortByCodigo(v, l, j);
    }
    
    private int buscarEmpleado(Telefono[] vector, int izq, int der, String codigoEmpleado) {
        int central = (izq + der)/2;
        if (izq > der) 
            return -1;
        else if (codigoEmpleado.compareTo(vector[central].getCodigo()) == 0) 
            return central;
        else if (codigoEmpleado.compareTo(vector[central].getCodigo()) > 0) 
            return buscarEmpleado(vector, central + 1, der, codigoEmpleado);
        else
            return buscarEmpleado(vector, izq, central - 1, codigoEmpleado);
    }
    
    public int buscarEmpleado(String codigoEmpleado) {
        sortByCodigo(empleados, 0, totalElementos - 1);
        return buscarEmpleado(empleados, 0, totalElementos - 1, codigoEmpleado);
    }
    
}
