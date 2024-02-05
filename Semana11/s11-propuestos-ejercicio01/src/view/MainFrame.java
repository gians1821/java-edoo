package view;

import control.Control;
import javax.swing.DefaultListModel;
import model.ArbolBinarioBusqueda;

public class MainFrame extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        scroll2 = new javax.swing.JScrollPane();
        list2 = new javax.swing.JList<>();
        scroll3 = new javax.swing.JScrollPane();
        list3 = new javax.swing.JList<>();
        scroll4 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(950, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtValor.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtValor.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        btnBuscar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        btnEliminar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, -1, -1));

        scroll1.setBorder(javax.swing.BorderFactory.createTitledBorder("PREORDEN"));
        scroll1.setPreferredSize(new java.awt.Dimension(150, 230));

        list1.setModel(modelo);
        scroll1.setViewportView(list1);

        bg.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        btnAgregar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, 40));

        scroll2.setBorder(javax.swing.BorderFactory.createTitledBorder("ENORDEN"));
        scroll2.setPreferredSize(new java.awt.Dimension(150, 230));

        list2.setModel(modelo);
        scroll2.setViewportView(list2);

        bg.add(scroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        scroll3.setBorder(javax.swing.BorderFactory.createTitledBorder("POSORDEN"));
        scroll3.setPreferredSize(new java.awt.Dimension(150, 230));

        list3.setModel(modelo);
        scroll3.setViewportView(list3);

        bg.add(scroll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        scroll4.setViewportView(txtResultado);

        bg.add(scroll4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 416, -1, 120));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Control.insertar(arbol, txtValor.getText());
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JList<String> list1;
    private javax.swing.JList<String> list2;
    private javax.swing.JList<String> list3;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JScrollPane scroll3;
    private javax.swing.JScrollPane scroll4;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
