
package proyectoprimerbimestre;

import java.text.DecimalFormat;
import baseDeDatos.Movimiento;
import baseDeDatos.GestorBD;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class PantallaInfoCuenta extends javax.swing.JFrame {
    Usuario cliente;
    int indiceDeCuenta;
    
    public PantallaInfoCuenta(Usuario cliente, int indice) {
        
        initComponents();
        DecimalFormat frmt=new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        txtMovimientos.setFocusable(false);
        this.cliente = cliente;
        this.indiceDeCuenta = indice;
        
        txtImgNumeroDeCuenta.setText("N°"+String.valueOf(cliente.getCuenta(indiceDeCuenta)));
        txtSaldoCuenta.setText("$ "+String.valueOf(frmt.format(cliente.getSaldo(indiceDeCuenta))));
        txtImgTipoDeCuenta.setText(String.valueOf(cliente.getTipoCuentas(indiceDeCuenta)));
        
        
        String cuenta = cliente.getCuenta(indiceDeCuenta);
        List<Movimiento> movimientos = GestorBD.obtenerMovimientos(cuenta);
        
        DateTimeFormatter formatoBonito = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        StringBuilder historial = new StringBuilder();
        for (Movimiento m : movimientos) {
            String fechaFormateada;
            try {
                LocalDateTime fecha = LocalDateTime.parse(m.getFechaHora());
                fechaFormateada = fecha.format(formatoBonito);
            } catch (Exception e) {
                fechaFormateada = m.getFechaHora(); // fallback si algo sale mal
            }
            
            historial.append(fechaFormateada).append("\n");

            // Determinar si es entrada (+) o salida (-)
            boolean esEntrada = m.getCuentaDestino() != null && m.getCuentaDestino().equals(cuenta);
            String signo = esEntrada ? "+" : "-";

            if (m.getTipo().equalsIgnoreCase("interbancaria")) {
                historial.append("Transferencia Interbancaria ");
                historial.append(esEntrada ? "de " : "a ");
            } else if (m.getTipo().equalsIgnoreCase("pago")) {
                historial.append("Pago a tarjeta ");
            } else {
                historial.append("Transferencia ");
                historial.append(esEntrada ? "de " : "a ");
            }

            if (m.getCuentaDestino() != null) {
                if (m.getNombreDestinatario() != null && !m.getNombreDestinatario().isEmpty()) {
                    historial.append(m.getNombreDestinatario()).append(" (").append(m.getCuentaDestino()).append(")");
                } else {
                    historial.append(m.getCuentaDestino());
                }
            } else {
                historial.append("Otro banco");
            }


            historial.append("\n$ ").append(signo).append(" ").append(frmt.format(m.getMonto()))
                    .append("\n-------------\n\n");
                }
        txtMovimientos.setText(historial.toString());

        
        //txtMovimientos.setText(cliente.getMovimientos(indice));  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        PanelFooterAzul = new javax.swing.JPanel();
        PanelFooterRojo = new javax.swing.JPanel();
        txtTituloInformacionCuenta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtImgTipoDeCuenta = new javax.swing.JLabel();
        txtSaldoDisponible = new javax.swing.JLabel();
        txtSaldoCuenta = new javax.swing.JLabel();
        bntSalir = new javax.swing.JButton();
        txtImgNumeroDeCuenta = new javax.swing.JLabel();
        txtMovimientos = new java.awt.TextArea();
        txtSaldoDisponible1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(535, 125));
        setResizable(false);

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

        txtTituloInformacionCuenta.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtTituloInformacionCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTituloInformacionCuenta.setText("Información de la cuenta");
        jPanel1.add(txtTituloInformacionCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, -1));

        txtImgTipoDeCuenta.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtImgTipoDeCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImgTipoDeCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoBancoPequeño.png"))); // NOI18N
        txtImgTipoDeCuenta.setText("Ahorros");
        jPanel1.add(txtImgTipoDeCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, -1));

        txtSaldoDisponible.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSaldoDisponible.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoDisponible.setText("Movimientos");
        jPanel1.add(txtSaldoDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 120, 20));

        txtSaldoCuenta.setFont(new java.awt.Font("Segoe UI Variable", 0, 48)); // NOI18N
        txtSaldoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoCuenta.setText("$ 458");
        jPanel1.add(txtSaldoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, -1));

        bntSalir.setBackground(new java.awt.Color(227, 29, 26));
        bntSalir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        bntSalir.setForeground(new java.awt.Color(255, 255, 255));
        bntSalir.setText("Volver");
        bntSalir.setBorder(null);
        bntSalir.setFocusPainted(false);
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bntSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 80, 30));

        txtImgNumeroDeCuenta.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtImgNumeroDeCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImgNumeroDeCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoNumeros.png"))); // NOI18N
        txtImgNumeroDeCuenta.setText("N° 1324567856");
        jPanel1.add(txtImgNumeroDeCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, -1));

        txtMovimientos.setBackground(new java.awt.Color(239, 239, 239));
        txtMovimientos.setColumns(3);
        txtMovimientos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMovimientos.setEditable(false);
        txtMovimientos.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txtMovimientos.setName(""); // NOI18N
        jPanel1.add(txtMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 140));

        txtSaldoDisponible1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtSaldoDisponible1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoDisponible1.setText("Saldo Disponible");
        jPanel1.add(txtSaldoDisponible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 280, -1));

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

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        PantallaPrincipal menuPrincipal=new PantallaPrincipal (this.cliente);
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntSalirActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInfoCuenta(null, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFooterAzul;
    private javax.swing.JPanel PanelFooterRojo;
    private javax.swing.JButton bntSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel txtImgNumeroDeCuenta;
    private javax.swing.JLabel txtImgTipoDeCuenta;
    private java.awt.TextArea txtMovimientos;
    private javax.swing.JLabel txtSaldoCuenta;
    private javax.swing.JLabel txtSaldoDisponible;
    private javax.swing.JLabel txtSaldoDisponible1;
    private javax.swing.JLabel txtTituloInformacionCuenta;
    // End of variables declaration//GEN-END:variables
}
