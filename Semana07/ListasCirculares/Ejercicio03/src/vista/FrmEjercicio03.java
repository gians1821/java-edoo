package vista;

import modelo.Ruleta;

public class FrmEjercicio03 extends javax.swing.JFrame {

    private float saldo = 10000;
    private Ruleta ruleta = new Ruleta();
    
    public FrmEjercicio03() {
        initComponents();
        setLocationRelativeTo(null);
        actualizarFrm();
    }
    
    private void actualizarFrm() {
        lblSaldo.setText(String.valueOf(saldo));
    }
    
    private void girarRuleta() {
        if (txtMonto.getText().compareTo("") == 0) return;
        float monto = Float.parseFloat(txtMonto.getText());
        if (monto <= 0 || monto > saldo) return;
        
        Object[] resultados = ruleta.moverRuleta(monto);
        float resultado = (float) resultados[1];
        
        if (resultado == 0) saldo = 0;
        else saldo += resultado;
        
        actualizarFrm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblSaldo = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        btnGirarNVeces = new javax.swing.JButton();
        btnGirar1 = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        btnGirar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(500, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo:"));
        lblSaldo.setPreferredSize(new java.awt.Dimension(100, 40));
        bg.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        txtN.setBorder(javax.swing.BorderFactory.createTitledBorder("N:"));
        txtN.setPreferredSize(new java.awt.Dimension(50, 40));
        bg.add(txtN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        btnGirarNVeces.setText("Girar N veces");
        btnGirarNVeces.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGirarNVeces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirarNVecesActionPerformed(evt);
            }
        });
        bg.add(btnGirarNVeces, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        btnGirar1.setText("Girar");
        btnGirar1.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGirar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirar1ActionPerformed(evt);
            }
        });
        bg.add(btnGirar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto a apostar:"));
        txtMonto.setPreferredSize(new java.awt.Dimension(150, 40));
        bg.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        btnGirar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rueda.png"))); // NOI18N
        bg.add(btnGirar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 220, 220));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirarNVecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirarNVecesActionPerformed
        if (txtN.getText().compareTo("") == 0) return;
        int n = Integer.parseInt(txtN.getText());
        for (int i = 0; i < n; i++)
            girarRuleta();
    }//GEN-LAST:event_btnGirarNVecesActionPerformed

    private void btnGirar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirar1ActionPerformed
        girarRuleta();
    }//GEN-LAST:event_btnGirar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGirar1;
    private javax.swing.JButton btnGirar2;
    private javax.swing.JButton btnGirarNVeces;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
