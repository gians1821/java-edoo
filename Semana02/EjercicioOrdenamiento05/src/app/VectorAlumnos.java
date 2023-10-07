package app;

import javax.swing.table.DefaultTableModel;

public class VectorAlumnos {
    
    private Alumno vector[];
    private int totalElementos;

    public VectorAlumnos() {
        vector = new Alumno[50];
        totalElementos = 0;
    }

    public VectorAlumnos(int limite) {
        vector = new Alumno[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Alumno x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    private void sortByNombre(Alumno[] v, int l, int r) {
        int i = l, j = r;
        Alumno x, temporal;
        x = v[(l+r)/2];
        System.out.println(x.toString());
        do {
            while (v[i].getNombre().compareTo(x.getNombre()) < 0 && i < r) i++;
            while (v[j].getNombre().compareTo(x.getNombre()) > 0 && j > l) j--;
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (i<r) sortByNombre(v, i, r);
        if (l<j) sortByNombre(v, l, j);
    }
    
    public void sortByNombre() {
        sortByNombre(vector, 0, totalElementos - 1);
    }
    
    private void sortByNota(Alumno[] v, int l, int r) {
        int i = l, j = r;
        Alumno x, temporal;
        x = v[(l+r)/2];
        do {
            while (v[i].getNota() > x.getNota() && i < r) i++;
            while (v[j].getNota() < x.getNota() && j > l) j--;
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (i<r) sortByNota(v, i, r);
        if (l<j) sortByNota(v, l, j);
    }
    
    public void sortByNota() {
        sortByNota(vector, 0, totalElementos - 1);
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"Nombre", "Nota"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getNota();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
