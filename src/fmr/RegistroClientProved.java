/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fmr;


import dao.rl_usuario;
import florma.usuario;

/**
 *
 * @author elcar
 */
public class RegistroClientProved extends javax.swing.JFrame {
 rl_usuario d ;
    /**
     * Creates new form RegistroClientProved
     */
    public RegistroClientProved() {
        initComponents();
        this.setLocationRelativeTo(null);
        d =new rl_usuario() ;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbr = new javax.swing.JComboBox<>();
        entryCorreo = new javax.swing.JTextField();
        entryDirec = new javax.swing.JTextField();
        entryApellP = new javax.swing.JTextField();
        entryApellM = new javax.swing.JTextField();
        entryNomb = new javax.swing.JTextField();
        entryCell = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        entryCi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro De Cliente O Provedor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 0, 680, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cedula");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido  Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombres");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Rol");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 40, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Telefono");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Correo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jButton1.setBackground(new java.awt.Color(159, 111, 145));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 464, 373, 43));

        cbr.setBackground(new java.awt.Color(255, 204, 255));
        cbr.setForeground(new java.awt.Color(0, 0, 0));
        cbr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Proovedor" }));
        jPanel1.add(cbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        entryCorreo.setBackground(new java.awt.Color(255, 204, 255));
        entryCorreo.setBorder(null);
        entryCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(entryCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 270, 30));

        entryDirec.setBackground(new java.awt.Color(255, 204, 255));
        entryDirec.setBorder(null);
        entryDirec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryDirecActionPerformed(evt);
            }
        });
        jPanel1.add(entryDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 270, 30));

        entryApellP.setBackground(new java.awt.Color(255, 204, 255));
        entryApellP.setBorder(null);
        entryApellP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryApellPActionPerformed(evt);
            }
        });
        jPanel1.add(entryApellP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 270, 30));

        entryApellM.setBackground(new java.awt.Color(255, 204, 255));
        entryApellM.setBorder(null);
        entryApellM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryApellMActionPerformed(evt);
            }
        });
        jPanel1.add(entryApellM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 270, 30));

        entryNomb.setBackground(new java.awt.Color(255, 204, 255));
        entryNomb.setBorder(null);
        entryNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryNombActionPerformed(evt);
            }
        });
        jPanel1.add(entryNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 270, 30));

        entryCell.setBackground(new java.awt.Color(255, 204, 255));
        entryCell.setBorder(null);
        entryCell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryCellActionPerformed(evt);
            }
        });
        jPanel1.add(entryCell, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 270, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 270, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 270, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 270, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 270, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 270, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 270, 10));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 270, 10));

        entryCi.setBackground(new java.awt.Color(255, 204, 255));
        entryCi.setBorder(null);
        entryCi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryCiActionPerformed(evt);
            }
        });
        jPanel1.add(entryCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 270, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("X");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setFocusable(false);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuario au = new usuario();
        au.setCi(entryCi.getText());
        au.setApellidoPaterno(entryApellP.getText());
        au.setApellidoMaterno(entryApellM.getText());
        au.setNombres(entryNomb.getText());
        au.setRol(cbr.getSelectedIndex()+1);
        au.setDireccion(entryDirec.getText());
        au.setTelefono(entryCell.getText());
        au.setCorreo(entryCorreo.getText());
        
       d.guardarUsuario(au);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void entryCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryCorreoActionPerformed

    private void entryDirecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryDirecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryDirecActionPerformed

    private void entryApellPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryApellPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryApellPActionPerformed

    private void entryApellMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryApellMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryApellMActionPerformed

    private void entryNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryNombActionPerformed

    private void entryCellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryCellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryCellActionPerformed

    private void entryCiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryCiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entryCiActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
           this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbr;
    private javax.swing.JTextField entryApellM;
    private javax.swing.JTextField entryApellP;
    private javax.swing.JTextField entryCell;
    private javax.swing.JTextField entryCi;
    private javax.swing.JTextField entryCorreo;
    private javax.swing.JTextField entryDirec;
    private javax.swing.JTextField entryNomb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
