package app;

public class FrmEjercicio02 extends javax.swing.JFrame {

    public FrmEjercicio02() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnContar = new javax.swing.JButton();
        lblNCifras = new javax.swing.JLabel();
        txtNCifras = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        sep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumero.setText("NÚMERO:");
        lblNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        txtNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        btnContar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnContar.setText("CONTAR CIFRAS");
        btnContar.setPreferredSize(new java.awt.Dimension(170, 30));
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblNCifras.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNCifras.setText("# CIFRAS:");
        lblNCifras.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblNCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 20));

        txtNCifras.setEditable(false);
        txtNCifras.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNCifras, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 20));

        btnLimpiar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));
        jPanel1.add(sep, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        int numero = Integer.parseInt(txtNumero.getText());
        ContadorCifras contador = new ContadorCifras(numero);
        
        txtNCifras.setText(String.valueOf(contador.getNCifras()));
    }//GEN-LAST:event_btnContarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumero.setText("");
        txtNCifras.setText("");
        txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNCifras;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JSeparator sep;
    private javax.swing.JTextField txtNCifras;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
