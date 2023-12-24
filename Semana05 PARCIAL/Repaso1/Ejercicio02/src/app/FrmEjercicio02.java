package app;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmEjercicio02 extends javax.swing.JFrame {

    ListaPeliculas peliculas = new ListaPeliculas();
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
        txtHoras = new javax.swing.JTextField();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarInicio = new javax.swing.JButton();
        lblHoras = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        scrollPane1 = new javax.swing.JScrollPane();
        listaNumeros1 = new javax.swing.JList<>();
        separator1 = new javax.swing.JSeparator();
        lblMinutos = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JTextField();
        lblSegundos = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panelListarEnteros = new javax.swing.JPanel();
        scrollPane2 = new javax.swing.JScrollPane();
        listaNumeros2 = new javax.swing.JList<>();
        txtEstado1 = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        btnOrdenCreciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabbedPane.setFont(new java.awt.Font("FreeSans", 0, 15)); // NOI18N

        panelCrearEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoras.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtHoras.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

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

        lblHoras.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblHoras.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHoras.setText("Horas:");
        lblHoras.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

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

        lblMinutos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblMinutos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMinutos.setText("Minutos:");
        lblMinutos.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        txtMinutos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtMinutos.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtMinutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        lblSegundos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblSegundos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSegundos.setText("Segundos:");
        lblSegundos.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtSegundos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtSegundos.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtSegundos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        lblNombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");
        lblNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtNombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        panelCrearEnteros.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        tabbedPane.addTab("CREAR PELÍCULAS", panelCrearEnteros);

        panelListarEnteros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPane2.setPreferredSize(new java.awt.Dimension(500, 200));

        listaNumeros2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        listaNumeros2.setModel(modelo);
        scrollPane2.setViewportView(listaNumeros2);

        panelListarEnteros.add(scrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 150));

        txtEstado1.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEstado1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtEstado1.setPreferredSize(new java.awt.Dimension(130, 60));
        panelListarEnteros.add(txtEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        btnOrdenar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnOrdenar.setText("Ordenar crecientemente");
        btnOrdenar.setPreferredSize(new java.awt.Dimension(200, 30));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, 30));

        btnOrdenCreciente.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnOrdenCreciente.setText("¿Orden creciente?");
        btnOrdenCreciente.setPreferredSize(new java.awt.Dimension(150, 30));
        btnOrdenCreciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenCrecienteActionPerformed(evt);
            }
        });
        panelListarEnteros.add(btnOrdenCreciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 30));

        tabbedPane.addTab("OPCIONES A", panelListarEnteros);

        bg.add(tabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed

    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnInsertarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarInicioActionPerformed
        if (txtNombre.getText().compareTo("") == 0 &&
            txtHoras.getText().compareTo("") == 0 &&
            txtMinutos.getText().compareTo("") == 0 &&
            txtSegundos.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ninguna película</p></html>");
        } else {
            try {
                // CREAR PELÍCULA
                String nombre = txtNombre.getText();
                int horas = Integer.parseInt(txtHoras.getText());
                int minutos = Integer.parseInt(txtMinutos.getText());
                int segundos = Integer.parseInt(txtSegundos.getText());
                Pelicula pelicula = LogicApp.crearPelicula(nombre, horas, minutos, segundos);
                // INSERTAMOS PELÍCULA
                LogicApp.insertarAlInicio(peliculas, pelicula);
                // REINICIAMOS EL FORMULARIO
                txtNombre.setText("");
                txtHoras.setText("");
                txtMinutos.setText("");
                txtSegundos.setText("");
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún real</p></html>");
            }
        }
        txtNombre.requestFocus();
        peliculas.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarInicioActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        if (txtNombre.getText().compareTo("") == 0 &&
            txtHoras.getText().compareTo("") == 0 &&
            txtMinutos.getText().compareTo("") == 0 &&
            txtSegundos.getText().compareTo("") == 0) {
            txtEstado.setForeground(Color.red);
            txtEstado.setText("<html><p>No se ha registrado ninguna película</p></html>");
        } else {
            try {
                // CREAR PELÍCULA
                String nombre = txtNombre.getText();
                int horas = Integer.parseInt(txtHoras.getText());
                int minutos = Integer.parseInt(txtMinutos.getText());
                int segundos = Integer.parseInt(txtSegundos.getText());
                Pelicula pelicula = LogicApp.crearPelicula(nombre, horas, minutos, segundos);
                // INSERTAMOS PELÍCULA
                LogicApp.insertarAlFinal(peliculas, pelicula);
                // REINICIAMOS EL FORMULARIO
                txtNombre.setText("");
                txtHoras.setText("");
                txtMinutos.setText("");
                txtSegundos.setText("");
                txtEstado.setForeground(new Color(2, 112, 36));
                txtEstado.setText("<html><p>Se ha registrado correctamente</p></html>");
            } catch (NumberFormatException ex) {
                txtEstado.setForeground(Color.red);
                txtEstado.setText("<html><p>No se ha registrado ningún real</p></html>");
            }
        }
        txtNombre.requestFocus();
        peliculas.mostrar(modelo);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnOrdenCrecienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenCrecienteActionPerformed
        if (LogicApp.esOrdenada(peliculas)) {
            txtEstado1.setForeground(new Color(2, 112, 36));
            txtEstado1.setText("<html><p>Sí, está ordenada crecientemente.</p></html>");
        } else {
            txtEstado1.setForeground(Color.red);
            txtEstado1.setText("<html><p>No, no está ordenada crecientemente.</p></html>");
        }
    }//GEN-LAST:event_btnOrdenCrecienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarInicio;
    private javax.swing.JButton btnOrdenCreciente;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.ButtonGroup btnsMostrar;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSegundos;
    private javax.swing.JList<String> listaNumeros1;
    private javax.swing.JList<String> listaNumeros2;
    private javax.swing.JPanel panelCrearEnteros;
    private javax.swing.JPanel panelListarEnteros;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JSeparator separator1;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtEstado1;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtMinutos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSegundos;
    // End of variables declaration//GEN-END:variables
}
