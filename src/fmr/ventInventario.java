/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fmr;
import dao.rl_compra;
import dao.rl_producto;
import dao.rl_usuario;
import dao.rl_venta;
import florma.compra;
import florma.producto;
import florma.usuario;
import florma.venta;
import javax.swing.table.*;
import java.awt.*;

public class ventInventario extends javax.swing.JFrame {
   
    DefaultTableModel modelo = new DefaultTableModel();
    rl_usuario usu = new rl_usuario();
    rl_producto pro =new rl_producto();
    rl_venta ven = new rl_venta();
    rl_compra co = new rl_compra();
usuario uss;

    public void AbsUser(usuario c) {
        this.uss = c;
        //txtCaje.setText(c.getApellidoPaterno()+" "+c.getApellidoMaterno()+" "+c.getNombres());
    }
     public void RefrescarCliente(){
          
       while(modelo.getRowCount()>0){
           modelo.removeRow(0);
       } 
       for(usuario us : usu.readCLIENTE()){
           Object fila[] = new Object[7];
           fila[0] = us.getCi();
           fila[1] = us.getApellidoPaterno();
           fila[2] = us.getApellidoMaterno();
           fila[3] = us.getNombres();
           fila[4] = us.getCorreo();
           fila[5] = us.getDireccion();
           fila[6] = us.getTelefono();
           
           modelo.addRow(fila);
       }
       TablaConsul.setModel(modelo);
    }
     
     
    
    public ventInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo.addColumn("ci");
        modelo.addColumn("Apellido P");
        modelo.addColumn("Apellido M");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        RefrescarCliente();
        
        //TablaConsul.setModel(modelo);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JLabel();
        btnCompra = new javax.swing.JLabel();
        btnInvntario = new javax.swing.JLabel();
        btnRegisto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnProvedor = new javax.swing.JLabel();
        btnCliente = new javax.swing.JLabel();
        btnCompras = new javax.swing.JLabel();
        btnProducto = new javax.swing.JLabel();
        btnVentas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaConsul = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FlorMa");

        btnVenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(51, 51, 51));
        btnVenta.setText("Venta");
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
        });

        btnCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(51, 51, 51));
        btnCompra.setText("Compra");
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompraMouseClicked(evt);
            }
        });

        btnInvntario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInvntario.setForeground(new java.awt.Color(0, 204, 0));
        btnInvntario.setText("Inventario");
        btnInvntario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvntario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvntarioMouseClicked(evt);
            }
        });

        btnRegisto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegisto.setForeground(new java.awt.Color(51, 51, 51));
        btnRegisto.setText("Registro");
        btnRegisto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 565, Short.MAX_VALUE)
                .addComponent(btnInvntario)
                .addGap(18, 18, 18)
                .addComponent(btnVenta)
                .addGap(18, 18, 18)
                .addComponent(btnCompra)
                .addGap(18, 18, 18)
                .addComponent(btnRegisto)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVenta)
                    .addComponent(btnCompra)
                    .addComponent(btnInvntario)
                    .addComponent(btnRegisto))
                .addGap(15, 15, 15))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        btnProvedor.setForeground(new java.awt.Color(0, 0, 0));
        btnProvedor.setText("Provedor");
        btnProvedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProvedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProvedorMouseClicked(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(0, 204, 0));
        btnCliente.setText("Clientes");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });

        btnCompras.setForeground(new java.awt.Color(0, 0, 0));
        btnCompras.setText("Compras");
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
        });

        btnProducto.setForeground(new java.awt.Color(0, 0, 0));
        btnProducto.setText("Producto");
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductoMouseClicked(evt);
            }
        });

        btnVentas.setForeground(new java.awt.Color(0, 0, 0));
        btnVentas.setText("Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnProvedor)
                .addGap(29, 29, 29)
                .addComponent(btnVentas)
                .addGap(30, 30, 30)
                .addComponent(btnCompras)
                .addGap(26, 26, 26)
                .addComponent(btnProducto)
                .addContainerGap(636, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnCliente)
                    .addContainerGap(918, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProvedor)
                    .addComponent(btnCompras)
                    .addComponent(btnProducto)
                    .addComponent(btnVentas))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(btnCliente)
                    .addContainerGap()))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 980, 30));

        TablaConsul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaConsul);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 790, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvntarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvntarioMouseClicked
         this.setVisible(false);
          ventInventario c = new ventInventario();
          c.AbsUser(uss);
          c.setVisible(true);
    }//GEN-LAST:event_btnInvntarioMouseClicked

    private void btnRegistoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistoMouseClicked
            this.setVisible(false);
          ventRegistroc r= new ventRegistroc();
          r.AbsUser(uss);
          r.setVisible(true);
    }//GEN-LAST:event_btnRegistoMouseClicked

    private void btnCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseClicked
        this.setVisible(false);
          ventCompra c= new ventCompra();
          c.AbsUserC(uss);
          c.setVisible(true);
    }//GEN-LAST:event_btnCompraMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        this.setVisible(false);
        ventasAdmin c =new ventasAdmin();
        c.AbsUser(uss);
        c.setVisible(true);
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
      ventInventario venp =new ventInventario();
           venp.setVisible(true);
           venp.AbsUser(uss);
           this.setVisible(false);
      
      
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnProvedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProvedorMouseClicked
    ventInventarioProovedor venp =new ventInventarioProovedor();
           venp.setVisible(true);
           venp.AbsUser(uss);
           this.setVisible(false);
                                          
    }//GEN-LAST:event_btnProvedorMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        ventInventarioVentas venp =new ventInventarioVentas();
           venp.setVisible(true);
           venp.AbsUser(uss);
           this.setVisible(false);
                                         
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
       ventInventarioCompras venp =new ventInventarioCompras();
           venp.setVisible(true);
           venp.AbsUser(uss);
           this.setVisible(false);
    }//GEN-LAST:event_btnComprasMouseClicked

    private void btnProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseClicked
         ventInventarioProducto venp =new ventInventarioProducto();
           venp.setVisible(true);
           venp.AbsUser(uss);
           venp.AbsUser(uss);
           this.setVisible(false);
        
    
    }//GEN-LAST:event_btnProductoMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaConsul;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnCompra;
    private javax.swing.JLabel btnCompras;
    private javax.swing.JLabel btnInvntario;
    private javax.swing.JLabel btnProducto;
    private javax.swing.JLabel btnProvedor;
    private javax.swing.JLabel btnRegisto;
    private javax.swing.JLabel btnVenta;
    private javax.swing.JLabel btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
