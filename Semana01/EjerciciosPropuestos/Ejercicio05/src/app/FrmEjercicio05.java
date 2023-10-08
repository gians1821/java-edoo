package app;

import javax.swing.DefaultListModel;

public class FrmEjercicio05 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    NumerosReales numerosReales = new NumerosReales();
    
    public FrmEjercicio05() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnAnnadir = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnMultiplicar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumero.setText("NÚMERO (N):");
        lblNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));

        txtNumero.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        btnAnnadir.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAnnadir.setText("AÑADIR");
        btnAnnadir.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        lblProducto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblProducto.setText("PRODUCTO:");
        lblProducto.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, 20));

        txtProducto.setEditable(false);
        txtProducto.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 20));

        btnMultiplicar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnMultiplicar.setText("MULTIPLICAR");
        btnMultiplicar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        jList1.setModel(modelo);
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 240, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnadirActionPerformed
        double n;
        n = Double.parseDouble(txtNumero.getText());
        txtNumero.setText("");
        txtNumero.requestFocus();
        numerosReales.addNumero(n);
        numerosReales.mostrar(modelo);
    }//GEN-LAST:event_btnAnnadirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        double producto = numerosReales.multiplicacion();
        txtProducto.setText(String.valueOf(producto));
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnadir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
