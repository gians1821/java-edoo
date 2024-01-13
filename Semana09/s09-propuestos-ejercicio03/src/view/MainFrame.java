package view;

import control.Control;
import javax.swing.DefaultListModel;
import model.Cliente;
import model.Cola;

public class MainFrame extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    Cola<Cliente> cola = new Cola<>();
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtMontoConsumido = new javax.swing.JTextField();
        btnEncolar = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        txtNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        bg.setPreferredSize(new java.awt.Dimension(800, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMontoConsumido.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtMontoConsumido.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto consumido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtMontoConsumido.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtMontoConsumido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        btnEncolar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEncolar.setText("ENCOLAR");
        btnEncolar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        bg.add(btnEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        btnAtender.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAtender.setText("ATENDER");
        btnAtender.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        bg.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        scroll1.setPreferredSize(new java.awt.Dimension(180, 175));

        list1.setModel(modelo);
        scroll1.setViewportView(list1);

        bg.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        Control.encolar(cola, txtNombre.getText(), txtMontoConsumido.getText());
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        Control.atender(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnAtenderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JList<String> list1;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTextField txtMontoConsumido;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
