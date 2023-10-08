package app;

public class FrmEjercicio03 extends javax.swing.JFrame {

    public FrmEjercicio03() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        lblSuma = new javax.swing.JLabel();
        txtSuma = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        sep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumero.setText("NÚMERO (N):");
        lblNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 20));

        txtNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        btnSumar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSumar.setText("SUMAR (1 HASTA N)");
        btnSumar.setPreferredSize(new java.awt.Dimension(170, 30));
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        lblSuma.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblSuma.setText("SUMA:");
        lblSuma.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, 20));

        txtSuma.setEditable(false);
        txtSuma.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, 20));

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

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        int numero = Integer.parseInt(txtNumero.getText());
        NumerosEnteros numeros = new NumerosEnteros(numero);
        
        txtSuma.setText(String.valueOf(numeros.getSumaHastaN()));
        System.out.println();
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumero.setText("");
        txtSuma.setText("");
        txtNumero.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblSuma;
    private javax.swing.JSeparator sep;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSuma;
    // End of variables declaration//GEN-END:variables
}
