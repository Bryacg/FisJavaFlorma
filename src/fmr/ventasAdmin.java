/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fmr;

import dao.rl_caje_admin;
import dao.rl_detalleventa;
import dao.rl_producto;
import dao.rl_usuario;
import dao.rl_venta;
import florma.detalleventa;
import florma.producto;
import florma.usuario;
import florma.venta;
import florma.conexion;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventasAdmin extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<detalleventa> listDetVenta = new ArrayList<detalleventa>();
    
    conexion cn = new conexion();
    rl_producto pro = new rl_producto();
    rl_venta ven = new rl_venta();
    rl_detalleventa dven = new rl_detalleventa();
    rl_usuario user = new rl_usuario();
    //rl_caje_admin cja = new rl_caje_admin();
    
    usuario uss;
    venta v = new venta();
    int idclien,nv;
    double iv, sub,sum, AT = 0;

    public void AbsUser(usuario c) {
        this.uss = c;
        txtCaje.setText(c.getApellidoPaterno()+" "+c.getApellidoMaterno()+" "+c.getNombres());
    }
    public void SeteoPrecio(){
        txtSubTotal.setText("00.00");
        txtIVA.setText("00.00");
        txtTotal.setText("00.00");
        txtmumvent.setText(String.valueOf(nv));
    }
    public void SeteoAgregar_producto(){
        entryBP.setText("");
        entrycant.setText("");
    }
    public void SeteoCliente(){
         usuario us = user.BuscarCliente2("999999999", 1);
        if (us.getNombres() != null) {
            
            txtNomb.setText(us.getApellidoMaterno() + " " + us.getApellidoPaterno() + " " + us.getNombres());
            txtCell.setText(us.getTelefono());
            txtDirec.setText(us.getDireccion());
            entrycedu.setText(us.getCi());
            idclien = us.getIdPersona();
        }
    }
    
    public void DetalleVent(int cant, producto c, Double AT) {
        detalleventa ve = new detalleventa();
        ve.setCodDVenta(0);//idAdmin
        ve.setIdVenta(nv);//idclien
        ve.setIdProducto(c.getCodigo()); //IdProducto 
        ve.setCant(cant);//cant
        ve.setTotal(AT); //total
        listDetVenta.add(ve);//Agregar en la lista para despues abstraer 
    }

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
        fila[2] = c.getPrecioVenta();
        fila[3] = canti;
        fila[4] = c.getPrecioVenta() * canti;
        DetalleVent(canti, c, sum);
        txtSubTotal.setText(TS);
        txtIVA.setText(TI);
        txtTotal.setText(TT);
        SeteoAgregar_producto();
        modelo.addRow(fila);
        tablaVent.setModel(modelo);
    }

    public ventasAdmin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        modelo.addColumn("codigo");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio C/u");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Total");
        tablaVent.setModel(modelo);
        nv = ven.obtenerIdVentaRecienGuardada()+1;
        System.out.println(nv);
        String tnv   = String.valueOf(nv);
        txtmumvent.setText(tnv);
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
        tablaVent = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIVA = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCaje = new javax.swing.JLabel();
        btnGuardarventa = new javax.swing.JButton();
        txtCell = new javax.swing.JLabel();
        entrycedu = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtDirec = new javax.swing.JLabel();
        txtNomb = new javax.swing.JLabel();
        entryBP = new javax.swing.JTextField();
        btnBuscarP = new javax.swing.JButton();
        entrycant = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtmumvent = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FlorMa");

        btnVenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVenta.setForeground(new java.awt.Color(0, 204, 0));
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cliente :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ci");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Direccion");

        tablaVent.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaVent);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Sub  Total");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("IVA");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Total");

        txtIVA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtIVA.setText("00.00");

        txtTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtTotal.setText("00.00");

        txtSubTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtSubTotal.setText("00.00");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Administrador:");

        txtCaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCaje.setForeground(new java.awt.Color(0, 0, 0));
        txtCaje.setText("Jhon Does");

        btnGuardarventa.setBackground(new java.awt.Color(159, 111, 145));
        btnGuardarventa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnGuardarventa.setText("Guardar");
        btnGuardarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarventaActionPerformed(evt);
            }
        });

        txtCell.setForeground(new java.awt.Color(0, 0, 0));
        txtCell.setText("Telefono");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDirec.setForeground(new java.awt.Color(0, 0, 0));
        txtDirec.setText("Calle S/N");

        txtNomb.setForeground(new java.awt.Color(0, 0, 0));
        txtNomb.setText("Consumidor Final");

        btnBuscarP.setText("Buscar Producto");
        btnBuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("cant");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Venta N°- ");

        txtmumvent.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmumvent.setForeground(new java.awt.Color(0, 0, 0));
        txtmumvent.setText("1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDirec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addComponent(entrycedu, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBuscar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                        .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnGuardarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(entryBP, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel13)
                        .addGap(28, 28, 28)
                        .addComponent(entrycant, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnBuscarP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtmumvent, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtCaje, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(entrycedu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtNomb))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtCell)
                    .addComponent(txtDirec))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addComponent(btnGuardarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entryBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarP)
                            .addComponent(entrycant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtmumvent))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void btnInvntarioMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnInvntarioMouseClicked
        this.setVisible(false);
        ventInventario i = new ventInventario();
        i.setVisible(true);
    }//GEN-LAST:event_btnInvntarioMouseClicked

    private void btnRegistoMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnRegistoMouseClicked
        this.setVisible(false);
        ventRegistroc r = new ventRegistroc();
        r.setVisible(true);
    }//GEN-LAST:event_btnRegistoMouseClicked

    private void btnCompraMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseClicked
        this.setVisible(false);
        ventCompra c = new ventCompra();
        c.setVisible(true);
    }//GEN-LAST:event_btnCompraMouseClicked

    private void btnVentaMouseClicked(MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        this.setVisible(false);
        ventasAdmin v = new ventasAdmin();
        v.setVisible(true);
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnBuscarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedu = entrycedu.getText();
        usuario us = user.BuscarCliente2(cedu, 1);
        if (us.getNombres() != null) {
            
            txtNomb.setText(us.getApellidoMaterno() + " " + us.getApellidoPaterno() + " " + us.getNombres());
            txtCell.setText(us.getTelefono());
            txtDirec.setText(us.getDireccion());
            entrycedu.setText(us.getCi());
            idclien = us.getIdPersona();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no existe");
            txtNomb.setText("Consumidor Final");
            txtCell.setText("000000000");
            txtDirec.setText("S/C");
            entrycedu.setText("");

        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscarPActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnBuscarPActionPerformed
        String nombre = entryBP.getText();
        producto p = pro.BuscarProducto(nombre);
        int c = Integer.parseInt(entrycant.getText());
        // System.out.println(p.getCodigo() + "  " + p.getPrecioCompra() + "  " + p.getPrecioVenta() + " " + p.getStock() + " " + c);
        Agregartabla(p, c);      
        
    }//GEN-LAST:event_btnBuscarPActionPerformed

    private void btnGuardarventaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnGuardarventaActionPerformed
        v.setIdCajero(uss.getIdPersona());//idAdmin
        v.setIdCliente(idclien);//idclien
        v.setFecha(""); //Fecha
        v.setSubtotal(sub);//sub 
        v.setTotal(AT); //AT
         ven.guardarVenta(v);
         
        
        for(int i=0;  i <listDetVenta.size(); i++){
            detalleventa den = new detalleventa();
                den.setCant(listDetVenta.get(i).getCant()); 
                den.setIdProducto(listDetVenta.get(i).getIdProducto());
                den.setIdVenta(ven.obtenerIdVentaRecienGuardada());
                den.setTotal(listDetVenta.get(i).getTotal());
                System.out.println(den.getIdVenta());
                System.out.println(den.getIdProducto());
                System.out.println(den.getCant());
                System.out.println(den.getTotal());
            dven.guardarDetalleVenta(den);
            SeteoPrecio();
            SeteoCliente();
            
        }

    }//GEN-LAST:event_btnGuardarventaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarP;
    private javax.swing.JLabel btnCompra;
    private javax.swing.JButton btnGuardarventa;
    private javax.swing.JLabel btnInvntario;
    private javax.swing.JLabel btnRegisto;
    private javax.swing.JLabel btnVenta;
    private javax.swing.JTextField entryBP;
    private javax.swing.JTextField entrycant;
    private javax.swing.JTextField entrycedu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVent;
    private javax.swing.JLabel txtCaje;
    private javax.swing.JLabel txtCell;
    private javax.swing.JLabel txtDirec;
    private javax.swing.JLabel txtIVA;
    private javax.swing.JLabel txtNomb;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtmumvent;
    // End of variables declaration//GEN-END:variables
}
