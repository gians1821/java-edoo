package view;

import control.Control;
import javax.swing.table.DefaultTableModel;
import model.ArbolBinarioBusqueda;

public class MainFrame extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void actualizar() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtSueldo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btnMostrarPosorden = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnMostrarPreorden = new javax.swing.JButton();
        btnMostrarEnorden = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(950, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSueldo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUELDO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtSueldo.setPreferredSize(new java.awt.Dimension(200, 50));
        bg.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        bg.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        btnConsultar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        bg.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CÓDIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 50));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        txtNombres.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtNombres.setPreferredSize(new java.awt.Dimension(200, 50));
        bg.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        txtApellidos.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APELLIDOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtApellidos.setPreferredSize(new java.awt.Dimension(200, 50));
        bg.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        btnMostrarPosorden.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarPosorden.setText("Mostrar en Posorden");
        btnMostrarPosorden.setPreferredSize(new java.awt.Dimension(250, 30));
        btnMostrarPosorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPosordenActionPerformed(evt);
            }
        });
        bg.add(btnMostrarPosorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        btnActualizar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        bg.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        scroll1.setPreferredSize(new java.awt.Dimension(600, 300));

        table1.setModel(modelo);
        scroll1.setViewportView(table1);

        bg.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        btnGuardar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        bg.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        btnMostrarPreorden.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarPreorden.setText("Mostrar en Preorden");
        btnMostrarPreorden.setPreferredSize(new java.awt.Dimension(250, 30));
        btnMostrarPreorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPreordenActionPerformed(evt);
            }
        });
        bg.add(btnMostrarPreorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        btnMostrarEnorden.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarEnorden.setText("Mostrar en Enorden");
        btnMostrarEnorden.setPreferredSize(new java.awt.Dimension(250, 30));
        btnMostrarEnorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEnordenActionPerformed(evt);
            }
        });
        bg.add(btnMostrarEnorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        btnEliminar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, -1, -1));

        txtSexo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        txtSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEXO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtSexo.setPreferredSize(new java.awt.Dimension(200, 50));
        bg.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnMostrarPosordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPosordenActionPerformed
    }//GEN-LAST:event_btnMostrarPosordenActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarPreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPreordenActionPerformed
    }//GEN-LAST:event_btnMostrarPreordenActionPerformed

    private void btnMostrarEnordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEnordenActionPerformed
    }//GEN-LAST:event_btnMostrarEnordenActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarEnorden;
    private javax.swing.JButton btnMostrarPosorden;
    private javax.swing.JButton btnMostrarPreorden;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JComboBox<String> txtSexo;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
