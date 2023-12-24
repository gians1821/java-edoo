package app;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmEjercicio03 extends javax.swing.JFrame {

    ListaCursos lista = new ListaCursos();
    DefaultListModel modelo = new DefaultListModel();
    
    public FrmEjercicio03() {
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
        txtCodigo = new javax.swing.JTextField();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarInicio = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        listaNumeros1 = new javax.swing.JList<>();
        separator1 = new javax.swing.JSeparator();
        lblCiclo = new javax.swing.JLabel();
        txtCiclo = new javax.swing.JTextField();
        lblCreditos = new javax.swing.JLabel();
        txtCreditos = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panelListarEnteros = new javax.swing.JPanel();
        scrollPane2 = new javax.swing.JScrollPane();
        listaNumeros2 = new javax.swing.JList<>();
        btnOrdenar = new javax.swing.JButton();
        txtCodigo2 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblCodigo1 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        txtCarrera = new javax.swing.JTextField();
        lblCarrera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N

        panelCrearEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        btnInsertarFinal.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnInsertarFinal.setText("Insertar Al FInal");
        btnInsertarFinal.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInsertarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarFinalActionPerformed(evt);
            }
        });
        panelCrearEnteros.add(btnInsertarFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        btnInsertarInicio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnInsertarInicio.setText("Insertar Al Inicio");
        btnInsertarInicio.setPreferredSize(new java.awt.Dimension(150, 30));
        btnInsertarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarInicioActionPerformed(evt);
            }
        });
        panelCrearEnteros.add(btnInsertarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        lblCodigo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código:");
        lblCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtEstado.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtEstado.setPreferredSize(new java.awt.Dimension(130, 60));
        panelCrearEnteros.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        lblEstado.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEstado.setText("Estado:");
        lblEstado.setToolTipText("");
        lblEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblEstado.setPreferredSize(new java.awt.Dimension(130, 30));
        panelCrearEnteros.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        scrollPane1.setPreferredSize(new java.awt.Dimension(500, 160));

        listaNumeros1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros1.setModel(modelo);
        scrollPane1.setViewportView(listaNumeros1);

        panelCrearEnteros.add(scrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        separator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator1.setPreferredSize(new java.awt.Dimension(3, 150));
        panelCrearEnteros.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 20, -1));

        lblCiclo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblCiclo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCiclo.setText("Ciclo:");
        lblCiclo.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtCiclo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCiclo.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        lblCreditos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblCreditos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCreditos.setText("Créditos:");
        lblCreditos.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtCreditos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCreditos.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        lblNombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");
        lblNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtNombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        tabbedPane.addTab("CREAR PELÍCULAS", panelCrearEnteros);

        panelListarEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane2.setPreferredSize(new java.awt.Dimension(500, 200));

        listaNumeros2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros2.setModel(modelo);
        scrollPane2.setViewportView(listaNumeros2);

        panelListarEnteros.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 150));

        btnOrdenar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnOrdenar.setText("Ordenar por nombre");
        btnOrdenar.setPreferredSize(new java.awt.Dimension(200, 30));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 30));

        txtCodigo2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCodigo2.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 30));

        lblCodigo2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblCodigo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo2.setText("Código:");
        lblCodigo2.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));

        btnEliminar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 30));

        lblCodigo1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblCodigo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo1.setText("Código:");
        lblCodigo1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        txtCodigo1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCodigo1.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 30));

        btnBuscar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, 30));

        btnMostrar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.setPreferredSize(new java.awt.Dimension(130, 30));
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, 30));

        txtCarrera.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCarrera.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(txtCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, 30));

        lblCarrera.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblCarrera.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarrera.setText("Carrera:");
        lblCarrera.setPreferredSize(new java.awt.Dimension(100, 30));
        panelListarEnteros.add(lblCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, 30));

        tabbedPane.addTab("OPCIONES A", panelListarEnteros);

        bg.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        LogicApp.ordernarCreciente(lista);
        lista.mostrar(modelo);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        if (txtCodigo.getText().compareTo("") == 0 &&
            txtNombre.getText().compareTo("") == 0 &&
            txtCiclo.getText().compareTo("") == 0 &&
            txtCreditos.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún curso</p></html>");
        } else {
            try {
                // CREAR CURSO
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String ciclo = txtCiclo.getText();
                int creditos = Integer.parseInt(txtCreditos.getText());
                Curso curso = LogicApp.crearCurso(codigo, nombre, ciclo, creditos);
                // INSERTAMOS PELÍCULA
                LogicApp.insertarAlInicio(lista, curso);
                // REINICIAMOS EL FORMULARIO
                txtCodigo.setText("");
                txtNombre.setText("");
                txtCiclo.setText("");
                txtCreditos.setText("");
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún curso</p></html>");
            }
        }
        txtNombre.requestFocus();
        lista.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        if (txtCodigo.getText().compareTo("") == 0 &&
            txtNombre.getText().compareTo("") == 0 &&
            txtCiclo.getText().compareTo("") == 0 &&
            txtCreditos.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ningún curso</p></html>");
        } else {
            try {
                // CREAR CURSO
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String ciclo = txtCiclo.getText();
                int creditos = Integer.parseInt(txtCreditos.getText());
                Curso curso = LogicApp.crearCurso(codigo, nombre, ciclo, creditos);
                // INSERTAMOS PELÍCULA
                LogicApp.insertarAlFinal(lista, curso);
                // REINICIAMOS EL FORMULARIO
                txtCodigo.setText("");
                txtNombre.setText("");
                txtCiclo.setText("");
                txtCreditos.setText("");
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún curso</p></html>");
            }
        }
        txtNombre.requestFocus();
        lista.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int pos = Integer.parseInt(txtCodigo2.getText());
        if (LogicApp.delete(lista, pos)) lista.mostrar(modelo);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup btnsMostrar;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCiclo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JList<String> listaNumeros1;
    private javax.swing.JList<String> listaNumeros2;
    private javax.swing.JPanel panelCrearEnteros;
    private javax.swing.JPanel panelListarEnteros;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JTextField txtCiclo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCreditos;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
