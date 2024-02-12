package view;

import control.Control;
import control.MessageController;
import javax.swing.DefaultListModel;
import model.Grafo;

public class MainFrame extends javax.swing.JFrame {

    private Grafo grafo;
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void habilitar(){
        btnCrearGrafo.setEnabled(false);
        crearGrafo();
    }
    
    public void crearGrafo() {
        grafo = new Grafo(6);
        Control.crearVertice(grafo, "1");
        Control.crearVertice(grafo, "2");
        Control.crearVertice(grafo, "3");
        Control.crearVertice(grafo, "4");
        Control.crearVertice(grafo, "5");
        Control.crearVertice(grafo, "6");
        Control.crearArco(grafo, "1", "3");
        Control.crearArco(grafo, "1", "4");
        Control.crearArco(grafo, "1", "5");
        Control.crearArco(grafo, "2", "5");
        Control.crearArco(grafo, "2", "6");
        Control.crearArco(grafo, "3", "2");
        Control.crearArco(grafo, "4", "2");
        Control.crearArco(grafo, "4", "5");
        Control.crearArco(grafo, "4", "6");
        Control.crearArco(grafo, "5", "3");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        btnCrearGrafo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        txtEtiquetaEntrada = new javax.swing.JTextField();
        btnGradoEntrada = new javax.swing.JButton();
        txtEtiquetaSalida = new javax.swing.JTextField();
        btnGradoSalida = new javax.swing.JButton();
        txtEtiquetaAdyacentes = new javax.swing.JTextField();
        btnMostrarAdyacentes = new javax.swing.JButton();
        txtEtiquetaAnchura = new javax.swing.JTextField();
        btnMostrarAnchura = new javax.swing.JButton();
        txtEtiquetaProfundidad = new javax.swing.JTextField();
        btnMostrarProfundidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setPreferredSize(new java.awt.Dimension(950, 600));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(204, 204, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearGrafo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnCrearGrafo.setText("CREAR GRAFO CON LISTA");
        btnCrearGrafo.setPreferredSize(new java.awt.Dimension(300, 30));
        btnCrearGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearGrafoActionPerformed(evt);
            }
        });
        panel1.add(btnCrearGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/grafo1.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 490, 250));

        bg.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 600));

        panel2.setBackground(new java.awt.Color(204, 255, 204));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEtiquetaEntrada.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaEntrada.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnGradoEntrada.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnGradoEntrada.setText("GRADO ENTRADA");
        btnGradoEntrada.setPreferredSize(new java.awt.Dimension(170, 30));
        btnGradoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoEntradaActionPerformed(evt);
            }
        });
        panel2.add(btnGradoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 40));

        txtEtiquetaSalida.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaSalida.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnGradoSalida.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnGradoSalida.setText("GRADO SALIDA");
        btnGradoSalida.setPreferredSize(new java.awt.Dimension(170, 30));
        btnGradoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoSalidaActionPerformed(evt);
            }
        });
        panel2.add(btnGradoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, 40));

        txtEtiquetaAdyacentes.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaAdyacentes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaAdyacentes.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaAdyacentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnMostrarAdyacentes.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarAdyacentes.setText("<html><p style=\"text-align:center;\">MOSTRAR ADYACENTES</html>");
        btnMostrarAdyacentes.setPreferredSize(new java.awt.Dimension(170, 50));
        btnMostrarAdyacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAdyacentesActionPerformed(evt);
            }
        });
        panel2.add(btnMostrarAdyacentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, 40));

        txtEtiquetaAnchura.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaAnchura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaAnchura.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        btnMostrarAnchura.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarAnchura.setText("<html><p style=\"text-align:center;\">MOSTRAR ANCHURA</html>");
        btnMostrarAnchura.setPreferredSize(new java.awt.Dimension(170, 50));
        btnMostrarAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAnchuraActionPerformed(evt);
            }
        });
        panel2.add(btnMostrarAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 40));

        txtEtiquetaProfundidad.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaProfundidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaProfundidad.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnMostrarProfundidad.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarProfundidad.setText("<html><p style=\"text-align:center;\">MOSTRAR PROFUNDIDAD</html>");
        btnMostrarProfundidad.setPreferredSize(new java.awt.Dimension(170, 50));
        btnMostrarProfundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProfundidadActionPerformed(evt);
            }
        });
        panel2.add(btnMostrarProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, 40));

        bg.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 440, 600));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGradoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradoEntradaActionPerformed
        String grado = Control.gradoEntrada(grafo, txtEtiquetaEntrada.getText());
        MessageController.showInfoMessage("Grado de entrada del vértice: " + grado);
    }//GEN-LAST:event_btnGradoEntradaActionPerformed

    private void btnGradoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradoSalidaActionPerformed
        String grado = Control.gradoSalida(grafo, txtEtiquetaSalida.getText());
        MessageController.showInfoMessage("Grado de salida del vértice: " + grado);
    }//GEN-LAST:event_btnGradoSalidaActionPerformed

    private void btnMostrarAdyacentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAdyacentesActionPerformed
        Control.mostrarAdyacentes(grafo, txtEtiquetaAdyacentes.getText());
    }//GEN-LAST:event_btnMostrarAdyacentesActionPerformed

    private void btnMostrarAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAnchuraActionPerformed
        Control.mostrarAnchura(grafo, txtEtiquetaAnchura.getText());
    }//GEN-LAST:event_btnMostrarAnchuraActionPerformed

    private void btnMostrarProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarProfundidadActionPerformed
        Control.mostrarProfundidad(grafo, txtEtiquetaProfundidad.getText());
    }//GEN-LAST:event_btnMostrarProfundidadActionPerformed

    private void btnCrearGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearGrafoActionPerformed
        habilitar();
    }//GEN-LAST:event_btnCrearGrafoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCrearGrafo;
    private javax.swing.JButton btnGradoEntrada;
    private javax.swing.JButton btnGradoSalida;
    private javax.swing.JButton btnMostrarAdyacentes;
    private javax.swing.JButton btnMostrarAnchura;
    private javax.swing.JButton btnMostrarProfundidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtEtiquetaAdyacentes;
    private javax.swing.JTextField txtEtiquetaAnchura;
    private javax.swing.JTextField txtEtiquetaEntrada;
    private javax.swing.JTextField txtEtiquetaProfundidad;
    private javax.swing.JTextField txtEtiquetaSalida;
    // End of variables declaration//GEN-END:variables
}
