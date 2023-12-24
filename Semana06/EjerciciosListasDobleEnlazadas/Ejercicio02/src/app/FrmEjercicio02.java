package app;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmEjercicio02 extends javax.swing.JFrame {

    ListaEnteros lista = new ListaEnteros();
    DefaultListModel modelo = new DefaultListModel();
    
    public FrmEjercicio02() {
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
        txtEntero0 = new javax.swing.JTextField();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarInicio = new javax.swing.JButton();
        lblEntero0 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        listaNumeros1 = new javax.swing.JList<>();
        separator1 = new javax.swing.JSeparator();
        panelListarEnteros = new javax.swing.JPanel();
        btnPrimos = new javax.swing.JButton();
        btnMediana = new javax.swing.JButton();
        scrollPane2 = new javax.swing.JScrollPane();
        listaNumeros2 = new javax.swing.JList<>();
        separator2 = new javax.swing.JSeparator();
        btnMenor = new javax.swing.JButton();
        btnDesvEstandar = new javax.swing.JButton();
        txtMenor = new javax.swing.JLabel();
        txtMediana = new javax.swing.JLabel();
        txtDesvEstandar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N

        panelCrearEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEntero0.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEntero0.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtEntero0, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

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
        lblEntero0.setText("Entero:");
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

        scrollPane1.setPreferredSize(new java.awt.Dimension(100, 200));

        listaNumeros1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros1.setModel(modelo);
        scrollPane1.setViewportView(listaNumeros1);

        panelCrearEnteros.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 180));

        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCrearEnteros.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 20, 220));

        tabbedPane.addTab("CREAR ENTERO", panelCrearEnteros);

        panelListarEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrimos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnPrimos.setText("Obtener primos");
        btnPrimos.setPreferredSize(new java.awt.Dimension(130, 30));
        btnPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimosActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        btnMediana.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnMediana.setText("Mediana");
        btnMediana.setPreferredSize(new java.awt.Dimension(130, 30));
        btnMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedianaActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnMediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        scrollPane2.setPreferredSize(new java.awt.Dimension(100, 200));

        listaNumeros2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros2.setModel(modelo);
        scrollPane2.setViewportView(listaNumeros2);

        panelListarEnteros.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 180));

        separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelListarEnteros.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 20, 220));

        btnMenor.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnMenor.setText("Obtener menor");
        btnMenor.setPreferredSize(new java.awt.Dimension(130, 30));
        btnMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenorActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        btnDesvEstandar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnDesvEstandar.setText("Desv. Estándar");
        btnDesvEstandar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnDesvEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesvEstandarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnDesvEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        txtMenor.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtMenor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMenor.setPreferredSize(new java.awt.Dimension(130, 60));
        panelListarEnteros.add(txtMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 140, 30));

        txtMediana.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtMediana.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMediana.setPreferredSize(new java.awt.Dimension(130, 60));
        panelListarEnteros.add(txtMediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 30));

        txtDesvEstandar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtDesvEstandar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDesvEstandar.setPreferredSize(new java.awt.Dimension(130, 60));
        panelListarEnteros.add(txtDesvEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 140, 30));

        tabbedPane.addTab("OPCIONES A", panelListarEnteros);

        bg.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedianaActionPerformed
        txtMediana.setText(String.valueOf(lista.getMediana()));
    }//GEN-LAST:event_btnMedianaActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        if (txtEntero0.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
        } else {
            try {
                int entero = Integer.parseInt(txtEntero0.getText());
                lista.insertarAlFinal(entero);
                txtEntero0.setText("");
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
            }
        }
        txtEntero0.requestFocus();
        lista.mostrarHaciaAdelante(modelo);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        if (txtEntero0.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
        } else {
            try {
                int entero = Integer.parseInt(txtEntero0.getText());
                lista.insertarAlInicio(entero);
                txtEntero0.setText("");
                txtEntero0.requestFocus();
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
            }
        }
        lista.mostrarHaciaAdelante(modelo);
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimosActionPerformed
        String listaPrimos = "";
        Nodo p = lista.getPrimos().primero;
        while (p != null) {
            listaPrimos += p.getValor() + "\n";
            p = p.getSgte();
        }
        JOptionPane.showMessageDialog(null, listaPrimos);
        
    }//GEN-LAST:event_btnPrimosActionPerformed

    private void btnMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenorActionPerformed
        txtMenor.setText(String.valueOf(lista.getMenorEntero().getValor()));
    }//GEN-LAST:event_btnMenorActionPerformed

    private void btnDesvEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesvEstandarActionPerformed
        txtDesvEstandar.setText(String.valueOf(lista.getDesvEstandar()));
    }//GEN-LAST:event_btnDesvEstandarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnDesvEstandar;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JButton btnMediana;
    private javax.swing.JButton btnMenor;
    private javax.swing.JButton btnPrimos;
    private javax.swing.ButtonGroup btnsMostrar;
    private javax.swing.JLabel lblEntero0;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JList<String> listaNumeros1;
    private javax.swing.JList<String> listaNumeros2;
    private javax.swing.JPanel panelCrearEnteros;
    private javax.swing.JPanel panelListarEnteros;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel txtDesvEstandar;
    private javax.swing.JTextField txtEntero0;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtMediana;
    private javax.swing.JLabel txtMenor;
    // End of variables declaration//GEN-END:variables
}
