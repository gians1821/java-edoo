package app;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmEjercicio01 extends javax.swing.JFrame {

    ListaNodoSimple reales = new ListaNodoSimple();
    DefaultListModel modelo = new DefaultListModel();
    
    public FrmEjercicio01() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsMostrar = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        panelCrearEnteros = new javax.swing.JPanel();
        txtReal0 = new javax.swing.JTextField();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarInicio = new javax.swing.JButton();
        lblEntero0 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        listaNumeros1 = new javax.swing.JList<>();
        separator1 = new javax.swing.JSeparator();
        panelListarEnteros = new javax.swing.JPanel();
        scrollPane2 = new javax.swing.JScrollPane();
        listaNumeros2 = new javax.swing.JList<>();
        separator2 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        lblReal1 = new javax.swing.JLabel();
        txtReal1 = new javax.swing.JTextField();
        lblPos1 = new javax.swing.JLabel();
        txtPos1 = new javax.swing.JTextField();
        lblPos2 = new javax.swing.JLabel();
        txtPos2 = new javax.swing.JTextField();
        txtEstado1 = new javax.swing.JLabel();
        btnOrdenCreciente = new javax.swing.JButton();
        btnInvertirLista = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        panelListarEnteros1 = new javax.swing.JPanel();
        scrollPane3 = new javax.swing.JScrollPane();
        listaNumeros3 = new javax.swing.JList<>();
        separator3 = new javax.swing.JSeparator();
        btnUltimosReales = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        lblEne = new javax.swing.JLabel();
        txtNReales = new javax.swing.JTextField();
        txtReal2 = new javax.swing.JTextField();
        lblReal2 = new javax.swing.JLabel();
        btnObtenerSuma = new javax.swing.JButton();
        txtSuma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N

        panelCrearEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReal0.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtReal0.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtReal0, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        btnInsertarFinal.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnInsertarFinal.setText("Insertar Al FInal");
        btnInsertarFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        panelCrearEnteros.add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        btnInsertarInicio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnInsertarInicio.setText("Insertar Al Inicio");
        btnInsertarInicio.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarInicioActionPerformed(evt);
            }
        });
        panelCrearEnteros.add(btnInsertarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        lblEntero0.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblEntero0.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEntero0.setText("Número Real:");
        lblEntero0.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblEntero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        txtEstado.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtEstado.setPreferredSize(new java.awt.Dimension(130, 60));
        panelCrearEnteros.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        lblEstado.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");
        lblEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblEstado.setPreferredSize(new java.awt.Dimension(130, 30));
        panelCrearEnteros.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        scrollPane1.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros1.setModel(modelo);
        scrollPane1.setViewportView(listaNumeros1);

        panelCrearEnteros.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 60, 180));

        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCrearEnteros.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 20, 220));

        tabbedPane.addTab("CREAR REALES", panelCrearEnteros);

        panelListarEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane2.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros2.setModel(modelo);
        scrollPane2.setViewportView(listaNumeros2);

        panelListarEnteros.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 180));

        separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelListarEnteros.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 20, 220));

        btnAdd.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnAdd.setText("Añadir");
        btnAdd.setPreferredSize(new java.awt.Dimension(130, 30));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, 30));

        lblReal1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblReal1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReal1.setText("Real:");
        lblReal1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, 30));

        txtReal1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtReal1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 30));

        lblPos1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblPos1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPos1.setText("Posición n:");
        lblPos1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 30));

        txtPos1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtPos1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        lblPos2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblPos2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPos2.setText("Posición n:");
        lblPos2.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 30));

        txtPos2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtPos2.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 30));

        txtEstado1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEstado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtEstado1.setPreferredSize(new java.awt.Dimension(130, 30));
        panelListarEnteros.add(txtEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 30));

        btnOrdenCreciente.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnOrdenCreciente.setText("¿Orden creciente?");
        btnOrdenCreciente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnOrdenCreciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenCrecienteActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnOrdenCreciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 30));

        btnInvertirLista.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnInvertirLista.setText("Invertir lista");
        btnInvertirLista.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInvertirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvertirListaActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnInvertirLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 130, 30));

        btnEliminar1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, 30));

        tabbedPane.addTab("OPCIONES A", panelListarEnteros);

        panelListarEnteros1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane3.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros3.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros3.setModel(modelo);
        scrollPane3.setViewportView(listaNumeros3);

        panelListarEnteros1.add(scrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 180));

        separator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelListarEnteros1.add(separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 20, 220));

        btnUltimosReales.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnUltimosReales.setText("Obtener últimos reales");
        btnUltimosReales.setPreferredSize(new java.awt.Dimension(180, 30));
        btnUltimosReales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimosRealesActionPerformed(evt);
            }
        });
        panelListarEnteros1.add(btnUltimosReales, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        btnEliminar2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnEliminar2.setText("Eliminar");
        btnEliminar2.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });
        panelListarEnteros1.add(btnEliminar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        lblEne.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblEne.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEne.setText("N reales:");
        lblEne.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros1.add(lblEne, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        txtNReales.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtNReales.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros1.add(txtNReales, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        txtReal2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtReal2.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros1.add(txtReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        lblReal2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblReal2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblReal2.setText("Real:");
        lblReal2.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros1.add(lblReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        btnObtenerSuma.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnObtenerSuma.setText("Obtener suma");
        btnObtenerSuma.setPreferredSize(new java.awt.Dimension(150, 30));
        btnObtenerSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerSumaActionPerformed(evt);
            }
        });
        panelListarEnteros1.add(btnObtenerSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, 30));

        txtSuma.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtSuma.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSuma.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtSuma.setPreferredSize(new java.awt.Dimension(130, 30));
        panelListarEnteros1.add(txtSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, 30));

        tabbedPane.addTab("OPCIONES B", panelListarEnteros1);

        bg.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        if (txtReal0.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún real</p></html>");
        } else {
            try {
                float real = Float.parseFloat(txtReal0.getText());
                reales.insertarAlFinal(real);
                txtReal0.setText("");
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún real</p></html>");
            }
        }
        txtReal0.requestFocus();
        reales.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        if (txtReal0.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún real</p></html>");
        } else {
            try {
                int real = Integer.parseInt(txtReal0.getText());
                reales.insertarAlInicio(real);
                txtReal0.setText("");
                txtReal0.requestFocus();
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún real</p></html>");
            }
        }
        reales.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtReal1.getText().compareTo("") != 0 && txtPos1.getText().compareTo("") != 0) {
            float valor = Float.parseFloat(txtReal1.getText());
            int pos = Integer.parseInt(txtPos1.getText());
            if (pos > 0) {
                if (LogicApp.add(reales, valor, pos)) {
                    reales.mostrar(modelo);
                }
            }
        }        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnOrdenCrecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenCrecienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenCrecienteActionPerformed

    private void btnInvertirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvertirListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvertirListaActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnUltimosRealesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimosRealesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUltimosRealesActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnObtenerSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerSumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObtenerSumaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JButton btnInvertirLista;
    private javax.swing.JButton btnObtenerSuma;
    private javax.swing.JButton btnOrdenCreciente;
    private javax.swing.JButton btnUltimosReales;
    private javax.swing.ButtonGroup btnsMostrar;
    private javax.swing.JLabel lblEne;
    private javax.swing.JLabel lblEntero0;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblPos1;
    private javax.swing.JLabel lblPos2;
    private javax.swing.JLabel lblReal1;
    private javax.swing.JLabel lblReal2;
    private javax.swing.JList<String> listaNumeros1;
    private javax.swing.JList<String> listaNumeros2;
    private javax.swing.JList<String> listaNumeros3;
    private javax.swing.JPanel panelCrearEnteros;
    private javax.swing.JPanel panelListarEnteros;
    private javax.swing.JPanel panelListarEnteros1;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JScrollPane scrollPane3;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtEstado1;
    private javax.swing.JTextField txtNReales;
    private javax.swing.JTextField txtPos1;
    private javax.swing.JTextField txtPos2;
    private javax.swing.JTextField txtReal0;
    private javax.swing.JTextField txtReal1;
    private javax.swing.JTextField txtReal2;
    private javax.swing.JLabel txtSuma;
    // End of variables declaration//GEN-END:variables
}
