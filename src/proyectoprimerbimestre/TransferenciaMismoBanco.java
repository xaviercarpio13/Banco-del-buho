/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprimerbimestre;
import java.text.DecimalFormat;

/**
 *
 * @author USUARIO
 */
public class TransferenciaMismoBanco extends javax.swing.JFrame {
    public Usuario cliente;
    DecimalFormat frmt=new DecimalFormat();

    /**
     * Creates new form TransferenciaMismoBanco
     */
    public TransferenciaMismoBanco() {
        initComponents();
        frmt.setMaximumFractionDigits(2);
        this.cliente=cliente;
        switch(cliente.getCantidadCuentas()){
            case 1:
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
            break;
            case 2:
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(1)));
            break;
            case 3:
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(1)));
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(2)));
            break;
            case 4:
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(1)));
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(2)));
                cmbCuentasUsuario.addItem(String.valueOf(cliente.getNumeroDeCuenta(3)));
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        cmbCuentasUsuario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblValidCuenta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblSaldo1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BANCO DEL BÚHO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingresar la cuenta del Beneficiario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Elija el numero de cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Saldo Disponible");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Monto a Transferir");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 90, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, -1));

        cmbCuentasUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCuentasUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", " " }));
        cmbCuentasUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCuentasUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 90, 30));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Volver");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 70, 30));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 10));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 40));

        lblValidCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValidCuenta.setText("jLabel4");
        jPanel1.add(lblValidCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 90, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 110, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        lblSaldo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldo1.setText("1000");
        jPanel1.add(lblSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("USD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("USD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCuentasUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasUsuarioActionPerformed
        // TODO add your handling code here:
        switch (cmbCuentasUsuario.getSelectedIndex()){
            case 0:
            lblSaldo1.setText("0");
            break;
            case 1:
            lblSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
            break;
            case 2:
            lblSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
            break;
            case 3:
            lblSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
            break;
            case 4:
            lblSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
            break;
        }
    }//GEN-LAST:event_cmbCuentasUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre=txtNombre.getText();
        boolean comb=false;
        String cuenta=cliente.getNumeroDeCuenta(cmbCuentasUsuario.getSelectedIndex()-1);
         if(cmbCuentasUsuario.getSelectedIndex()==0){
                lblValidCuenta.setText("*Seleccione una cuenta");
            } else{
                comb=true;
                lblValidCuenta.setText("");
            }
         
   
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(TransferenciaMismoBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferenciaMismoBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferenciaMismoBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferenciaMismoBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciaMismoBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbCuentasUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblSaldo1;
    private javax.swing.JLabel lblValidCuenta;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
