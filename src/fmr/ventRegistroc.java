/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fmr;

/**
 *
 * @author elcar
 */
public class ventRegistroc extends javax.swing.JFrame {

    /**
     * Creates new form ventas
     */
    public ventRegistroc() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JLabel();
        btnCompra = new javax.swing.JLabel();
        btnInvntario = new javax.swing.JLabel();
        btnRegisto = new javax.swing.JLabel();
        btnCA = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnCP = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnP = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btnInvntario.setForeground(new java.awt.Color(51, 51, 51));
        btnInvntario.setText("Inventario");
        btnInvntario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvntario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvntarioMouseClicked(evt);
            }
        });

        btnRegisto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegisto.setForeground(new java.awt.Color(0, 204, 0));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
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

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        btnCA.setBackground(new java.awt.Color(255, 204, 255));
        btnCA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCAMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registro deCajero/Admin");

        javax.swing.GroupLayout btnCALayout = new javax.swing.GroupLayout(btnCA);
        btnCA.setLayout(btnCALayout);
        btnCALayout.setHorizontalGroup(
            btnCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCALayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnCALayout.setVerticalGroup(
            btnCALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCALayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.add(btnCA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 170, 100));

        btnCP.setBackground(new java.awt.Color(255, 204, 255));
        btnCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCPMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Registro deCliente/Provedor");

        javax.swing.GroupLayout btnCPLayout = new javax.swing.GroupLayout(btnCP);
        btnCP.setLayout(btnCPLayout);
        btnCPLayout.setHorizontalGroup(
            btnCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnCPLayout.setVerticalGroup(
            btnCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCPLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.add(btnCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        btnP.setBackground(new java.awt.Color(255, 204, 255));
        btnP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registro de Producto");

        javax.swing.GroupLayout btnPLayout = new javax.swing.GroupLayout(btnP);
        btnP.setLayout(btnPLayout);
        btnPLayout.setHorizontalGroup(
            btnPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );
        btnPLayout.setVerticalGroup(
            btnPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel2.add(btnP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvntarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvntarioMouseClicked
         this.setVisible(false);
          ventInventario c = new ventInventario();
          c.setVisible(true);
    }//GEN-LAST:event_btnInvntarioMouseClicked

    private void btnRegistoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistoMouseClicked
           this.setVisible(false);
          ventRegistroc c= new ventRegistroc();
          c.setVisible(true);
    }//GEN-LAST:event_btnRegistoMouseClicked

    private void btnCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompraMouseClicked
        this.setVisible(false);
          ventCompra c= new ventCompra();
          c.setVisible(true);
    }//GEN-LAST:event_btnCompraMouseClicked

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        this.setVisible(false);
        ventasAdmin c =new ventasAdmin();
        c.setVisible(true);
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnCAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCAMouseClicked
       RegistroCajeAdmin c = new RegistroCajeAdmin();
        c.setVisible(true);
    }//GEN-LAST:event_btnCAMouseClicked

    private void btnCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCPMouseClicked
        RegistroClientProved c = new RegistroClientProved();
        c.setVisible(true);
    }//GEN-LAST:event_btnCPMouseClicked

    private void btnPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPMouseClicked
       RegistroProducto c = new RegistroProducto();
        c.setVisible(true);
    }//GEN-LAST:event_btnPMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCA;
    private javax.swing.JPanel btnCP;
    private javax.swing.JLabel btnCompra;
    private javax.swing.JLabel btnInvntario;
    private javax.swing.JPanel btnP;
    private javax.swing.JLabel btnRegisto;
    private javax.swing.JLabel btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
