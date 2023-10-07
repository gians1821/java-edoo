package app;

import javax.swing.JOptionPane;
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
        txtNombreBuscado = new javax.swing.JTextField();
        lblNombreBuscado = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNumeroTelefono = new javax.swing.JLabel();
        txtNumeroTelefono = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTelefonoEncontrado = new javax.swing.JLabel();
        txtTelefonoEncontrado = new javax.swing.JTextField();

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
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        txtNombreBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(txtNombreBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        lblNombreBuscado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreBuscado.setText("Nombre de la persona:");
        lblNombreBuscado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblNombreBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 190, -1));

        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadir.setText("Añadir");
        btnAñadir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        bg.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

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

        jTable1.setModel(modelo);
        jScrollPane1.setViewportView(jTable1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 170));

        lblTelefonoEncontrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefonoEncontrado.setText("Teléfono del empleado:");
        lblTelefonoEncontrado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(lblTelefonoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 190, -1));

        txtTelefonoEncontrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefonoEncontrado.setPreferredSize(new java.awt.Dimension(150, 30));
        bg.add(txtTelefonoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombreBuscado = txtNombreBuscado.getText();
        
        if (personas.getPersona(0) != null) {
            int index = personas.buscarPersona(nombreBuscado);
            Persona persona = personas.getPersona(index);
            if (persona != null) txtTelefonoEncontrado.setText(persona.getNumeroTelefono());
            else txtTelefonoEncontrado.setText("No existe");
        } else {
            JOptionPane.showMessageDialog(
                    null, 
                    "No hay personas en el vector", 
                    "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        String nombre = txtNombre.getText();
        String numeroTelefono = txtNumeroTelefono.getText();
        
        Persona persona = new Persona(nombre, numeroTelefono);
        
        personas.addPersona(persona);
        
        personas.mostrar(modelo);
        
        txtNombre.setText("");
        txtNumeroTelefono.setText("");
    
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnAñadirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreBuscado;
    private javax.swing.JLabel lblNumeroTelefono;
    private javax.swing.JLabel lblTelefonoEncontrado;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreBuscado;
    private javax.swing.JTextField txtNumeroTelefono;
    private javax.swing.JTextField txtTelefonoEncontrado;
    // End of variables declaration//GEN-END:variables
}
