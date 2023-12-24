package app;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEjercicio01 extends javax.swing.JFrame {

    ListaEmpleados lista = new ListaEmpleados();
    DefaultTableModel modelo = new DefaultTableModel();
    String[] idColumnas = {"CÓDIGO", "NOMBRES", "APELLIDOS", "SEXO", "SUELDO"};
    
    public FrmEjercicio01() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo.setColumnIdentifiers(idColumnas);
    }
    
    private Empleado guardarEmpleado() {
        try {
            String codigo = txtCodigo.getText();
            String nombres = txtNombres.getText();
            String apellidos = txtApellidos.getText();
            String sexo = comboSexo.getSelectedItem().toString();
            float sueldo = Float.parseFloat(txtSueldo.getText());
            return LogicApp.crearEmpleado(codigo, nombres, apellidos, sexo, sueldo);    
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    private void limpiarCampos() {
        txtCodigo.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        comboSexo.setSelectedIndex(0);
        txtSueldo.setText("");
    }
    
    private void actualizarEstado() {
        if (lista.contar() > 0) {
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
        } else {
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
        lista.mostrarHaciaAdelante(modelo);
        txtEmpleadoMayorSueldo.setText(lista.buscarMayorSueldo().getValor().getCodigo());
        txtSumaSueldos.setText(String.valueOf(LogicApp.sumarSueldos(lista)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        scrollPanel1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        txtSueldo = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtSumaSueldos = new javax.swing.JTextField();
        txtEmpleadoMayorSueldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPanel1.setPreferredSize(new java.awt.Dimension(700, 200));

        table1.setModel(modelo);
        scrollPanel1.setViewportView(table1);

        bg.add(scrollPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        txtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("SUELDO"));
        txtSueldo.setPreferredSize(new java.awt.Dimension(150, 40));
        bg.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        txtApellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDOS"));
        txtApellidos.setPreferredSize(new java.awt.Dimension(150, 40));
        bg.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CÓDIGO"));
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 40));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO" }));
        comboSexo.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));
        txtNombres.setPreferredSize(new java.awt.Dimension(150, 40));
        bg.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        btnGuardar.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        bg.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        btnEliminar.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        btnConsultar.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        bg.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        btnActualizar.setFont(new java.awt.Font("FreeSans", 0, 16)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.setPreferredSize(new java.awt.Dimension(120, 30));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        bg.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        txtSumaSueldos.setEditable(false);
        txtSumaSueldos.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO DE SUELDOS ACUMULADOS"));
        txtSumaSueldos.setPreferredSize(new java.awt.Dimension(300, 40));
        bg.add(txtSumaSueldos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        txtEmpleadoMayorSueldo.setEditable(false);
        txtEmpleadoMayorSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("EMPLEADO CON MAYOR SUELDO"));
        txtEmpleadoMayorSueldo.setPreferredSize(new java.awt.Dimension(300, 40));
        bg.add(txtEmpleadoMayorSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Empleado empleado = guardarEmpleado();
        LogicApp.guardarEmpleado(lista, empleado);
        actualizarEstado();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        LogicApp.eliminar(lista, codigo);
        actualizarEstado();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String codigo = txtCodigo.getText();
        Nodo nodo = LogicApp.buscar(lista, codigo);
        if (nodo != null) {
            JOptionPane.showMessageDialog(null, nodo.getValor().toString());
        }
        actualizarEstado();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String codigo = txtCodigo.getText();
        Nodo nodo = LogicApp.buscar(lista, codigo);
        if (nodo != null) {
            Empleado empleadoNuevo = guardarEmpleado();
            LogicApp.actualizar(lista, nodo, empleadoNuevo);
        }
        actualizarEstado();
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JScrollPane scrollPanel1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmpleadoMayorSueldo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtSumaSueldos;
    // End of variables declaration//GEN-END:variables

}
