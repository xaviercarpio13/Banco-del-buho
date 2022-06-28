
package proyectoprimerbimestre;

import java.time.LocalDate;
import java.time.LocalTime;


public class PantallaPrincipal extends javax.swing.JFrame {
    public Usuario cliente;
    
    public PantallaPrincipal() {
        initComponents();
        cliente = new Usuario();
        
        lblBienvenido.setText("Bienvenido,");
        txtNombreCliente.setText(cliente.getNombre()+" "+cliente.getApellido());
        /*
        this.cantidadCuentas = (int)Math.round(Math.random()*3+1);
        this.numeroDeCuenta = new String[this.cantidadCuentas];
        for(int i=0; i<this.cantidadCuentas; i++){
            this.numeroDeCuenta[i]="";
            for(int j=0; j<10; j++){
                this.numeroDeCuenta[i]=this.numeroDeCuenta[i]+String.valueOf((int)Math.round(Math.random()*8+1));
            }
        }
        */
        
        LocalDate fechaActualIngreso=LocalDate.now();
        LocalTime horaActual=LocalTime.now();
        String ingresoFechaHora = "Ultimo ingreso: "+String.valueOf(fechaActualIngreso)+
                                  " a las "+String.valueOf(horaActual).substring(0, 8); 
        
        
        txtHoraFecha.setText(String.valueOf(ingresoFechaHora));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        imgLogoLargoHeader = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtHoraFecha = new javax.swing.JLabel();
        lblMiCuenta = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        bntPagarTarjeta = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        imgenmnut = new javax.swing.JLabel();
        txtTipoCuenta4 = new javax.swing.JLabel();
        txtNumeroCuenta4 = new javax.swing.JLabel();
        txtTipoCuenta2 = new javax.swing.JLabel();
        txtTipoCuenta3 = new javax.swing.JLabel();
        txtTipoCuenta1 = new javax.swing.JLabel();
        txtSaldoCuenta4 = new javax.swing.JLabel();
        txtNumeroCuenta2 = new javax.swing.JLabel();
        txtNumeroCuenta3 = new javax.swing.JLabel();
        txtNumeroCuenta1 = new javax.swing.JLabel();
        txtSaldoCuenta1 = new javax.swing.JLabel();
        txtSaldoCuenta2 = new javax.swing.JLabel();
        txtSaldoCuenta3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        lblMiCuenta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(281, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(301, 466));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 30));

        imgLogoLargoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogoLargoHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoLargov1.png"))); // NOI18N
        jPanel1.add(imgLogoLargoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 281, -1));

        lblBienvenido.setBackground(new java.awt.Color(0, 0, 0));
        lblBienvenido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(15, 34, 64));
        lblBienvenido.setText("Bienvenido,");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, 20));

        txtNombreCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtNombreCliente.setText("Bicho Serresiete");
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 20));

        txtHoraFecha.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        txtHoraFecha.setForeground(new java.awt.Color(153, 153, 153));
        txtHoraFecha.setText("Ultimo ingreso: 2022-06-28 a las 14:33:28");
        jPanel1.add(txtHoraFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, -1));

        lblMiCuenta.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lblMiCuenta.setText("Operaciones");
        jPanel1.add(lblMiCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/receipt_long_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btnPagar.setBorder(null);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPagar.setFocusPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, 60));

        bntPagarTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paid_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        bntPagarTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bntPagarTarjeta.setBorderPainted(false);
        bntPagarTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntPagarTarjeta.setFocusPainted(false);
        bntPagarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPagarTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(bntPagarTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 60, 60));

        btnTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sync_alt_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
        btnTransferencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnTransferencia.setBorderPainted(false);
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTransferencia.setFocusPainted(false);
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 60, 60));

        jPanel6.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 10));

        imgenmnut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoPersona.png"))); // NOI18N
        imgenmnut.setToolTipText("");
        jPanel1.add(imgenmnut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtTipoCuenta4.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta4.setText("AHORROS");
        jPanel1.add(txtTipoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        txtNumeroCuenta4.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta4.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        txtTipoCuenta2.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta2.setText("CORRIENTE");
        jPanel1.add(txtTipoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        txtTipoCuenta3.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta3.setText("AHORROS");
        jPanel1.add(txtTipoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, -1));

        txtTipoCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta1.setText("C. Ahorros");
        jPanel1.add(txtTipoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        txtSaldoCuenta4.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta4.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 60, -1));

        txtNumeroCuenta2.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta2.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 80, -1));

        txtNumeroCuenta3.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta3.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 80, -1));

        txtNumeroCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta1.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 80, -1));

        txtSaldoCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta1.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, -1));

        txtSaldoCuenta2.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta2.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 60, -1));

        txtSaldoCuenta3.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta3.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setEnabled(false);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 10));

        lblMiCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lblMiCuenta1.setText("Mis Cuentas");
        jPanel1.add(lblMiCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        Transferencias ventanaTransferencias=new Transferencias();
        ventanaTransferencias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        PagoDeServicios ventanaPagoDeServicios=new PagoDeServicios();
        ventanaPagoDeServicios.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void bntPagarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPagarTarjetaActionPerformed
        Creditos ventanaCreditos=new Creditos();
        ventanaCreditos.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntPagarTarjetaActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntPagarTarjeta;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel imgLogoLargoHeader;
    private javax.swing.JLabel imgenmnut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblMiCuenta;
    private javax.swing.JLabel lblMiCuenta1;
    private javax.swing.JLabel txtHoraFecha;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCuenta1;
    private javax.swing.JLabel txtNumeroCuenta2;
    private javax.swing.JLabel txtNumeroCuenta3;
    private javax.swing.JLabel txtNumeroCuenta4;
    private javax.swing.JLabel txtSaldoCuenta1;
    private javax.swing.JLabel txtSaldoCuenta2;
    private javax.swing.JLabel txtSaldoCuenta3;
    private javax.swing.JLabel txtSaldoCuenta4;
    private javax.swing.JLabel txtTipoCuenta1;
    private javax.swing.JLabel txtTipoCuenta2;
    private javax.swing.JLabel txtTipoCuenta3;
    private javax.swing.JLabel txtTipoCuenta4;
    // End of variables declaration//GEN-END:variables
}
