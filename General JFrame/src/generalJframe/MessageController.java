package generalJframe;

import javax.swing.JOptionPane;

public class MessageController {
    
    public static void showInfoMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showWarningMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Peligro", JOptionPane.WARNING_MESSAGE);
    }
    
}
