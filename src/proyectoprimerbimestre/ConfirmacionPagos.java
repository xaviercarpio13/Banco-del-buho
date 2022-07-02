
package proyectoprimerbimestre;

import java.time.LocalDate;


public class ConfirmacionPagos extends javax.swing.JFrame {

    public Usuario usuario;
    float valor;
    String cuenta;
    String tarjeta;
    String nombre=null;
    int cuentas;
    LocalDate fechaActual;
    int cuentaSeleccionada;
    int tipo;           //1 para transferencias, 2 para Pago Tarjetas
   
    
    public ConfirmacionPagos(Usuario cliente, float valorPagado, String numCuenta, String numTarjeta, int cuentaSeleccionada) {
        initComponents();
        this.cuentaSeleccionada=cuentaSeleccionada;
        this.usuario=cliente;
        valor=valorPagado;
        cuenta=numCuenta;
        tarjeta=numTarjeta;
        cuentas=cuentaSeleccionada;
        fechaActual=LocalDate.now();
        tipo=1;
        
    }
    public ConfirmacionPagos(Usuario cliente, float valorPagado, String numCuenta, String numTarjeta, int cuentaSeleccionada, String nombre) {
        initComponents();
        this.cuentaSeleccionada=cuentaSeleccionada;
        this.usuario=cliente;
        valor=valorPagado;
        cuenta=numCuenta;
        tarjeta=numTarjeta;
        cuentas=cuentaSeleccionada;
        this.nombre=nombre;
        fechaActual=LocalDate.now();
        tipo=2;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("¿Estás seguro de realizar el pago?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 43));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Puede revisar los datos otra vez");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        btnPagar.setBackground(new java.awt.Color(15, 34, 64));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Pagar");
        btnPagar.setBorder(null);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setFocusPainted(false);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 100, 30));

        btnCancelar.setBackground(new java.awt.Color(227, 29, 26));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 70, 30));

        jPanel2.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 300, 10));

        jPanel3.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 300, 40));

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

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if(this.tipo==1){
        usuario.setSaldos((usuario.getSaldo(cuentaSeleccionada)
                    -valor),(cuentaSeleccionada));
        String movimiento=String.valueOf(fechaActual)+"\nPago de tarjeta  "+tarjeta+
                "\n- $"+valor+"\n\n"+usuario.getMovimientos(cuentas);
        this.usuario.setMovimientos(movimiento,cuentas);
        ReciboPago newframe2= new ReciboPago(this.usuario, valor,cuenta,tarjeta);
        newframe2.setVisible(true);
        this.dispose();
        } else {
            usuario.setSaldos((usuario.getSaldo(cuentaSeleccionada)
                    -valor),(cuentaSeleccionada));
        String movimiento=String.valueOf(fechaActual)+"\nTransferencia a "+nombre+
                "\n- $"+valor+"\n\n"+usuario.getMovimientos(cuentas);
        this.usuario.setMovimientos(movimiento,cuentas);
        ReciboPago newframe2= new ReciboPago(this.usuario, valor,cuenta,tarjeta,nombre);
        newframe2.setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PagoTarjetas ventanaPagoDeServicios=new PagoTarjetas(usuario);
        ventanaPagoDeServicios.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacionPagos(null, -1, null, null, -1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
