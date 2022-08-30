
package proyectoprimerbimestre;

import java.text.DecimalFormat;


public class PagoTarjetas extends javax.swing.JFrame {
    public Usuario cliente;
    
    
    DecimalFormat frmt=new DecimalFormat();
    
    public PagoTarjetas(Usuario cliente) {
        initComponents();
        this.cliente=cliente;
        frmt.setMaximumFractionDigits(2);

        switch(cliente.getCantidadCuentas()){
            case 1:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
            break;
            case 2:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(1)));
            break;
            case 3:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(1)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(2)));
            break;
            case 4:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(1)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(2)));
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(3)));
                
        }
           
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbCuentas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNumTarjeta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lblValidNum = new javax.swing.JLabel();
        lblValidCuenta = new javax.swing.JLabel();
        lblValidMonto = new javax.swing.JLabel();
        lblValidBanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Pago de tarjetas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 161, 34));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Elije la cuenta a pagar ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, 160, 23));

        jPanel4.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 280, -1));

        jPanel5.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nro. Cuenta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        cmbCuentas.setBackground(new java.awt.Color(15, 34, 64));
        cmbCuentas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCuentas.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentas.setToolTipText("");
        cmbCuentas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCuentasItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Saldo disponible");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 120, -1));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldo.setText("0");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 50, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("USD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Monto a Pagar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 155, -1));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtMonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 84, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("USD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nombre del Banco");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txtBanco.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtBanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 155, -1));

        btnContinuar.setBackground(new java.awt.Color(15, 34, 64));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorder(null);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 78, 28));

        btnSalir.setBackground(new java.awt.Color(227, 29, 26));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setMaximumSize(new java.awt.Dimension(57, 19));
        btnSalir.setMinimumSize(new java.awt.Dimension(57, 19));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 78, 28));

        txtNumTarjeta.setFont(new java.awt.Font("Segoe UI Light", 0, 11)); // NOI18N
        txtNumTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 155, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Numero de la Tarjeta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 155, -1));

        lblValidNum.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValidNum.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, -1));

        lblValidCuenta.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValidCuenta.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, -1));

        lblValidMonto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValidMonto.setForeground(new java.awt.Color(255, 0, 0));
        lblValidMonto.setToolTipText("");
        jPanel1.add(lblValidMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 20));

        lblValidBanco.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValidBanco.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 170, -1));

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

        try{
        boolean validMonto=false;
        boolean onlyNum=false;
        boolean onlyLet=false;
        boolean comb=false;
        String numTarjeta=txtNumTarjeta.getText();
        String nombreBanco=txtBanco.getText();
        float montoPagado=-1;
        String cuenta=cliente.getCuenta(cmbCuentas.getSelectedIndex()-1);
        
        
        if(txtMonto.getText().isEmpty()){
            lblValidMonto.setText("*Campo obligatorio");
        } else{
            try {
              float monto=Float.parseFloat(txtMonto.getText());
              if(monto<0){
              lblValidMonto.setText("*Introduzca una cantidad positiva");
              } else{
                  if(monto>cliente.getSaldo((cmbCuentas.getSelectedIndex())-1)){
                      lblValidMonto.setText("*Saldo insuficiente");
                      }
                  else{
                      validMonto=true;
                      lblValidMonto.setText("");
                      montoPagado=monto;
                      }
              }
            } catch (Exception e) {
            
            lblValidMonto.setText("*Cantidad no válida");
            }  
        }
 
        if(numTarjeta.isEmpty()){
            lblValidNum.setText("*Campo obligatorio");
        } else{
            
            for(int i=0;i<numTarjeta.length();i++){
                if(Character.isAlphabetic(numTarjeta.charAt(i))){
                    onlyNum=false;
                    
                } else{
                    onlyNum=true;
                }
            }
            if(onlyNum){
                lblValidNum.setText("");
            } else{
                lblValidNum.setText("*Digite solamente números");
            }
        }
        
        if(nombreBanco.isEmpty()){
            lblValidBanco.setText("*Campo obligatorio");
        } else{
            for(int i=0;i<nombreBanco.length();i++){
                if(Character.isDigit(nombreBanco.charAt(i))){
                    onlyLet=false;
                    
                } else{
                    onlyLet=true;
                }
            }
            if(onlyLet){
                lblValidBanco.setText("");
            } else{
                lblValidBanco.setText("*Digite solamente letras");
            }
        }
        
        if(cmbCuentas.getSelectedIndex()==0){
            lblValidCuenta.setText("*Seleccione una cuenta");
        } else{
            comb=true;
            lblValidCuenta.setText("");
        }
        
        if(validMonto&&onlyLet&&onlyNum&&comb){
            
        ConfirmacionPagos newframe= new ConfirmacionPagos(
            this.cliente,montoPagado,cuenta, numTarjeta, 
            (cmbCuentas.getSelectedIndex()-1));
            newframe.setVisible(true);
        dispose();
        }
        
        }catch(Exception e){                  //Todos los campos vacíos
            
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        PantallaPrincipal menuPrincipal=new PantallaPrincipal(this.cliente);
        menuPrincipal.setVisible(true);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbCuentasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentasItemStateChanged
        switch (cmbCuentas.getSelectedIndex()){
            case 0:
                lblSaldo.setText("0");
            break;
            case 1:
                lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
            break;
            case 2:
                lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
            break;
            case 3:
                lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
            break;
            case 4:
                lblSaldo.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
            break;
        }
    }//GEN-LAST:event_cmbCuentasItemStateChanged
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoTarjetas(null).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblValidBanco;
    private javax.swing.JLabel lblValidCuenta;
    private javax.swing.JLabel lblValidMonto;
    private javax.swing.JLabel lblValidNum;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
