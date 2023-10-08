package app;

public class FrmEjercicio07 extends javax.swing.JFrame {

    public FrmEjercicio07() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        btnCifrasIguales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumero.setText("NÚMERO (N):");
        lblNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 20));

        txtNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 20));

        txtResultado.setEditable(false);
        txtResultado.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, 20));

        btnCifrasIguales.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnCifrasIguales.setText("¿TIENE CIFRAS IGUALES?");
        btnCifrasIguales.setPreferredSize(new java.awt.Dimension(250, 30));
        btnCifrasIguales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrasIgualesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCifrasIguales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCifrasIgualesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrasIgualesActionPerformed
        int numero = Integer.parseInt(txtNumero.getText());
        
        NumeroEntero numeroEntero = new NumeroEntero(numero);
        
        if (numeroEntero.tieneCifrasIguales()) txtResultado.setText("SI");
        else txtResultado.setText("NO");

        
    }//GEN-LAST:event_btnCifrasIgualesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCifrasIguales;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
