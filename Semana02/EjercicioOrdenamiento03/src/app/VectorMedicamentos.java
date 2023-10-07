package app;

import javax.swing.table.DefaultTableModel;

public class VectorMedicamentos {
    
    private Medicamento vector[];
    private int totalElementos;

    public VectorMedicamentos() {
        vector = new Medicamento[50];
        totalElementos = 0;
    }

    public VectorMedicamentos(int limite) {
        vector = new Medicamento[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Medicamento x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    public void sortByNombre() {
        int indiceMenor, i, j;
        String temporal;
        Medicamento medicamento;
        for (i = 0; i < totalElementos - 1; i++) {
            indiceMenor = i;
            temporal = vector[indiceMenor].getNombre();
            for (j = i + 1; j < totalElementos; j++) {
                if (vector[j].getNombre().compareTo(temporal) < 0) {
                    indiceMenor = j;
                }
            }
            medicamento = vector[i];
            vector[i] = vector[indiceMenor];
            vector[indiceMenor] = medicamento;
        }
    }
    
    public void sortByPrecio() {
        int indiceMenor, i, j;
        double temporal;
        Medicamento medicamento;
        for (i = 0; i < totalElementos; i++) {
            indiceMenor = i;
            temporal = vector[indiceMenor].getPrecio();
            for (j = i + 1; j < totalElementos; j++) {
                if (vector[j].getPrecio() > temporal) {
                    indiceMenor = j;
                }
            }
            medicamento = vector[i];
            vector[i] = vector[indiceMenor];
            vector[indiceMenor] = medicamento;
        }
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][4];
        String titulos[] = {"Codigo", "Nombre", "Laboratorio", "Precio"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getCodigo();
            datos[i][1] = vector[i].getNombre();
            datos[i][2] = vector[i].getLaboratorio();
            datos[i][3] = vector[i].getPrecio();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
