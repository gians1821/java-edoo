package control;

import javax.swing.DefaultListModel;
import model.Cliente;
import model.ColaPrioridades;

public class Control {
    
    public static void encolar(ColaPrioridades<Cliente> cola, String nombre, String prioridad) {
        if (nombre.compareTo("") == 0 || prioridad.compareTo("") == 0) return;
        int prioridadCliente = Integer.parseInt(prioridad);
        Cliente cliente = new Cliente(nombre, prioridadCliente);
        cola.insertar(cliente, cliente.getPrioridad());
    }
    
    public static void atender(ColaPrioridades<Cliente> cola) {
        Cliente cliente = cola.quitarMin();
        if (cliente == null) return;
        MessageController.showInfoMessage(cliente + " ha sido atendido");
    }
    
    public static void mostrar(ColaPrioridades<Cliente> cola, DefaultListModel modelo) {
        cola.mostrarColas(modelo);
    }
    
}
