package vista;

import data.Ciudad;
import data.LineaEcuatorial;
import data.Nodo;

public class FrmEjercicio04 extends javax.swing.JFrame {

    private Nodo nodoCiudadEscogida;
    private final LineaEcuatorial lineaEcuatorial = new LineaEcuatorial();
    
    public FrmEjercicio04() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void avanzarCiudad() {
        if (nodoCiudadEscogida == null) return;
        nodoCiudadEscogida = nodoCiudadEscogida.getSgte();
        imprimirCiudad(nodoCiudadEscogida.getValor());
    }
    
    private void retrocederCiudad() {
        if (nodoCiudadEscogida == null) return;
        nodoCiudadEscogida = nodoCiudadEscogida.getAnt();
        imprimirCiudad(nodoCiudadEscogida.getValor());
    }
    
    private Ciudad generarCiudad() {
        nodoCiudadEscogida = (Nodo) lineaEcuatorial.getCiudadAleatoria()[0];
        return nodoCiudadEscogida.getValor();
    }
    
    private void imprimirCiudad(Ciudad ciudad) {
        txtCiudad.setText("<html><style>body{text-align:center;}"
                + "<body>"
                + "<span style='font-size:12px;font-weight:normal'>" + ciudad.getNombreCiudad() + "</span>"
                + "<br>" 
                + "<span style='font-size:10px;font-weight:bold'>" + ciudad.getNombrePais() + "</span>"
                + "</body></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtCiudad = new javax.swing.JLabel();
        btnGiro1 = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnGiro2 = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 450));
        setResizable(false);

        bg.setPreferredSize(new java.awt.Dimension(1000, 450));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCiudad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciudad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        txtCiudad.setPreferredSize(new java.awt.Dimension(250, 90));
        bg.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        btnGiro1.setText("Giro aleatorio");
        btnGiro1.setPreferredSize(new java.awt.Dimension(150, 30));
        btnGiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiro1ActionPerformed(evt);
            }
        });
        bg.add(btnGiro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        btnDerecha.setText("->");
        btnDerecha.setPreferredSize(new java.awt.Dimension(100, 30));
        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });
        bg.add(btnDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, -1));

        btnGiro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linea-ecuatorial.jpg"))); // NOI18N
        btnGiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiro2ActionPerformed(evt);
            }
        });
        bg.add(btnGiro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 940, 220));

        btnIzquierda.setText("<-");
        btnIzquierda.setPreferredSize(new java.awt.Dimension(100, 30));
        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        bg.add(btnIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        avanzarCiudad();
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnGiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiro1ActionPerformed
        imprimirCiudad(generarCiudad());
    }//GEN-LAST:event_btnGiro1ActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        retrocederCiudad();
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnGiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiro2ActionPerformed
        imprimirCiudad(generarCiudad());
    }//GEN-LAST:event_btnGiro2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnGiro1;
    private javax.swing.JButton btnGiro2;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JLabel txtCiudad;
    // End of variables declaration//GEN-END:variables
}
