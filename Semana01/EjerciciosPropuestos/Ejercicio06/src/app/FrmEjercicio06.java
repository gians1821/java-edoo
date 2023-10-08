package app;

import javax.swing.DefaultListModel;

public class FrmEjercicio06 extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    NumerosReales numerosReales = new NumerosReales();
    
    public FrmEjercicio06() {
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
        lblPosicion = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblNumABuscar = new javax.swing.JLabel();
        txtNumABuscar = new javax.swing.JTextField();

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

        lblPosicion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblPosicion.setText("POSICIÓN (°):");
        lblPosicion.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, 20));

        txtPosicion.setEditable(false);
        txtPosicion.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 20));

        btnBuscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnBuscar.setText("OBTENER POS.");
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jList1.setModel(modelo);
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 240, 200));

        lblNumABuscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNumABuscar.setText("NÚMERO:");
        lblNumABuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(lblNumABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 20));

        txtNumABuscar.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel1.add(txtNumABuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 20));

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        double numero = Double.parseDouble(txtNumABuscar.getText());
        txtPosicion.setText(String.valueOf(numerosReales.buscarNumero(numero)));
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumABuscar;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JTextField txtNumABuscar;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
