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
        btnBuscar = new javax.swing.JButton();
        stock = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        precio = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnMostrarTodos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnIngresarPrecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setPreferredSize(new java.awt.Dimension(630, 550));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStock.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtStock.setNextFocusableComponent(btnBuscar);
        txtStock.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        btnBuscar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setNextFocusableComponent(txtCodigo);
        btnBuscar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        bg.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, -1));

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
        txtNombre.setNextFocusableComponent(txtPrecio);
        txtNombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        nombre.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre:");
        nombre.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtCodigo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtCodigo.setFocusCycleRoot(true);
        txtCodigo.setNextFocusableComponent(txtNombre);
        txtCodigo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        codigo.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        codigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        codigo.setText("Código:");
        codigo.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        txtPrecio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        txtPrecio.setNextFocusableComponent(txtStock);
        txtPrecio.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        precio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        precio.setText("Precio:");
        precio.setPreferredSize(new java.awt.Dimension(100, 30));
        bg.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        btnAgregar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnAgregar.setMnemonic('A');
        btnAgregar.setText("Agregar");
        btnAgregar.setNextFocusableComponent(txtCodigo);
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bg.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 120, -1));

        tblProductos.setModel(modelo        );
        scrollPane.setViewportView(tblProductos);

        bg.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 470, 180));

        btnMostrarTodos.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnMostrarTodos.setText("Todos");
        btnMostrarTodos.setNextFocusableComponent(txtCodigo);
        btnMostrarTodos.setPreferredSize(new java.awt.Dimension(150, 30));
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });
        bg.add(btnMostrarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 120, -1));

        btnEliminar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setNextFocusableComponent(txtCodigo);
        btnEliminar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bg.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 120, -1));

        btnModificar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setNextFocusableComponent(txtCodigo);
        btnModificar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        bg.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 120, -1));

        btnOrdenar.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setNextFocusableComponent(txtCodigo);
        btnOrdenar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        bg.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 120, -1));

        btnIngresarPrecio.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        btnIngresarPrecio.setText("Ingresar Precio");
        btnIngresarPrecio.setNextFocusableComponent(txtCodigo);
        btnIngresarPrecio.setPreferredSize(new java.awt.Dimension(150, 30));
        btnIngresarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPrecioActionPerformed(evt);
            }
        });
        bg.add(btnIngresarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 30));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = txtCodigo.getText();
        
        Producto producto = productos.consultar(codigo);
        
        txtNombre.setText(producto.getNombre());
        txtPrecio.setText(String.valueOf(producto.getPrecio()));
        txtStock.setText(String.valueOf(producto.getStock()));
        
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        float precio = Float.parseFloat(txtPrecio.getText());
        int stock = Integer.parseInt(txtStock.getText());
        
        Producto producto = new Producto(codigo, nombre, precio, stock);
        
        productos.agregar(producto);
        
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        productos.mostrarTodos(modelo);
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo = txtCodigo.getText();
        productos.eliminar(codigo);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        float precio = Float.parseFloat(txtPrecio.getText());
        int stock = Integer.parseInt(txtStock.getText());
        
        Producto nuevo = new Producto(codigo, nombre, precio, stock);
        
        productos.modificar(codigo, nuevo);        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        productos.ordenarPorNombre();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnIngresarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPrecioActionPerformed
        float precio = Float.parseFloat(txtPrecio.getText());
        
        productos.mostrarSegunPrecio(modelo, precio);
    }//GEN-LAST:event_btnIngresarPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresarPrecio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel stock;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
