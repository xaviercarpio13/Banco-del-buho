package proyectoprimerbimestre;

import java.text.DecimalFormat;

public class TransferenciaMismoBanco extends javax.swing.JFrame {

    public Usuario cliente;
    DecimalFormat frmt = new DecimalFormat();

    public TransferenciaMismoBanco(Usuario cliente) {
        initComponents();
        frmt.setMaximumFractionDigits(2);
        this.cliente = cliente;

        switch (cliente.getCantidadCuentas()) {
            case 1:
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                break;
            case 2:
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(1)));
                break;
            case 3:
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(1)));
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(2)));
                break;
            case 4:
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(1)));
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(2)));
                cmbCuentas.addItem(String.valueOf(cliente.getNumeroDeCuenta(3)));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSaldo1 = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblValidarN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        cmbCuentas = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        lblValidar1 = new javax.swing.JLabel();
        lblValidarC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("BANCO DEL BÚHO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Ingresar Nro. de cuenta del Beneficiario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Elija el Nro. de cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Saldo Disponible");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Monto a Transferir");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        txtSaldo1.setBackground(new java.awt.Color(255, 255, 255));
        txtSaldo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSaldo1.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo1.setText("0");
        txtSaldo1.setBorder(null);
        jPanel1.add(txtSaldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 60, -1));

        txtNum.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, -1));

        btnContinuar.setBackground(new java.awt.Color(15, 34, 64));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setToolTipText("");
        btnContinuar.setBorder(null);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 30));

        jPanel2.setBackground(new java.awt.Color(227, 29, 26));

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

        jPanel3.setBackground(new java.awt.Color(15, 34, 64));

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

        lblValidarN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(lblValidarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("USD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("USD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        txtMonto.setBackground(new java.awt.Color(0, 0, 51));
        txtMonto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, -1));

        cmbCuentas.setBackground(new java.awt.Color(0, 0, 51));
        cmbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, -1));

        btnVolver.setBackground(new java.awt.Color(255, 0, 51));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        lblValidar1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel1.add(lblValidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 10));

        lblValidarC.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel1.add(lblValidarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 180, 10));

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


    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
         try{
             boolean onlyNum=false;
             boolean Validar1=false;
             boolean onlyLetNombre=false;
             /*
            boolean validMonto=false;
            boolean onlyNum=false;
            boolean onlyLet=false;
            boolean comb=false;
            boolean onlyLetNombre=false;
            boolean onlyNumCI=false;
*/
            String numeroCuenta=txtNum.getText();
            //String nombreBanco=txtBanco.getText();
            float montoPagado=-1;
            String cuenta=cliente.getNumeroDeCuenta(cmbCuentas.getSelectedIndex()-1);
            String nombre=lblValidarN.getText();
            //String CI=txtCI.getText();

            if(txtMonto.getText().isEmpty()){
                lblValidar1.setText("*Campo obligatorio");
            } else{
                try {
                    float monto=Float.parseFloat(txtMonto.getText());
                    if(monto<0){
                        lblValidar1.setText("*Introduzca una cantidad positiva");
                    } else{
                        if(monto>(cliente.getSaldo((cmbCuentas.getSelectedIndex())-1))-0.4){
                            lblValidar1.setText("*Saldo insuficiente");
                        }
                        else{
                            Validar1=true;
                            lblValidar1.setText("");
                            montoPagado=monto;
                        }
                    }
                } catch (Exception e) {

                    lblValidar1.setText("*Cantidad no válida");
                }
            }

            if(numeroCuenta.isEmpty()){
                lblValidarC.setText("*Campo obligatorio");
            } else{

                for(int i=0;i<numeroCuenta.length();i++){
                    if(Character.isAlphabetic(numeroCuenta.charAt(i))){
                        onlyNum=false;
                        lblValidarC.setText("*Dato no válido");

                    } else{
                        onlyNum=true;
                        lblValidarC.setText("");
                    }
                }
                
            }

            

            /*if(cmbCuentas.getSelectedIndex()==0){
                lblValidCuenta.setText("*Seleccione una cuenta");
            } else{
                comb=true;
                lblValidCuenta.setText("");
            }
            */
            if(nombre.isEmpty()){
                lblValidarN.setText("*Campo obligatorio");
            } else{
                for (int i=0;i<nombre.length();i++){
                    if(Character.isDigit(nombre.charAt(i))){
                        onlyLetNombre=false;
                        lblValidarN.setText("*Dato no válido");
                    } else{
                        onlyLetNombre=true;
                        lblValidarN.setText("");
                    }
                }
            }
          

            if(Validar1&&onlyNum&&onlyLetNombre){
                
            montoPagado+=0.4;
            ConfirmacionPagos newframe= new ConfirmacionPagos(
                this.cliente,montoPagado,cuenta, numeroCuenta,
                (cmbCuentas.getSelectedIndex()-1),nombre);
            newframe.setVisible(true);
            dispose();
            
        }

        }catch(Exception e){                  //Todos los campos vacíos

        }
        
        
        


    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void cmbCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasActionPerformed

        switch (cmbCuentas.getSelectedIndex()) {
            case 0:
                txtSaldo1.setText("0");
                break;
            case 1:
                txtSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                break;
            case 2:
                txtSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                break;
            case 3:
                txtSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
                break;
            case 4:
                txtSaldo1.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
                break;
        }

    }//GEN-LAST:event_cmbCuentasActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Transferencias pantallaVolver = new Transferencias(this.cliente);
        pantallaVolver.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

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
                new TransferenciaMismoBanco(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCuentas;
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
    private javax.swing.JLabel lblValidar1;
    private javax.swing.JLabel lblValidarC;
    private javax.swing.JTextField lblValidarN;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtSaldo1;
    // End of variables declaration//GEN-END:variables
}
