/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoprimerbimestre;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import baseDeDatos.GestorBD;

/**
 *
 * @author nivek
 */
public class NuevaCuenta extends javax.swing.JFrame {

    
    private Usuario cliente;
    private int tipo;
    private String numCuenta="";
    private float saldoInicial;
    public NuevaCuenta(Usuario cliente) {
        initComponents();
        this.cliente = cliente;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelFooterAzul = new javax.swing.JPanel();
        PanelFooterRojo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblCreacionCuenta = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cmbTipo = new javax.swing.JComboBox<>();
        lblCreacionCuenta1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        lblUSD = new javax.swing.JLabel();
        btnAnadir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        lblValidMonto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(535, 125));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFooterAzul.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout PanelFooterAzulLayout = new javax.swing.GroupLayout(PanelFooterAzul);
        PanelFooterAzul.setLayout(PanelFooterAzulLayout);
        PanelFooterAzulLayout.setHorizontalGroup(
            PanelFooterAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        PanelFooterAzulLayout.setVerticalGroup(
            PanelFooterAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(PanelFooterAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 30));

        PanelFooterRojo.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout PanelFooterRojoLayout = new javax.swing.GroupLayout(PanelFooterRojo);
        PanelFooterRojo.setLayout(PanelFooterRojoLayout);
        PanelFooterRojoLayout.setHorizontalGroup(
            PanelFooterRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        PanelFooterRojoLayout.setVerticalGroup(
            PanelFooterRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelFooterRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 10));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/LocoCuadrado.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, -1));

        lblTitulo.setFont(new java.awt.Font("Segoe UI Variable", 1, 20)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Añadir nueva cuenta");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, -1));

        lblCreacionCuenta.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblCreacionCuenta.setForeground(new java.awt.Color(153, 153, 153));
        lblCreacionCuenta.setText("Elija el tipo de cuenta");
        jPanel1.add(lblCreacionCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 100, 10));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Ahorros", " Corriente" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 160, -1));

        lblCreacionCuenta1.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblCreacionCuenta1.setForeground(new java.awt.Color(153, 153, 153));
        lblCreacionCuenta1.setText("Ingrese su abono inical");
        jPanel1.add(lblCreacionCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 100, 10));

        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 120, -1));

        lblUSD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUSD.setText("USD");
        lblUSD.setToolTipText("");
        jPanel1.add(lblUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 30, 22));

        btnAnadir.setBackground(new java.awt.Color(15, 34, 64));
        btnAnadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 90, -1));

        btnVolver.setBackground(new java.awt.Color(227, 29, 26));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 90, -1));

        lblValidMonto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblValidMonto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 150, -1));

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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        PantallaPrincipal menuPrincipal=new PantallaPrincipal(cliente);
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        boolean validMonto=false;
        try {
            float monto = Float.parseFloat(txtMonto.getText());
            if (monto < 0) {
                lblValidMonto.setText("*Introduzca una cantidad positiva");
            } else {
                    validMonto = true;
                    lblValidMonto.setText("");
                    saldoInicial = monto;  
            }
        } catch (Exception e) {

            lblValidMonto.setText("*Cantidad no válida");
        }
        
        if(validMonto){
            if(cmbTipo.getSelectedIndex()==0){
                this.tipo = 0;
            } else {
                this.tipo = 1;

            }
            for (int i = 0; i < 10; i++) {
                numCuenta = numCuenta + String.valueOf((int) Math.round(Math.random() * 8 + 1));
            }
            cliente.addCuenta(numCuenta);
            cliente.addTipo(String.valueOf(tipo));
            cliente.addSaldo(saldoInicial);
            
   
            boolean cuentaOk = GestorBD.insertarCuenta(cliente.getId(), numCuenta, String.valueOf(tipo), saldoInicial);
                if (cuentaOk) {
                    JOptionPane.showMessageDialog(null, "Cuenta creada correctamente",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    PantallaPrincipal menuPrincipal = new PantallaPrincipal(cliente);
                    menuPrincipal.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al crear cuenta", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
              
        }
    }//GEN-LAST:event_btnAnadirActionPerformed

    
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
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCuenta(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFooterAzul;
    private javax.swing.JPanel PanelFooterRojo;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCreacionCuenta;
    private javax.swing.JLabel lblCreacionCuenta1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSD;
    private javax.swing.JLabel lblValidMonto;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
