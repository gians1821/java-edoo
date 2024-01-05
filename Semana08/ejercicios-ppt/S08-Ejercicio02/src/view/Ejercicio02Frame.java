package view;

import controller.Control;

public class Ejercicio02Frame extends javax.swing.JFrame {

    public Ejercicio02Frame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtExpresion = new javax.swing.JTextField();
        btnVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(500, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtExpresion.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtExpresion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expresión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtExpresion.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtExpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        btnVerificar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnVerificar.setText("VERIFICAR");
        btnVerificar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        bg.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        if (txtExpresion.getText().compareTo("") == 0) return;
        boolean status = Control.verificaPalidromo(txtExpresion.getText());
        if (status) MessageController.showInfoMessage("ES palíndromo");
        else MessageController.showInfoMessage("NO ES palíndromo");
    }//GEN-LAST:event_btnVerificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables
}
