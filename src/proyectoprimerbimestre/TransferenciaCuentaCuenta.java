
package proyectoprimerbimestre;

import java.text.DecimalFormat;

public class TransferenciaCuentaCuenta extends javax.swing.JFrame {

    Usuario cliente;
    DecimalFormat frmt=new DecimalFormat();
    int indiceComboBox;
    
    public TransferenciaCuentaCuenta(Usuario cliente) {
        initComponents();
        frmt.setMaximumFractionDigits(2);
        this.cliente = cliente;
        /*
        switch (cliente.getCantidadCuentas()) {
            case 1:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(0) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(0)));
                break;
            case 2:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(0) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(1) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(1)));
                break;
            case 3:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(0) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(1) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(1)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(2) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(2)));
                break;
            case 4:
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(0) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(0)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(1) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(1)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(2) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(2)));
                cmbCuentasUsuarioOrigen.addItem(cliente.getTipoDeCuenta(3) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(3)));
                break;
        }
        */
        txtSaldo.setVisible(false);
        txtSaldoOrigen.setVisible(false);
        txtValorTransferencia.setVisible(false);
        txtSimboloDolar.setVisible(false);
        txtFieldDineroTransferencia.setVisible(false);
        btnValidar2.setVisible(false);
        txtSubtituloDestino.setVisible(false);
        txtSeleccioneCuenta.setVisible(false);
        cmbCuentasUsuarioDestino.setVisible(false);
        btnValidar3.setVisible(false);
        btnConfirmar.setVisible(false);
        txtError1.setVisible(false);
        txtError2.setVisible(false);
        txtError3.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoBlanco = new javax.swing.JPanel();
        txtTituloTransferencia = new javax.swing.JLabel();
        panelAzulFooter = new javax.swing.JPanel();
        panelRojoFooter = new javax.swing.JPanel();
        txtSimboloDolar = new javax.swing.JLabel();
        txtValorTransferencia = new javax.swing.JLabel();
        txtSeleccioneCuenta = new javax.swing.JLabel();
        txtCuentaOrigen = new javax.swing.JLabel();
        txtSubtituloDestino = new javax.swing.JLabel();
        txtSubtituloResumen = new javax.swing.JLabel();
        cmbCuentasUsuarioOrigen = new javax.swing.JComboBox<>();
        txtSaldo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JPanel();
        txtConfirmar = new javax.swing.JLabel();
        btnVolver = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        txtFieldDineroTransferencia = new javax.swing.JTextField();
        cmbCuentasUsuarioDestino = new javax.swing.JComboBox<>();
        btnValidar2 = new javax.swing.JButton();
        txtSaldoOrigen = new javax.swing.JLabel();
        btnValidar1 = new javax.swing.JButton();
        txtError1 = new javax.swing.JLabel();
        txtError2 = new javax.swing.JLabel();
        btnValidar3 = new javax.swing.JButton();
        txtError3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        panelFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));
        panelFondoBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTituloTransferencia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTituloTransferencia.setForeground(new java.awt.Color(15, 34, 64));
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

        txtSimboloDolar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSimboloDolar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSimboloDolar.setText("$");
        panelFondoBlanco.add(txtSimboloDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 20, -1));

        txtValorTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValorTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValorTransferencia.setText("Valor a transferir:  ");
        panelFondoBlanco.add(txtValorTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 280, -1));

        txtSeleccioneCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSeleccioneCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSeleccioneCuenta.setText("Seleccione la cuenta destino:");
        panelFondoBlanco.add(txtSeleccioneCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 280, -1));

        txtCuentaOrigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCuentaOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCuentaOrigen.setText("Seleccione la cuenta origen:");
        panelFondoBlanco.add(txtCuentaOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 280, -1));

        txtSubtituloDestino.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSubtituloDestino.setForeground(new java.awt.Color(15, 34, 64));
        txtSubtituloDestino.setText("CUENTA DESTINO");
        panelFondoBlanco.add(txtSubtituloDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        txtSubtituloResumen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSubtituloResumen.setForeground(new java.awt.Color(15, 34, 64));
        txtSubtituloResumen.setText("CUENTA ORIGEN");
        panelFondoBlanco.add(txtSubtituloResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cmbCuentasUsuarioOrigen.setBackground(new java.awt.Color(15, 34, 64));
        cmbCuentasUsuarioOrigen.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cmbCuentasUsuarioOrigen.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuentasUsuarioOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentasUsuarioOrigen.setOpaque(false);
        cmbCuentasUsuarioOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentasUsuarioOrigenActionPerformed(evt);
            }
        });
        panelFondoBlanco.add(cmbCuentasUsuarioOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 190, 20));

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldo.setText("Saldo disponible:  ");
        panelFondoBlanco.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        panelFondoBlanco.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, 20));

        btnConfirmar.setBackground(new java.awt.Color(15, 34, 64));
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfirmarMousePressed(evt);
            }
        });

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

        panelFondoBlanco.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, 30));

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

        panelFondoBlanco.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        txtFieldDineroTransferencia.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtFieldDineroTransferencia.setText("10000.00");
        txtFieldDineroTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDineroTransferenciaActionPerformed(evt);
            }
        });
        panelFondoBlanco.add(txtFieldDineroTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 60, 20));

        cmbCuentasUsuarioDestino.setBackground(new java.awt.Color(15, 34, 64));
        cmbCuentasUsuarioDestino.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cmbCuentasUsuarioDestino.setForeground(new java.awt.Color(255, 255, 255));
        cmbCuentasUsuarioDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentasUsuarioDestino.setFocusable(false);
        cmbCuentasUsuarioDestino.setOpaque(false);
        panelFondoBlanco.add(cmbCuentasUsuarioDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 20));

        btnValidar2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnValidar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoVistoSmall.png"))); // NOI18N
        btnValidar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar2ActionPerformed(evt);
            }
        });
        panelFondoBlanco.add(btnValidar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 20, 20));

        txtSaldoOrigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSaldoOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldoOrigen.setText("$1012.25");
        panelFondoBlanco.add(txtSaldoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, -1));

        btnValidar1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnValidar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoVistoSmall.png"))); // NOI18N
        btnValidar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar1ActionPerformed(evt);
            }
        });
        panelFondoBlanco.add(btnValidar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 20, 20));

        txtError1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtError1.setForeground(new java.awt.Color(227, 29, 26));
        txtError1.setText("* Por favor, seleccione una cuenta válida");
        panelFondoBlanco.add(txtError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtError2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtError2.setForeground(new java.awt.Color(227, 29, 26));
        txtError2.setText("* Por favor, ingrese una cantidad válida");
        panelFondoBlanco.add(txtError2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        btnValidar3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnValidar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoVistoSmall.png"))); // NOI18N
        btnValidar3.setFocusPainted(false);
        btnValidar3.setFocusable(false);
        btnValidar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar3ActionPerformed(evt);
            }
        });
        panelFondoBlanco.add(btnValidar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 20, 20));

        txtError3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtError3.setForeground(new java.awt.Color(227, 29, 26));
        txtError3.setText("* Campo requerido");
        panelFondoBlanco.add(txtError3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldDineroTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDineroTransferenciaActionPerformed
       
    }//GEN-LAST:event_txtFieldDineroTransferenciaActionPerformed

    private void txtVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVolverMouseClicked
       PantallaTipoTransferencias pantTrans=new PantallaTipoTransferencias(this.cliente);
       pantTrans.setVisible(true);
       dispose();
    }//GEN-LAST:event_txtVolverMouseClicked

    private void cmbCuentasUsuarioOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasUsuarioOrigenActionPerformed
        txtSaldo.setVisible(true);
        txtSaldoOrigen.setVisible(true);
        switch (cmbCuentasUsuarioOrigen.getSelectedIndex()) {
            case 0:
                txtSaldoOrigen.setText("$0.00");
                break;
            case 1:
                txtSaldoOrigen.setText("$" + String.valueOf(frmt.format(cliente.getSaldo(0))));
                indiceComboBox = 0;
                //for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    //if (i != indiceComboBox) {
                        //cmbCuentasUsuarioDestino.addItem(cliente.getTipoDeCuenta(i) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(i)));
                    //}
               // }

                break;
            case 2:
                txtSaldoOrigen.setText("$" + String.valueOf(frmt.format(cliente.getSaldo(1))));
                indiceComboBox = 1;
               // for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    //if (i != indiceComboBox) {
                       // cmbCuentasUsuarioDestino.addItem(cliente.getTipoDeCuenta(i) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(i)));
                   // }
                //}
                break;
            case 3:
                txtSaldoOrigen.setText("$" + String.valueOf(frmt.format(cliente.getSaldo(2))));
                indiceComboBox = 2;
                //for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                    //if (i != indiceComboBox) {
                      //  cmbCuentasUsuarioDestino.addItem(cliente.getTipoDeCuenta(i) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(i)));
                   // }
              //  }
                break;
            case 4:
                txtSaldoOrigen.setText("$" + String.valueOf(frmt.format(cliente.getSaldo(3))));
                indiceComboBox = 3;
                //for (int i = 0; i < cliente.getCantidadCuentas(); i++) {
                   // if (i != indiceComboBox) {
                     //   cmbCuentasUsuarioDestino.addItem(cliente.getTipoDeCuenta(i) + ": #" + String.valueOf(cliente.getNumeroDeCuenta(i)));
                   // }
              //  }
                break;
        }
    }//GEN-LAST:event_cmbCuentasUsuarioOrigenActionPerformed

    private void btnValidar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidar1ActionPerformed
        if(cmbCuentasUsuarioOrigen.getSelectedIndex()==0){
            txtError1.setVisible(true);
        }else{
            txtError1.setVisible(false);
            cmbCuentasUsuarioOrigen.setEnabled(false);
            btnValidar1.setEnabled(false);
            txtValorTransferencia.setVisible(true);
            txtSimboloDolar.setVisible(true);
            txtFieldDineroTransferencia.setVisible(true);
            btnValidar2.setVisible(true);
            txtFieldDineroTransferencia.setText("");
        }
    }//GEN-LAST:event_btnValidar1ActionPerformed

    private void btnValidar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidar2ActionPerformed

        try{
            if(Float.parseFloat(txtFieldDineroTransferencia.getText())<=cliente.getSaldo(indiceComboBox)){
                txtFieldDineroTransferencia.setEnabled(false);
                btnValidar2.setEnabled(false);
                txtError2.setVisible(false);
                txtSubtituloDestino.setVisible(true);
                txtSeleccioneCuenta.setVisible(true);
                cmbCuentasUsuarioDestino.setVisible(true);
                btnValidar3.setVisible(true);
            }else{
                txtError2.setVisible(true);
            }
        }catch (NumberFormatException e){
            txtError2.setVisible(true);
        }
    }//GEN-LAST:event_btnValidar2ActionPerformed

    private void btnValidar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidar3ActionPerformed
        if(cmbCuentasUsuarioDestino.getSelectedIndex()==0){
            txtError3.setText("*Campo Requerido");
            txtError3.setVisible(true);
        }else{
            txtError3.setVisible(false);
            cmbCuentasUsuarioDestino.setEnabled(false);
            btnValidar3.setEnabled(false);
            btnConfirmar.setVisible(true);
        }
        
    }//GEN-LAST:event_btnValidar3ActionPerformed

    private void btnConfirmarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMousePressed
        switch (cmbCuentasUsuarioOrigen.getSelectedIndex()) {
            case 1:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 0, 1,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 0, 2,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 0, 3,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
            case 2:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 1, 0,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 1, 2,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 1, 3,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
            case 3:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 2, 0,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 2, 1,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 2, 3,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
            case 4:
                switch (cmbCuentasUsuarioDestino.getSelectedIndex()) {
                    case 1:
                        ConfirmacionPagos newframe = new ConfirmacionPagos(this.cliente, 3, 0,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe.setVisible(true);
                        dispose();
                        break;
                    case 2:
                        ConfirmacionPagos newframe1 = new ConfirmacionPagos(this.cliente, 3, 1,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe1.setVisible(true);
                        dispose();
                        break;
                    case 3:
                        ConfirmacionPagos newframe2 = new ConfirmacionPagos(this.cliente, 3, 2,
                                Float.parseFloat(txtFieldDineroTransferencia.getText()));
                        newframe2.setVisible(true);
                        dispose();
                        break;
                }
                break;
        }
    }//GEN-LAST:event_btnConfirmarMousePressed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferenciaCuentaCuenta(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirmar;
    private javax.swing.JButton btnValidar1;
    private javax.swing.JButton btnValidar2;
    private javax.swing.JButton btnValidar3;
    private javax.swing.JPanel btnVolver;
    private javax.swing.JComboBox<String> cmbCuentasUsuarioDestino;
    private javax.swing.JComboBox<String> cmbCuentasUsuarioOrigen;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelAzulFooter;
    private javax.swing.JPanel panelFondoBlanco;
    private javax.swing.JPanel panelRojoFooter;
    private javax.swing.JLabel txtConfirmar;
    private javax.swing.JLabel txtCuentaOrigen;
    private javax.swing.JLabel txtError1;
    private javax.swing.JLabel txtError2;
    private javax.swing.JLabel txtError3;
    private javax.swing.JTextField txtFieldDineroTransferencia;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtSaldoOrigen;
    private javax.swing.JLabel txtSeleccioneCuenta;
    private javax.swing.JLabel txtSimboloDolar;
    private javax.swing.JLabel txtSubtituloDestino;
    private javax.swing.JLabel txtSubtituloResumen;
    private javax.swing.JLabel txtTituloTransferencia;
    private javax.swing.JLabel txtValorTransferencia;
    private javax.swing.JLabel txtVolver;
    // End of variables declaration//GEN-END:variables
}
