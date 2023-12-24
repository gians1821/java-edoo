package app;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ListaEmpleados {
    
    protected Nodo primero;
    protected Nodo ultimo;

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public boolean esVacia() {
        return primero == null && ultimo == null;
    }
    
    /**
     * @param x - Not null
     * @return
     */
    public boolean insertarAlFinal(Empleado x) {
        Nodo nuevo = new Nodo(x);
        if (primero == null) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(null);
            nuevo.setAnt(ultimo);
            ultimo.setSgte(nuevo);
            ultimo = nuevo;
        }
        return true;
    }
    
    /**
     * @param x - Not null
     * @return 
     */
    public boolean insertarAlInicio(Empleado x) {
        Nodo nuevo = new Nodo(x);
        if (primero == null) {
            nuevo.setSgte(null);
            nuevo.setAnt(null);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSgte(primero);
            nuevo.setAnt(null);
            primero.setAnt(nuevo);
            primero = nuevo;
        }
        return true;
    }
    
    public int contar() {
        int c = 0;
        Nodo p = primero;
        while (p != null) {
            c++;
            p = p.getSgte();   
        }
        return c;
    }
    
    public void mostrarHaciaAdelante(DefaultTableModel modelo) {
        Object[][] datos = new Object[contar()][5];
        
        String[] titulos = {"Código", "Nombres", "Apellidos", "Sexo", "Sueldo"};
        modelo.setColumnIdentifiers(titulos);
        
        int i = 0;
        Nodo nodo = primero;
        
        while (i < contar() && nodo != null) {
            datos[i][0] = nodo.getValor().getCodigo();
            datos[i][1] = nodo.getValor().getNombres();
            datos[i][2] = nodo.getValor().getApellidos();
            datos[i][3] = nodo.getValor().getSexo();
            datos[i][4] = nodo.getValor().getSueldo();
            nodo = nodo.getSgte();
            i++;
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
    public void mostrarHaciaAtras(DefaultTableModel modelo) {
        Object[][] datos = new Object[contar()][5];
        
        String[] titulos = {"Código", "Nombres", "Apellidos", "Sexo", "Sueldo"};
        modelo.setColumnIdentifiers(titulos);
        
        int i = 0;
        Nodo nodo = ultimo;
        
        while (i < contar() && nodo != null) {
            datos[i][0] = nodo.getValor().getCodigo();
            datos[i][1] = nodo.getValor().getNombres();
            datos[i][2] = nodo.getValor().getApellidos();
            datos[i][3] = nodo.getValor().getSexo();
            datos[i][4] = nodo.getValor().getSueldo();
            nodo = nodo.getAnt();
            i++;
        }
        
        modelo.setDataVector(datos, titulos);
    }
    
    /**
     * @param codigo - Not null
     * @return 
     */
    public Nodo buscar(String codigo) {
        Nodo p = primero;
        while (p != null) {
            if (p.getValor().getCodigo().compareTo(codigo) == 0) return p;
            p = p.getSgte();
        }
        return null;
    }
    
    public boolean eliminar(String codigo) {
        if (primero.getValor().getCodigo().compareTo(codigo) == 0) {
            if (primero.getSgte() == null) {
                primero = null;
                ultimo = null;
            } else {
                primero = primero.getSgte();
                primero.setAnt(null);
            }
            return true;
        } else {
            Nodo p = primero.getSgte();
            while (p != null && p.getValor().getCodigo().compareTo(codigo) != 0)
                p = p.getSgte();
            if (p != null) {
                if (p == ultimo) {
                    ultimo = ultimo.getAnt();
                    ultimo.setSgte(null);
                } else {
                    p.getAnt().setSgte(p.getSgte());
                    p.getSgte().setAnt(p.getAnt());
                }
                return true;
            } else {
                return false;
            }
        }
    }
    
    public void ordenar() {
        Nodo p, q;
        Empleado aux;
        p = primero;
        while (p.getSgte() != null) {
            q = p.getSgte();
            while (q != null) {
                if (p.getValor().getNombres().compareTo(q.getValor().getNombres()) >= 0) {
                    aux = p.getValor();
                    p.setValor(q.getValor());
                    q.setValor(aux);
                }
                q = q.getSgte();
            }
            p = p.getSgte();
        }
    }
    
    public boolean actualizar(Nodo nodo, Empleado empleado) {
        if (nodo == null && empleado == null) return false;
        nodo.setValor(empleado);
        return true;
    }
    
    public Nodo buscarMayorSueldo() {
        Nodo p = primero;
        float mayor = -1;
        Nodo nodoMayor = null;
        while (p != null) {
            if (p.getValor().getSueldo() > mayor) {
                mayor = p.getValor().getSueldo();
                nodoMayor = p;
            }
            p = p.getSgte();
        }
        return nodoMayor;
    }
    
    private float sumar(Nodo a, Nodo b) {
        if (b == null) return a.getValor().getSueldo();
        else return a.getValor().getSueldo() + sumar(b, b.getSgte());
    }
    
    public float sumar() {
        Nodo p = primero;
        if (p == null) return 0;
        else return sumar(p, p.getSgte());
    }

}
