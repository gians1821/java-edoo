package app.view;

import app.controller.Control;
import app.model.Pila;
import javax.swing.DefaultListModel;

public class Ejercicio01Frame extends javax.swing.JFrame {
    
    private final int maxSize = 10;
    private final Pila pila = new Pila(maxSize);
    private final DefaultListModel modelo = new DefaultListModel();
    
    public Ejercicio01Frame() {
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
        list = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(500, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtValor.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        btnEmpty.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEmpty.setText("EMPTY");
        btnEmpty.setPreferredSize(new java.awt.Dimension(120, 30));
        btnEmpty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyActionPerformed(evt);
            }
        });
        bg.add(btnEmpty, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        btnPush.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnPush.setText("PUSH");
        btnPush.setPreferredSize(new java.awt.Dimension(120, 30));
        btnPush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPushActionPerformed(evt);
            }
        });
        bg.add(btnPush, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        btnTop.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnTop.setText("TOP");
        btnTop.setPreferredSize(new java.awt.Dimension(120, 30));
        btnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopActionPerformed(evt);
            }
        });
        bg.add(btnTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        btnPop.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnPop.setText("POP");
        btnPop.setPreferredSize(new java.awt.Dimension(120, 30));
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        bg.add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        btnClear.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setPreferredSize(new java.awt.Dimension(120, 30));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        bg.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        list.setModel(modelo);
        pnScroll1.setViewportView(list);

        bg.add(pnScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 170, 170));

        getContentPane().add(bg, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmptyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyActionPerformed
        if (Control.empty(pila)) MessageController.showInfoMessage("La pila ESTÁ VACÍA");
        else MessageController.showInfoMessage("La pila NO ESTÁ VACÍA");
    }//GEN-LAST:event_btnEmptyActionPerformed

    private void btnPushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPushActionPerformed
        if (txtValor.getText().compareTo("") == 0) return;
        try {
            int valor = Integer.parseInt(txtValor.getText());
            if (Control.push(pila, valor)) {
                MessageController.showInfoMessage("Añadido el valor: " + valor);
                Control.mostrar(pila, modelo);
            } else {
                MessageController.showInfoMessage("NO SE PUDO añadir el valor");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnPushActionPerformed

    private void btnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopActionPerformed
        if (Control.top(pila) != Integer.MIN_VALUE) {
            int valor = Control.top(pila);
            MessageController.showInfoMessage("El valor de la cima: " + valor);
        } else MessageController.showInfoMessage("NO SE ENCONTRÓ un valor");
    }//GEN-LAST:event_btnTopActionPerformed

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        if (Control.pop(pila) != Integer.MIN_VALUE) {
            int valor = Control.pop(pila);
            MessageController.showInfoMessage("Valor eliminado: " + valor);
            Control.mostrar(pila, modelo);
        } else {
            MessageController.showInfoMessage("NO SE PUDO eliminar un valor");
        }        
    }//GEN-LAST:event_btnPopActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        Control.clear(pila);
        MessageController.showWarningMessage("PILA LIMPIADA");
        Control.mostrar(pila, modelo);
    }//GEN-LAST:event_btnClearActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnPush;
    private javax.swing.JButton btnTop;
    private javax.swing.JList<String> list;
    private javax.swing.JScrollPane pnScroll1;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
