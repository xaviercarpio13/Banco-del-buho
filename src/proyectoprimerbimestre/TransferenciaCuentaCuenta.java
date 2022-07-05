
package proyectoprimerbimestre;

public class TransferenciaCuentaCuenta extends javax.swing.JFrame {

    Usuario cliente;
    public TransferenciaCuentaCuenta(Usuario cliente) {
        initComponents();
        this.cliente = cliente;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoBlanco = new javax.swing.JPanel();
        txtTituloTransferencia = new javax.swing.JLabel();
        panelAzulFooter = new javax.swing.JPanel();
        panelRojoFooter = new javax.swing.JPanel();
        txtSaldoOrigen = new javax.swing.JLabel();
        txtValorTransferencia = new javax.swing.JLabel();
        txtSeleccioneCuenta = new javax.swing.JLabel();
        txtCuentaOrigen = new javax.swing.JLabel();
        txtSubtituloDestino = new javax.swing.JLabel();
        txtSubtituloResumen = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtSaldo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JPanel();
        txtConfirmar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        btnValidar1 = new javax.swing.JButton();
        btnValidar2 = new javax.swing.JButton();
        txtSaldoOrigen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        panelFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelFondoBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloTransferencia.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtTituloTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloTransferencia.setText("Transferir a otra cuenta");
        panelFondoBlanco.add(txtTituloTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 280, -1));

        panelAzulFooter.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout panelAzulFooterLayout = new javax.swing.GroupLayout(panelAzulFooter);
        panelAzulFooter.setLayout(panelAzulFooterLayout);
        panelAzulFooterLayout.setHorizontalGroup(
            panelAzulFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        panelAzulFooterLayout.setVerticalGroup(
            panelAzulFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        panelFondoBlanco.add(panelAzulFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 281, 30));

        panelRojoFooter.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout panelRojoFooterLayout = new javax.swing.GroupLayout(panelRojoFooter);
        panelRojoFooter.setLayout(panelRojoFooterLayout);
        panelRojoFooterLayout.setHorizontalGroup(
            panelRojoFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );
        panelRojoFooterLayout.setVerticalGroup(
            panelRojoFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelFondoBlanco.add(panelRojoFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 281, 10));

        txtSaldoOrigen.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        txtSaldoOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoOrigen.setText("$");
        panelFondoBlanco.add(txtSaldoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 20, -1));

        txtValorTransferencia.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        txtValorTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValorTransferencia.setText("Valor a transferir:  ");
        panelFondoBlanco.add(txtValorTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        txtSeleccioneCuenta.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        txtSeleccioneCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeleccioneCuenta.setText("Seleccione la cuenta destino:");
        panelFondoBlanco.add(txtSeleccioneCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 280, -1));

        txtCuentaOrigen.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        txtCuentaOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCuentaOrigen.setText("Seleccione la cuenta origen:");
        panelFondoBlanco.add(txtCuentaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, -1));

        txtSubtituloDestino.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        txtSubtituloDestino.setText("CUENTA DESTINO");
        panelFondoBlanco.add(txtSubtituloDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtSubtituloResumen.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        txtSubtituloResumen.setText("CUENTA ORIGEN");
        panelFondoBlanco.add(txtSubtituloResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFondoBlanco.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));

        txtSaldo.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        txtSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldo.setText("Saldo disponible:  ");
        panelFondoBlanco.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 280, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        panelFondoBlanco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 20));

        btnConfirmar.setBackground(new java.awt.Color(15, 34, 64));
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConfirmar.setText("Confirmar");

        javax.swing.GroupLayout btnConfirmarLayout = new javax.swing.GroupLayout(btnConfirmar);
        btnConfirmar.setLayout(btnConfirmarLayout);
        btnConfirmarLayout.setHorizontalGroup(
            btnConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnConfirmarLayout.setVerticalGroup(
            btnConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelFondoBlanco.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 30));

        btnVolver.setBackground(new java.awt.Color(227, 29, 26));
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtVolver.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtVolver.setForeground(new java.awt.Color(255, 255, 255));
        txtVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVolver.setText("Volver");
        txtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVolverMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnVolverLayout = new javax.swing.GroupLayout(btnVolver);
        btnVolver.setLayout(btnVolverLayout);
        btnVolverLayout.setHorizontalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnVolverLayout.setVerticalGroup(
            btnVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelFondoBlanco.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        btnValidar.setText("Validar");
        panelFondoBlanco.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, -1));

        jTextField1.setText("10000.00");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelFondoBlanco.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 60, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelFondoBlanco.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, -1));

        btnValidar1.setText("Validar");
        panelFondoBlanco.add(btnValidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 70, -1));

        btnValidar2.setText("Validar");
        panelFondoBlanco.add(btnValidar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 70, -1));

        txtSaldoOrigen1.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        txtSaldoOrigen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoOrigen1.setText("$1012.25");
        panelFondoBlanco.add(txtSaldoOrigen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
       Transferencias pantTrans=new Transferencias(this.cliente);
       pantTrans.setVisible(true);
       dispose();
    }//GEN-LAST:event_txtVolverMouseClicked

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
            java.util.logging.Logger.getLogger(TransferenciaCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferenciaCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferenciaCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferenciaCuentaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciaCuentaCuenta(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirmar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnValidar1;
    private javax.swing.JButton btnValidar2;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelAzulFooter;
    private javax.swing.JPanel panelFondoBlanco;
    private javax.swing.JPanel panelRojoFooter;
    private javax.swing.JLabel txtConfirmar;
    private javax.swing.JLabel txtCuentaOrigen;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtSaldoOrigen;
    private javax.swing.JLabel txtSaldoOrigen1;
    private javax.swing.JLabel txtSeleccioneCuenta;
    private javax.swing.JLabel txtSubtituloDestino;
    private javax.swing.JLabel txtSubtituloResumen;
    private javax.swing.JLabel txtTituloTransferencia;
    private javax.swing.JLabel txtValorTransferencia;
    private javax.swing.JLabel txtVolver;
    // End of variables declaration//GEN-END:variables
}
