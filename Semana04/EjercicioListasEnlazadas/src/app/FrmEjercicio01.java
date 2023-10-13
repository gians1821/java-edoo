package app;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

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
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        scrollPane2 = new javax.swing.JScrollPane();
        listaNumeros2 = new javax.swing.JList<>();
        separator2 = new javax.swing.JSeparator();
        btnContar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JRadioButton();
        btnMostrarPares = new javax.swing.JRadioButton();
        lblEntero1 = new javax.swing.JLabel();
        txtEntero1 = new javax.swing.JTextField();

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

        scrollPane1.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros1.setModel(modelo);
        scrollPane1.setViewportView(listaNumeros1);

        panelCrearEnteros.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 40, 180));

        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCrearEnteros.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 20, 220));

        tabbedPane.addTab("CREAR ENTEROS", panelCrearEnteros);

        panelListarEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        btnBuscar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        scrollPane2.setPreferredSize(new java.awt.Dimension(120, 200));

        listaNumeros2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros2.setModel(modelo);
        scrollPane2.setViewportView(listaNumeros2);

        panelListarEnteros.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 40, 180));

        separator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelListarEnteros.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 20, 220));

        btnContar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnContar.setText("Contar");
        btnContar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnContar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        btnModificar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        btnOrdenar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        btnsMostrar.add(btnMostrarTodo);
        btnMostrarTodo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnMostrarTodo.setSelected(true);
        btnMostrarTodo.setText("Mostrar todos");
        panelListarEnteros.add(btnMostrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        btnsMostrar.add(btnMostrarPares);
        btnMostrarPares.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnMostrarPares.setText("Mostrar pares");
        panelListarEnteros.add(btnMostrarPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        lblEntero1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblEntero1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEntero1.setText("Entero:");
        lblEntero1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        txtEntero1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEntero1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtEntero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        tabbedPane.addTab("LISTAR ENTEROS", panelListarEnteros);

        bg.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Entero entero = enteros.buscar(Integer.parseInt(txtEntero1.getText()));
        System.out.println(entero);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        if (txtEntero0.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
        } else {
            try {
                int entero = Integer.parseInt(txtEntero0.getText());
                enteros.insertarAlFinal(entero);
                txtEntero0.setText("");
                txtEntero0.requestFocus();
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
            }
        }
        enteros.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        if (txtEntero0.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún entero</p></html>");
        } else {
            try {
                int entero = Integer.parseInt(txtEntero0.getText());
                enteros.insertarAlInicio(entero);
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
        enteros.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        int dato = Integer.parseInt(txtEntero1.getText());
        enteros.eliminar(dato);
        enteros.mostrar(modelo);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        String message = switch (enteros.contar()) {
            case 0 -> "No hay enteros en la lista";
            case 1 -> "Hay " + enteros.contar() + " entero en la lista";
            default -> "Hay " + enteros.contar() + " enteros en la lista";
        };
        
        JOptionPane.showMessageDialog(
                null, 
                message, 
                "Información", 
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnContarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        System.out.println(txtEntero1.getText());
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        enteros.ordenar();
        enteros.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JRadioButton btnMostrarPares;
    private javax.swing.JRadioButton btnMostrarTodo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup btnsMostrar;
    private javax.swing.JLabel lblEntero0;
    private javax.swing.JLabel lblEntero1;
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
    private javax.swing.JTextField txtEntero0;
    private javax.swing.JTextField txtEntero1;
    private javax.swing.JLabel txtEstado;
    // End of variables declaration//GEN-END:variables
}
