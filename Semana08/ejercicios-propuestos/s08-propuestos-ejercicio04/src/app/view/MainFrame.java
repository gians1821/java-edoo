package app.view;

import app.controller.Control;
import javax.swing.DefaultListModel;

public class MainFrame extends javax.swing.JFrame {
    
    private DefaultListModel modelo = new DefaultListModel();
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnRemplazar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnScroll2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(1000, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemplazar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnRemplazar.setText("MOSTRAR");
        btnRemplazar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnRemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemplazarActionPerformed(evt);
            }
        });
        bg.add(btnRemplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARCHIVO TXT: ./assets/ejemplo.txt");
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 30));
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        list2.setModel(modelo);
        pnScroll2.setViewportView(list2);

        bg.add(pnScroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 230, 230));

        getContentPane().add(bg, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemplazarActionPerformed
        Control.leerArchivoTexto();
        Control.mostrar(modelo);
    }//GEN-LAST:event_btnRemplazarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnRemplazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> list2;
    private javax.swing.JScrollPane pnScroll2;
    // End of variables declaration//GEN-END:variables
}
