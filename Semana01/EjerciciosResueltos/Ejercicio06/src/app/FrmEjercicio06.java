package app;

public class FrmEjercicio06 extends javax.swing.JFrame {

    public FrmEjercicio06() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setText("VALOR DE X");
        lblX.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lblN.setText("VALOR DE N");
        lblN.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txtN.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 110, -1));

        txtX.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtX, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 110, -1));

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

        lblResultado.setText("POTENCIA");
        lblResultado.setPreferredSize(new java.awt.Dimension(150, 25));
        bg.add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtResultado.setEditable(false);
        txtResultado.setPreferredSize(new java.awt.Dimension(64, 25));
        bg.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 110, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double x = Double.parseDouble(txtX.getText());
        int n = Integer.parseInt(txtN.getText());
        Matematica mat = new Matematica(x, n);
        txtResultado.setText(String.valueOf(mat.calcularPotencia()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtX.setText("");
        txtN.setText("");
        txtResultado.setText("");
        txtX.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
