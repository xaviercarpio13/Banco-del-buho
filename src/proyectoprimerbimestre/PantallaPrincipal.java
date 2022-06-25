
package proyectoprimerbimestre;


public class PantallaPrincipal extends javax.swing.JFrame {
    private int saldo;
   
    public PantallaPrincipal(String nombreUsuario) {
        initComponents();
        long numeroCuenta=(int)(1+(Math.random()*1000000000));
        this.saldo=(int)(1+(Math.random()*1000));
        lblNro.setText("Nro. "+String.valueOf(numeroCuenta));
        lblBienvenido.setText("Bienvenido "+nombreUsuario);
        lblSaldo.setText("$"+this.saldo);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        lblSaludo = new javax.swing.JLabel();
        lblOperaciones = new javax.swing.JLabel();
        lblMiCuenta = new javax.swing.JLabel();
        btnTransferencia = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        lblTransferencia = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAhorros = new javax.swing.JLabel();
        lblNro = new javax.swing.JLabel();
        lblSaldoDisp = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblPagar = new javax.swing.JLabel();
        bntPagarTarjeta = new javax.swing.JButton();
        lblPagarTarjeta = new javax.swing.JLabel();
        txtFooter1 = new javax.swing.JLabel();
        txtFooter2 = new javax.swing.JLabel();
        txtFooter3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoLargov1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/person.png"))); // NOI18N

        lblBienvenido.setBackground(new java.awt.Color(0, 0, 0));
        lblBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(15, 34, 64));
        lblBienvenido.setText("Bienvenido");

        lblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaludo.setForeground(new java.awt.Color(102, 102, 102));
        lblSaludo.setText("Un gusto atenderle");

        lblOperaciones.setBackground(new java.awt.Color(0, 0, 0));
        lblOperaciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblOperaciones.setForeground(new java.awt.Color(102, 102, 102));
        lblOperaciones.setText("Operaciones");

        lblMiCuenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMiCuenta.setForeground(new java.awt.Color(227, 29, 26));
        lblMiCuenta.setText("Mi Cuenta");

        btnTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        btnTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sync_alt_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btnTransferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferencia.setFocusPainted(false);
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(255, 255, 255));
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/receipt_long_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btnPagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setFocusPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        lblTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTransferencia.setText("<html>Trasnferir<p>Dinero<html>");

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));

        lblAhorros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAhorros.setForeground(new java.awt.Color(15, 34, 64));
        lblAhorros.setText("AHORROS");

        lblNro.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblNro.setForeground(new java.awt.Color(15, 34, 64));
        lblNro.setText("Nro.");

        lblSaldoDisp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldoDisp.setForeground(new java.awt.Color(15, 34, 64));
        lblSaldoDisp.setText("Saldo Disponible");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(15, 34, 64));
        lblSaldo.setText("$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSaldoDisp)))
                        .addGap(24, 24, 24))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNro)
                    .addComponent(lblSaldoDisp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lblPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPagar.setText("<html>Pagar<p>Servicios<html>");

        bntPagarTarjeta.setBackground(new java.awt.Color(255, 255, 255));
        bntPagarTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/credit_card_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bntPagarTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bntPagarTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntPagarTarjeta.setFocusPainted(false);
        bntPagarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPagarTarjetaActionPerformed(evt);
            }
        });

        lblPagarTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPagarTarjeta.setText("<html>Pagar<p>Tarjetas<html>");

        txtFooter1.setFont(new java.awt.Font("Segoe UI Variable", 0, 9)); // NOI18N
        txtFooter1.setForeground(new java.awt.Color(153, 153, 153));
        txtFooter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFooter1.setText("Escuela Politécnica Nacional, Ecuador");

        txtFooter2.setFont(new java.awt.Font("Segoe UI Variable", 0, 9)); // NOI18N
        txtFooter2.setForeground(new java.awt.Color(153, 153, 153));
        txtFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFooter2.setText("Programación II, GR1COM, 2022A");

        txtFooter3.setFont(new java.awt.Font("Segoe UI Variable", 0, 9)); // NOI18N
        txtFooter3.setForeground(new java.awt.Color(153, 153, 153));
        txtFooter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFooter3.setText("Grupo H: Carpio X. Guallichico R. & Martinez K.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblBienvenido))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSaludo))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMiCuenta))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOperaciones))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTransferencia))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPagar)
                            .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPagarTarjeta)
                            .addComponent(bntPagarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtFooter3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFooter1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFooter2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBienvenido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSaludo))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(lblMiCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblOperaciones)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(bntPagarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransferencia)
                    .addComponent(lblPagar)
                    .addComponent(lblPagarTarjeta))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(txtFooter3))
                        .addComponent(txtFooter1)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(txtFooter2)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 470));

        jPanel4.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 467, 280, 10));

        jPanel5.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 40));

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

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        Transferencias ventanaTransferencias=new Transferencias(this.saldo);
        ventanaTransferencias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        PagoDeServicios ventanaPagoDeServicios=new PagoDeServicios(this.saldo);
        ventanaPagoDeServicios.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void bntPagarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPagarTarjetaActionPerformed
        PagoDeTarjetas ventanaPagoDeTarjetas=new PagoDeTarjetas(this.saldo);
        ventanaPagoDeTarjetas.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntPagarTarjetaActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal(null).setVisible(true);
            }
        });
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPagarTarjeta;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAhorros;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblMiCuenta;
    private javax.swing.JLabel lblNro;
    private javax.swing.JLabel lblOperaciones;
    private javax.swing.JLabel lblPagar;
    private javax.swing.JLabel lblPagarTarjeta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldoDisp;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblTransferencia;
    private javax.swing.JLabel txtFooter1;
    private javax.swing.JLabel txtFooter2;
    private javax.swing.JLabel txtFooter3;
    // End of variables declaration//GEN-END:variables
}
