package app;

import javax.swing.DefaultListModel;

public class FrmEjercicio03 extends javax.swing.JFrame {

    TelefonosVector empleados = new TelefonosVector();
    
    public FrmEjercicio03() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCodigoBuscado = new javax.swing.JTextField();
        lblCodigoBuscado = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        lblDatos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblSueldo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigo.setText("Código:");
        lblCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        txtCodigoBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(txtCodigoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        lblCodigoBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoBuscado.setText("Código del empleado:");
        lblCodigoBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblCodigoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        bg.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        lblDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatos.setText("Datos del empleado:");
        lblDatos.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        lblSueldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSueldo.setText("Sueldo:");
        lblSueldo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(lblSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        txtSueldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSueldo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setText("EMPLEADO");
        bg.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        txtDatos.setEditable(false);
        txtDatos.setColumns(20);
        txtDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDatos.setRows(5);
        jScrollPane2.setViewportView(txtDatos);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigoBuscado = txtCodigoBuscado.getText();
        
        int index = empleados.buscarEmpleado(codigoBuscado);
        
        Telefono empleado = empleados.mostrarEmpleado(index);
        
        if (empleado != null) txtDatos.setText(empleado.toString());            
        else txtDatos.setText("Empleado no encontrado");
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        double sueldo = Double.parseDouble(txtSueldo.getText());
        
        Telefono empleado = new Telefono(codigo, nombre, sueldo);
        
        empleados.addEmpleado(empleado);
        
        txtCodigo.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");
        
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnAñadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoBuscado;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSueldo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBuscado;
    private javax.swing.JTextArea txtDatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
