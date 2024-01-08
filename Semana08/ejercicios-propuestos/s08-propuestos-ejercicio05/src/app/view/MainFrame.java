package app.view;

import app.controller.Control;
import app.controller.MessageController;
import javax.swing.DefaultListModel;

public class MainFrame extends javax.swing.JFrame {
    
    private final DefaultListModel modelo = new DefaultListModel();
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnRemplazar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnScroll2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        btnAnalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(1000, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemplazar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnRemplazar.setText("MOSTRAR");
        btnRemplazar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnRemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemplazarActionPerformed(evt);
            }
        });
        bg.add(btnRemplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARCHIVO JAVA: ./assets/Ejemplo.Java");
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 30));
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        list2.setModel(modelo);
        pnScroll2.setViewportView(list2);

        bg.add(pnScroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 550, 310));

        btnAnalizar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAnalizar.setText("ANALIZAR");
        btnAnalizar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });
        bg.add(btnAnalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemplazarActionPerformed
        Control.mostrar(modelo);
    }//GEN-LAST:event_btnRemplazarActionPerformed

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        Character simbolo = Control.analizarSimbolos();
        if (simbolo == 'Y') {
            MessageController.showInfoMessage("SIMBOLOS CORRECTOS");
        } else {
            MessageController.showInfoMessage("SIMBOLO QUE FALTA O SOBRA: " + simbolo);
        }
    }//GEN-LAST:event_btnAnalizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnRemplazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> list2;
    private javax.swing.JScrollPane pnScroll2;
    // End of variables declaration//GEN-END:variables
}
