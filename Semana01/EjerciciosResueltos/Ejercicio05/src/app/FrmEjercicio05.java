package app;

public class FrmEjercicio05 extends javax.swing.JFrame {

    public FrmEjercicio05() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblNumero1 = new javax.swing.JLabel();
        lblNumero2 = new javax.swing.JLabel();
        txtN2 = new javax.swing.JTextField();
        txtN1 = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblMCD = new javax.swing.JLabel();
        txtMCD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero1.setText("NUMERO 1");
        lblNumero1.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lblNumero2.setText("NUMERO 2");
        lblNumero2.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txtN2.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, -1));

        txtN1.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, -1));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 22));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        bg.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 22));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        btnCalcular.setText("CALCULAR");
        btnCalcular.setPreferredSize(new java.awt.Dimension(100, 22));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        bg.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        lblMCD.setText("MCD");
        lblMCD.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblMCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtMCD.setEditable(false);
        txtMCD.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtMCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 110, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        NumerosEnteros numeros = new NumerosEnteros(n1, n2);
        txtMCD.setText(String.valueOf(numeros.mcd()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtN1.setText("");
        txtN2.setText("");
        txtMCD.setText("");
        txtN1.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblMCD;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JTextField txtMCD;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    // End of variables declaration//GEN-END:variables
}
