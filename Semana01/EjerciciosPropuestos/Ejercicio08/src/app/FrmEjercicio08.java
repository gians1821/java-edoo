package app;

public class FrmEjercicio08 extends javax.swing.JFrame {

    public FrmEjercicio08() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNroCuadrados = new javax.swing.JLabel();
        txtNroCuadrados = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        lblLado = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNroCuadrados.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNroCuadrados.setText("#CUADRADOS:");
        lblNroCuadrados.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(lblNroCuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        txtNroCuadrados.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNroCuadrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        txtResultado.setEditable(false);
        txtResultado.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, 20));

        btnSumar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSumar.setText("SUMAR PERÍMETROS");
        btnSumar.setPreferredSize(new java.awt.Dimension(250, 30));
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        lblLado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblLado.setText("TAMAÑO LADO:");
        lblLado.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel1.add(lblLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        txtLado.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        int nroCuadrados = Integer.parseInt(txtNroCuadrados.getText());
        double lado = Double.parseDouble(txtLado.getText());
        
        SerieCuadrados serie = new SerieCuadrados(nroCuadrados, lado);
        
        txtResultado.setText(String.format("%.2f", serie.getPerimetro()));
    }//GEN-LAST:event_btnSumarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSumar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLado;
    private javax.swing.JLabel lblNroCuadrados;
    private javax.swing.JTextField txtLado;
    private javax.swing.JTextField txtNroCuadrados;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
