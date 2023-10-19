package app;

import javax.swing.table.DefaultTableModel;

public class FrmEjercicio02 extends javax.swing.JFrame {

    ListaProductos productos = new ListaProductos();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public FrmEjercicio02() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txtStock = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        stock = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        precio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStock.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtStock.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnAgregar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, -1));

        stock.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        stock.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        stock.setText("Stock:");
        stock.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtEstado.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        txtEstado.setPreferredSize(new java.awt.Dimension(130, 60));
        bg.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        estado.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estado.setText("Estado:");
        estado.setToolTipText("");
        estado.setPreferredSize(new java.awt.Dimension(130, 30));
        bg.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        txtNombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        nombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre:");
        nombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtCodigo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        codigo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        codigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        codigo.setText("Código:");
        codigo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        txtPrecio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtPrecio.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        precio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio.setText("Precio:");
        precio.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        float precio = Float.parseFloat(txtPrecio.getText());
        int stock = Integer.parseInt(txtStock.getText());
        
        Producto producto = new Producto(codigo, nombre, precio, stock);
        
        productos.agregar(producto);
    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
