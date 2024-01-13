package view;

import control.Control;
import control.MessageController;
import javax.swing.DefaultListModel;
import model.Cliente;
import model.ColaPrioridades;

public class MainFrame extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    ColaPrioridades<Cliente> cola;
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private boolean crearCola(String maxPrioridad) {
        if (maxPrioridad.compareTo("") == 0) return false;
        try {
            int maximaPrioridad = Integer.parseInt(maxPrioridad);
            cola = new ColaPrioridades<>(maximaPrioridad);
            return true;
        } catch (NumberFormatException e) {
            MessageController.showWarningMessage(e.toString());
            return false;
        }
    }
  
    private void actualizar() {
        if (cola != null) {
            btnAtender.setEnabled(true);
            btnEncolar.setEnabled(true);
            btnCrearCola.setEnabled(false);
            txtMaxPrioridad.setEnabled(false);
            Control.mostrar(cola, modelo);
        }
        System.out.println(cola);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtPrioridad = new javax.swing.JTextField();
        btnEncolar = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();
        scroll1 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        txtNombre = new javax.swing.JTextField();
        txtMaxPrioridad = new javax.swing.JTextField();
        btnCrearCola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        bg.setPreferredSize(new java.awt.Dimension(800, 700));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrioridad.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtPrioridad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prioridad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtPrioridad.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        btnEncolar.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnEncolar.setText("ENCOLAR");
        btnEncolar.setEnabled(false);
        btnEncolar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        bg.add(btnEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        btnAtender.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnAtender.setText("ATENDER");
        btnAtender.setEnabled(false);
        btnAtender.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });
        bg.add(btnAtender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        scroll1.setPreferredSize(new java.awt.Dimension(300, 175));

        list1.setModel(modelo);
        scroll1.setViewportView(list1);

        bg.add(scroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 40));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        txtMaxPrioridad.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtMaxPrioridad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Máxima prioridad (entero)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtMaxPrioridad.setPreferredSize(new java.awt.Dimension(250, 40));
        bg.add(txtMaxPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnCrearCola.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnCrearCola.setText("CREAR COLA DE PRIORIDADES");
        btnCrearCola.setPreferredSize(new java.awt.Dimension(300, 30));
        btnCrearCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearColaActionPerformed(evt);
            }
        });
        bg.add(btnCrearCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        Control.encolar(cola, txtNombre.getText(), txtPrioridad.getText());
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        Control.atender(cola);
        Control.mostrar(cola, modelo);
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnCrearColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearColaActionPerformed
        crearCola(txtMaxPrioridad.getText());
        actualizar();
    }//GEN-LAST:event_btnCrearColaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnCrearCola;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JList<String> list1;
    private javax.swing.JScrollPane scroll1;
    private javax.swing.JTextField txtMaxPrioridad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrioridad;
    // End of variables declaration//GEN-END:variables
}
