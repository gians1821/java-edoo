package modelo;

import javax.swing.JOptionPane;

public class Ruleta {
    
    private final ListaEnlazadaCircularSimple ruleta = new ListaEnlazadaCircularSimple();
    
    public Ruleta() {
        for (int i = 0; i <= 30; i++) {
            ruleta.insertarAlFinal(i);
        }
    }

    public ListaEnlazadaCircularSimple getRuleta() {
        return ruleta;
    }
    
    private Nodo moverRuleta() {
        int numeroAleatorio = (int) (Math.random() * 30);
        Nodo nodo = ruleta.getU();
        for (int i = 0; i < numeroAleatorio; i++) {
            nodo = nodo.getSgte();
        }
        return nodo;
    }
    
    public Object[] moverRuleta(float monto) {
        Object[] resultados = new Object[2];
        String mensaje = "Resultado ruleta: ";
        Nodo nodo = moverRuleta();
        resultados[0] = nodo;
        mensaje += nodo.getValor();
        if (nodo.getValor() == 0)  {
            resultados[1] = 0f;
            mensaje += "\n¡Lo perdiste todo! :(";
        } else if (nodo.getValor() % 2 == 0) {
            resultados[1] = monto * 2;
            mensaje += "\n¡Duplicaste tu apuesta! :)";
        } else {
            resultados[1] = -monto;
            mensaje += "\n¡Perdiste!";
        }
        JOptionPane.showMessageDialog(null,  mensaje);
        return resultados;
    }
    
}
