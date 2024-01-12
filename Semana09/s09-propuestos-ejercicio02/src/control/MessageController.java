package control;

import javax.swing.JOptionPane;

public class MessageController {
    
    public static void showInfoMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
