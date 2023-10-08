package app;

import javax.swing.DefaultListModel;

public class VectorFrame extends javax.swing.JFrame {

    VectorReales v = new VectorReales();
    DefaultListModel modelo = new DefaultListModel();
    
    public VectorFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        txtMediana = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblValor1 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtDesv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblValor.setText("Mediana:");
        lblValor.setPreferredSize(new java.awt.Dimension(130, 25));
        bg.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        jList1.setModel(modelo);
        jScrollPane1.setViewportView(jList1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 70, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        txtMediana.setPreferredSize(new java.awt.Dimension(70, 25));
        bg.add(txtMediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        jButton1.setText("Cálculos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        lblValor1.setText("Valor:");
        lblValor1.setPreferredSize(new java.awt.Dimension(50, 25));
        bg.add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        lblValor2.setText("Desviación Estándar:");
        lblValor2.setPreferredSize(new java.awt.Dimension(130, 25));
        bg.add(lblValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        txtValor.setPreferredSize(new java.awt.Dimension(70, 25));
        bg.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        txtDesv.setPreferredSize(new java.awt.Dimension(70, 25));
        bg.add(txtDesv, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        double valor = Double.parseDouble(txtValor.getText());
        txtMediana.setText("");
        txtMediana.requestFocus();
        v.addNumero(valor);
        v.mostrar(modelo);
        txtValor.setText("");
        txtValor.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtDesv.setText(String.format("%.2f", v.getDesviacionEstandar()));
        txtMediana.setText(String.valueOf(v.mediana()));
        v.mostrar(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JTextField txtDesv;
    private javax.swing.JTextField txtMediana;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
