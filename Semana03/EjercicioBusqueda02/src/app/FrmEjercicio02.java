package app;

import javax.swing.DefaultListModel;

public class FrmEjercicio02 extends javax.swing.JFrame {

    NumerosReales reales = new NumerosReales();
    DefaultListModel modelo = new DefaultListModel();
    
    public FrmEjercicio02() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNumeros = new javax.swing.JList<>();
        txtNumBuscado = new javax.swing.JTextField();
        lblNumBuscado = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        lblIndex = new javax.swing.JLabel();
        txtIndex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumero.setText("Número:");
        lblNumero.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        txtNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumero.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros.setModel(modelo);
        jScrollPane1.setViewportView(listaNumeros);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        txtNumBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(txtNumBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        lblNumBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumBuscado.setText("Número a buscar:");
        lblNumBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblNumBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        bg.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        lblIndex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIndex.setText("Índice:");
        lblIndex.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        txtIndex.setEditable(false);
        txtIndex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIndex.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(txtIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        double numero = Double.parseDouble(txtNumBuscado.getText());
        
        int indice = reales.buscarNumero(numero);
        modelo = reales.mostrar(modelo);
        
        txtIndex.setText(String.valueOf(indice));
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        double numero = Double.parseDouble(txtNumero.getText());
        
        reales.addNumero(numero);
        
        txtNumero.setText("");
        txtNumero.requestFocus();
        
        modelo = reales.mostrar(modelo);
    }//GEN-LAST:event_btnAñadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIndex;
    private javax.swing.JLabel lblNumBuscado;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JList<String> listaNumeros;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtNumBuscado;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
