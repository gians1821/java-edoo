package app;

import javax.swing.table.DefaultTableModel;

public class VectorLibros {
    
    private Libro vector[];
    private int totalElementos;

    public VectorLibros() {
        vector = new Libro[50];
        totalElementos = 0;
    }

    public VectorLibros(int limite) {
        vector = new Libro[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(Libro x) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = x;
            totalElementos++;
            return true;
        } else return false;
    }
    
    public void sortByAutor() {
        Libro temporal;
        int i, j, salto = totalElementos / 2;
        while (salto > 0) {
            for (i = salto; i < totalElementos; i++) {
                j = i - salto;
                while (j >= 0) {
                    if (vector[j].getAutor().compareTo(vector[j + salto].getAutor()) > 0) {
                        temporal = vector[j];
                        vector[j] = vector[j + salto];
                        vector[j + salto] = temporal;
                        j -= salto;
                    } else {
                        j--;
                    }
                }
            }
            salto /= 2;
        }
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][5];
        String titulos[] = {"Codigo", "Título", "Autor", "Editorial", "#Páginas"};
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getCodigo();
            datos[i][1] = vector[i].getTitulo();
            datos[i][2] = vector[i].getAutor();
            datos[i][3] = vector[i].getEditorial();
            datos[i][4] = vector[i].getNroPaginas();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
}
