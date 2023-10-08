package app;

public class FrmEjercicio02 extends javax.swing.JFrame {

    public FrmEjercicio02() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        lblReves = new javax.swing.JLabel();
        txtReves = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setText("NUMERO");
        lblNumero.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lblReves.setText("NUMERO AL REVES");
        lblReves.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblReves, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txtReves.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtReves, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, -1));

        txtNumero.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 22));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 22));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setPreferredSize(new java.awt.Dimension(100, 22));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        bg.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int n = Integer.parseInt(txtNumero.getText());
        NumeroEntero ne = new NumeroEntero(n);
        txtReves.setText(ne.numeroAlReves());
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumero.setText("");
        txtReves.setText("");
        txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblReves;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtReves;
    // End of variables declaration//GEN-END:variables
}
