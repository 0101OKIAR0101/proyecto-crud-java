
package Vista;

import Controlador.operaciones_tecno;
import Controlador.operaciones_proveedores;
import Controlador.operaciones_venta;
import Modelo.Producto;
import Modelo.Proveedores;
import Modelo.Ventas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    
    
    public Ventana() {
        initComponents();
        CargarLista ();
        CargarLista2();
        CargarLista3();

    }
     public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
        ComboBoxMarca.setSelectedIndex(0);
        ComboBoxCategoria.setSelectedIndex(0);
        
    }
     public void limpiar2(){
        txtId2.setText("");
        txtNombre2.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }
    public void limpiar3(){
        txtId3.setText("");
        txtTotal.setText("");
        txtCodigoProducto.setText("");
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        ComboBoxMarca = new javax.swing.JComboBox<>();
        ComboBoxCategoria = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtId2 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnAgregar2 = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        btnSalir22 = new javax.swing.JButton();
        btnModificar2 = new javax.swing.JButton();
        btnListar2 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtId3 = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtCodigoProducto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla3 = new javax.swing.JTable();
        btnAgregarVenta = new javax.swing.JButton();
        btnModificarVenta = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        btnListaVenta = new javax.swing.JButton();
        btnLimpiarVenta = new javax.swing.JButton();
        btnSalirVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Precio:");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Marca: ");

        jLabel7.setText("Categoria:");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        ComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asus", "Apple", "Dell", "Canon", "Garmin", "Huawei", "Lenovo", "LG", "Microsoft", "Nikon", "Nintendo", "Nokia ", "Samsung", "Sony", "Xiaomi", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " }));

        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Precio", "Cantidad", "Marca", "Categoria"
            }
        ));
        jScrollPane5.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21)
                                .addComponent(ComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(txtId)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEliminar)
                            .addComponent(btnSalir))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar)
                            .addComponent(btnListar)
                            .addComponent(btnLimpiar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel1);

        jLabel8.setText("ID:");

        jLabel9.setText("Nombre:");

        jLabel10.setText("Telefono:");

        jLabel11.setText("Correo:");

        txtId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId2ActionPerformed(evt);
            }
        });

        btnAgregar2.setText("Agregar");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        btnEliminar2.setText("Eliminar");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnSalir22.setText("Salir");
        btnSalir22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir22ActionPerformed(evt);
            }
        });

        btnModificar2.setText("Modificar");
        btnModificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar2ActionPerformed(evt);
            }
        });

        btnListar2.setText("Listar");
        btnListar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListar2ActionPerformed(evt);
            }
        });

        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Correo"
            }
        ));
        jScrollPane4.setViewportView(Table2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtId2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtNombre2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtTelefono))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnModificar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListar2)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar2)
                    .addComponent(btnEliminar2)
                    .addComponent(btnSalir22))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar2)
                    .addComponent(btnListar2)
                    .addComponent(btnLimpiar2))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proveedores", jPanel2);

        jLabel12.setText("ID:");

        jLabel13.setText("Total:");

        jLabel14.setText("CodigoProducto:");

        Tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Total", "CodigoProducto"
            }
        ));
        jScrollPane3.setViewportView(Tabla3);

        btnAgregarVenta.setText("Agregar");
        btnAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVentaActionPerformed(evt);
            }
        });

        btnModificarVenta.setText("Modificar");
        btnModificarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarVentaActionPerformed(evt);
            }
        });

        btnEliminarVenta.setText("Eliminar");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        btnListaVenta.setText("Listar");
        btnListaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVentaActionPerformed(evt);
            }
        });

        btnLimpiarVenta.setText("Limpiar");
        btnLimpiarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarVentaActionPerformed(evt);
            }
        });

        btnSalirVenta.setText("Salir");
        btnSalirVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtId3)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnEliminarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAgregarVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificarVenta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarVenta)
                            .addComponent(btnSalirVenta))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarVenta)
                    .addComponent(btnModificarVenta)
                    .addComponent(btnLimpiarVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarVenta)
                    .addComponent(btnListaVenta)
                    .addComponent(btnSalirVenta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ventas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
                int Id = Integer.parseInt(txtId2.getText());
                String Nombre  = txtNombre2.getText();
                int Telefono = Integer.parseInt(txtTelefono.getText());
                String Correo = txtCorreo.getText();
                // Creas un objeto Pais con los valores
                Proveedores nuevoProveedores = new Proveedores(Id , Nombre, Telefono, Correo);
                

                // Llamas a la operación agregar
                operaciones_proveedores operaciones_proveedores = new operaciones_proveedores();
                int resultado = operaciones_proveedores.Agregar(nuevoProveedores);

                // Manejas el resultado, por ejemplo, muestras un mensaje
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor agregado exitosamente");
                    CargarLista2 ();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar proveedor");
                }        
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
  // Aquí obtienes los valores desde tus componentes de interfaz
                int Id = Integer.parseInt(txtId.getText());
                String Nombre  = txtNombre.getText();
                String Descripcion = txtDescripcion.getText();
                int CantidadEnStock = Integer.parseInt(txtCantidad.getText());
                String Marca = ComboBoxMarca.getSelectedItem().toString();
                String Categoria = ComboBoxCategoria.getSelectedItem().toString();
                int Precio = Integer.parseInt(txtPrecio.getText());

                Producto nuevoProducto = new Producto(Id , Nombre, Descripcion, Precio, CantidadEnStock, Marca,  Categoria);
                

                // Llamas a la operación agregar
                operaciones_tecno operaciones_tecno = new operaciones_tecno();
                int resultado = operaciones_tecno.Agregar(nuevoProducto);

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
                    CargarLista ();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar el producto");
                }        
    }//GEN-LAST:event_btnAgregarActionPerformed
    
    
    
    
    
    private void CargarLista(){
        //Obtenemos el Modelo de la tabla
     DefaultTableModel modeloTabla = (DefaultTableModel) TablaDatos.getModel();
     //limpiamos las filas existentes
     modeloTabla.setRowCount(0);
     //creamos la instancia metodo
     operaciones_tecno operacion = new operaciones_tecno();
     List<Producto> listaTecno = operacion.Lista();
     //ordenamos los datos de la lista
     for(Producto p: listaTecno){
         modeloTabla.addRow(new Object[] {p.getId(), p.getNombre(), p.getDescripcion(), p.getPrecio(), p.getCantidadEnStock(),p.getMarca(),p.getCategoria()});
     }
     
    }
    
    private void CargarLista2(){
        //Obtenemos el Modelo de la tabla
     DefaultTableModel modeloTabla = (DefaultTableModel) Table2.getModel();
     //limpiamos las filas existentes
     modeloTabla.setRowCount(0);
     //creamos la instancia metodo
     operaciones_proveedores operacion2 = new operaciones_proveedores();
     List<Proveedores> listaTecno2 = operacion2.Lista();
     //ordenamos los datos de la lista
     for(Proveedores     p: listaTecno2){
         modeloTabla.addRow(new Object[] {p.getId(), p.getNombre(), p.getTelefono(), p.getCorreo()});
     }
    }
      private void CargarLista3(){
        //Obtenemos el Modelo de la tabla
     DefaultTableModel modeloTabla = (DefaultTableModel) Tabla3.getModel();
     //limpiamos las filas existentes
     modeloTabla.setRowCount(0);
     //creamos la instancia metodo
     operaciones_venta operacion3 = new operaciones_venta();
     List<Ventas> listaTecno3 = operacion3.Lista();
     //ordenamos los datos de la lista
     for(Ventas p: listaTecno3){
         modeloTabla.addRow(new Object[] {p.getId(), p.getTotal(), p.getCodigoProducto()});
     }
     
    }
    private void btnModificarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarVentaActionPerformed
    int Id = Integer.parseInt(txtId3.getText());
    int Total = Integer.parseInt(txtTotal.getText());
    int CodigoProducto = Integer.parseInt(txtCodigoProducto.getText());
    
    Ventas VentaModificada = new Ventas(Id, Total, CodigoProducto);
    operaciones_venta operacion3 = new operaciones_venta();

    int resultado = operacion3.Modificar(VentaModificada);
     
    if (resultado > 0) {
    JOptionPane.showMessageDialog(null, "Venta Modificado exitosamente");
    CargarLista3 ();
    } else {
    
    JOptionPane.showMessageDialog(null, "Error al Modificar Venta");
    
    }        
    }//GEN-LAST:event_btnModificarVentaActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
    //Obtenemos el Modelo de la tabla
     DefaultTableModel modeloTabla = (DefaultTableModel) TablaDatos.getModel();
     //limpiamos las filas existentes
     modeloTabla.setRowCount(0);
     //creamos la instancia metodo
     operaciones_tecno operacion = new operaciones_tecno();
     List<Producto> listaTecno = operacion.Lista();
     //ordenamos los datos de la lista
     for(Producto p: listaTecno){
        modeloTabla.addRow(new Object[] {p.getId(), p.getNombre(), p.getDescripcion(), p.getPrecio(), p.getCantidadEnStock(),p.getMarca(),p.getCategoria()});
     }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         //obtenemos el codigo 
        String codigoEliminar = txtId.getText();
        //validacion
        if(codigoEliminar.isEmpty()){
            JOptionPane.showMessageDialog(null, "ingrese su id:");
            return;
        }
    //instancio
    operaciones_tecno operacion = new operaciones_tecno();
    int resultado = operacion.Eliminar(codigoEliminar);
    
    if(resultado > 0) {
        JOptionPane.showMessageDialog(null, "Producto eliminado");
        CargarLista ();
    }else{
        JOptionPane.showMessageDialog(null, "error Verifique");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       
    int Id = Integer.parseInt(txtId.getText());
    String Nombre  = txtNombre.getText();
    String Descripcion = txtDescripcion.getText();
    int CantidadEnStock = Integer.parseInt(txtCantidad.getText());
    String Marca = ComboBoxMarca.getSelectedItem().toString();
    String Categoria = ComboBoxCategoria.getSelectedItem().toString();
    int Precio = Integer.parseInt(txtPrecio.getText());
    
    //instancio la clase
    Producto productoModificado = new Producto(Id, Nombre, Descripcion, Precio, CantidadEnStock, Marca, Categoria);
    operaciones_tecno operacion = new operaciones_tecno();
    
    int resultado = operacion.Modificar(productoModificado);
    //manejo resultados
    if (resultado > 0) {
        JOptionPane.showMessageDialog(null, "Producto modificado");
        CargarLista();
    }else {
        JOptionPane.showMessageDialog(null, "Error al modificar");    }
                                                
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
     limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnListar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListar2ActionPerformed

     DefaultTableModel modeloTabla = (DefaultTableModel) Table2.getModel();
     //limpiamos las filas existentes
     modeloTabla.setRowCount(0);
     //creamos la instancia metodo
     operaciones_proveedores operacion2 = new operaciones_proveedores();
     List<Proveedores> listaTecno2 = operacion2.Lista();
     //ordenamos los datos de la lista
     for(Proveedores     p: listaTecno2){
         modeloTabla.addRow(new Object[] {p.getId(), p.getNombre(), p.getTelefono(), p.getCorreo()});
    }//GEN-LAST:event_btnListar2ActionPerformed
    }
    private void btnSalir22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir22ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnSalir22ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        limpiar2();
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
     String codigoEliminar = txtId2.getText();
        //validacion
        if(codigoEliminar.isEmpty()){
            JOptionPane.showMessageDialog(null, "ingrese su id:");
            return;
        }
    //instancio
    operaciones_proveedores operacion2 = new operaciones_proveedores();
    int resultado = operacion2.Eliminar(codigoEliminar);
    
    if(resultado > 0) {
        JOptionPane.showMessageDialog(null, "Proveedor eliminado");
        CargarLista2 ();
    }else{
        JOptionPane.showMessageDialog(null, "error Verifique");
    }
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnModificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar2ActionPerformed
                int Id = Integer.parseInt(txtId2.getText());
                String Nombre  = txtNombre2.getText();
                int Telefono = Integer.parseInt(txtTelefono.getText());
                String Correo = txtCorreo.getText(); 

                Proveedores proveedorModificado = new Proveedores(Id, Nombre, Telefono, Correo);
                operaciones_proveedores operacion2 = new operaciones_proveedores();

                int resultado = operacion2.Modificar(proveedorModificado);
                // Manejas el resultado, por ejemplo, muestras un mensaje
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Proveedor Modificado exitosamente");
                    CargarLista2 ();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar proveedor");
                }        
    }//GEN-LAST:event_btnModificar2ActionPerformed

    private void btnSalirVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirVentaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirVentaActionPerformed

    private void btnLimpiarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarVentaActionPerformed
        limpiar3();
    }//GEN-LAST:event_btnLimpiarVentaActionPerformed

    private void btnAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVentaActionPerformed
                int Id = Integer.parseInt(txtId3.getText());
                int Total = Integer.parseInt(txtTotal.getText());
                int CodigoProducto = Integer.parseInt(txtCodigoProducto.getText());
                // Creas un objeto Pais con los valores
                Ventas nuevaVenta = new Ventas(Id , Total, CodigoProducto);
                

                // Llamas a la operación agregar
                operaciones_venta ventas = new operaciones_venta();
                int resultado = ventas.Agregar(nuevaVenta);

                // Manejas el resultado, por ejemplo, muestras un mensaje
                if (resultado > 0) { 
                    JOptionPane.showMessageDialog(null, "Venta agregada exitosamente");
                    CargarLista3 ();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al agregar Venta");
                }        
    }//GEN-LAST:event_btnAgregarVentaActionPerformed

    private void btnListaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVentaActionPerformed
     DefaultTableModel modeloTabla = (DefaultTableModel) Tabla3.getModel();
     //limpiamos las filas existentes
     modeloTabla.setRowCount(0);
     //creamos la instancia metodo
     operaciones_venta operacion3 = new operaciones_venta();
     List<Ventas> listaTecno3 = operacion3.Lista();
     //ordenamos los datos de la lista
     for(Ventas p: listaTecno3){
         modeloTabla.addRow(new Object[] {p.getId(), p.getTotal(), p.getCodigoProducto()});
    }                                          
    }//GEN-LAST:event_btnListaVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
 
        String codigoEliminar = txtId3.getText();
 
        if(codigoEliminar.isEmpty()){
            JOptionPane.showMessageDialog(null, "ingrese su id:");
            return;
        }
    operaciones_venta operacion3 = new operaciones_venta();
    int resultado = operacion3.Eliminar(codigoEliminar);
    
    if(resultado > 0) {
        JOptionPane.showMessageDialog(null, "Venta eliminada");
        CargarLista3 ();
    }else{
        JOptionPane.showMessageDialog(null, "error Verifique");
    }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCategoria;
    private javax.swing.JComboBox<String> ComboBoxMarca;
    private javax.swing.JTable Tabla3;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable Table2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnAgregarVenta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiarVenta;
    private javax.swing.JButton btnListaVenta;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnListar2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar2;
    private javax.swing.JButton btnModificarVenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir22;
    private javax.swing.JButton btnSalirVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtId2;
    private javax.swing.JTextField txtId3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

