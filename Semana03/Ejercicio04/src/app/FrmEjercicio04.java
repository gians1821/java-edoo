package app;

import javax.swing.table.DefaultTableModel;

public class FrmEjercicio04 extends javax.swing.JFrame {

    PersonasVector personas = new PersonasVector();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FrmEjercicio04() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        txtCodigoBuscado = new javax.swing.JTextField();
        lblCodigoBuscado = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        lblDatos = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNumeroTelefono = new javax.swing.JLabel();
        txtNumeroTelefono = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, -1, -1));

        txtCodigoBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(txtCodigoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        lblCodigoBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoBuscado.setText("Código del empleado:");
        lblCodigoBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblCodigoBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        bg.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        lblDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDatos.setText("Datos del empleado:");
        lblDatos.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        lblNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 180, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 110, -1));

        lblNumeroTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroTelefono.setText("Número de Teléfono:");
        lblNumeroTelefono.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(lblNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 180, -1));

        txtNumeroTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumeroTelefono.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtNumeroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 110, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("EMPLEADO");
        bg.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 280, -1));

        txtDatos.setEditable(false);
        txtDatos.setColumns(20);
        txtDatos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDatos.setRows(5);
        jScrollPane2.setViewportView(txtDatos);

        bg.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, -1));

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 250));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
//        String codigoBuscado = txtCodigoBuscado.getText();
//        
//        int index = empleados.buscarEmpleado(codigoBuscado);
//        
////        Persona empleado = empleados.mostrarEmpleado(index);
//        
//        if (empleado != null) txtDatos.setText(empleado.toString());            
//        else txtDatos.setText("Empleado no encontrado");
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String nombre = txtNombre.getText();
        String numeroTelefono = txtNumeroTelefono.getText();
        
        Persona persona = new Persona(nombre, numeroTelefono);
        
        personas.addPersona(persona);
        
        personas.mostrarPersonas(modelo);
        
        txtNombre.setText("");
        txtNumeroTelefono.setText("");
    
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnAñadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigoBuscado;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroTelefono;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCodigoBuscado;
    private javax.swing.JTextArea txtDatos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
