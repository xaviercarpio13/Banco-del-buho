package proyectoprimerbimestre;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TransferenciasDirectas extends javax.swing.JFrame {

    public Usuario cliente;
    DecimalFormat frmt = new DecimalFormat();

    public TransferenciasDirectas(Usuario cliente) {
        initComponents();
        frmt.setMaximumFractionDigits(2);
        this.cliente = cliente;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        cmbCuentas = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        lblValMonto = new javax.swing.JLabel();
        lblValNum = new javax.swing.JLabel();
        lblValNom = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblValidCuenta = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(535, 125));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 34, 64));
        jLabel2.setText("Transferencias directas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 34, 64));
        jLabel3.setText("Datos del beneficiario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 34, 64));
        jLabel1.setText("Elija la cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Saldo Disponible");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Monto a Transferir");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        txtNum.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        jPanel1.add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 120, 20));

        btnContinuar.setBackground(new java.awt.Color(15, 34, 64));
        btnContinuar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnContinuar.setText("Continuar");
        btnContinuar.setToolTipText("");
        btnContinuar.setBorder(null);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 90, 30));

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

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("USD");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("USD");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtMonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 20));

        cmbCuentas.setBackground(new java.awt.Color(15, 34, 64));
        cmbCuentas.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TransferenciasDirectas.this.itemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, -1));

        btnVolver.setBackground(new java.awt.Color(227, 29, 26));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 90, 30));

        lblValMonto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValMonto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 20));

        lblValNum.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValNum.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 110, 10));

        lblValNom.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValNom.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldo.setText("0");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nro. Cuenta");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        lblValidCuenta.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValidCuenta.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nro. Cuenta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 230, 10));

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
            int contadorFila=0;
            int contadorColumna=0;
            boolean Validar1=false;
            boolean onlyNum=false;
            boolean onlyLetNombre=false;
            boolean comb=false;
            boolean validCuentaDestino=false;
            String numeroCuentaEmisor=cliente.getCuenta(cmbCuentas.getSelectedIndex()-1);
            String numeroCuentaDestino=txtNum.getText();
            String nombre=txtNombre.getText();
            float montoPagado=-1;
            //String cuentaClienteEmisor=cliente.getNumeroDeCuenta(cmbCuentas.getSelectedIndex()-1);
            

            if(txtMonto.getText().isEmpty()){
                lblValMonto.setText("*Campo obligatorio");
            } else{
                try {
                    float monto=Float.parseFloat(txtMonto.getText());
                    if(monto<0){
                        lblValMonto.setText("*Dato no válido");
                    } else{
                        if(monto>(cliente.getSaldo((cmbCuentas.getSelectedIndex())-1))-0.4){
                            lblValMonto.setText("*Saldo insuficiente");
                        }
                        else{
                            Validar1=true;
                            lblValMonto.setText("");
                            montoPagado=monto;
                        }
                    }
                } catch (Exception e) {

                    lblValMonto.setText("*Dato no válido");
                }
            }

            if(numeroCuentaDestino.isEmpty()){
                lblValNum.setText("*Campo obligatorio");
            } else {
                for (int i = 0; i < numeroCuentaDestino.length(); i++) {
                    if (Character.isAlphabetic(numeroCuentaDestino.charAt(i))) {
                        onlyNum = false;
                        lblValNum.setText("*Dato no válido");

                    } else {
                        onlyNum = true;
                        lblValNum.setText("");
                    }
                }
                    if(onlyNum){
                        ArrayList<String> archivo = cliente.leerArchivo();
                        contadorFila = 0;
                        String cuentaDest = txtNum.getText();
                        for (int j = 0; j < archivo.size(); j++) {
                             String fila = archivo.get(j);
                             String[] columnas = fila.split(";");
                            
                             if (columnas.length > 2) {
                                 contadorColumna=0;
                                 for (String columna : columnas) {
                                     if (columna.equals(cuentaDest)) {
                                        validCuentaDestino = true;
                                        break;
                                    }
                                     contadorColumna++;
                                 }
                             }
                            if (validCuentaDestino) {
                            break;
                        }
                         contadorFila++;
                     }
                 }
                 if (!validCuentaDestino) {
                     JOptionPane.showMessageDialog(null, "Usuario no encontrado\n"
                             + "Verifique el número de cuenta",
                             "Error", JOptionPane.WARNING_MESSAGE);
                 }
             }

             if (cmbCuentas.getSelectedIndex() == 0) {
                 lblValidCuenta.setText("*Seleccione una cuenta");
             } else {
                 comb = true;
                 lblValidCuenta.setText("");

             }

             if (nombre.isEmpty()) {
                 lblValNom.setText("*Campo obligatorio");
            } else{
                for (int i=0;i<nombre.length();i++){
                    if(Character.isDigit(nombre.charAt(i))){
                        onlyLetNombre=false;
                        lblValNom.setText("*Dato no válido");
                    } else{
                        onlyLetNombre=true;
                        lblValNom.setText("");
                    }
                }
            }
            
            
          
            if(Validar1 && onlyNum && onlyLetNombre && comb && validCuentaDestino) {

                 ConfirmacionPagos newframe = new ConfirmacionPagos(
                         this.cliente, montoPagado, numeroCuentaEmisor, numeroCuentaDestino,
                         contadorFila,contadorColumna,
                         (cmbCuentas.getSelectedIndex() - 1), nombre, "Directa");
                 newframe.setVisible(true);
                 dispose();

             }

        }catch(Exception e){                  

        }
        
        
        


    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        PantallaTipoTransferencias pantallaVolver = new PantallaTipoTransferencias(this.cliente);
        pantallaVolver.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void itemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemStateChanged
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
        
        
        
        
    }//GEN-LAST:event_itemStateChanged

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciasDirectas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCuentas;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblValMonto;
    private javax.swing.JLabel lblValNom;
    private javax.swing.JLabel lblValNum;
    private javax.swing.JLabel lblValidCuenta;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables
}
