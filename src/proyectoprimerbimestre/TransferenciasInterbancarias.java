package proyectoprimerbimestre;
import java.text.DecimalFormat;


public class TransferenciasInterbancarias extends javax.swing.JFrame {

    public Usuario cliente;
    DecimalFormat frmt = new DecimalFormat();

    public TransferenciasInterbancarias(Usuario cliente) {
        initComponents();
        frmt.setMaximumFractionDigits(2);
        this.cliente = cliente;

        switch (cliente.getCantidadCuentas()) {
            case 1:
                cmbCuentas.addItem(String.valueOf(cliente.getCuenta(0)));//
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
        lblValidCuenta.setText("");
        lblValidMonto.setText("");
        lblValidBanco.setText("");
        lblValidNum.setText("");
        lblValidNombre.setText("");
        lblValidCI.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCuentas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblValidCuenta = new javax.swing.JLabel();
        lblValidMonto = new javax.swing.JLabel();
        lblValidBanco = new javax.swing.JLabel();
        lblValidNombre = new javax.swing.JLabel();
        lblValidCI = new javax.swing.JLabel();
        lblValidNum = new javax.swing.JLabel();
        lblAdvertencia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cmbBanco = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(535, 125));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 281));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 500));

        jPanel4.setBackground(new java.awt.Color(227, 29, 26));

        jPanel5.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setBackground(new java.awt.Color(15, 34, 64));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 34, 64));
        jLabel1.setText("Transferencias Interbancarias");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 34, 64));
        jLabel2.setText("Elije la cuenta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nro. Cuenta");

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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Saldo disponible");

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaldo.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("USD");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Monto a Transferir");

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        txtMonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("USD");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Seleccione el banco");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nro. Cuenta ");

        txtNumCuenta.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNumCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Nombre ");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("C.I.");

        txtCI.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txtCI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 34, 64));
        jLabel5.setText("Datos del beneficiario");

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

        lblValidCuenta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblValidCuenta.setForeground(new java.awt.Color(255, 0, 0));
        lblValidCuenta.setText("*Campo obligatorio");

        lblValidMonto.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblValidMonto.setForeground(new java.awt.Color(255, 0, 0));
        lblValidMonto.setText("*Campo obligatorio");

        lblValidBanco.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblValidBanco.setForeground(new java.awt.Color(255, 0, 0));
        lblValidBanco.setText("*Campo obligatorio");

        lblValidNombre.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblValidNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblValidNombre.setText("*Campo obligatorio");

        lblValidCI.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblValidCI.setForeground(new java.awt.Color(255, 0, 0));
        lblValidCI.setText("*Campo obligatorio");
        lblValidCI.setToolTipText("");

        lblValidNum.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblValidNum.setForeground(new java.awt.Color(255, 0, 0));
        lblValidNum.setText("*Campo obligatorio");

        lblAdvertencia.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblAdvertencia.setText("* El valor de esta transacción es $0.40");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        cmbBanco.setBackground(new java.awt.Color(0, 0, 51));
        cmbBanco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBanco.setForeground(new java.awt.Color(204, 204, 204));
        cmbBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Banco Pichincha", "Banco Guayaquil", "Banco Pacifico" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblValidNum, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValidMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAdvertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValidCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValidBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValidNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblValidCI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaldo)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addComponent(lblValidCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValidMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidNum, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValidCI, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValidNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdvertencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        try {
            String CI = txtCI.getText();
            String nombre = txtNombre.getText();
            String cuentaEmisor = cliente.getCuenta(cmbCuentas.getSelectedIndex() - 1);
            int nombreBanco = cmbBanco.getSelectedIndex();
            String cuentaReceptor = txtNumCuenta.getText();
            
            boolean combCuenta = false;
            boolean montoValido = false;
            boolean combBanco = false;
            boolean numeroCuentaValido = false;
            boolean nombreValido = false;
            boolean cedulaValido = false;
            
            float montoPagado=-1; 
            if (txtMonto.getText().isEmpty()) {
                lblValidMonto.setText("*Campo obligatorio");
            } else {
                try {
                    float monto = Float.parseFloat(txtMonto.getText());
                    if (monto < 0) {
                        lblValidMonto.setText("*Introduzca una cantidad positiva");
                    } else {
                        if (monto > (cliente.getSaldo((cmbCuentas.getSelectedIndex()) - 1)) - 0.4) {
                            lblValidMonto.setText("*Saldo insuficiente");
                        } else {
                            montoValido= true;
                            lblValidMonto.setText("");
                            montoPagado = monto;
                        }
                    }
                } catch (NumberFormatException e) {
                    lblValidMonto.setText("*Cantidad no válida");
                }
            }
            
            if (cuentaReceptor.isEmpty()) {
                lblValidNum.setText("*Campo obligatorio");
            } else {
                numeroCuentaValido = true;
                for (int i = 0; i < cuentaReceptor.length(); i++) {
                    if (Character.isAlphabetic(cuentaReceptor.charAt(i))) {
                        numeroCuentaValido = false;
                        lblValidNum.setText("*Dato no válido");
                        break; 
                } if (numeroCuentaValido) {
                        lblValidNum.setText("");
                    }
                }
            }

            if (cmbBanco.getSelectedIndex() == 0) {
                lblValidBanco.setText("*Seleccione un banco");
            } else {
                combBanco = true;
                lblValidBanco.setText("");
               
            }


            if (cmbCuentas.getSelectedIndex() == 0) {
                lblValidCuenta.setText("*Seleccione una cuenta");
            } else {
                combCuenta = true;
                lblValidCuenta.setText("");
            }

            if (nombre.isEmpty()) {
                lblValidNombre.setText("*Campo obligatorio");
            } else {
                nombreValido = true;
                for (int i = 0; i < nombre.length(); i++) {
                    if (Character.isDigit(nombre.charAt(i))) {
                        nombreValido = false;
                        lblValidNombre.setText("*Dato no válido");
                        break;
                    }
                } if (nombreValido){
                    lblValidNombre.setText("");
                }
            }
            if (CI.isEmpty()) {
                lblValidCI.setText("*Campo obligatorio");
            } else {
                cedulaValido = true;
                for (int i = 0; i < CI.length(); i++) {
                    if (Character.isAlphabetic(CI.charAt(i))) {
                        cedulaValido = false;
                        lblValidCI.setText("*Dato no válido");
                        break;
                    }
                } if (cedulaValido){
                    lblValidCI.setText("");
                }
            }

            if (montoValido && numeroCuentaValido && combCuenta && combBanco && nombreValido && cedulaValido) {
                montoPagado += 0.4;
                ConfirmacionPagos newframe = new ConfirmacionPagos(
                        this.cliente, txtNombre.getText(),cmbCuentas.getSelectedIndex()-1, montoPagado, "Interbancaria");
                newframe.setVisible(true);
                dispose();

            }

        } catch (Exception e) {                  

        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        PantallaTipoTransferencias pantallaTransferencias = new PantallaTipoTransferencias(this.cliente);
        pantallaTransferencias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbCuentasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentasItemStateChanged

        switch (cmbCuentas.getSelectedIndex()) {
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
                new TransferenciasInterbancarias(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbBanco;
    private javax.swing.JComboBox<String> cmbCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdvertencia;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblValidBanco;
    private javax.swing.JLabel lblValidCI;
    private javax.swing.JLabel lblValidCuenta;
    private javax.swing.JLabel lblValidMonto;
    private javax.swing.JLabel lblValidNombre;
    private javax.swing.JLabel lblValidNum;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCuenta;
    // End of variables declaration//GEN-END:variables
}
