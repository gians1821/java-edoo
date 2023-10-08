package app;

public class FrmEjercicio01 extends javax.swing.JFrame {

    public FrmEjercicio01() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDivisor = new javax.swing.JLabel();
        lblDividendo = new javax.swing.JLabel();
        txtDivisor = new javax.swing.JTextField();
        txtDividendo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResiduo = new javax.swing.JLabel();
        lblCociente = new javax.swing.JLabel();
        txtResiduo = new javax.swing.JTextField();
        txtCociente = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDivisor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDivisor.setText("DIVISOR:");
        lblDivisor.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblDivisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 20));

        lblDividendo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblDividendo.setText("DIVIDENDO:");
        lblDividendo.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblDividendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, 20));

        txtDivisor.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtDivisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 20));

        txtDividendo.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtDividendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, 20));

        btnCalcular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnCalcular.setText("CALCULAR DIVISIÓN");
        btnCalcular.setPreferredSize(new java.awt.Dimension(170, 30));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        lblResiduo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblResiduo.setText("RESIDUO:");
        lblResiduo.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 20));

        lblCociente.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCociente.setText("COCIENTE:");
        lblCociente.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblCociente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 20));

        txtResiduo.setEditable(false);
        txtResiduo.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 20));

        txtCociente.setEditable(false);
        txtCociente.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtCociente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, 20));

        btnLimpiar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int dividendo = Integer.parseInt(txtDividendo.getText());
        int divisor = Integer.parseInt(txtDivisor.getText());
        Division division = new Division(dividendo, divisor);
        
        txtCociente.setText(String.valueOf(division.getCociente()));
        txtResiduo.setText(String.valueOf(division.getResiduo()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtDividendo.setText("");
        txtDivisor.setText("");
        txtCociente.setText("");
        txtResiduo.setText("");
        txtDividendo.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCociente;
    private javax.swing.JLabel lblDividendo;
    private javax.swing.JLabel lblDivisor;
    private javax.swing.JLabel lblResiduo;
    private javax.swing.JTextField txtCociente;
    private javax.swing.JTextField txtDividendo;
    private javax.swing.JTextField txtDivisor;
    private javax.swing.JTextField txtResiduo;
    // End of variables declaration//GEN-END:variables
}
