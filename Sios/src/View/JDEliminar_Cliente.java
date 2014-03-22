package View;
import Control.ClienteCtl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class JDEliminar_Cliente extends javax.swing.JDialog {
    ClienteCtl objClienteCtl=new ClienteCtl();
    //String url = "jdbc:odbc:SIOS";
    //PreparedStatement st;
    public JDEliminar_Cliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
  
        this.txtNum_Identifica.requestFocus();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNumero_Identificacion = new javax.swing.JLabel();
        txtNum_Identifica = new javax.swing.JTextField();
        lblNombre_Cliente = new javax.swing.JLabel();
        txtNombre_Cliente = new javax.swing.JTextField();
        lbl_Direccion_Cliente = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNom_Contacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTel_Contacto = new javax.swing.JTextField();
        btnBuscar_Cliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegreso = new javax.swing.JButton();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.jpg"))); // NOI18N
        jButton5.setText("Buscar");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(31, 73, 125));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELIMINAR CLIENTES                                                                                        S I O S");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumero_Identificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumero_Identificacion.setText("Número Identificación:");
        jPanel1.add(lblNumero_Identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 26, -1, -1));

        txtNum_Identifica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNum_IdentificaKeyReleased(evt);
            }
        });
        jPanel1.add(txtNum_Identifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 26, 171, -1));

        lblNombre_Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre_Cliente.setText("Nombre:");
        jPanel1.add(lblNombre_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 61, 99, -1));
        jPanel1.add(txtNombre_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 61, 408, -1));

        lbl_Direccion_Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Direccion_Cliente.setText("Dirección");
        jPanel1.add(lbl_Direccion_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 99, -1, -1));
        jPanel1.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 99, 408, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Teléfono:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 137, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 137, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Correo Electrónico:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 137, -1, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 137, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre Contacto:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 175, -1, -1));
        jPanel1.add(txtNom_Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 175, 408, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono Contacto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 213, -1, -1));
        jPanel1.add(txtTel_Contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 213, 119, -1));

        btnBuscar_Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.jpg"))); // NOI18N
        btnBuscar_Cliente.setText("Buscar");
        btnBuscar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar_ClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 14, -1, -1));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.jpg"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar2.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida3.jpg"))); // NOI18N
        btnRegreso.setText("Regreso");
        btnRegreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnRegreso)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addComponent(btnRegreso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiarcliente(){
            this.txtNum_Identifica.setText("");
            //this.cbxTipo_Documento.setSelectedItem(0);
            //this.cbxTipo_Documento.setSelectedItem("Seleccione");
            this.txtNombre_Cliente.setText("");
            this.txtDireccionCliente.setText("");
            this.txtTelefono.setText("");
            this.txtCorreo.setText("");
            this.txtNom_Contacto.setText("");
            this.txtTel_Contacto.setText("");
            this.txtNum_Identifica.setEnabled(true);
            this.txtNum_Identifica.requestFocus();       
    }
    private void btnRegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresoActionPerformed

    private void btnBuscar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar_ClienteActionPerformed
        try {
            int id=Integer.parseInt(txtNum_Identifica.getText());
             ResultSet rs = objClienteCtl.buscar_clienteCtl(id);
             if (rs!=null){
                rs.next();
                this.txtNombre_Cliente.setText(rs.getString(1));
                this.txtDireccionCliente.setText(rs.getString(2));
                this.txtTelefono.setText(rs.getString(3));
                this.txtCorreo.setText(rs.getString(4));
                this.txtNom_Contacto.setText(rs.getString(5));
                this.txtTel_Contacto.setText(rs.getString(6));
                this.txtNum_Identifica.setEnabled(false);
             }else{
                JOptionPane.showMessageDialog(null, "Cliente no existe");
                this.txtNum_Identifica.requestFocus();
                this.txtNum_Identifica.setText("");
             }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Cliente no existe");
           this.txtNum_Identifica.requestFocus();
           this.txtNum_Identifica.setText("");
       }
    }//GEN-LAST:event_btnBuscar_ClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int id=Integer.parseInt(txtNum_Identifica.getText());
            String rs=objClienteCtl.eliminar_clienteCtl(id);
            limpiarcliente();
           } catch (Exception e) {
           //JOptionPane.showMessageDialog(null, "error en la conexión");
       }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarcliente();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNum_IdentificaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum_IdentificaKeyReleased
        if(!txtNum_Identifica.getText().matches("[0-9]*")){//.matches valida el rango de números a ingresar
            JOptionPane.showMessageDialog(null,"Solo números","Advertencia",JOptionPane.ERROR_MESSAGE);//mensaje con título en la caja y con ícono
            this.txtNum_Identifica.setText("");//limpiar caja de texto
            this.txtNum_Identifica.requestFocus();//lleva el cursor a la caja de texto
        }
    }//GEN-LAST:event_txtNum_IdentificaKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JDEliminar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDEliminar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDEliminar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDEliminar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDEliminar_Cliente dialog = new JDEliminar_Cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar_Cliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegreso;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNombre_Cliente;
    private javax.swing.JLabel lblNumero_Identificacion;
    private javax.swing.JLabel lbl_Direccion_Cliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtNom_Contacto;
    private javax.swing.JTextField txtNombre_Cliente;
    private javax.swing.JTextField txtNum_Identifica;
    private javax.swing.JTextField txtTel_Contacto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
