package view;

import control.Control;
import javax.swing.DefaultListModel;
import model.Bicola;

public class MainFrame extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    Bicola<Integer> cola = new Bicola<>();
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtEntero = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnEncolarFrente = new javax.swing.JButton();
        btnDesencolarFrente = new javax.swing.JButton();
        btnEmpty = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFrente = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        btnEncolarFinal = new javax.swing.JButton();
        btnDesencolarFinal = new javax.swing.JButton();
        btnFinal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(1000, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntero.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEntero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEntero.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        btnMostrar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        bg.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        btnEncolarFrente.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEncolarFrente.setText("ENCOLAR FRENTE");
        btnEncolarFrente.setPreferredSize(new java.awt.Dimension(200, 30));
        btnEncolarFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarFrenteActionPerformed(evt);
            }
        });
        bg.add(btnEncolarFrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        btnDesencolarFrente.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnDesencolarFrente.setText("DESENCOLAR FRENTE");
        btnDesencolarFrente.setPreferredSize(new java.awt.Dimension(200, 30));
        btnDesencolarFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarFrenteActionPerformed(evt);
            }
        });
        bg.add(btnDesencolarFrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        btnEmpty.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEmpty.setText("EMPTY");
        btnEmpty.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });
        bg.add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setPreferredSize(new java.awt.Dimension(150, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        bg.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        btnFrente.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnFrente.setText("FRENTE");
        btnFrente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenteActionPerformed(evt);
            }
        });
        bg.add(btnFrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 30));

        scroll1.setPreferredSize(new java.awt.Dimension(150, 175));

        list1.setModel(modelo);
        scroll1.setViewportView(list1);

        bg.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 220, 260));

        btnEncolarFinal.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEncolarFinal.setText("ENCOLAR FINAL");
        btnEncolarFinal.setPreferredSize(new java.awt.Dimension(200, 30));
        btnEncolarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarFinalActionPerformed(evt);
            }
        });
        bg.add(btnEncolarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        btnDesencolarFinal.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnDesencolarFinal.setText("DESENCOLAR FINAL");
        btnDesencolarFinal.setPreferredSize(new java.awt.Dimension(200, 30));
        btnDesencolarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarFinalActionPerformed(evt);
            }
        });
        bg.add(btnDesencolarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        btnFinal.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnFinal.setText("FINAL");
        btnFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        btnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalActionPerformed(evt);
            }
        });
        bg.add(btnFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 30));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarFrenteActionPerformed
        Control.encolarFrente(cola, txtEntero.getText());
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnEncolarFrenteActionPerformed

    private void btnDesencolarFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarFrenteActionPerformed
        Control.desencolarFrente(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnDesencolarFrenteActionPerformed

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        Control.empty(cola);
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Control.clear(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenteActionPerformed
        Control.frenteBicola(cola);
    }//GEN-LAST:event_btnFrenteActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnEncolarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarFinalActionPerformed
        Control.encolarFinal(cola, txtEntero.getText());
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnEncolarFinalActionPerformed

    private void btnDesencolarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarFinalActionPerformed
        Control.desencolarFinal(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnDesencolarFinalActionPerformed

    private void btnFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalActionPerformed
        Control.finalBicola(cola);
    }//GEN-LAST:event_btnFinalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDesencolarFinal;
    private javax.swing.JButton btnDesencolarFrente;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnEncolarFinal;
    private javax.swing.JButton btnEncolarFrente;
    private javax.swing.JButton btnFinal;
    private javax.swing.JButton btnFrente;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JList<String> list1;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTextField txtEntero;
    // End of variables declaration//GEN-END:variables
}
