/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fmr;

import dao.rl_compra;
import dao.rl_detallecompra;
import dao.rl_producto;
import dao.rl_usuario;
import florma.compra;
import florma.detallecompra;
import florma.producto;
import florma.usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ventCompra extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
     ArrayList<detallecompra> listDetcompra = new ArrayList<detallecompra>();
     rl_usuario user = new rl_usuario();
     rl_producto pro = new rl_producto();
    rl_compra ven = new rl_compra();
    rl_detallecompra dven = new rl_detallecompra();
    detallecompra dtc =new detallecompra();
   compra co = new compra();
     
      int idclien,nv ;
      double AT,iv,sub,sum;
      usuario use;
      
      public void Agregartabla(producto c, int canti) {
        sum=c.getPrecioVenta() * canti;
        AT = (sum + AT);//Valor Total
        iv = AT * 0.12;//Valor IVA
        sub = AT - iv;//Valor Subtotal
        String TT = String.valueOf(AT);
        String TI = String.valueOf(iv);
        String TS = String.valueOf(sub);
        Object fila[] = new Object[6];
        fila[0] = c.getCodigo();
        fila[1] = c.getNombre();
        fila[2] = c.getPrecioCompra();
        fila[3] = canti;
        fila[4] = c.getPrecioVenta() * canti;
          DetalleCompra(canti, c, sum);
        //txtSubTotal.setText(TS);
        //txtIVA.setText(TI);
        txtTotalC.setText(TT);
        //SeteoAgregar_producto();
        modelo.addRow(fila);
        tablaComp.setModel(modelo);
    }
      public void DetalleCompra(int cant, producto c, Double AT) {
        detallecompra ve = new detallecompra();
        ve.setCodDcompra(0);//idAdmin
        ve.setIdCompra(nv);//idclien
        ve.setIdProducto(c.getCodigo()); //IdProducto 
        ve.setCant(cant);//cant
        ve.setTotal(AT); //total
        listDetcompra.add(ve);//Agregar en la lista para despues abstraer 
    }
      
      public void AbsUserC(usuario c) {
        this.use = c;
        txtcajeadmin.setText(c.getApellidoPaterno()+" "+c.getApellidoMaterno()+" "+c.getNombres());
    }
      
      
    public ventCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo.addColumn("codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio C/u");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Total");
        tablaComp.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JLabel();
        btnCompra = new javax.swing.JLabel();
        btnInvntario = new javax.swing.JLabel();
        btnRegisto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComp = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtTotalC = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JLabel();
        txtCell = new javax.swing.JLabel();
        txtDirec = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtcajeadmin = new javax.swing.JLabel();
        entryci = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        entryPro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        entryct = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        btnCompra.setForeground(new java.awt.Color(0, 204, 0));
        btnCompra.setText("Compra");
        btnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompraMouseClicked(evt);
            }
        });

        btnInvntario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnInvntario.setForeground(new java.awt.Color(51, 51, 51));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                .addComponent(btnInvntario)
                .addGap(18, 18, 18)
                .addComponent(btnVenta)
                .addGap(18, 18, 18)
                .addComponent(btnCompra)
                .addGap(18, 18, 18)
                .addComponent(btnRegisto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnVenta)
                    .addComponent(btnCompra)
                    .addComponent(btnInvntario))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegisto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Provedor");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ci");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Direccion");

        tablaComp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaComp);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total");

        txtTotalC.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTotalC.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalC.setText("95.00");

        btnGuardar.setBackground(new java.awt.Color(159, 111, 145));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setText("Jhon Does");

        txtCell.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCell.setForeground(new java.awt.Color(0, 0, 0));
        txtCell.setText("0000000000");

        txtDirec.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDirec.setForeground(new java.awt.Color(0, 0, 0));
        txtDirec.setText("Calle S/N");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Administrador");

        txtcajeadmin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcajeadmin.setForeground(new java.awt.Color(0, 0, 0));
        txtcajeadmin.setText("Jhon Does");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("cant");

        btnBuscarP.setText("Buscar Producto");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addGap(74, 74, 74)
                .addComponent(txtcajeadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(197, 197, 197)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCell)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(entryci, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTotalC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(entryPro, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13)
                        .addGap(28, 28, 28)
                        .addComponent(entryct, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre)
                    .addComponent(entryci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(txtDirec))
                    .addComponent(txtCell, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entryPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarP)
                            .addComponent(entryct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel12)
                        .addGap(28, 28, 28)
                        .addComponent(txtTotalC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtcajeadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvntarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvntarioMouseClicked
         this.setVisible(false);
          ventInventario c = new ventInventario();
          c.AbsUser(use);
          c.setVisible(true);
    }//GEN-LAST:event_btnInvntarioMouseClicked

    private void btnRegistoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistoMouseClicked
            this.setVisible(false);
          ventRegistroc r= new ventRegistroc();
          r.AbsUser(use);
          r.setVisible(true);
    }//GEN-LAST:event_btnRegistoMouseClicked

    private void btnCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseClicked
        this.setVisible(false);
          ventCompra c= new ventCompra();
          c.AbsUserC(use);
          c.setVisible(true);
    }//GEN-LAST:event_btnCompraMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        this.setVisible(false);
        ventasAdmin c =new ventasAdmin();
        c.AbsUser(use);
        c.setVisible(true);
    }//GEN-LAST:event_btnVentaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String cedu = entryci.getText();
        usuario us = user.BuscarCliente2(cedu,2);
        if(us.getNombres()!= null){
            txtNombre.setText(us.getApellidoMaterno() + " " + us.getApellidoPaterno() + " " + us.getNombres());
            txtCell.setText(us.getTelefono());
            txtDirec.setText(us.getDireccion());
            entryci.setText(us.getCi());
            idclien = us.getIdPersona();
        }else{
            JOptionPane.showMessageDialog(null, "Proveedor no existe");
            txtNombre.setText("Consumidor Final");
            txtCell.setText("000000000");
            txtDirec.setText("S/C");
            entryci.setText("");
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        co.setIdAdmin(use.getIdPersona());//idAdmin
        co.setIdProovedor(idclien);//idclien
        co.setFecha(""); //Fecha
        co.setTotal(AT); //AT
         ven.guardarCompra(co);
         
        
        for(int i=0;  i <listDetcompra.size(); i++){
            detallecompra den = new detallecompra();
                den.setCant(listDetcompra.get(i).getCant()); 
                den.setIdProducto(listDetcompra.get(i).getIdProducto());
                den.setIdCompra(ven.obtenerIdCompraRecienGuardada());
                den.setTotal(listDetcompra.get(i).getTotal());
                System.out.println(den.getIdCompra());
                System.out.println(den.getIdProducto());
                System.out.println(den.getCant());
                System.out.println(den.getTotal());
            dven.guardarDCompra(den);
//            SeteoPrecio();
//            SeteoCliente();
//            VaciarTabla();
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        String nombre = entryPro.getText();
        producto p = pro.BuscarProducto(nombre);
        int c = Integer.parseInt(entryct.getText());
        // System.out.println(p.getCodigo() + "  " + p.getPrecioCompra() + "  " + p.getPrecioVenta() + " " + p.getStock() + " " + c);
        Agregartabla(p, c);

    }//GEN-LAST:event_btnBuscarPActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JLabel btnCompra;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel btnInvntario;
    private javax.swing.JLabel btnRegisto;
    private javax.swing.JLabel btnVenta;
    private javax.swing.JTextField entryPro;
    private javax.swing.JTextField entryci;
    private javax.swing.JTextField entryct;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaComp;
    private javax.swing.JLabel txtCell;
    private javax.swing.JLabel txtDirec;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTotalC;
    private javax.swing.JLabel txtcajeadmin;
    // End of variables declaration//GEN-END:variables
}
