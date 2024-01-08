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
        btnEvaluar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        txtPosfija = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(500, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEvaluar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEvaluar.setText("EVALUAR");
        btnEvaluar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });
        bg.add(btnEvaluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtResultado.setPreferredSize(new java.awt.Dimension(300, 40));
        bg.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        txtPosfija.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtPosfija.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Expresión posfija", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtPosfija.setPreferredSize(new java.awt.Dimension(300, 40));
        bg.add(txtPosfija, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        int resultado = Control.convertir(txtPosfija.getText());
        txtResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_btnEvaluarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JTextField txtPosfija;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
