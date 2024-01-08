package app.view;

import app.controller.Control;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnConvertir = new javax.swing.JButton();
        txtPosfija = new javax.swing.JTextField();
        txtInfija = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 300));

        bg.setPreferredSize(new java.awt.Dimension(500, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConvertir.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnConvertir.setText("CONVERTIR");
        btnConvertir.setPreferredSize(new java.awt.Dimension(120, 30));
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        bg.add(btnConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        txtPosfija.setEditable(false);
        txtPosfija.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtPosfija.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expresión posfija", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtPosfija.setPreferredSize(new java.awt.Dimension(300, 40));
        bg.add(txtPosfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txtInfija.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtInfija.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expresión infija", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtInfija.setPreferredSize(new java.awt.Dimension(300, 40));
        bg.add(txtInfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        String resultado = Control.convertir(txtInfija.getText());
        txtPosfija.setText(resultado);
    }//GEN-LAST:event_btnConvertirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JTextField txtInfija;
    private javax.swing.JTextField txtPosfija;
    // End of variables declaration//GEN-END:variables
}
