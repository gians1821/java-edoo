package view;

import control.Control;
import javax.swing.DefaultListModel;
import model.Cola;

public class MainFrame extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    Cola cola = new Cola(10);
    
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
        btnEncolar = new javax.swing.JButton();
        btnDesencolar = new javax.swing.JButton();
        btnEmpty = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFrente = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(800, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntero.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEntero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEntero.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        btnMostrar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        bg.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        btnEncolar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEncolar.setText("ENCOLAR");
        btnEncolar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        bg.add(btnEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        btnDesencolar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnDesencolar.setText("DESENCOLAR");
        btnDesencolar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });
        bg.add(btnDesencolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        btnEmpty.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEmpty.setText("EMPTY");
        btnEmpty.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });
        bg.add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setPreferredSize(new java.awt.Dimension(150, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        bg.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        btnFrente.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnFrente.setText("FRENTE");
        btnFrente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnFrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenteActionPerformed(evt);
            }
        });
        bg.add(btnFrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, 30));

        scroll1.setPreferredSize(new java.awt.Dimension(150, 175));

        list1.setModel(modelo);
        scroll1.setViewportView(list1);

        bg.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        Control.encolar(cola, txtEntero.getText());
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
        Control.desencolar(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        Control.isEmpty(cola);
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Control.clear(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnFrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenteActionPerformed
        Control.frente(cola);
    }//GEN-LAST:event_btnFrenteActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnFrente;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JList<String> list1;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTextField txtEntero;
    // End of variables declaration//GEN-END:variables
}
