package control;

import javax.swing.DefaultListModel;
import model.Cliente;
import model.Cola;
import model.ColaPrioridades;

public class Control {
    
    private static Float montoTotalDeConsumo = 0f;
    private static Integer totalAtendidos = 0;
    
    public static void encolar(ColaPrioridades<Cliente> cola, String nombre, String prioridad) {
        if (nombre.compareTo("") == 0 || prioridad.compareTo("") == 0) return;
        int prioridadCliente = Integer.parseInt(prioridad);
        Cliente cliente = new Cliente(nombre, prioridadCliente);
        cola.insertar(cliente, cliente.getPrioridad());
    }
    
    public static void atender(Cola<Cliente> cola) {
        Cliente cliente = cola.desencolar();
        if (cliente == null) return;
        MessageController.showInfoMessage(cliente + " ha sido atendido");
//        montoTotalDeConsumo += cliente.getMontoCompra();
        totalAtendidos++;
        MessageController.showInfoMessage("En total, ya se ha consumido un total de: " 
                + montoTotalDeConsumo + " soles, atendiendo a " + totalAtendidos + " clientes");
    }
    
    public static void mostrar(ColaPrioridades<Cliente> cola, DefaultListModel modelo) {
        cola.mostrarColas(modelo);
    }
    
}
