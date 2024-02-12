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
        txtNumVertices.setEditable(false);
        btnCrearGrafo.setEnabled(false);
        btnCrearVertice.setEnabled(true);
        btnCrearArco.setEnabled(true);
    }
    
    public boolean crearGrafo(String numVertices) {
        try {
            int numeroVertices = Integer.parseInt(numVertices);
            if (numeroVertices > 0) {
                this.grafo = new Grafo(numeroVertices);
                MessageController.showInfoMessage("Grafo inicializado");
                return true;
            } else {
                MessageController.showWarningMessage("Grafo no inicializado");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return false;
    }
    
    public void actualizar() {
        int vertices = grafo.getNumeroVertices();
        int maxVertices = grafo.getVertices().length;
        if (vertices >= maxVertices) {
            btnCrearVertice.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        txtNumVertices = new javax.swing.JTextField();
        btnCrearGrafo = new javax.swing.JButton();
        txtEtiqueta = new javax.swing.JTextField();
        btnCrearVertice = new javax.swing.JButton();
        txtEtiquetaA = new javax.swing.JTextField();
        txtEtiquetaB = new javax.swing.JTextField();
        btnCrearArco = new javax.swing.JButton();
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

        txtNumVertices.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtNumVertices.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número máximo de vértices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtNumVertices.setPreferredSize(new java.awt.Dimension(250, 40));
        panel1.add(txtNumVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        btnCrearGrafo.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnCrearGrafo.setText("CREAR GRAFO CON LISTA");
        btnCrearGrafo.setPreferredSize(new java.awt.Dimension(300, 30));
        btnCrearGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearGrafoActionPerformed(evt);
            }
        });
        panel1.add(btnCrearGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtEtiqueta.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiqueta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiqueta.setPreferredSize(new java.awt.Dimension(200, 40));
        panel1.add(txtEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btnCrearVertice.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnCrearVertice.setText("CREAR VÉRTICE");
        btnCrearVertice.setEnabled(false);
        btnCrearVertice.setPreferredSize(new java.awt.Dimension(200, 30));
        btnCrearVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVerticeActionPerformed(evt);
            }
        });
        panel1.add(btnCrearVertice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, 40));

        txtEtiquetaA.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaA.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaA.setPreferredSize(new java.awt.Dimension(200, 40));
        panel1.add(txtEtiquetaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        txtEtiquetaB.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaB.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaB.setPreferredSize(new java.awt.Dimension(200, 40));
        panel1.add(txtEtiquetaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        btnCrearArco.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnCrearArco.setText("CREAR ARCO (A -> B)");
        btnCrearArco.setEnabled(false);
        btnCrearArco.setPreferredSize(new java.awt.Dimension(200, 30));
        btnCrearArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArcoActionPerformed(evt);
            }
        });
        panel1.add(btnCrearArco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, 40));

        bg.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 600));

        panel2.setBackground(new java.awt.Color(204, 255, 204));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEtiquetaEntrada.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaEntrada.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btnGradoEntrada.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnGradoEntrada.setText("GRADO ENTRADA");
        btnGradoEntrada.setPreferredSize(new java.awt.Dimension(170, 30));
        btnGradoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoEntradaActionPerformed(evt);
            }
        });
        panel2.add(btnGradoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, 40));

        txtEtiquetaSalida.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaSalida.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaSalida.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        btnGradoSalida.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnGradoSalida.setText("GRADO SALIDA");
        btnGradoSalida.setPreferredSize(new java.awt.Dimension(170, 30));
        btnGradoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradoSalidaActionPerformed(evt);
            }
        });
        panel2.add(btnGradoSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 40));

        txtEtiquetaAdyacentes.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaAdyacentes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaAdyacentes.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaAdyacentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        btnMostrarAdyacentes.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarAdyacentes.setText("<html><p style=\"text-align:center;\">MOSTRAR ADYACENTES</html>");
        btnMostrarAdyacentes.setPreferredSize(new java.awt.Dimension(170, 50));
        btnMostrarAdyacentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAdyacentesActionPerformed(evt);
            }
        });
        panel2.add(btnMostrarAdyacentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, 40));

        txtEtiquetaAnchura.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaAnchura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaAnchura.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        btnMostrarAnchura.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarAnchura.setText("<html><p style=\"text-align:center;\">MOSTRAR ANCHURA</html>");
        btnMostrarAnchura.setPreferredSize(new java.awt.Dimension(170, 50));
        btnMostrarAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAnchuraActionPerformed(evt);
            }
        });
        panel2.add(btnMostrarAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, 40));

        txtEtiquetaProfundidad.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        txtEtiquetaProfundidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Etiqueta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 15))); // NOI18N
        txtEtiquetaProfundidad.setPreferredSize(new java.awt.Dimension(200, 40));
        panel2.add(txtEtiquetaProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        btnMostrarProfundidad.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        btnMostrarProfundidad.setText("<html><p style=\"text-align:center;\">MOSTRAR PROFUNDIDAD</html>");
        btnMostrarProfundidad.setPreferredSize(new java.awt.Dimension(170, 50));
        btnMostrarProfundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarProfundidadActionPerformed(evt);
            }
        });
        panel2.add(btnMostrarProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, 40));

        bg.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 470, 600));

        getContentPane().add(bg, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVerticeActionPerformed
        Control.crearVertice(grafo, txtEtiqueta.getText());
        actualizar();
    }//GEN-LAST:event_btnCrearVerticeActionPerformed

    private void btnCrearGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearGrafoActionPerformed
        if (crearGrafo(txtNumVertices.getText())) {
            habilitar();
        }
    }//GEN-LAST:event_btnCrearGrafoActionPerformed

    private void btnCrearArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArcoActionPerformed
        Control.crearArco(grafo, txtEtiquetaA.getText(), txtEtiquetaB.getText());
    }//GEN-LAST:event_btnCrearArcoActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCrearArco;
    private javax.swing.JButton btnCrearGrafo;
    private javax.swing.JButton btnCrearVertice;
    private javax.swing.JButton btnGradoEntrada;
    private javax.swing.JButton btnGradoSalida;
    private javax.swing.JButton btnMostrarAdyacentes;
    private javax.swing.JButton btnMostrarAnchura;
    private javax.swing.JButton btnMostrarProfundidad;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextField txtEtiqueta;
    private javax.swing.JTextField txtEtiquetaA;
    private javax.swing.JTextField txtEtiquetaAdyacentes;
    private javax.swing.JTextField txtEtiquetaAnchura;
    private javax.swing.JTextField txtEtiquetaB;
    private javax.swing.JTextField txtEtiquetaEntrada;
    private javax.swing.JTextField txtEtiquetaProfundidad;
    private javax.swing.JTextField txtEtiquetaSalida;
    private javax.swing.JTextField txtNumVertices;
    // End of variables declaration//GEN-END:variables
}
