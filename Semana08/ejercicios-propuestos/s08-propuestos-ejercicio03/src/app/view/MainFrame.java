package app.view;

import app.controller.Control;
import app.model.Pila;
import javax.swing.DefaultListModel;

public class MainFrame extends javax.swing.JFrame {
    
    private final Pila<Integer> pila1 = new Pila();
    private Pila pila2;
    private final DefaultListModel modelo1 = new DefaultListModel();
    private final DefaultListModel modelo2 = new DefaultListModel();

    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        btnEmpty = new javax.swing.JButton();
        btnPush = new javax.swing.JButton();
        btnTop = new javax.swing.JButton();
        btnPop = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pnScroll1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        btnRemplazar = new javax.swing.JButton();
        pnScroll2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        txtValor1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(1000, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtValor.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btnEmpty.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEmpty.setText("EMPTY");
        btnEmpty.setPreferredSize(new java.awt.Dimension(120, 30));
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });
        bg.add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        btnPush.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnPush.setText("PUSH");
        btnPush.setPreferredSize(new java.awt.Dimension(120, 30));
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        bg.add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        btnTop.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnTop.setText("TOP");
        btnTop.setPreferredSize(new java.awt.Dimension(120, 30));
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        bg.add(btnTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        btnPop.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnPop.setText("POP");
        btnPop.setPreferredSize(new java.awt.Dimension(120, 30));
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        bg.add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setPreferredSize(new java.awt.Dimension(120, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        bg.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        list1.setModel(modelo1);
        pnScroll1.setViewportView(list1);

        bg.add(pnScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, 170));

        btnRemplazar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnRemplazar.setText("MULTIPLICAR");
        btnRemplazar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnRemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemplazarActionPerformed(evt);
            }
        });
        bg.add(btnRemplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        list2.setModel(modelo2);
        pnScroll2.setViewportView(list2);

        bg.add(pnScroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 170, 170));

        txtValor1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtValor1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtValor1.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        Control.empty(pila1);
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        Control.push(pila1, txtValor.getText());
        Control.mostrar(pila1, modelo1);
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        Control.top(pila1);
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        Control.pop(pila1);
        Control.mostrar(pila1, modelo1);
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Control.clear(pila1);
        Control.mostrar(pila1, modelo1);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemplazarActionPerformed
        pila2 = Control.multiplicarPor(pila1, txtValor1.getText());
        Control.mostrar(pila1, modelo1);
        Control.mostrar(pila2, modelo2);
    }//GEN-LAST:event_btnRemplazarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnRemplazar;
    private javax.swing.JButton btnTop;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list2;
    private javax.swing.JScrollPane pnScroll1;
    private javax.swing.JScrollPane pnScroll2;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValor1;
    // End of variables declaration//GEN-END:variables
}
