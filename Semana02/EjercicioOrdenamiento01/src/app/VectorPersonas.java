package app;

import javax.swing.table.DefaultTableModel;

public class VectorPersonas {
    
    private Persona vector[];
    private int totalElementos;

    public VectorPersonas() {
        vector = new Persona[50];
        totalElementos = 0;
    }

    public VectorPersonas(int limite) {
        vector = new Persona[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Persona x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    public void burbujaSort() {
        int i, j;
        Persona temporal;
        for (i = 0; i < totalElementos-1; i++)
            for (j = totalElementos-1; j > i; j--)
                if (vector[j].getNombre().compareTo(vector[j-1].getNombre()) < 0) {
                    temporal = vector[j];
                    vector[j] = vector[j-1];
                    vector[j-1] = temporal;
                }
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"Nombre", "Numero de Telefono"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getNumeroDeTelefono();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
