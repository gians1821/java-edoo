package app;

import javax.swing.table.DefaultTableModel;

public class VectorEmpleados {
    
    private Empleado vector[];
    private int totalElementos;

    public VectorEmpleados() {
        vector = new Empleado[50];
        totalElementos = 0;
    }

    public VectorEmpleados(int limite) {
        vector = new Empleado[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Empleado x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    public void sortInsertion() {
        int i, j, temporal;
        Empleado empleado;
        for (i = 1; i < totalElementos; i++) {
            temporal = vector[i].getnVentas();
            empleado = vector[i];
            j = i;
            while (j > 0 && temporal < vector[j-1].getnVentas()) {
                vector[j] = vector[j-1];
                j--;
            }
            vector[j] = empleado;
        }
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][3];
        String titulos[] = {"Nombre", "Edad", "#Ventas"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getEdad();
            datos[i][2] = vector[i].getnVentas();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
