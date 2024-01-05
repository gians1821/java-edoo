/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopilagenerica;

import javax.swing.DefaultListModel;

/**
 *
 * @author Sistemas
 */
public class Pila<T> {
    private Nodo<T> p;
    
    public Pila(){
        p=null;
    }
    
    public void push(T valor)
    {
        Nodo<T> nuevo = new Nodo<T>(valor);
        nuevo.setSgte(p);
        p=nuevo;
    }
    
    public T pop(){
        T cima=p.getInfo();
        p=p.getSgte();
        return cima;
    }
    
   public T top(){
        return p.getInfo();
    }

    
    public boolean empty(){
        return p==null;
    }
    
    public void clear(){
        while(p!=null)
            p=p.getSgte();
    }
    
    public void mostrar(DefaultListModel modelo){
        Nodo actual=p;
        modelo.removeAllElements();
        while(actual!=null)
        {
            modelo.addElement(actual.getInfo());
            actual=actual.getSgte();
        }
    }
    
}
