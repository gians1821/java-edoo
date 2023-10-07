package app;

import javax.swing.table.DefaultTableModel;

public class PersonasVector {
    
    private Persona[] personas;
    private int totalElementos;
    
    public PersonasVector() {
        personas = new Persona[50];
        totalElementos = 0;
    }
    
    public PersonasVector(int limite) {
        personas = new Persona[limite];
        totalElementos = 0;
    }
    
    public void addPersona(Persona persona) {
        if (totalElementos < personas.length) {
            personas[totalElementos] = persona;
            totalElementos++;
        }
    }
    
    public Persona getPersona(int index) {
        if (index != -1)
            for (int i = 0; i < totalElementos; i++)
                if (personas[index] == personas[i]) return personas[i];
        return null;
    }
    
    public void mostrar(DefaultTableModel modelo) {
        Object[][] datos = new Object[totalElementos][2];
        String[] titulos = {"Nombre", "Numero de Telefono"};
        
        modelo.setColumnIdentifiers(titulos);
        
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = getPersona(i).getNombre();
            datos[i][1] = getPersona(i).getNumeroTelefono();
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
    private void sortByNombre(Persona[] v, int l, int r) {
        int i = l, j = r;
        Persona x, temporal;
        x = v[(l + r) / 2];
        do {
            while (v[i].getNombre().compareToIgnoreCase(x.getNombre()) < 0 && i < r) i++;
            while (v[j].getNombre().compareToIgnoreCase(x.getNombre()) > 0 && j > l) j--;
            if (i <= j) {
                temporal = v[i];
                v[i] = v[j];
                v[j] = temporal;
                i++;
                j--;
            }
        } while (i <= j);
        if (i < r) sortByNombre(v, i, r);
        if (l < j) sortByNombre(v, l, j);
    }
    
    private int buscarPersona(Persona[] vector, int izq, int der, String nombre) {
        int central = (izq + der)/2;
        if (izq > der) 
            return -1;
        else if (nombre.compareTo(vector[central].getNombre()) == 0) 
            return central;
        else if (nombre.compareTo(vector[central].getNombre()) > 0) 
            return PersonasVector.this.buscarPersona(vector, central + 1, der, nombre);
        else
            return PersonasVector.this.buscarPersona(vector, izq, central - 1, nombre);
    }
    
    public int buscarPersona(String nombre) {
        sortByNombre(personas, 0, totalElementos - 1);
        return PersonasVector.this.buscarPersona(personas, 0, totalElementos - 1, nombre);
    }
    
}
