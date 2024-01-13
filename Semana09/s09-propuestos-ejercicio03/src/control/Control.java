package control;

import javax.swing.DefaultListModel;
import model.Cliente;
import model.Cola;

public class Control {
    
    private static Float montoTotalDeConsumo = 0f;
    private static Integer totalAtendidos = 0;
    
    public static void encolar(Cola<Cliente> cola, String nombre, String montoConsumido) {
        if (nombre.compareTo("") == 0 || montoConsumido.compareTo("") == 0) return;
        Float montoCompra = Float.valueOf(montoConsumido);
        Cliente cliente = new Cliente(nombre, montoCompra);
        cola.encolar(cliente);
    }
    
    public static void atender(Cola<Cliente> cola) {
        Cliente cliente = cola.desencolar();
        if (cliente == null) return;
        MessageController.showInfoMessage(cliente + " ha sido atendido");
        montoTotalDeConsumo += cliente.getMontoCompra();
        totalAtendidos++;
        MessageController.showInfoMessage("En total, ya se ha consumido un total de: " 
                + montoTotalDeConsumo + " soles, atendiendo a " + totalAtendidos + " clientes");
    }
    
    public static void mostrar(Cola<Cliente> cola, DefaultListModel modelo) {
        cola.mostrar(modelo);
    }
    
}
