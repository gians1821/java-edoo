package app;

import java.awt.Color;
import javax.swing.DefaultListModel;

public class FrmEjercicio01 extends javax.swing.JFrame {

    ListaEnteros enteros = new ListaEnteros();
    DefaultListModel modelo = new DefaultListModel();
    
    public FrmEjercicio01() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelCrearEnteros = new javax.swing.JPanel();
        txtEntero = new javax.swing.JTextField();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarInicio = new javax.swing.JButton();
        lblEntero = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaNumeros1 = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        panelListarEnteros = new javax.swing.JPanel();
        btnAñadir3 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaNumeros = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCrearEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEntero.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        btnInsertarFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertarFinal.setText("Insertar Al FInal");
        btnInsertarFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        panelCrearEnteros.add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        btnInsertarInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInsertarInicio.setText("Insertar Al Inicio");
        btnInsertarInicio.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarInicioActionPerformed(evt);
            }
        });
        panelCrearEnteros.add(btnInsertarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        lblEntero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntero.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEntero.setText("Entero:");
        lblEntero.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtEstado.setPreferredSize(new java.awt.Dimension(130, 60));
        panelCrearEnteros.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");
        lblEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblEstado.setPreferredSize(new java.awt.Dimension(130, 30));
        panelCrearEnteros.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros1.setModel(modelo);
        jScrollPane2.setViewportView(listaNumeros1);

        panelCrearEnteros.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 40, 180));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCrearEnteros.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 20, 220));

        tabbedPane.addTab("CREAR ENTEROS", panelCrearEnteros);

        btnAñadir3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAñadir3.setText("Modificar Elemento");
        btnAñadir3.setPreferredSize(new java.awt.Dimension(170, 30));
        btnAñadir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadir3ActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnAñadir3);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(170, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnBuscar);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros.setModel(modelo);
        jScrollPane1.setViewportView(listaNumeros);

        panelListarEnteros.add(jScrollPane1);

        tabbedPane.addTab("LISTAR ENTEROS", panelListarEnteros);

        bg.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        if (txtEntero.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
        } else {
            int entero = Integer.parseInt(txtEntero.getText());
            enteros.insertarAlFinal(entero);
            txtEntero.setText("");
            txtEntero.requestFocus();
            txtEstado.setForeground(new Color(2, 112, 36));
            txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
        }
        enteros.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        if (txtEntero.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
        } else {
            int entero = Integer.parseInt(txtEntero.getText());
            enteros.insertarAlInicio(entero);
            txtEntero.setText("");
            txtEntero.requestFocus();
            txtEstado.setForeground(new Color(2, 112, 36));
            txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
        }
        enteros.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnAñadir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadir3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadir3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAñadir3;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEntero;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JList<String> listaNumeros;
    private javax.swing.JList<String> listaNumeros1;
    private javax.swing.JPanel panelCrearEnteros;
    private javax.swing.JPanel panelListarEnteros;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JLabel txtEstado;
    // End of variables declaration//GEN-END:variables
}
